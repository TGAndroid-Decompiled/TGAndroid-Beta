package org.telegram.tgnet;

public class TLRPC$TL_textItalic extends TLRPC$RichText {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-653089380);
        this.text.serializeToStream(abstractSerializedData);
    }
}
