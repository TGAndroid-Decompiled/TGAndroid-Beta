package org.telegram.tgnet;
public class TLRPC$TL_postInteractionCountersStory extends TLRPC$PostInteractionCounters {
    public int forwards;
    public int reactions;
    public int story_id;
    public int views;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.story_id = abstractSerializedData.readInt32(z);
        this.views = abstractSerializedData.readInt32(z);
        this.forwards = abstractSerializedData.readInt32(z);
        this.reactions = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1974989273);
        abstractSerializedData.writeInt32(this.story_id);
        abstractSerializedData.writeInt32(this.views);
        abstractSerializedData.writeInt32(this.forwards);
        abstractSerializedData.writeInt32(this.reactions);
    }
}
