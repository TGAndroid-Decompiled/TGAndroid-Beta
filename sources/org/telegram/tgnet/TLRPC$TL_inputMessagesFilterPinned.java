package org.telegram.tgnet;

public class TLRPC$TL_inputMessagesFilterPinned extends TLRPC$MessagesFilter {
    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(464520273);
    }
}
