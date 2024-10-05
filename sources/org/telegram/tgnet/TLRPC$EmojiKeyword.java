package org.telegram.tgnet;

public abstract class TLRPC$EmojiKeyword extends TLObject {
    public static TLRPC$EmojiKeyword TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EmojiKeyword tLRPC$TL_emojiKeywordDeleted = i != -709641735 ? i != 594408994 ? null : new TLRPC$TL_emojiKeywordDeleted() : new TLRPC$TL_emojiKeyword();
        if (tLRPC$TL_emojiKeywordDeleted == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in EmojiKeyword", Integer.valueOf(i)));
        }
        if (tLRPC$TL_emojiKeywordDeleted != null) {
            tLRPC$TL_emojiKeywordDeleted.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_emojiKeywordDeleted;
    }
}
