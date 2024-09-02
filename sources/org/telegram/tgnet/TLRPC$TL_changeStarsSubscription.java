package org.telegram.tgnet;

public class TLRPC$TL_changeStarsSubscription extends TLObject {
    public Boolean canceled;
    public int flags;
    public TLRPC$InputPeer peer;
    public String subscription_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-948500360);
        int i = this.canceled != null ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.subscription_id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeBool(this.canceled.booleanValue());
        }
    }
}
