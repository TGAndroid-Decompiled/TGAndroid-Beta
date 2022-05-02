package org.telegram.tgnet;

public class TLRPC$TL_accountDaysTTL extends TLObject {
    public static int constructor = -1194283041;
    public int days;

    public static TLRPC$TL_accountDaysTTL TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor == i) {
            TLRPC$TL_accountDaysTTL tLRPC$TL_accountDaysTTL = new TLRPC$TL_accountDaysTTL();
            tLRPC$TL_accountDaysTTL.readParams(abstractSerializedData, z);
            return tLRPC$TL_accountDaysTTL;
        } else if (!z) {
            return null;
        } else {
            throw new RuntimeException(String.format("can't parse magic %x in TL_accountDaysTTL", Integer.valueOf(i)));
        }
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.days = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.days);
    }
}
