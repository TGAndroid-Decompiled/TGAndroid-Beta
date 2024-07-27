package org.telegram.tgnet;
public class TLRPC$TL_inputFileStoryDocument extends TLRPC$InputFile {
    public TLRPC$InputDocument doc;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.doc = TLRPC$InputDocument.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1658620744);
        this.doc.serializeToStream(abstractSerializedData);
    }
}
