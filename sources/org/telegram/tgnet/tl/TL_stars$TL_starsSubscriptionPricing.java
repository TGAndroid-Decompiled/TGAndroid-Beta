package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stars$TL_starsSubscriptionPricing extends TLObject {
    public long amount;
    public int period;

    public static TL_stars$TL_starsSubscriptionPricing TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (88173912 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_starsSubscriptionPricing", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stars$TL_starsSubscriptionPricing tL_stars$TL_starsSubscriptionPricing = new TL_stars$TL_starsSubscriptionPricing();
        tL_stars$TL_starsSubscriptionPricing.readParams(abstractSerializedData, z);
        return tL_stars$TL_starsSubscriptionPricing;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.period = abstractSerializedData.readInt32(z);
        this.amount = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(88173912);
        abstractSerializedData.writeInt32(this.period);
        abstractSerializedData.writeInt64(this.amount);
    }
}
