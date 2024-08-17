package org.telegram.tgnet;

public class TLRPC$TL_inputMediaDice extends TLRPC$InputMedia {
    public String emoticon;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.emoticon = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-428884101);
        abstractSerializedData.writeString(this.emoticon);
    }
}
