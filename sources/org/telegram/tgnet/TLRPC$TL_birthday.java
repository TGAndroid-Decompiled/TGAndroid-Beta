package org.telegram.tgnet;
public class TLRPC$TL_birthday extends TLObject {
    public int day;
    public int flags;
    public int month;
    public int year;

    public static TLRPC$TL_birthday TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != 1821253126) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_birthday", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_birthday tLRPC$TL_birthday = new TLRPC$TL_birthday();
        tLRPC$TL_birthday.readParams(abstractSerializedData, z);
        return tLRPC$TL_birthday;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.day = abstractSerializedData.readInt32(z);
        this.month = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.year = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1821253126);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.day);
        abstractSerializedData.writeInt32(this.month);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.year);
        }
    }
}
