package org.telegram.tgnet;
public abstract class TLRPC$EmojiKeyword extends TLObject {
    public static TLRPC$EmojiKeyword TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EmojiKeyword tLRPC$TL_emojiKeyword;
        if (i != -709641735) {
            tLRPC$TL_emojiKeyword = i != 594408994 ? null : new TLRPC$TL_emojiKeywordDeleted();
        } else {
            tLRPC$TL_emojiKeyword = new TLRPC$TL_emojiKeyword();
        }
        if (tLRPC$TL_emojiKeyword == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in EmojiKeyword", Integer.valueOf(i)));
        }
        if (tLRPC$TL_emojiKeyword != null) {
            tLRPC$TL_emojiKeyword.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_emojiKeyword;
    }
}
