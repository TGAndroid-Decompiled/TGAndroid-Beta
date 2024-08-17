package org.telegram.tgnet;

public abstract class TLRPC$ChatReactions extends TLObject {
    public static TLRPC$ChatReactions TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChatReactions tLRPC$TL_chatReactionsSome = i != -352570692 ? i != 1385335754 ? i != 1713193015 ? null : new TLRPC$TL_chatReactionsSome() : new TLRPC$TL_chatReactionsAll() : new TLRPC$TL_chatReactionsNone();
        if (tLRPC$TL_chatReactionsSome == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ChatReactions", Integer.valueOf(i)));
        }
        if (tLRPC$TL_chatReactionsSome != null) {
            tLRPC$TL_chatReactionsSome.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_chatReactionsSome;
    }
}
