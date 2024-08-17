package org.telegram.tgnet;

public class TLRPC$TL_pageBlockPullquote extends TLRPC$PageBlock {
    public TLRPC$RichText caption;
    public TLRPC$RichText text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.caption = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1329878739);
        this.text.serializeToStream(abstractSerializedData);
        this.caption.serializeToStream(abstractSerializedData);
    }
}
