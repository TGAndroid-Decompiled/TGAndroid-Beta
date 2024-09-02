package org.telegram.tgnet;

public abstract class TLRPC$payments_GiveawayInfo extends TLObject {
    public static TLRPC$payments_GiveawayInfo TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$payments_GiveawayInfo tLRPC$TL_payments_giveawayInfo = i != -512366993 ? i != 13456752 ? i != 1130879648 ? null : new TLRPC$TL_payments_giveawayInfo() : new TLRPC$TL_payments_giveawayInfoResults() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.winner = (readInt32 & 1) != 0;
                this.refunded = (readInt32 & 2) != 0;
                this.start_date = abstractSerializedData2.readInt32(z2);
                if ((this.flags & 1) != 0) {
                    this.gift_code_slug = abstractSerializedData2.readString(z2);
                }
                this.finish_date = abstractSerializedData2.readInt32(z2);
                this.winners_count = abstractSerializedData2.readInt32(z2);
                this.activated_count = abstractSerializedData2.readInt32(z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(13456752);
                int i2 = this.winner ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                int i3 = this.refunded ? i2 | 2 : i2 & (-3);
                this.flags = i3;
                abstractSerializedData2.writeInt32(i3);
                abstractSerializedData2.writeInt32(this.start_date);
                if ((this.flags & 1) != 0) {
                    abstractSerializedData2.writeString(this.gift_code_slug);
                }
                abstractSerializedData2.writeInt32(this.finish_date);
                abstractSerializedData2.writeInt32(this.winners_count);
                abstractSerializedData2.writeInt32(this.activated_count);
            }
        } : new TLRPC$TL_payments_giveawayInfoResults();
        if (tLRPC$TL_payments_giveawayInfo == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in payments_GiveawayInfo", Integer.valueOf(i)));
        }
        if (tLRPC$TL_payments_giveawayInfo != null) {
            tLRPC$TL_payments_giveawayInfo.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_payments_giveawayInfo;
    }
}
