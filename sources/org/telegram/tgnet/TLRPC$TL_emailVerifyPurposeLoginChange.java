package org.telegram.tgnet;

public class TLRPC$TL_emailVerifyPurposeLoginChange extends TLRPC$EmailVerifyPurpose {
    public static int constructor = 1383932651;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
