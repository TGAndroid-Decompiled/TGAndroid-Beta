package org.telegram.tgnet;
public class TLRPC$TL_forumTopicDeleted extends TLRPC$TL_forumTopic {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(37687451);
        abstractSerializedData.writeInt32(this.id);
    }
}
