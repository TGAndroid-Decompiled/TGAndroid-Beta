package org.telegram.tgnet;
public class TLRPC$TL_auth_signIn extends TLObject {
    public static int constructor = -1923962543;
    public TLRPC$EmailVerification email_verification;
    public int flags;
    public String phone_code;
    public String phone_code_hash;
    public String phone_number;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$auth_Authorization.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.phone_number);
        abstractSerializedData.writeString(this.phone_code_hash);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.phone_code);
        }
        if ((this.flags & 2) != 0) {
            this.email_verification.serializeToStream(abstractSerializedData);
        }
    }
}
