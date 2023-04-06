package org.telegram.tgnet;
public class TLRPC$TL_emailVerifyPurposePassport extends TLRPC$EmailVerifyPurpose {
    public static int constructor = -1141565819;

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
    }
}
