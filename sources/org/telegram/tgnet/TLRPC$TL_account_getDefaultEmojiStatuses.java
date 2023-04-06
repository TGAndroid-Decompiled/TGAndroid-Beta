package org.telegram.tgnet;
public class TLRPC$TL_account_getDefaultEmojiStatuses extends TLObject {
    public static int constructor = -696962170;
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$account_EmojiStatuses.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.hash);
    }
}
