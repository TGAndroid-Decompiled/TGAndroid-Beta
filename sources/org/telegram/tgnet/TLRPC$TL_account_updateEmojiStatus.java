package org.telegram.tgnet;

public class TLRPC$TL_account_updateEmojiStatus extends TLObject {
    public TLRPC$EmojiStatus emoji_status;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-70001045);
        this.emoji_status.serializeToStream(abstractSerializedData);
    }
}
