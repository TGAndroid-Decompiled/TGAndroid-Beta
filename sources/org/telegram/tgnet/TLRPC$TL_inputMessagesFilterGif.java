package org.telegram.tgnet;
public class TLRPC$TL_inputMessagesFilterGif extends TLRPC$MessagesFilter {
    public static int constructor = -3644025;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
