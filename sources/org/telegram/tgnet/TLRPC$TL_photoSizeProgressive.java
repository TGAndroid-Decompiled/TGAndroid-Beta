package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_photoSizeProgressive extends TLRPC$PhotoSize {
    public static int constructor = -96535659;
    public ArrayList<Integer> sizes = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = abstractSerializedData.readString(z);
        this.f879w = abstractSerializedData.readInt32(z);
        this.f878h = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            this.sizes.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
        }
        if (this.sizes.isEmpty()) {
            return;
        }
        ArrayList<Integer> arrayList = this.sizes;
        this.size = arrayList.get(arrayList.size() - 1).intValue();
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.type);
        abstractSerializedData.writeInt32(this.f879w);
        abstractSerializedData.writeInt32(this.f878h);
        abstractSerializedData.writeInt32(481674261);
        int size = this.sizes.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.sizes.get(i).intValue());
        }
    }
}
