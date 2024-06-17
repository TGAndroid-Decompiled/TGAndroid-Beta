package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stats$TL_statsDateRangeDays extends TLObject {
    public int max_date;
    public int min_date;

    public static TL_stats$TL_statsDateRangeDays TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1237848657 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_statsDateRangeDays", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_statsDateRangeDays tL_stats$TL_statsDateRangeDays = new TL_stats$TL_statsDateRangeDays();
        tL_stats$TL_statsDateRangeDays.readParams(abstractSerializedData, z);
        return tL_stats$TL_statsDateRangeDays;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.min_date = abstractSerializedData.readInt32(z);
        this.max_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1237848657);
        abstractSerializedData.writeInt32(this.min_date);
        abstractSerializedData.writeInt32(this.max_date);
    }
}
