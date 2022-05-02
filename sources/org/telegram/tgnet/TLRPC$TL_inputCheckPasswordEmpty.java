package org.telegram.tgnet;

public class TLRPC$TL_inputCheckPasswordEmpty extends TLRPC$InputCheckPasswordSRP {
    public static int constructor = -1736378792;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
