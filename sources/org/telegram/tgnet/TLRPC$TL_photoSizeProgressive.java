package org.telegram.tgnet;

import java.util.ArrayList;

public class TLRPC$TL_photoSizeProgressive extends TLRPC$PhotoSize {
    public static int constructor = -96535659;
    public ArrayList<Integer> sizes = new ArrayList<>();

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.type = abstractSerializedData.readString(z);
        this.f884w = abstractSerializedData.readInt32(z);
        this.f883h = abstractSerializedData.readInt32(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 == 481674261) {
            int readInt322 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt322; i++) {
                this.sizes.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
            }
            if (!this.sizes.isEmpty()) {
                ArrayList<Integer> arrayList = this.sizes;
                this.size = arrayList.get(arrayList.size() - 1).intValue();
            }
        } else if (z) {
            throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.type);
        abstractSerializedData.writeInt32(this.f884w);
        abstractSerializedData.writeInt32(this.f883h);
        abstractSerializedData.writeInt32(481674261);
        int size = this.sizes.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            abstractSerializedData.writeInt32(this.sizes.get(i).intValue());
        }
    }
}
