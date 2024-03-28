package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_stats$TL_statsPercentValue extends TLObject {
    public double part;
    public double total;

    public static TL_stats$TL_statsPercentValue TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-875679776 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_statsPercentValue", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_statsPercentValue tL_stats$TL_statsPercentValue = new TL_stats$TL_statsPercentValue();
        tL_stats$TL_statsPercentValue.readParams(abstractSerializedData, z);
        return tL_stats$TL_statsPercentValue;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.part = abstractSerializedData.readDouble(z);
        this.total = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-875679776);
        abstractSerializedData.writeDouble(this.part);
        abstractSerializedData.writeDouble(this.total);
    }
}
