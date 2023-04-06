package org.telegram.tgnet;
public class TLRPC$TL_stats_getBroadcastStats extends TLObject {
    public static int constructor = -1421720550;
    public TLRPC$InputChannel channel;
    public boolean dark;
    public int flags;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_stats_broadcastStats.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.dark ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.channel.serializeToStream(abstractSerializedData);
    }
}
