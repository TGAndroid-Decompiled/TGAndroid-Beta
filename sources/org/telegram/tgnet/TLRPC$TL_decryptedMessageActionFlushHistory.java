package org.telegram.tgnet;

public class TLRPC$TL_decryptedMessageActionFlushHistory extends TLRPC$DecryptedMessageAction {
    public static int constructor = 1729750108;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
