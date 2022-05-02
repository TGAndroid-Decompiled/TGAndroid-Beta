package org.telegram.tgnet;

public class TLRPC$TL_stats_getMessagePublicForwards extends TLObject {
    public static int constructor = 1445996571;
    public TLRPC$InputChannel channel;
    public int limit;
    public int msg_id;
    public int offset_id;
    public TLRPC$InputPeer offset_peer;
    public int offset_rate;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_Messages.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.msg_id);
        abstractSerializedData.writeInt32(this.offset_rate);
        this.offset_peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.offset_id);
        abstractSerializedData.writeInt32(this.limit);
    }
}
