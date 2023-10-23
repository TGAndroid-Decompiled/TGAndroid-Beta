package org.telegram.tgnet;
public class TLRPC$TL_account_getDefaultProfilePhotoEmojis extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$EmojiList.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-495647960);
        abstractSerializedData.writeInt64(this.hash);
    }
}
