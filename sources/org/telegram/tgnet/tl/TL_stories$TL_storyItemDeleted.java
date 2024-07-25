package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
public class TL_stories$TL_storyItemDeleted extends TL_stories$StoryItem {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1374088783);
        abstractSerializedData.writeInt32(this.id);
    }
}
