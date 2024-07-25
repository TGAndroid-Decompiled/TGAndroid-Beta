package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Peer;
public class TL_stories$TL_foundStory extends TLObject {
    public TLRPC$Peer peer;
    public TL_stories$StoryItem storyItem;

    public static TL_stories$TL_foundStory TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-394605632 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_foundStory", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_foundStory tL_stories$TL_foundStory = new TL_stories$TL_foundStory();
        tL_stories$TL_foundStory.readParams(abstractSerializedData, z);
        return tL_stories$TL_foundStory;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.storyItem = TL_stories$StoryItem.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-394605632);
        this.peer.serializeToStream(abstractSerializedData);
        this.storyItem.serializeToStream(abstractSerializedData);
    }
}
