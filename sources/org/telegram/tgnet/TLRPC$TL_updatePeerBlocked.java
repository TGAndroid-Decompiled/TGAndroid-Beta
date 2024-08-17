package org.telegram.tgnet;

public class TLRPC$TL_updatePeerBlocked extends TLRPC$Update {
    public boolean blocked;
    public boolean blocked_my_stories_from;
    public int flags;
    public TLRPC$Peer peer_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.blocked = (readInt32 & 1) != 0;
        this.blocked_my_stories_from = (readInt32 & 2) != 0;
        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-337610926);
        int i = this.blocked ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.blocked_my_stories_from ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        this.peer_id.serializeToStream(abstractSerializedData);
    }
}
