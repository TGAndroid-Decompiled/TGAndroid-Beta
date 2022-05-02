package org.telegram.tgnet;

public class TLRPC$TL_sendMessageCancelAction extends TLRPC$SendMessageAction {
    public static int constructor = -44119819;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
