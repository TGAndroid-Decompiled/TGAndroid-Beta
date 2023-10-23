package org.telegram.tgnet;
public class TLRPC$TL_messages_setChatAvailableReactions extends TLObject {
    public TLRPC$ChatReactions available_reactions;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-21928079);
        this.peer.serializeToStream(abstractSerializedData);
        this.available_reactions.serializeToStream(abstractSerializedData);
    }
}
