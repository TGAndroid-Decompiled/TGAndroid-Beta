package org.telegram.tgnet;
public class TLRPC$TL_textPhone extends TLRPC$RichText {
    public String phone;
    public TLRPC$RichText text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.phone = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(483104362);
        this.text.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.phone);
    }
}
