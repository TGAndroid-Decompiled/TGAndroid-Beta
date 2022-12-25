package org.telegram.tgnet;

public abstract class TLRPC$ChatReactions extends TLObject {
    public static TLRPC$ChatReactions TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChatReactions tLRPC$TL_chatReactionsNone;
        if (i == -352570692) {
            tLRPC$TL_chatReactionsNone = new TLRPC$TL_chatReactionsNone();
        } else if (i != 1385335754) {
            tLRPC$TL_chatReactionsNone = i != 1713193015 ? null : new TLRPC$TL_chatReactionsSome();
        } else {
            tLRPC$TL_chatReactionsNone = new TLRPC$TL_chatReactionsAll();
        }
        if (tLRPC$TL_chatReactionsNone == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ChatReactions", Integer.valueOf(i)));
        }
        if (tLRPC$TL_chatReactionsNone != null) {
            tLRPC$TL_chatReactionsNone.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_chatReactionsNone;
    }
}
