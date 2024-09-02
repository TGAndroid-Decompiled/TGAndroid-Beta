package org.telegram.tgnet;

public abstract class TLRPC$messages_FeaturedStickers extends TLObject {
    public static TLRPC$messages_FeaturedStickers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_FeaturedStickers tLRPC$TL_messages_featuredStickers;
        if (i == -1103615738) {
            tLRPC$TL_messages_featuredStickers = new TLRPC$TL_messages_featuredStickers();
        } else {
            tLRPC$TL_messages_featuredStickers = i != -958657434 ? null : new TLRPC$messages_FeaturedStickers() {
                public int count;

                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.count = abstractSerializedData2.readInt32(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-958657434);
                    abstractSerializedData2.writeInt32(this.count);
                }
            };
        }
        if (tLRPC$TL_messages_featuredStickers == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_FeaturedStickers", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_featuredStickers != null) {
            tLRPC$TL_messages_featuredStickers.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_featuredStickers;
    }
}
