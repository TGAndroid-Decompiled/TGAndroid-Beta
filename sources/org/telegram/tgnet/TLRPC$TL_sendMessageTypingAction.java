package org.telegram.tgnet;

public class TLRPC$TL_sendMessageTypingAction extends TLRPC$SendMessageAction {
    public static int constructor = 381645902;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
