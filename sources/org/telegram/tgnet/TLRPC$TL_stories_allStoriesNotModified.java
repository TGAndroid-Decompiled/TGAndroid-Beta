package org.telegram.tgnet;
public class TLRPC$TL_stories_allStoriesNotModified extends TLRPC$stories_AllStories {
    public static int constructor = 1205903486;
    public String state;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.state = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.state);
    }
}
