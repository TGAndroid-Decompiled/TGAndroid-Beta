package org.telegram.tgnet;

import java.util.ArrayList;
public class TLRPC$TL_messageMediaGiveaway extends TLRPC$MessageMedia {
    public static int constructor = 1478887012;
    public ArrayList<Long> channels = new ArrayList<>();
    public ArrayList<String> countries_iso2 = new ArrayList<>();
    public int months;
    public boolean only_new_subscribers;
    public int quantity;
    public int until_date;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.only_new_subscribers = (readInt32 & 1) != 0;
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            this.channels.add(Long.valueOf(abstractSerializedData.readInt64(z)));
        }
        if ((this.flags & 2) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                }
                return;
            }
            int readInt325 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt325; i2++) {
                this.countries_iso2.add(abstractSerializedData.readString(z));
            }
        }
        this.quantity = abstractSerializedData.readInt32(z);
        this.months = abstractSerializedData.readInt32(z);
        this.until_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.only_new_subscribers ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(481674261);
        int size = this.channels.size();
        abstractSerializedData.writeInt32(size);
        for (int i2 = 0; i2 < size; i2++) {
            abstractSerializedData.writeInt64(this.channels.get(i2).longValue());
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.countries_iso2.size();
            abstractSerializedData.writeInt32(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                abstractSerializedData.writeString(this.countries_iso2.get(i3));
            }
        }
        abstractSerializedData.writeInt32(this.quantity);
        abstractSerializedData.writeInt32(this.months);
        abstractSerializedData.writeInt32(this.until_date);
    }
}
