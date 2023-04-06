package org.telegram.tgnet;
public class TLRPC$TL_inputMessagesFilterPhotos extends TLRPC$MessagesFilter {
    public static int constructor = -1777752804;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
