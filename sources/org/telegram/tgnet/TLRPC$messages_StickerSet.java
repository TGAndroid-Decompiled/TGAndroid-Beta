package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$messages_StickerSet extends TLObject {
    public TLRPC$StickerSet set;
    public ArrayList packs = new ArrayList();
    public ArrayList keywords = new ArrayList();
    public ArrayList documents = new ArrayList();

    public static TLRPC$TL_messages_stickerSet TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_messages_stickerSet tLRPC$TL_messages_stickerSet = i != -1240849242 ? i != -738646805 ? i != 1846886166 ? null : new TLRPC$TL_messages_stickerSet() : new TLRPC$TL_messages_stickerSet() {
            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-738646805);
            }
        } : new TLRPC$TL_messages_stickerSet() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                this.set = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
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
                    this.documents.add(TLdeserialize2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-1240849242);
                this.set.serializeToStream(abstractSerializedData2);
                abstractSerializedData2.writeInt32(481674261);
                int size = this.packs.size();
                abstractSerializedData2.writeInt32(size);
                for (int i2 = 0; i2 < size; i2++) {
                    ((TLRPC$TL_stickerPack) this.packs.get(i2)).serializeToStream(abstractSerializedData2);
                }
                abstractSerializedData2.writeInt32(481674261);
                int size2 = this.documents.size();
                abstractSerializedData2.writeInt32(size2);
                for (int i3 = 0; i3 < size2; i3++) {
                    ((TLRPC$Document) this.documents.get(i3)).serializeToStream(abstractSerializedData2);
                }
            }
        };
        if (tLRPC$TL_messages_stickerSet == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in messages_StickerSet", Integer.valueOf(i)));
        }
        if (tLRPC$TL_messages_stickerSet != null) {
            tLRPC$TL_messages_stickerSet.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_messages_stickerSet;
    }
}
