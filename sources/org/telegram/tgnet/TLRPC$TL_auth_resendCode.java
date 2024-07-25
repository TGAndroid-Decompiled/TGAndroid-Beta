package org.telegram.tgnet;
public class TLRPC$TL_auth_resendCode extends TLObject {
    public int flags;
    public String phone_code_hash;
    public String phone_number;
    public String reason;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$auth_SentCode.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-890997469);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.phone_number);
        abstractSerializedData.writeString(this.phone_code_hash);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.reason);
        }
    }
}
