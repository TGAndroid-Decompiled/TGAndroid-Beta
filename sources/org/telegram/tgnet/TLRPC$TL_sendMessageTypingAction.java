package org.telegram.tgnet;

public class TLRPC$TL_sendMessageTypingAction extends TLRPC$SendMessageAction {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(381645902);
    }
}
