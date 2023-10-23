package org.telegram.tgnet;
public class TLRPC$TL_defaultHistoryTTL extends TLObject {
    public int period;

    public static TLRPC$TL_defaultHistoryTTL TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1135897376 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_defaultHistoryTTL", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_defaultHistoryTTL tLRPC$TL_defaultHistoryTTL = new TLRPC$TL_defaultHistoryTTL();
        tLRPC$TL_defaultHistoryTTL.readParams(abstractSerializedData, z);
        return tLRPC$TL_defaultHistoryTTL;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.period = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1135897376);
        abstractSerializedData.writeInt32(this.period);
    }
}
