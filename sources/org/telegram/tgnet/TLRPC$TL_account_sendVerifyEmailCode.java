package org.telegram.tgnet;
public class TLRPC$TL_account_sendVerifyEmailCode extends TLObject {
    public static int constructor = -1730136133;
    public String email;
    public TLRPC$EmailVerifyPurpose purpose;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_account_sentEmailCode.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.purpose.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.email);
    }
}
