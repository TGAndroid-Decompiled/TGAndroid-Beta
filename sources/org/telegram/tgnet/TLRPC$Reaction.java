package org.telegram.tgnet;

public abstract class TLRPC$Reaction extends TLObject {
    public long tag_long_id;

    public static TLRPC$Reaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Reaction tLRPC$TL_reactionEmpty = i != -1992950669 ? i != 455247544 ? i != 1379771627 ? i != 2046153753 ? null : new TLRPC$TL_reactionEmpty() : new TLRPC$TL_reactionPaid() : new TLRPC$TL_reactionEmoji() : new TLRPC$TL_reactionCustomEmoji();
        if (tLRPC$TL_reactionEmpty == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Reaction", Integer.valueOf(i)));
        }
        if (tLRPC$TL_reactionEmpty != null) {
            tLRPC$TL_reactionEmpty.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_reactionEmpty;
    }

    public boolean equals(TLRPC$Reaction tLRPC$Reaction) {
        if (tLRPC$Reaction == null) {
            return false;
        }
        if ((this instanceof TLRPC$TL_reactionEmpty) && (tLRPC$Reaction instanceof TLRPC$TL_reactionEmpty)) {
            return true;
        }
        return ((this instanceof TLRPC$TL_reactionEmoji) && (tLRPC$Reaction instanceof TLRPC$TL_reactionEmoji)) ? ((TLRPC$TL_reactionEmoji) this).emoticon == ((TLRPC$TL_reactionEmoji) tLRPC$Reaction).emoticon : (this instanceof TLRPC$TL_reactionCustomEmoji) && (tLRPC$Reaction instanceof TLRPC$TL_reactionCustomEmoji) && ((TLRPC$TL_reactionCustomEmoji) this).document_id == ((TLRPC$TL_reactionCustomEmoji) tLRPC$Reaction).document_id;
    }
}
