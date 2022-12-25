package org.telegram.tgnet;

public class TLRPC$TL_photoCachedSize extends TLRPC$PhotoSize {
    public static int constructor = 35527382;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = abstractSerializedData.readString(z);
        this.f879w = abstractSerializedData.readInt32(z);
        this.f878h = abstractSerializedData.readInt32(z);
        this.bytes = abstractSerializedData.readByteArray(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.type);
        abstractSerializedData.writeInt32(this.f879w);
        abstractSerializedData.writeInt32(this.f878h);
        abstractSerializedData.writeByteArray(this.bytes);
    }
}
