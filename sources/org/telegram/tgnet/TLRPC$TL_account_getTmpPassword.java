package org.telegram.tgnet;
public class TLRPC$TL_account_getTmpPassword extends TLObject {
    public TLRPC$InputCheckPasswordSRP password;
    public int period;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_account_tmpPassword.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1151208273);
        this.password.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.period);
    }
}
