package org.telegram.tgnet;
public class TLRPC$TL_messages_hideChatJoinRequest extends TLObject {
    public boolean approved;
    public int flags;
    public TLRPC$InputPeer peer;
    public TLRPC$InputUser user_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2145904661);
        int i = this.approved ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        this.peer.serializeToStream(abstractSerializedData);
        this.user_id.serializeToStream(abstractSerializedData);
    }
}
