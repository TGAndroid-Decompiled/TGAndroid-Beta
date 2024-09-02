package org.telegram.tgnet;

public class TLRPC$TL_updateNewStoryReaction extends TLRPC$Update {
    public TLRPC$Peer peer;
    public TLRPC$Reaction reaction;
    public int story_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.story_id = abstractSerializedData.readInt32(z);
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.reaction = TLRPC$Reaction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(405070859);
        abstractSerializedData.writeInt32(this.story_id);
        this.peer.serializeToStream(abstractSerializedData);
        this.reaction.serializeToStream(abstractSerializedData);
    }
}
