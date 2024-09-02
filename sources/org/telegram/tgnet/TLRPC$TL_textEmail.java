package org.telegram.tgnet;

public class TLRPC$TL_textEmail extends TLRPC$RichText {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = TLRPC$RichText.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.email = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-564523562);
        this.text.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.email);
    }
}
