package org.telegram.tgnet;
public class TLRPC$TL_emailVerifyPurposeLoginSetup extends TLRPC$EmailVerifyPurpose {
    public static int constructor = 1128644211;
    public String phone_code_hash;
    public String phone_number;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.phone_number = abstractSerializedData.readString(z);
        this.phone_code_hash = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.phone_number);
        abstractSerializedData.writeString(this.phone_code_hash);
    }
}
