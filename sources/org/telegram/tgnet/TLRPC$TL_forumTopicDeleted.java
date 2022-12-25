package org.telegram.tgnet;

public class TLRPC$TL_forumTopicDeleted extends TLRPC$TL_forumTopic {
    public static int constructor = 37687451;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.f901id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.f901id);
    }
}
