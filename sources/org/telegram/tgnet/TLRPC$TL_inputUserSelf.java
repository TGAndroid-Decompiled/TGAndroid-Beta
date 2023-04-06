package org.telegram.tgnet;
public class TLRPC$TL_inputUserSelf extends TLRPC$InputUser {
    public static int constructor = -138301121;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
