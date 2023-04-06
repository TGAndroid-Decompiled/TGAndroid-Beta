package org.telegram.tgnet;
public class TLRPC$TL_inputMessagesFilterMusic extends TLRPC$MessagesFilter {
    public static int constructor = 928101534;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
