package org.telegram.tgnet;

public class TLRPC$TL_updateMessageID extends TLRPC$Update {
    public static int constructor = 1318109142;
    public int f980id;
    public long random_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f980id = abstractSerializedData.readInt32(z);
        this.random_id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.f980id);
        abstractSerializedData.writeInt64(this.random_id);
    }
}
