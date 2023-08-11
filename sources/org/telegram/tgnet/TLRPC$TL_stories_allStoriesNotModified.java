package org.telegram.tgnet;
public class TLRPC$TL_stories_allStoriesNotModified extends TLRPC$stories_AllStories {
    public static int constructor = 291044926;
    public int flags;
    public String state;
    public TLRPC$TL_storiesStealthMode stealth_mode;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.state = abstractSerializedData.readString(z);
        this.stealth_mode = TLRPC$TL_storiesStealthMode.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeString(this.state);
        this.stealth_mode.serializeToStream(abstractSerializedData);
    }
}
