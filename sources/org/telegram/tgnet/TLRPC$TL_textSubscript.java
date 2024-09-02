package org.telegram.tgnet;

public class TLRPC$TL_textSubscript extends TLRPC$RichText {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-311786236);
        this.text.serializeToStream(abstractSerializedData);
    }
}
