package com.example.ttlock.dao.gen;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.Property;
import org.greenrobot.greendao.internal.DaoConfig;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.database.DatabaseStatement;

import com.example.ttlock.model.Key;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.
/** 
 * DAO for table "KEY".
*/
public class KeyDao extends AbstractDao<Key, Long> {

    public static final String TABLENAME = "KEY";

    /**
     * Properties of entity Key.<br/>
     * Can be used for QueryBuilder and for referencing column names.
     */
    public static class Properties {
        public final static Property Id = new Property(0, Long.class, "id", true, "_id");
        public final static Property AccessToken = new Property(1, String.class, "accessToken", false, "ACCESS_TOKEN");
        public final static Property KeyStatus = new Property(2, String.class, "keyStatus", false, "KEY_STATUS");
        public final static Property LockId = new Property(3, int.class, "lockId", false, "LOCK_ID");
        public final static Property KeyId = new Property(4, int.class, "keyId", false, "KEY_ID");
        public final static Property IsAdmin = new Property(5, boolean.class, "isAdmin", false, "IS_ADMIN");
        public final static Property LockVersion = new Property(6, String.class, "lockVersion", false, "LOCK_VERSION");
        public final static Property LockName = new Property(7, String.class, "lockName", false, "LOCK_NAME");
        public final static Property LockAlias = new Property(8, String.class, "lockAlias", false, "LOCK_ALIAS");
        public final static Property LockMac = new Property(9, String.class, "lockMac", false, "LOCK_MAC");
        public final static Property Battery = new Property(10, int.class, "battery", false, "BATTERY");
        public final static Property LockFlagPos = new Property(11, int.class, "lockFlagPos", false, "LOCK_FLAG_POS");
        public final static Property AdminPs = new Property(12, String.class, "adminPs", false, "ADMIN_PS");
        public final static Property UnlockKey = new Property(13, String.class, "unlockKey", false, "UNLOCK_KEY");
        public final static Property AdminKeyboardPwd = new Property(14, String.class, "adminKeyboardPwd", false, "ADMIN_KEYBOARD_PWD");
        public final static Property DeletePwd = new Property(15, String.class, "deletePwd", false, "DELETE_PWD");
        public final static Property PwdInfo = new Property(16, String.class, "pwdInfo", false, "PWD_INFO");
        public final static Property Timestamp = new Property(17, long.class, "timestamp", false, "TIMESTAMP");
        public final static Property AesKeystr = new Property(18, String.class, "aesKeystr", false, "AES_KEYSTR");
        public final static Property StartDate = new Property(19, long.class, "startDate", false, "START_DATE");
        public final static Property EndDate = new Property(20, long.class, "endDate", false, "END_DATE");
        public final static Property SpecialValue = new Property(21, int.class, "specialValue", false, "SPECIAL_VALUE");
        public final static Property TimezoneRawOffset = new Property(22, int.class, "timezoneRawOffset", false, "TIMEZONE_RAW_OFFSET");
        public final static Property ModelNumber = new Property(23, String.class, "modelNumber", false, "MODEL_NUMBER");
        public final static Property HardwareRevision = new Property(24, String.class, "hardwareRevision", false, "HARDWARE_REVISION");
        public final static Property FirmwareRevision = new Property(25, String.class, "firmwareRevision", false, "FIRMWARE_REVISION");
    }


    public KeyDao(DaoConfig config) {
        super(config);
    }
    
    public KeyDao(DaoConfig config, DaoSession daoSession) {
        super(config, daoSession);
    }

    /** Creates the underlying database table. */
    public static void createTable(Database db, boolean ifNotExists) {
        String constraint = ifNotExists? "IF NOT EXISTS ": "";
        db.execSQL("CREATE TABLE " + constraint + "\"KEY\" (" + //
                "\"_id\" INTEGER PRIMARY KEY ," + // 0: id
                "\"ACCESS_TOKEN\" TEXT," + // 1: accessToken
                "\"KEY_STATUS\" TEXT," + // 2: keyStatus
                "\"LOCK_ID\" INTEGER NOT NULL ," + // 3: lockId
                "\"KEY_ID\" INTEGER NOT NULL ," + // 4: keyId
                "\"IS_ADMIN\" INTEGER NOT NULL ," + // 5: isAdmin
                "\"LOCK_VERSION\" TEXT," + // 6: lockVersion
                "\"LOCK_NAME\" TEXT," + // 7: lockName
                "\"LOCK_ALIAS\" TEXT," + // 8: lockAlias
                "\"LOCK_MAC\" TEXT," + // 9: lockMac
                "\"BATTERY\" INTEGER NOT NULL ," + // 10: battery
                "\"LOCK_FLAG_POS\" INTEGER NOT NULL ," + // 11: lockFlagPos
                "\"ADMIN_PS\" TEXT," + // 12: adminPs
                "\"UNLOCK_KEY\" TEXT," + // 13: unlockKey
                "\"ADMIN_KEYBOARD_PWD\" TEXT," + // 14: adminKeyboardPwd
                "\"DELETE_PWD\" TEXT," + // 15: deletePwd
                "\"PWD_INFO\" TEXT," + // 16: pwdInfo
                "\"TIMESTAMP\" INTEGER NOT NULL ," + // 17: timestamp
                "\"AES_KEYSTR\" TEXT," + // 18: aesKeystr
                "\"START_DATE\" INTEGER NOT NULL ," + // 19: startDate
                "\"END_DATE\" INTEGER NOT NULL ," + // 20: endDate
                "\"SPECIAL_VALUE\" INTEGER NOT NULL ," + // 21: specialValue
                "\"TIMEZONE_RAW_OFFSET\" INTEGER NOT NULL ," + // 22: timezoneRawOffset
                "\"MODEL_NUMBER\" TEXT," + // 23: modelNumber
                "\"HARDWARE_REVISION\" TEXT," + // 24: hardwareRevision
                "\"FIRMWARE_REVISION\" TEXT);"); // 25: firmwareRevision
    }

    /** Drops the underlying database table. */
    public static void dropTable(Database db, boolean ifExists) {
        String sql = "DROP TABLE " + (ifExists ? "IF EXISTS " : "") + "\"KEY\"";
        db.execSQL(sql);
    }

    @Override
    protected final void bindValues(DatabaseStatement stmt, Key entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String accessToken = entity.getAccessToken();
        if (accessToken != null) {
            stmt.bindString(2, accessToken);
        }
 
        String keyStatus = entity.getKeyStatus();
        if (keyStatus != null) {
            stmt.bindString(3, keyStatus);
        }
        stmt.bindLong(4, entity.getLockId());
        stmt.bindLong(5, entity.getKeyId());
        stmt.bindLong(6, entity.getIsAdmin() ? 1L: 0L);
 
        String lockVersion = entity.getLockVersion();
        if (lockVersion != null) {
            stmt.bindString(7, lockVersion);
        }
 
        String lockName = entity.getLockName();
        if (lockName != null) {
            stmt.bindString(8, lockName);
        }
 
        String lockAlias = entity.getLockAlias();
        if (lockAlias != null) {
            stmt.bindString(9, lockAlias);
        }
 
        String lockMac = entity.getLockMac();
        if (lockMac != null) {
            stmt.bindString(10, lockMac);
        }
        stmt.bindLong(11, entity.getBattery());
        stmt.bindLong(12, entity.getLockFlagPos());
 
        String adminPs = entity.getAdminPs();
        if (adminPs != null) {
            stmt.bindString(13, adminPs);
        }
 
        String unlockKey = entity.getUnlockKey();
        if (unlockKey != null) {
            stmt.bindString(14, unlockKey);
        }
 
        String adminKeyboardPwd = entity.getAdminKeyboardPwd();
        if (adminKeyboardPwd != null) {
            stmt.bindString(15, adminKeyboardPwd);
        }
 
        String deletePwd = entity.getDeletePwd();
        if (deletePwd != null) {
            stmt.bindString(16, deletePwd);
        }
 
        String pwdInfo = entity.getPwdInfo();
        if (pwdInfo != null) {
            stmt.bindString(17, pwdInfo);
        }
        stmt.bindLong(18, entity.getTimestamp());
 
        String aesKeystr = entity.getAesKeystr();
        if (aesKeystr != null) {
            stmt.bindString(19, aesKeystr);
        }
        stmt.bindLong(20, entity.getStartDate());
        stmt.bindLong(21, entity.getEndDate());
        stmt.bindLong(22, entity.getSpecialValue());
        stmt.bindLong(23, entity.getTimezoneRawOffset());
 
        String modelNumber = entity.getModelNumber();
        if (modelNumber != null) {
            stmt.bindString(24, modelNumber);
        }
 
        String hardwareRevision = entity.getHardwareRevision();
        if (hardwareRevision != null) {
            stmt.bindString(25, hardwareRevision);
        }
 
        String firmwareRevision = entity.getFirmwareRevision();
        if (firmwareRevision != null) {
            stmt.bindString(26, firmwareRevision);
        }
    }

    @Override
    protected final void bindValues(SQLiteStatement stmt, Key entity) {
        stmt.clearBindings();
 
        Long id = entity.getId();
        if (id != null) {
            stmt.bindLong(1, id);
        }
 
        String accessToken = entity.getAccessToken();
        if (accessToken != null) {
            stmt.bindString(2, accessToken);
        }
 
        String keyStatus = entity.getKeyStatus();
        if (keyStatus != null) {
            stmt.bindString(3, keyStatus);
        }
        stmt.bindLong(4, entity.getLockId());
        stmt.bindLong(5, entity.getKeyId());
        stmt.bindLong(6, entity.getIsAdmin() ? 1L: 0L);
 
        String lockVersion = entity.getLockVersion();
        if (lockVersion != null) {
            stmt.bindString(7, lockVersion);
        }
 
        String lockName = entity.getLockName();
        if (lockName != null) {
            stmt.bindString(8, lockName);
        }
 
        String lockAlias = entity.getLockAlias();
        if (lockAlias != null) {
            stmt.bindString(9, lockAlias);
        }
 
        String lockMac = entity.getLockMac();
        if (lockMac != null) {
            stmt.bindString(10, lockMac);
        }
        stmt.bindLong(11, entity.getBattery());
        stmt.bindLong(12, entity.getLockFlagPos());
 
        String adminPs = entity.getAdminPs();
        if (adminPs != null) {
            stmt.bindString(13, adminPs);
        }
 
        String unlockKey = entity.getUnlockKey();
        if (unlockKey != null) {
            stmt.bindString(14, unlockKey);
        }
 
        String adminKeyboardPwd = entity.getAdminKeyboardPwd();
        if (adminKeyboardPwd != null) {
            stmt.bindString(15, adminKeyboardPwd);
        }
 
        String deletePwd = entity.getDeletePwd();
        if (deletePwd != null) {
            stmt.bindString(16, deletePwd);
        }
 
        String pwdInfo = entity.getPwdInfo();
        if (pwdInfo != null) {
            stmt.bindString(17, pwdInfo);
        }
        stmt.bindLong(18, entity.getTimestamp());
 
        String aesKeystr = entity.getAesKeystr();
        if (aesKeystr != null) {
            stmt.bindString(19, aesKeystr);
        }
        stmt.bindLong(20, entity.getStartDate());
        stmt.bindLong(21, entity.getEndDate());
        stmt.bindLong(22, entity.getSpecialValue());
        stmt.bindLong(23, entity.getTimezoneRawOffset());
 
        String modelNumber = entity.getModelNumber();
        if (modelNumber != null) {
            stmt.bindString(24, modelNumber);
        }
 
        String hardwareRevision = entity.getHardwareRevision();
        if (hardwareRevision != null) {
            stmt.bindString(25, hardwareRevision);
        }
 
        String firmwareRevision = entity.getFirmwareRevision();
        if (firmwareRevision != null) {
            stmt.bindString(26, firmwareRevision);
        }
    }

    @Override
    public Long readKey(Cursor cursor, int offset) {
        return cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0);
    }    

    @Override
    public Key readEntity(Cursor cursor, int offset) {
        Key entity = new Key( //
            cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0), // id
            cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1), // accessToken
            cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2), // keyStatus
            cursor.getInt(offset + 3), // lockId
            cursor.getInt(offset + 4), // keyId
            cursor.getShort(offset + 5) != 0, // isAdmin
            cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6), // lockVersion
            cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7), // lockName
            cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8), // lockAlias
            cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9), // lockMac
            cursor.getInt(offset + 10), // battery
            cursor.getInt(offset + 11), // lockFlagPos
            cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12), // adminPs
            cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13), // unlockKey
            cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14), // adminKeyboardPwd
            cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15), // deletePwd
            cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16), // pwdInfo
            cursor.getLong(offset + 17), // timestamp
            cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18), // aesKeystr
            cursor.getLong(offset + 19), // startDate
            cursor.getLong(offset + 20), // endDate
            cursor.getInt(offset + 21), // specialValue
            cursor.getInt(offset + 22), // timezoneRawOffset
            cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23), // modelNumber
            cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24), // hardwareRevision
            cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25) // firmwareRevision
        );
        return entity;
    }
     
    @Override
    public void readEntity(Cursor cursor, Key entity, int offset) {
        entity.setId(cursor.isNull(offset + 0) ? null : cursor.getLong(offset + 0));
        entity.setAccessToken(cursor.isNull(offset + 1) ? null : cursor.getString(offset + 1));
        entity.setKeyStatus(cursor.isNull(offset + 2) ? null : cursor.getString(offset + 2));
        entity.setLockId(cursor.getInt(offset + 3));
        entity.setKeyId(cursor.getInt(offset + 4));
        entity.setIsAdmin(cursor.getShort(offset + 5) != 0);
        entity.setLockVersion(cursor.isNull(offset + 6) ? null : cursor.getString(offset + 6));
        entity.setLockName(cursor.isNull(offset + 7) ? null : cursor.getString(offset + 7));
        entity.setLockAlias(cursor.isNull(offset + 8) ? null : cursor.getString(offset + 8));
        entity.setLockMac(cursor.isNull(offset + 9) ? null : cursor.getString(offset + 9));
        entity.setBattery(cursor.getInt(offset + 10));
        entity.setLockFlagPos(cursor.getInt(offset + 11));
        entity.setAdminPs(cursor.isNull(offset + 12) ? null : cursor.getString(offset + 12));
        entity.setUnlockKey(cursor.isNull(offset + 13) ? null : cursor.getString(offset + 13));
        entity.setAdminKeyboardPwd(cursor.isNull(offset + 14) ? null : cursor.getString(offset + 14));
        entity.setDeletePwd(cursor.isNull(offset + 15) ? null : cursor.getString(offset + 15));
        entity.setPwdInfo(cursor.isNull(offset + 16) ? null : cursor.getString(offset + 16));
        entity.setTimestamp(cursor.getLong(offset + 17));
        entity.setAesKeystr(cursor.isNull(offset + 18) ? null : cursor.getString(offset + 18));
        entity.setStartDate(cursor.getLong(offset + 19));
        entity.setEndDate(cursor.getLong(offset + 20));
        entity.setSpecialValue(cursor.getInt(offset + 21));
        entity.setTimezoneRawOffset(cursor.getInt(offset + 22));
        entity.setModelNumber(cursor.isNull(offset + 23) ? null : cursor.getString(offset + 23));
        entity.setHardwareRevision(cursor.isNull(offset + 24) ? null : cursor.getString(offset + 24));
        entity.setFirmwareRevision(cursor.isNull(offset + 25) ? null : cursor.getString(offset + 25));
     }
    
    @Override
    protected final Long updateKeyAfterInsert(Key entity, long rowId) {
        entity.setId(rowId);
        return rowId;
    }
    
    @Override
    public Long getKey(Key entity) {
        if(entity != null) {
            return entity.getId();
        } else {
            return null;
        }
    }

    @Override
    public boolean hasKey(Key entity) {
        return entity.getId() != null;
    }

    @Override
    protected final boolean isEntityUpdateable() {
        return true;
    }
    
}
