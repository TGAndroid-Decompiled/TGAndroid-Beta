package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
public class TL_stats$TL_statsAbsValueAndPrev extends TLObject {
    public double current;
    public double previous;

    public static TL_stats$TL_statsAbsValueAndPrev TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-884757282 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_statsAbsValueAndPrev", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stats$TL_statsAbsValueAndPrev tL_stats$TL_statsAbsValueAndPrev = new TL_stats$TL_statsAbsValueAndPrev();
        tL_stats$TL_statsAbsValueAndPrev.readParams(abstractSerializedData, z);
        return tL_stats$TL_statsAbsValueAndPrev;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.current = abstractSerializedData.readDouble(z);
        this.previous = abstractSerializedData.readDouble(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-884757282);
        abstractSerializedData.writeDouble(this.current);
        abstractSerializedData.writeDouble(this.previous);
    }
}
