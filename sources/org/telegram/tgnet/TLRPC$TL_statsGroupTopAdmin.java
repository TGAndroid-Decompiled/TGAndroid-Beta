package org.telegram.tgnet;

public class TLRPC$TL_statsGroupTopAdmin extends TLObject {
    public static int constructor = -682079097;
    public int banned;
    public int deleted;
    public int kicked;
    public long user_id;

    public static TLRPC$TL_statsGroupTopAdmin TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_statsGroupTopAdmin tLRPC$TL_statsGroupTopAdmin = new TLRPC$TL_statsGroupTopAdmin();
            tLRPC$TL_statsGroupTopAdmin.readParams(abstractSerializedData, z);
            return tLRPC$TL_statsGroupTopAdmin;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_statsGroupTopAdmin", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.deleted = abstractSerializedData.readInt32(z);
        this.kicked = abstractSerializedData.readInt32(z);
        this.banned = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.deleted);
        abstractSerializedData.writeInt32(this.kicked);
        abstractSerializedData.writeInt32(this.banned);
    }
}
