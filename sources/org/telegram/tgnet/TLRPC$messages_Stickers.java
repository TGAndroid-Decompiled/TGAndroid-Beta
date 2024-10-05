package org.telegram.tgnet;

public abstract class TLRPC$messages_Stickers extends TLObject {
    public static TLRPC$messages_Stickers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_Stickers tLRPC$TL_messages_stickers = i != -244016606 ? i != 816245886 ? null : new TLRPC$TL_messages_stickers() : new TLRPC$messages_Stickers() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-244016606);
            }
        };
        if (tLRPC$TL_messages_stickers == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_Stickers", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_stickers != null) {
            tLRPC$TL_messages_stickers.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_stickers;
    }
}
