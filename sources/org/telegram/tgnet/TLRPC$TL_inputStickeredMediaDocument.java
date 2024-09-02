package org.telegram.tgnet;

public class TLRPC$TL_inputStickeredMediaDocument extends TLRPC$InputStickeredMedia {
    public TLRPC$InputDocument id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = TLRPC$InputDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(70813275);
        this.id.serializeToStream(abstractSerializedData);
    }
}
