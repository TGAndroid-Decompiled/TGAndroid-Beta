package org.telegram.tgnet;
public abstract class TLRPC$messages_Reactions extends TLObject {
    public static TLRPC$messages_Reactions TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_Reactions tLRPC$TL_messages_reactions = i != -1334846497 ? i != -352454890 ? null : new TLRPC$TL_messages_reactions() : new TLRPC$messages_Reactions() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1334846497);
            }
        };
        if (tLRPC$TL_messages_reactions == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_Reactions", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_reactions != null) {
            tLRPC$TL_messages_reactions.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_reactions;
    }
}
