package org.telegram.tgnet;

public abstract class TLRPC$messages_AvailableReactions extends TLObject {
    public static TLRPC$messages_AvailableReactions TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_AvailableReactions tLRPC$messages_AvailableReactions;
        if (i != -1626924713) {
            tLRPC$messages_AvailableReactions = i != 1989032621 ? null : new TLRPC$TL_messages_availableReactions();
        } else {
            tLRPC$messages_AvailableReactions = new TLRPC$messages_AvailableReactions() {
                public static int constructor = -1626924713;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        }
        if (tLRPC$messages_AvailableReactions != null || !z) {
            if (tLRPC$messages_AvailableReactions != null) {
                tLRPC$messages_AvailableReactions.readParams(abstractSerializedData, z);
            }
            return tLRPC$messages_AvailableReactions;
        }
        throw new RuntimeException(String.format("can't parse magic %x in messages_AvailableReactions", Integer.valueOf(i)));
    }
}
