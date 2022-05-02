package org.telegram.tgnet;

public class TLRPC$TL_messageActionPinMessage extends TLRPC$MessageAction {
    public static int constructor = -1799538451;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
