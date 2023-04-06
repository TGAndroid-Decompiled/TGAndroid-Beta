package org.telegram.tgnet;
public class TLRPC$TL_account_getDefaultProfilePhotoEmojis extends TLObject {
    public static int constructor = -495647960;
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$EmojiList.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.hash);
    }
}
