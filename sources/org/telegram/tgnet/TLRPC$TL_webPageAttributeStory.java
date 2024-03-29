package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_stories$StoryItem;
public class TLRPC$TL_webPageAttributeStory extends TLRPC$WebPageAttribute {
    public int id;
    public TLRPC$Peer peer;
    public TL_stories$StoryItem storyItem;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.id = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.storyItem = TL_stories$StoryItem.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(781501415);
        abstractSerializedData.writeInt32(this.flags);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & 1) != 0) {
            this.storyItem.serializeToStream(abstractSerializedData);
        }
    }
}
