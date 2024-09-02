package org.telegram.tgnet;

public class TLRPC$TL_textMarked extends TLRPC$RichText {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(55281185);
        this.text.serializeToStream(abstractSerializedData);
    }
}
