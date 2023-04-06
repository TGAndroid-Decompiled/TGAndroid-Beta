package org.telegram.tgnet;
public class TLRPC$TL_updatePeerHistoryTTL extends TLRPC$Update {
    public static int constructor = -1147422299;
    public int flags;
    public TLRPC$Peer peer;
    public int ttl_period;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.ttl_period = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.ttl_period);
        }
    }
}
