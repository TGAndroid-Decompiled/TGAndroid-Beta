package org.telegram.tgnet;

public abstract class TLRPC$messages_EmojiGroups extends TLObject {
    public static TLRPC$messages_EmojiGroups TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_EmojiGroups tLRPC$TL_messages_emojiGroups = i != -2011186869 ? i != 1874111879 ? null : new TLRPC$messages_EmojiGroups() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(1874111879);
            }
        } : new TLRPC$TL_messages_emojiGroups();
        if (tLRPC$TL_messages_emojiGroups == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_EmojiGroups", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_emojiGroups != null) {
            tLRPC$TL_messages_emojiGroups.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_emojiGroups;
    }
}
