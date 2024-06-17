package org.telegram.tgnet;

public class TLRPC$TL_auth_checkRecoveryPassword extends TLObject {
    public String code;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(221691769);
        abstractSerializedData.writeString(this.code);
    }
}
