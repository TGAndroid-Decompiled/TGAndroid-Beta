package org.telegram.tgnet;
public class TLRPC$TL_account_verifyEmail extends TLObject {
    public TLRPC$EmailVerifyPurpose purpose;
    public TLRPC$EmailVerification verification;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$account_EmailVerified.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(53322959);
        this.purpose.serializeToStream(abstractSerializedData);
        this.verification.serializeToStream(abstractSerializedData);
    }
}
