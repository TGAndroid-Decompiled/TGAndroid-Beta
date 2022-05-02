package org.telegram.tgnet;

public class TLRPC$TL_chatEmpty extends TLRPC$Chat {
    public static int constructor = 693512293;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f843id = abstractSerializedData.readInt64(z);
        this.title = "DELETED";
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.f843id);
    }
}
