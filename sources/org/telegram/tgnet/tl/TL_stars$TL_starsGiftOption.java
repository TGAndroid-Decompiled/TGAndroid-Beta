package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stars$TL_starsGiftOption extends TLObject {
    public long amount;
    public String currency;
    public boolean extended;
    public int flags;
    public boolean loadingStorePrice;
    public boolean missingStorePrice;
    public long stars;
    public String store_product;

    public static TL_stars$TL_starsGiftOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1577421297 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_starsGiftOption", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stars$TL_starsGiftOption tL_stars$TL_starsGiftOption = new TL_stars$TL_starsGiftOption();
        tL_stars$TL_starsGiftOption.readParams(abstractSerializedData, z);
        return tL_stars$TL_starsGiftOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.extended = (readInt32 & 2) != 0;
        this.stars = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.store_product = abstractSerializedData.readString(z);
        }
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1577421297);
        int i = this.extended ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.stars);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.store_product);
        }
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
    }
}
