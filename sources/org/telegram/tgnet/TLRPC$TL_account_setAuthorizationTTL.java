package org.telegram.tgnet;

public class TLRPC$TL_account_setAuthorizationTTL extends TLObject {
    public int authorization_ttl_days;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1081501024);
        abstractSerializedData.writeInt32(this.authorization_ttl_days);
    }
}
