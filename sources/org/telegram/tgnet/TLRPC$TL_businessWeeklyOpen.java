package org.telegram.tgnet;

public class TLRPC$TL_businessWeeklyOpen extends TLObject {
    public int end_minute;
    public int start_minute;

    public static TLRPC$TL_businessWeeklyOpen TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (i != 302717625) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_businessWeeklyOpen", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_businessWeeklyOpen tLRPC$TL_businessWeeklyOpen = new TLRPC$TL_businessWeeklyOpen();
        tLRPC$TL_businessWeeklyOpen.readParams(abstractSerializedData, z);
        return tLRPC$TL_businessWeeklyOpen;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.start_minute = abstractSerializedData.readInt32(z);
        this.end_minute = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(302717625);
        abstractSerializedData.writeInt32(this.start_minute);
        abstractSerializedData.writeInt32(this.end_minute);
    }
}
