package org.telegram.tgnet;
public class TLRPC$TL_keyboardButton extends TLRPC$KeyboardButton {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1560655744);
        abstractSerializedData.writeString(this.text);
    }
}
