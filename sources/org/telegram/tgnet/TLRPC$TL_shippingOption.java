package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_shippingOption extends TLObject {
    public static int constructor = -1239335713;
    public String id;
    public ArrayList<TLRPC$TL_labeledPrice> prices = new ArrayList<>();
    public String title;

    public static TLRPC$TL_shippingOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_shippingOption", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_shippingOption tLRPC$TL_shippingOption = new TLRPC$TL_shippingOption();
        tLRPC$TL_shippingOption.readParams(abstractSerializedData, z);
        return tLRPC$TL_shippingOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readString(z);
        this.title = abstractSerializedData.readString(z);
        int readInt32 = abstractSerializedData.readInt32(z);
        if (readInt32 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
            }
            return;
        }
        int readInt322 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt322; i++) {
            TLRPC$TL_labeledPrice TLdeserialize = TLRPC$TL_labeledPrice.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.prices.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeString(this.id);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeInt32(481674261);
        int size = this.prices.size();
        abstractSerializedData.writeInt32(size);
        for (int i = 0; i < size; i++) {
            this.prices.get(i).serializeToStream(abstractSerializedData);
        }
    }
}
