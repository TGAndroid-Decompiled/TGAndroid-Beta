package org.telegram.tgnet;

public class TLRPC$TL_textPlain extends TLRPC$RichText {
    public String text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1950782688);
        abstractSerializedData.writeString(this.text);
    }
}
