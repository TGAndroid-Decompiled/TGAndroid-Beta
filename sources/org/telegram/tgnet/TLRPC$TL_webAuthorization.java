package org.telegram.tgnet;

public class TLRPC$TL_webAuthorization extends TLObject {
    public static int constructor = -1493633966;
    public long bot_id;
    public String browser;
    public int date_active;
    public int date_created;
    public String domain;
    public long hash;
    public String f984ip;
    public String platform;
    public String region;

    public static TLRPC$TL_webAuthorization TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_webAuthorization", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_webAuthorization tLRPC$TL_webAuthorization = new TLRPC$TL_webAuthorization();
        tLRPC$TL_webAuthorization.readParams(abstractSerializedData, z);
        return tLRPC$TL_webAuthorization;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.hash = abstractSerializedData.readInt64(z);
        this.bot_id = abstractSerializedData.readInt64(z);
        this.domain = abstractSerializedData.readString(z);
        this.browser = abstractSerializedData.readString(z);
        this.platform = abstractSerializedData.readString(z);
        this.date_created = abstractSerializedData.readInt32(z);
        this.date_active = abstractSerializedData.readInt32(z);
        this.f984ip = abstractSerializedData.readString(z);
        this.region = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.hash);
        abstractSerializedData.writeInt64(this.bot_id);
        abstractSerializedData.writeString(this.domain);
        abstractSerializedData.writeString(this.browser);
        abstractSerializedData.writeString(this.platform);
        abstractSerializedData.writeInt32(this.date_created);
        abstractSerializedData.writeInt32(this.date_active);
        abstractSerializedData.writeString(this.f984ip);
        abstractSerializedData.writeString(this.region);
    }
}
