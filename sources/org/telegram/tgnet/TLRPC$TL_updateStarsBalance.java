package org.telegram.tgnet;
public class TLRPC$TL_updateStarsBalance extends TLRPC$Update {
    public long balance;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.balance = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(263737752);
        abstractSerializedData.writeInt64(this.balance);
    }
}
