package org.telegram.tgnet;

public class TLRPC$TL_inputMessagesFilterPinned extends TLRPC$MessagesFilter {
    public static int constructor = 464520273;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
