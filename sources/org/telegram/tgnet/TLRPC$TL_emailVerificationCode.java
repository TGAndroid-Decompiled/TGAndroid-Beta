package org.telegram.tgnet;

public class TLRPC$TL_emailVerificationCode extends TLRPC$EmailVerification {
    public String code;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.code = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1842457175);
        abstractSerializedData.writeString(this.code);
    }
}
