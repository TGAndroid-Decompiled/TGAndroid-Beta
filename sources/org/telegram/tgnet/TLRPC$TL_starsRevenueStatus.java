package org.telegram.tgnet;
public class TLRPC$TL_starsRevenueStatus extends TLObject {
    public long available_balance;
    public long current_balance;
    public int flags;
    public int next_withdrawal_at;
    public long overall_revenue;
    public boolean withdrawal_enabled;

    public static TLRPC$TL_starsRevenueStatus TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (2033461574 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_starsRevenueStatus", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_starsRevenueStatus tLRPC$TL_starsRevenueStatus = new TLRPC$TL_starsRevenueStatus();
        tLRPC$TL_starsRevenueStatus.readParams(abstractSerializedData, z);
        return tLRPC$TL_starsRevenueStatus;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.withdrawal_enabled = (readInt32 & 1) != 0;
        this.current_balance = abstractSerializedData.readInt64(z);
        this.available_balance = abstractSerializedData.readInt64(z);
        this.overall_revenue = abstractSerializedData.readInt64(z);
        if ((this.flags & 2) != 0) {
            this.next_withdrawal_at = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(2033461574);
        int i = this.withdrawal_enabled ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt64(this.current_balance);
        abstractSerializedData.writeInt64(this.available_balance);
        abstractSerializedData.writeInt64(this.overall_revenue);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.next_withdrawal_at);
        }
    }
}
