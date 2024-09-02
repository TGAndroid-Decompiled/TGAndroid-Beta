package org.telegram.tgnet;

public class TLRPC$TL_account_emailVerifiedLogin extends TLRPC$account_EmailVerified {
    public String email;
    public TLRPC$auth_SentCode sent_code;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.email = abstractSerializedData.readString(z);
        this.sent_code = TLRPC$auth_SentCode.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-507835039);
        abstractSerializedData.writeString(this.email);
        this.sent_code.serializeToStream(abstractSerializedData);
    }
}
