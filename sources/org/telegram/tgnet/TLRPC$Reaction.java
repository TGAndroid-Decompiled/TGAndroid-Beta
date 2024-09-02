package org.telegram.tgnet;

public abstract class TLRPC$Reaction extends TLObject {
    public long tag_long_id;

    public static TLRPC$Reaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Reaction tLRPC$TL_reactionCustomEmoji;
        switch (i) {
            case -1992950669:
                tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionCustomEmoji();
                break;
            case 455247544:
                tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionEmoji();
                break;
            case 1379771627:
                tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionPaid();
                break;
            case 2046153753:
                tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionEmpty();
                break;
            default:
                tLRPC$TL_reactionCustomEmoji = null;
                break;
        }
        if (tLRPC$TL_reactionCustomEmoji == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Reaction", Integer.valueOf(i)));
        }
        if (tLRPC$TL_reactionCustomEmoji != null) {
            tLRPC$TL_reactionCustomEmoji.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_reactionCustomEmoji;
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
