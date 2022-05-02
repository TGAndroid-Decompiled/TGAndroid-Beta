package org.telegram.tgnet;

public class TLRPC$TL_inputMessagesFilterUrl extends TLRPC$MessagesFilter {
    public static int constructor = 2129714567;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
