package org.telegram.tgnet;
public class TLRPC$TL_inputMessagesFilterChatPhotos extends TLRPC$MessagesFilter {
    public static int constructor = 975236280;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
