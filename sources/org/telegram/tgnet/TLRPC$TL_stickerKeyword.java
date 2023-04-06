package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_stickerKeyword extends TLObject {
    public static int constructor = -50416996;
    public long document_id;
    public ArrayList<String> keyword = new ArrayList<>();

    public static TLRPC$TL_stickerKeyword TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stickerKeyword", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_stickerKeyword tLRPC$TL_stickerKeyword = new TLRPC$TL_stickerKeyword();
        tLRPC$TL_stickerKeyword.readParams(abstractSerializedData, z);
        return tLRPC$TL_stickerKeyword;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.document_id = abstractSerializedData.readInt64(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.keyword.add(abstractSerializedData.readString(z));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.document_id);
        abstractSerializedData.writeInt32(481674261);
        int size = this.keyword.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeString(this.keyword.get(i));
        }
    }
}
