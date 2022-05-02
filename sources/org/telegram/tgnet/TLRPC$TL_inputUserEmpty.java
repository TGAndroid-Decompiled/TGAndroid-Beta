package org.telegram.tgnet;

public class TLRPC$TL_inputUserEmpty extends TLRPC$InputUser {
    public static int constructor = -1182234929;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
