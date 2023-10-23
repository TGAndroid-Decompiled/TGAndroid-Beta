package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_stickerPack extends TLObject {
    public ArrayList<Long> documents = new ArrayList<>();
    public String emoticon;

    public static TLRPC$TL_stickerPack TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (313694676 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stickerPack", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_stickerPack tLRPC$TL_stickerPack = new TLRPC$TL_stickerPack();
        tLRPC$TL_stickerPack.readParams(abstractSerializedData, z);
        return tLRPC$TL_stickerPack;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.emoticon = abstractSerializedData.readString(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.documents.add(Long.valueOf(abstractSerializedData.readInt64(z)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(313694676);
        abstractSerializedData.writeString(this.emoticon);
        abstractSerializedData.writeInt32(481674261);
        int size = this.documents.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt64(this.documents.get(i).longValue());
        }
    }
}
