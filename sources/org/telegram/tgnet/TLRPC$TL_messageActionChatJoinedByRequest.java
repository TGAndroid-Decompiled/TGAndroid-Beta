package org.telegram.tgnet;

public class TLRPC$TL_messageActionChatJoinedByRequest extends TLRPC$MessageAction {
    public static int constructor = -339958837;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
