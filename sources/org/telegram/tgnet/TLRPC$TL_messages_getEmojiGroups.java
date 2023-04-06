package org.telegram.tgnet;
public class TLRPC$TL_messages_getEmojiGroups extends TLObject {
    public static int constructor = 1955122779;
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
