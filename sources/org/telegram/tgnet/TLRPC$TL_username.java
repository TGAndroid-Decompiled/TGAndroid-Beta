package org.telegram.tgnet;

public class TLRPC$TL_username extends TLObject {
    public static int constructor = -1274595769;
    public boolean active;
    public boolean editable;
    public int flags;
    public String username;

    public static TLRPC$TL_username TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_username", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_username tLRPC$TL_username = new TLRPC$TL_username();
        tLRPC$TL_username.readParams(abstractSerializedData, z);
        return tLRPC$TL_username;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.editable = (readInt32 & 1) != 0;
        this.active = (readInt32 & 2) != 0;
        this.username = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.editable ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.active ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeString(this.username);
    }
}
