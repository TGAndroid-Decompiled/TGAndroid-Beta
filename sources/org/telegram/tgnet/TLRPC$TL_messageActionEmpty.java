package org.telegram.tgnet;

public class TLRPC$TL_messageActionEmpty extends TLRPC$MessageAction {
    public static int constructor = -1230047312;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
