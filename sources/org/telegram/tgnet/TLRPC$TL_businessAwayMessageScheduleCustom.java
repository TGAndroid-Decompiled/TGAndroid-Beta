package org.telegram.tgnet;

public class TLRPC$TL_businessAwayMessageScheduleCustom extends TLRPC$BusinessAwayMessageSchedule {
    public int end_date;
    public int start_date;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.start_date = abstractSerializedData.readInt32(z);
        this.end_date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-867328308);
        abstractSerializedData.writeInt32(this.start_date);
        abstractSerializedData.writeInt32(this.end_date);
    }
}
