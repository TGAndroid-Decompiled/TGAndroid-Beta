package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_fragment$TL_collectibleInfo extends TLObject {
    public long amount;
    public long crypto_amount;
    public String crypto_currency;
    public String currency;
    public int purchase_date;
    public String url;

    public static TL_fragment$TL_collectibleInfo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1857945489 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_collectibleInfo", Integer.valueOf(i)));
            }
            return null;
        }
        TL_fragment$TL_collectibleInfo tL_fragment$TL_collectibleInfo = new TL_fragment$TL_collectibleInfo();
        tL_fragment$TL_collectibleInfo.readParams(abstractSerializedData, z);
        return tL_fragment$TL_collectibleInfo;
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1857945489);
        abstractSerializedData.writeInt32(this.purchase_date);
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
        abstractSerializedData.writeString(this.crypto_currency);
        abstractSerializedData.writeInt64(this.crypto_amount);
        abstractSerializedData.writeString(this.url);
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.purchase_date = abstractSerializedData.readInt32(z);
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
        this.crypto_currency = abstractSerializedData.readString(z);
        this.crypto_amount = abstractSerializedData.readInt64(z);
        this.url = abstractSerializedData.readString(z);
    }
}
