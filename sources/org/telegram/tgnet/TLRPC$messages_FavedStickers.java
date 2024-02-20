package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$messages_FavedStickers extends TLObject {
    public long hash;
    public ArrayList<TLRPC$TL_stickerPack> packs = new ArrayList<>();
    public ArrayList<TLRPC$Document> stickers = new ArrayList<>();

    public static TLRPC$messages_FavedStickers TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$messages_FavedStickers tLRPC$messages_FavedStickers;
        if (i == -1634752813) {
            tLRPC$messages_FavedStickers = new TLRPC$messages_FavedStickers() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(-1634752813);
                }
            };
        } else {
            tLRPC$messages_FavedStickers = i != 750063767 ? null : new TLRPC$messages_FavedStickers() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this.hash = abstractSerializedData2.readInt64(z2);
                    int readInt32 = abstractSerializedData2.readInt32(z2);
                    if (readInt32 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                        }
                        return;
                    }
                    int readInt322 = abstractSerializedData2.readInt32(z2);
                    for (int i2 = 0; i2 < readInt322; i2++) {
                        TLRPC$TL_stickerPack TLdeserialize = TLRPC$TL_stickerPack.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize == null) {
                            return;
                        }
                        this.packs.add(TLdeserialize);
                    }
                    int readInt323 = abstractSerializedData2.readInt32(z2);
                    if (readInt323 != 481674261) {
                        if (z2) {
                            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                        }
                        return;
                    }
                    int readInt324 = abstractSerializedData2.readInt32(z2);
                    for (int i3 = 0; i3 < readInt324; i3++) {
                        TLRPC$Document TLdeserialize2 = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize2 == null) {
                            return;
                        }
                        this.stickers.add(TLdeserialize2);
                    }
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(750063767);
                    abstractSerializedData2.writeInt64(this.hash);
                    abstractSerializedData2.writeInt32(481674261);
                    int size = this.packs.size();
                    abstractSerializedData2.writeInt32(size);
                    for (int i2 = 0; i2 < size; i2++) {
                        this.packs.get(i2).serializeToStream(abstractSerializedData2);
                    }
                    abstractSerializedData2.writeInt32(481674261);
                    int size2 = this.stickers.size();
                    abstractSerializedData2.writeInt32(size2);
                    for (int i3 = 0; i3 < size2; i3++) {
                        this.stickers.get(i3).serializeToStream(abstractSerializedData2);
                    }
                }
            };
        }
        if (tLRPC$messages_FavedStickers == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_FavedStickers", Integer.valueOf(i)));
        }
        if (tLRPC$messages_FavedStickers != null) {
            tLRPC$messages_FavedStickers.readParams(abstractSerializedData, z);
        }
        return tLRPC$messages_FavedStickers;
    }
}
