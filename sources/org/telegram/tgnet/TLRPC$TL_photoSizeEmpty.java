package org.telegram.tgnet;

public class TLRPC$TL_photoSizeEmpty extends TLRPC$PhotoSize {
    public static int constructor = 236446268;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.type);
    }
}
