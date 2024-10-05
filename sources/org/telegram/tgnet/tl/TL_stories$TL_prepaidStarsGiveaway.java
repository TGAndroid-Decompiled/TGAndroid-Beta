package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;

public class TL_stories$TL_prepaidStarsGiveaway extends TL_stories$PrepaidGiveaway {
    public long stars;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.stars = abstractSerializedData.readInt64(z);
        this.quantity = abstractSerializedData.readInt32(z);
        this.boosts = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1700956192);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt64(this.stars);
        abstractSerializedData.writeInt32(this.quantity);
        abstractSerializedData.writeInt32(this.boosts);
        abstractSerializedData.writeInt32(this.date);
    }
}
