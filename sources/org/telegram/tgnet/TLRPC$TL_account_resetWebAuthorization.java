package org.telegram.tgnet;

public class TLRPC$TL_account_resetWebAuthorization extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(755087855);
        abstractSerializedData.writeInt64(this.hash);
    }
}
