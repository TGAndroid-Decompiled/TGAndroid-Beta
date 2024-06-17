package org.telegram.tgnet;

public class TLRPC$TL_account_getDefaultEmojiStatuses extends TLObject {
    public long hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$account_EmojiStatuses.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-696962170);
        abstractSerializedData.writeInt64(this.hash);
    }
}
