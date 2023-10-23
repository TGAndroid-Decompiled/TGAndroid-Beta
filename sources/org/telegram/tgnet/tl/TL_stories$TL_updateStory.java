package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$Peer;
import org.telegram.tgnet.TLRPC$Update;
public class TL_stories$TL_updateStory extends TLRPC$Update {
    public TLRPC$Peer peer;
    public TL_stories$StoryItem story;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.story = TL_stories$StoryItem.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1974712216);
        this.peer.serializeToStream(abstractSerializedData);
        this.story.serializeToStream(abstractSerializedData);
    }
}
