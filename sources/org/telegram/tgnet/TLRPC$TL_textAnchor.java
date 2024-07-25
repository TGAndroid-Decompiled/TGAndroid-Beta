package org.telegram.tgnet;
public class TLRPC$TL_textAnchor extends TLRPC$RichText {
    public String name;
    public TLRPC$RichText text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.name = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(894777186);
        this.text.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.name);
    }
}
