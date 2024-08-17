package org.telegram.tgnet;

public class TLRPC$TL_emailVerificationGoogle extends TLRPC$EmailVerification {
    public String token;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.token = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-611279166);
        abstractSerializedData.writeString(this.token);
    }
}
