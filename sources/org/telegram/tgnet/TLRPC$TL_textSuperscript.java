package org.telegram.tgnet;
public class TLRPC$TL_textSuperscript extends TLRPC$RichText {
    public TLRPC$RichText text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-939827711);
        this.text.serializeToStream(abstractSerializedData);
    }
}
