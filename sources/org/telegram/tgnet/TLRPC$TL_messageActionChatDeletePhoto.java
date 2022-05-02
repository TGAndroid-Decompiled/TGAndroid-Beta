package org.telegram.tgnet;

public class TLRPC$TL_messageActionChatDeletePhoto extends TLRPC$MessageAction {
    public static int constructor = -1780220945;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
