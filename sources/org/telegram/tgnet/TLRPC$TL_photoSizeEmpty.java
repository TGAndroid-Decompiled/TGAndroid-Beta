package org.telegram.tgnet;

public class TLRPC$TL_photoSizeEmpty extends TLRPC$PhotoSize {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(236446268);
        abstractSerializedData.writeString(this.type);
    }
}
