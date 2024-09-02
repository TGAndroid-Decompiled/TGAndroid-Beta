package org.telegram.tgnet;

public class TLRPC$TL_messages_sendPaidReaction extends TLObject {
    public int count;
    public int flags;
    public boolean isPrivate;
    public int msg_id;
    public TLRPC$InputPeer peer;
    public long random_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(633929278);
        int i = this.isPrivate ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.msg_id);
        abstractSerializedData.writeInt32(this.count);
        abstractSerializedData.writeInt64(this.random_id);
    }
}
