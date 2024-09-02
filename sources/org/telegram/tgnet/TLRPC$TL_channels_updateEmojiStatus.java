package org.telegram.tgnet;

public class TLRPC$TL_channels_updateEmojiStatus extends TLObject {
    public TLRPC$InputChannel channel;
    public TLRPC$EmojiStatus emoji_status;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-254548312);
        this.channel.serializeToStream(abstractSerializedData);
        this.emoji_status.serializeToStream(abstractSerializedData);
    }
}
