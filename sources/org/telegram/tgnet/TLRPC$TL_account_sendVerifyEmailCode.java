package org.telegram.tgnet;

public class TLRPC$TL_account_sendVerifyEmailCode extends TLObject {
    public String email;
    public TLRPC$EmailVerifyPurpose purpose;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_account_sentEmailCode.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1730136133);
        this.purpose.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.email);
    }
}
