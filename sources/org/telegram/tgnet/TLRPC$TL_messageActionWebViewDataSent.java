package org.telegram.tgnet;

public class TLRPC$TL_messageActionWebViewDataSent extends TLRPC$MessageAction {
    public String text;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.text = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1262252875);
        abstractSerializedData.writeString(this.text);
    }
}
