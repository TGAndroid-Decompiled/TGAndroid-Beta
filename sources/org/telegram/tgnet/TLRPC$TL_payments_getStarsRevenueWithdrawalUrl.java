package org.telegram.tgnet;
public class TLRPC$TL_payments_getStarsRevenueWithdrawalUrl extends TLObject {
    public TLRPC$InputCheckPasswordSRP password;
    public TLRPC$InputPeer peer;
    public long stars;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_payments_starsRevenueWithdrawalUrl.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(331081907);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt64(this.stars);
        this.password.serializeToStream(abstractSerializedData);
    }
}
