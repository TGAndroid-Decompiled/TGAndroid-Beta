package org.telegram.tgnet;

public class TLRPC$TL_sendMessageCancelAction extends TLRPC$SendMessageAction {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-44119819);
    }
}
