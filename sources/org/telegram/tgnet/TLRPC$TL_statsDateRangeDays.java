package org.telegram.tgnet;

public class TLRPC$TL_statsDateRangeDays extends TLObject {
    public static int constructor = -1237848657;
    public int max_date;
    public int min_date;

    public static TLRPC$TL_statsDateRangeDays TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_statsDateRangeDays tLRPC$TL_statsDateRangeDays = new TLRPC$TL_statsDateRangeDays();
            tLRPC$TL_statsDateRangeDays.readParams(abstractSerializedData, z);
            return tLRPC$TL_statsDateRangeDays;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_statsDateRangeDays", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.min_date = abstractSerializedData.readInt32(z);
        this.max_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.min_date);
        abstractSerializedData.writeInt32(this.max_date);
    }
}
