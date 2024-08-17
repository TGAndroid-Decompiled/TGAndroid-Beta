package org.telegram.tgnet;

public class TLRPC$TL_pageBlockPreformatted extends TLRPC$PageBlock {
    public String language;
    public TLRPC$RichText text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.language = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1066346178);
        this.text.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.language);
    }
}
