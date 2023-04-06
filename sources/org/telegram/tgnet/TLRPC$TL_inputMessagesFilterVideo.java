package org.telegram.tgnet;
public class TLRPC$TL_inputMessagesFilterVideo extends TLRPC$MessagesFilter {
    public static int constructor = -1614803355;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
