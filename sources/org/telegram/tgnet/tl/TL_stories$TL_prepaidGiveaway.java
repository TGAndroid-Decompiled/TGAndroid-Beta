package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_stories$TL_prepaidGiveaway extends TLObject {
    public static int constructor = -1303143084;
    public int date;
    public long id;
    public int months;
    public int quantity;

    public static TL_stories$TL_prepaidGiveaway TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_prepaidGiveaway", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_prepaidGiveaway tL_stories$TL_prepaidGiveaway = new TL_stories$TL_prepaidGiveaway();
        tL_stories$TL_prepaidGiveaway.readParams(abstractSerializedData, z);
        return tL_stories$TL_prepaidGiveaway;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.months = abstractSerializedData.readInt32(z);
        this.quantity = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt32(this.months);
        abstractSerializedData.writeInt32(this.quantity);
        abstractSerializedData.writeInt32(this.date);
    }
}
