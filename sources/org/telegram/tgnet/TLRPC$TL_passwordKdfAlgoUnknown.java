package org.telegram.tgnet;

public class TLRPC$TL_passwordKdfAlgoUnknown extends TLRPC$PasswordKdfAlgo {
    public static int constructor = -732254058;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
