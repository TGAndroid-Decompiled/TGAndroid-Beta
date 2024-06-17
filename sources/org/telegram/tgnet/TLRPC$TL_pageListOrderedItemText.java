package org.telegram.tgnet;

public class TLRPC$TL_pageListOrderedItemText extends TLRPC$PageListOrderedItem {
    public String num;
    public TLRPC$RichText text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.num = abstractSerializedData.readString(z);
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1577484359);
        abstractSerializedData.writeString(this.num);
        this.text.serializeToStream(abstractSerializedData);
    }
}
