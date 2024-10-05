package org.telegram.tgnet;

public abstract class TLRPC$ReactionNotificationsFrom extends TLObject {
    public static TLRPC$ReactionNotificationsFrom TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ReactionNotificationsFrom tLRPC$TL_reactionNotificationsFromAll = i != -1161583078 ? i != 1268654752 ? null : new TLRPC$TL_reactionNotificationsFromAll() : new TLRPC$TL_reactionNotificationsFromContacts();
        if (tLRPC$TL_reactionNotificationsFromAll == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ReactionNotificationsFrom", Integer.valueOf(i)));
        }
        if (tLRPC$TL_reactionNotificationsFromAll != null) {
            tLRPC$TL_reactionNotificationsFromAll.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_reactionNotificationsFromAll;
    }
}
