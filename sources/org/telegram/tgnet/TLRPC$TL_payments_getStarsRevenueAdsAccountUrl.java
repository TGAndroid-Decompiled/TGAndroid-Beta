package org.telegram.tgnet;

public class TLRPC$TL_payments_getStarsRevenueAdsAccountUrl extends TLObject {
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_payments_starsRevenueAdsAccountUrl.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-774377531);
        this.peer.serializeToStream(abstractSerializedData);
    }
}
