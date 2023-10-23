package org.telegram.tgnet;
public class TLRPC$TL_messageReplyStoryHeader extends TLRPC$MessageReplyHeader {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.story_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1667711039);
        abstractSerializedData.writeInt64(this.user_id);
        abstractSerializedData.writeInt32(this.story_id);
    }
}
