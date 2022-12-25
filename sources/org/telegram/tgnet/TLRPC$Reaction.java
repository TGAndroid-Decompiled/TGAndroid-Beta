package org.telegram.tgnet;

public abstract class TLRPC$Reaction extends TLObject {
    public static TLRPC$Reaction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Reaction tLRPC$TL_reactionCustomEmoji;
        if (i == -1992950669) {
            tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionCustomEmoji();
        } else if (i != 455247544) {
            tLRPC$TL_reactionCustomEmoji = i != 2046153753 ? null : new TLRPC$Reaction() {
                public static int constructor = 2046153753;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$TL_reactionCustomEmoji = new TLRPC$TL_reactionEmoji();
        }
        if (tLRPC$TL_reactionCustomEmoji == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Reaction", Integer.valueOf(i)));
        }
        if (tLRPC$TL_reactionCustomEmoji != null) {
            tLRPC$TL_reactionCustomEmoji.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_reactionCustomEmoji;
    }
}
