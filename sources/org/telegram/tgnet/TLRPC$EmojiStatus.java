package org.telegram.tgnet;

public abstract class TLRPC$EmojiStatus extends TLObject {
    public static TLRPC$EmojiStatus TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$EmojiStatus tLRPC$TL_emojiStatusEmpty = i != -1835310691 ? i != -97474361 ? i != 769727150 ? null : new TLRPC$TL_emojiStatusEmpty() : new TLRPC$TL_emojiStatusUntil() : new TLRPC$TL_emojiStatus();
        if (tLRPC$TL_emojiStatusEmpty == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in EmojiStatus", Integer.valueOf(i)));
        }
        if (tLRPC$TL_emojiStatusEmpty != null) {
            tLRPC$TL_emojiStatusEmpty.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_emojiStatusEmpty;
    }
}
