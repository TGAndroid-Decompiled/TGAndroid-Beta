package org.telegram.ui.Stories;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$StoryItem;
import org.telegram.tgnet.TLRPC$TL_messageMediaStory;
public class MessageMediaStoryFull extends TLRPC$TL_messageMediaStory {
    public static int constructor = -946147811;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.id = abstractSerializedData.readInt32(z);
        this.storyItem = TLRPC$StoryItem.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.via_mention = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.id);
        this.storyItem.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.via_mention);
    }
}
