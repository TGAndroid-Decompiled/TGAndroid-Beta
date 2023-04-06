package org.telegram.tgnet;
public abstract class TLRPC$messages_RecentStickers extends TLObject {
    public static TLRPC$messages_RecentStickers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_RecentStickers tLRPC$TL_messages_recentStickers;
        if (i == -1999405994) {
            tLRPC$TL_messages_recentStickers = new TLRPC$TL_messages_recentStickers();
        } else {
            tLRPC$TL_messages_recentStickers = i != 186120336 ? null : new TLRPC$messages_RecentStickers() {
                public static int constructor = 186120336;

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(constructor);
                }
            };
        }
        if (tLRPC$TL_messages_recentStickers == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_RecentStickers", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_recentStickers != null) {
            tLRPC$TL_messages_recentStickers.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_recentStickers;
    }
}
