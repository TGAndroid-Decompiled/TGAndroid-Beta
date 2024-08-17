package org.telegram.tgnet;

public class TLRPC$TL_documentEmpty extends TLRPC$Document {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(922273905);
        abstractSerializedData.writeInt64(this.id);
    }
}
