package org.telegram.tgnet;
public class TLRPC$TL_emailVerificationCode extends TLRPC$EmailVerification {
    public static int constructor = -1842457175;
    public String code;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.code = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.code);
    }
}
