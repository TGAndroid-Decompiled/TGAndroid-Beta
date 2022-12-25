package org.telegram.tgnet;

public class TLRPC$TL_photoStrippedSize extends TLRPC$PhotoSize {
    public static int constructor = -525288402;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = abstractSerializedData.readString(z);
        this.bytes = abstractSerializedData.readByteArray(z);
        this.f887h = 50;
        this.f888w = 50;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.type);
        abstractSerializedData.writeByteArray(this.bytes);
    }
}
