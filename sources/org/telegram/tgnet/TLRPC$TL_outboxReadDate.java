package org.telegram.tgnet;

public class TLRPC$TL_outboxReadDate extends TLObject {
    public int date;

    public static TLRPC$TL_outboxReadDate TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1001931436 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_outboxReadDate", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_outboxReadDate tLRPC$TL_outboxReadDate = new TLRPC$TL_outboxReadDate();
        tLRPC$TL_outboxReadDate.readParams(abstractSerializedData, z);
        return tLRPC$TL_outboxReadDate;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.date = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(this.date);
    }
}
