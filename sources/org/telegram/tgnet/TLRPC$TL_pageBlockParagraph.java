package org.telegram.tgnet;
public class TLRPC$TL_pageBlockParagraph extends TLRPC$PageBlock {
    public TLRPC$RichText text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1182402406);
        this.text.serializeToStream(abstractSerializedData);
    }
}
