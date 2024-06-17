package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Reaction;

public class TL_stories$TL_storyReaction extends TL_stories$StoryReaction {
    public int date;
    public TLRPC$Reaction reaction;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.date = abstractSerializedData.readInt32(z);
        this.reaction = TLRPC$Reaction.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1620104917);
        this.peer_id.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.date);
        this.reaction.serializeToStream(abstractSerializedData);
    }
}
