package org.telegram.tgnet;
public class TLRPC$TL_fulfillStarsSubscription extends TLObject {
    public TLRPC$InputPeer peer;
    public String subscription_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-866391117);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.subscription_id);
    }
}
