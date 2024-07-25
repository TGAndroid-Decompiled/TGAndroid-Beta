package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
public class TL_stories$TL_stories_allStoriesNotModified extends TL_stories$stories_AllStories {
    public int flags;
    public String state;
    public TL_stories$TL_storiesStealthMode stealth_mode;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.state = abstractSerializedData.readString(z);
        this.stealth_mode = TL_stories$TL_storiesStealthMode.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(291044926);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.state);
        this.stealth_mode.serializeToStream(abstractSerializedData);
    }
}
