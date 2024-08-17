package org.telegram.tgnet;

public class TLRPC$TL_timezone extends TLObject {
    public String id;
    public String name;
    public int utc_offset;

    public static TLRPC$TL_timezone TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != -7173643) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_timezone", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_timezone tLRPC$TL_timezone = new TLRPC$TL_timezone();
        tLRPC$TL_timezone.readParams(abstractSerializedData, z);
        return tLRPC$TL_timezone;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readString(z);
        this.name = abstractSerializedData.readString(z);
        this.utc_offset = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-7173643);
        abstractSerializedData.writeString(this.id);
        abstractSerializedData.writeString(this.name);
        abstractSerializedData.writeInt32(this.utc_offset);
    }
}
