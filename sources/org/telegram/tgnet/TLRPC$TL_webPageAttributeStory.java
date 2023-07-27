package org.telegram.tgnet;
public class TLRPC$TL_webPageAttributeStory extends TLRPC$WebPageAttribute {
    public int id;
    public TLRPC$StoryItem storyItem;
    public long user_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.user_id = abstractSerializedData.readInt64(z);
        this.id = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.storyItem = TLRPC$StoryItem.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        if (this.storyItem != null) {
            this.flags |= 1;
        } else {
            this.flags &= -2;
        }
        abstractSerializedData.writeInt32(-1818605967);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & 1) != 0) {
            this.storyItem.serializeToStream(abstractSerializedData);
        }
    }
}
