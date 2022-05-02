package org.telegram.tgnet;

public class TLRPC$TL_sendMessageEmojiInteractionSeen extends TLRPC$SendMessageAction {
    public static int constructor = -1234857938;
    public String emoticon;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.emoticon = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.emoticon);
    }
}
