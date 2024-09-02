package org.telegram.tgnet;

public class TLRPC$TL_accountDaysTTL extends TLObject {
    public int days;

    public static TLRPC$TL_accountDaysTTL TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-1194283041 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_accountDaysTTL", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_accountDaysTTL tLRPC$TL_accountDaysTTL = new TLRPC$TL_accountDaysTTL();
        tLRPC$TL_accountDaysTTL.readParams(abstractSerializedData, z);
        return tLRPC$TL_accountDaysTTL;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.days = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1194283041);
        abstractSerializedData.writeInt32(this.days);
    }
}
