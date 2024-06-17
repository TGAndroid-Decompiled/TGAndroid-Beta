package org.telegram.tgnet;

public class TLRPC$TL_updateUserEmojiStatus extends TLRPC$Update {
    public TLRPC$EmojiStatus emoji_status;
    public long user_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.user_id = abstractSerializedData.readInt64(z);
        this.emoji_status = TLRPC$EmojiStatus.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(674706841);
        abstractSerializedData.writeInt64(this.user_id);
        this.emoji_status.serializeToStream(abstractSerializedData);
    }
}
