package org.telegram.tgnet;
public class TLRPC$TL_messages_setChatAvailableReactions extends TLObject {
    public TLRPC$ChatReactions available_reactions;
    public int flags;
    public TLRPC$InputPeer peer;
    public int reactions_limit;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1511328724);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        this.available_reactions.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.reactions_limit);
        }
    }
}
