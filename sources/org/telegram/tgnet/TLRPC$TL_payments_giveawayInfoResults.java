package org.telegram.tgnet;

public class TLRPC$TL_payments_giveawayInfoResults extends TLRPC$payments_GiveawayInfo {
    public int activated_count;
    public int finish_date;
    public int flags;
    public String gift_code_slug;
    public boolean refunded;
    public long stars_prize;
    public int start_date;
    public boolean winner;
    public int winners_count;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.winner = (readInt32 & 1) != 0;
        this.refunded = (readInt32 & 2) != 0;
        this.start_date = abstractSerializedData.readInt32(z);
        if ((this.flags & 8) != 0) {
            this.gift_code_slug = abstractSerializedData.readString(z);
        }
        if ((this.flags & 16) != 0) {
            this.stars_prize = abstractSerializedData.readInt64(z);
        }
        this.finish_date = abstractSerializedData.readInt32(z);
        this.winners_count = abstractSerializedData.readInt32(z);
        if ((this.flags & 4) != 0) {
            this.activated_count = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-512366993);
        int i = this.winner ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.refunded ? i | 2 : i & (-3);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt32(this.start_date);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeString(this.gift_code_slug);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.stars_prize);
        }
        abstractSerializedData.writeInt32(this.finish_date);
        abstractSerializedData.writeInt32(this.winners_count);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.activated_count);
        }
    }
}
