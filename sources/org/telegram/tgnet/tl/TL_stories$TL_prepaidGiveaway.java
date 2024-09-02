package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;

public class TL_stories$TL_prepaidGiveaway extends TL_stories$PrepaidGiveaway {
    public int months;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.id = abstractSerializedData.readInt64(z);
        this.months = abstractSerializedData.readInt32(z);
        this.quantity = abstractSerializedData.readInt32(z);
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1303143084);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeInt32(this.months);
        abstractSerializedData.writeInt32(this.quantity);
        abstractSerializedData.writeInt32(this.date);
    }
}
