package org.telegram.tgnet;

public class TLRPC$TL_messageActionPrizeStars extends TLRPC$MessageAction {
    public TLRPC$Peer boost_peer;
    public int flags;
    public int giveaway_msg_id;
    public long stars;
    public String transaction_id;
    public boolean unclaimed;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.unclaimed = (readInt32 & 1) != 0;
        this.stars = abstractSerializedData.readInt64(z);
        this.transaction_id = abstractSerializedData.readString(z);
        this.boost_peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.giveaway_msg_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1341372510);
        int i = this.unclaimed ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.stars);
        abstractSerializedData.writeString(this.transaction_id);
        this.boost_peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.giveaway_msg_id);
    }
}
