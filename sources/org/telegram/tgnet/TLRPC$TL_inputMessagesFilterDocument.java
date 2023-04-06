package org.telegram.tgnet;
public class TLRPC$TL_inputMessagesFilterDocument extends TLRPC$MessagesFilter {
    public static int constructor = -1629621880;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
