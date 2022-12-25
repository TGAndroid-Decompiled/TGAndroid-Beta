package org.telegram.tgnet;

public class TLRPC$TL_authorization extends TLObject {
    public static int constructor = -1392388579;
    public int api_id;
    public String app_name;
    public String app_version;
    public boolean call_requests_disabled;
    public String country;
    public boolean current;
    public int date_active;
    public int date_created;
    public String device_model;
    public boolean encrypted_requests_disabled;
    public int flags;
    public long hash;
    public String f892ip;
    public boolean official_app;
    public boolean password_pending;
    public String platform;
    public String region;
    public String system_version;

    public static TLRPC$TL_authorization TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_authorization", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_authorization tLRPC$TL_authorization = new TLRPC$TL_authorization();
        tLRPC$TL_authorization.readParams(abstractSerializedData, z);
        return tLRPC$TL_authorization;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.current = (readInt32 & 1) != 0;
        this.official_app = (readInt32 & 2) != 0;
        this.password_pending = (readInt32 & 4) != 0;
        this.encrypted_requests_disabled = (readInt32 & 8) != 0;
        this.call_requests_disabled = (readInt32 & 16) != 0;
        this.hash = abstractSerializedData.readInt64(z);
        this.device_model = abstractSerializedData.readString(z);
        this.platform = abstractSerializedData.readString(z);
        this.system_version = abstractSerializedData.readString(z);
        this.api_id = abstractSerializedData.readInt32(z);
        this.app_name = abstractSerializedData.readString(z);
        this.app_version = abstractSerializedData.readString(z);
        this.date_created = abstractSerializedData.readInt32(z);
        this.date_active = abstractSerializedData.readInt32(z);
        this.f892ip = abstractSerializedData.readString(z);
        this.country = abstractSerializedData.readString(z);
        this.region = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.current ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.official_app ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.password_pending ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.encrypted_requests_disabled ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.call_requests_disabled ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        abstractSerializedData.writeInt32(i5);
        abstractSerializedData.writeInt64(this.hash);
        abstractSerializedData.writeString(this.device_model);
        abstractSerializedData.writeString(this.platform);
        abstractSerializedData.writeString(this.system_version);
        abstractSerializedData.writeInt32(this.api_id);
        abstractSerializedData.writeString(this.app_name);
        abstractSerializedData.writeString(this.app_version);
        abstractSerializedData.writeInt32(this.date_created);
        abstractSerializedData.writeInt32(this.date_active);
        abstractSerializedData.writeString(this.f892ip);
        abstractSerializedData.writeString(this.country);
        abstractSerializedData.writeString(this.region);
    }
}
