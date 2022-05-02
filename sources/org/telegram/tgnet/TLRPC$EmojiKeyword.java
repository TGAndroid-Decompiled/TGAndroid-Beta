package org.telegram.tgnet;

public abstract class TLRPC$EmojiKeyword extends TLObject {
    public static TLRPC$EmojiKeyword TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EmojiKeyword tLRPC$EmojiKeyword;
        if (i != -709641735) {
            tLRPC$EmojiKeyword = i != 594408994 ? null : new TLRPC$TL_emojiKeywordDeleted();
        } else {
            tLRPC$EmojiKeyword = new TLRPC$TL_emojiKeyword();
        }
        if (tLRPC$EmojiKeyword != null || !z) {
            if (tLRPC$EmojiKeyword != null) {
                tLRPC$EmojiKeyword.readParams(abstractSerializedData, z);
            }
            return tLRPC$EmojiKeyword;
        }
        throw new RuntimeException(String.format("can't parse magic %x in EmojiKeyword", Integer.valueOf(i)));
    }
}
