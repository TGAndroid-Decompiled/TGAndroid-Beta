package org.telegram.tgnet;

public abstract class TLRPC$messages_Reactions extends TLObject {
    public static TLRPC$messages_Reactions TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_Reactions tLRPC$messages_Reactions;
        if (i == -1334846497) {
            tLRPC$messages_Reactions = new TLRPC$messages_Reactions() {
                public static int constructor = -1334846497;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        } else {
            tLRPC$messages_Reactions = i != -352454890 ? null : new TLRPC$TL_messages_reactions();
        }
        if (tLRPC$messages_Reactions == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_Reactions", Integer.valueOf(i)));
        }
        if (tLRPC$messages_Reactions != null) {
            tLRPC$messages_Reactions.readParams(abstractSerializedData, z);
        }
        return tLRPC$messages_Reactions;
    }
}
