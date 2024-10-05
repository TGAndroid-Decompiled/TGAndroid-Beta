package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stars$TL_starsGiveawayOption extends TLObject {
    public long amount;
    public String currency;
    public boolean extended;
    public int flags;
    public boolean isDefault;
    public boolean loadingStorePrice;
    public boolean missingStorePrice;
    public long stars;
    public String store_product;
    public ArrayList winners = new ArrayList();
    public int yearly_boosts;

    public static TL_stars$TL_starsGiveawayOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1798404822 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_starsGiveawayOption", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stars$TL_starsGiveawayOption tL_stars$TL_starsGiveawayOption = new TL_stars$TL_starsGiveawayOption();
        tL_stars$TL_starsGiveawayOption.readParams(abstractSerializedData, z);
        return tL_stars$TL_starsGiveawayOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.extended = (readInt32 & 1) != 0;
        this.isDefault = (readInt32 & 2) != 0;
        this.stars = abstractSerializedData.readInt64(z);
        this.yearly_boosts = abstractSerializedData.readInt32(z);
        if ((this.flags & 4) != 0) {
            this.store_product = abstractSerializedData.readString(z);
        }
        this.currency = abstractSerializedData.readString(z);
        this.amount = abstractSerializedData.readInt64(z);
        int readInt322 = abstractSerializedData.readInt32(z);
        if (readInt322 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            }
            return;
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt323; i++) {
            TL_stars$TL_starsGiveawayWinnersOption TLdeserialize = TL_stars$TL_starsGiveawayWinnersOption.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.winners.add(TLdeserialize);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1798404822);
        int i = this.extended ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.isDefault ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.stars);
        abstractSerializedData.writeInt32(this.yearly_boosts);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.store_product);
        }
        abstractSerializedData.writeString(this.currency);
        abstractSerializedData.writeInt64(this.amount);
        abstractSerializedData.writeInt32(481674261);
        int size = this.winners.size();
        abstractSerializedData.writeInt32(size);
        for (int i3 = 0; i3 < size; i3++) {
            ((TL_stars$TL_starsGiveawayWinnersOption) this.winners.get(i3)).serializeToStream(abstractSerializedData);
        }
    }
}
