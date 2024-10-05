package org.telegram.tgnet;

public class TLRPC$TL_keyboardButtonCopy extends TLRPC$KeyboardButton {
    public String copy_text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
        this.copy_text = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1976723854);
        abstractSerializedData.writeString(this.text);
        abstractSerializedData.writeString(this.copy_text);
    }
}
