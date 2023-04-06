package org.telegram.tgnet;
public class TLRPC$TL_messages_getEmojiProfilePhotoGroups extends TLObject {
    public static int constructor = 564480243;
    public int hash;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_EmojiGroups.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.hash);
    }
}
