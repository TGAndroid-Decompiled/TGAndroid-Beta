package org.telegram.tgnet;

public class TLRPC$TL_sendMessageEmojiInteractionSeen extends TLRPC$SendMessageAction {
    public String emoticon;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.emoticon = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1234857938);
        abstractSerializedData.writeString(this.emoticon);
    }
}
