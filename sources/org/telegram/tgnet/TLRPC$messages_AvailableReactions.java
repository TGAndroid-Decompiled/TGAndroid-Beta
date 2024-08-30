package org.telegram.tgnet;

public abstract class TLRPC$messages_AvailableReactions extends TLObject {
    public static TLRPC$messages_AvailableReactions TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_AvailableReactions tLRPC$TL_messages_availableReactions = i != -1626924713 ? i != 1989032621 ? null : new TLRPC$TL_messages_availableReactions() : new TLRPC$messages_AvailableReactions() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1626924713);
            }
        };
        if (tLRPC$TL_messages_availableReactions == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_AvailableReactions", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_availableReactions != null) {
            tLRPC$TL_messages_availableReactions.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_availableReactions;
    }
}
