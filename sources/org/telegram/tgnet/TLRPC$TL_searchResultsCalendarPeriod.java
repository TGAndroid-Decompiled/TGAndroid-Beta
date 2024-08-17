package org.telegram.tgnet;

public class TLRPC$TL_searchResultsCalendarPeriod extends TLObject {
    public int count;
    public int date;
    public int max_msg_id;
    public int min_msg_id;

    public static TLRPC$TL_searchResultsCalendarPeriod TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-911191137 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_searchResultsCalendarPeriod", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_searchResultsCalendarPeriod tLRPC$TL_searchResultsCalendarPeriod = new TLRPC$TL_searchResultsCalendarPeriod();
        tLRPC$TL_searchResultsCalendarPeriod.readParams(abstractSerializedData, z);
        return tLRPC$TL_searchResultsCalendarPeriod;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.date = abstractSerializedData.readInt32(z);
        this.min_msg_id = abstractSerializedData.readInt32(z);
        this.max_msg_id = abstractSerializedData.readInt32(z);
        this.count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-911191137);
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.min_msg_id);
        abstractSerializedData.writeInt32(this.max_msg_id);
        abstractSerializedData.writeInt32(this.count);
    }
}
