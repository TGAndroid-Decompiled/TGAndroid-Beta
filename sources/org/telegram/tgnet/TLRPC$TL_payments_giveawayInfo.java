package org.telegram.tgnet;

public class TLRPC$TL_payments_giveawayInfo extends TLRPC$payments_GiveawayInfo {
    public long admin_disallowed_chat_id;
    public String disallowed_country;
    public int flags;
    public int joined_too_early_date;
    public boolean participating;
    public boolean preparing_results;
    public int start_date;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.participating = (readInt32 & 1) != 0;
        this.preparing_results = (readInt32 & 8) != 0;
        this.start_date = abstractSerializedData.readInt32(z);
        if ((this.flags & 2) != 0) {
            this.joined_too_early_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.admin_disallowed_chat_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 16) != 0) {
            this.disallowed_country = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1130879648);
        int i = this.participating ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.preparing_results ? i | 8 : i & (-9);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt32(this.start_date);
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.joined_too_early_date);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt64(this.admin_disallowed_chat_id);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeString(this.disallowed_country);
        }
    }
}
