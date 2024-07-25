package org.telegram.tgnet;
public class TLRPC$TL_messages_getFeaturedEmojiStickers extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_FeaturedStickers.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(248473398);
        abstractSerializedData.writeInt64(this.hash);
    }
}
