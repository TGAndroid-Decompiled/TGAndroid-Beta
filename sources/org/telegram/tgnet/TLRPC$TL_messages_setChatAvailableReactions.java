package org.telegram.tgnet;

public class TLRPC$TL_messages_setChatAvailableReactions extends TLObject {
    public static int constructor = -21928079;
    public TLRPC$ChatReactions available_reactions;
    public TLRPC$InputPeer peer;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.peer.serializeToStream(abstractSerializedData);
        this.available_reactions.serializeToStream(abstractSerializedData);
    }
}
