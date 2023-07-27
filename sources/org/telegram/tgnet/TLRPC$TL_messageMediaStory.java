package org.telegram.tgnet;
public class TLRPC$TL_messageMediaStory extends TLRPC$MessageMedia {
    public static int constructor = -877523576;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.via_mention = (readInt32 & 2) != 0;
        this.user_id = abstractSerializedData.readInt64(z);
        this.id = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.storyItem = TLRPC$StoryItem.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        this.flags = this.storyItem != null ? this.flags | 1 : this.flags & (-2);
        abstractSerializedData.writeInt32(constructor);
        int i = this.via_mention ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & 1) != 0) {
            this.storyItem.serializeToStream(abstractSerializedData);
        }
    }
}
