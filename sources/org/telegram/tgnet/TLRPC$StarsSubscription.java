package org.telegram.tgnet;
public class TLRPC$StarsSubscription extends TLObject {
    public boolean can_refulfill;
    public boolean canceled;
    public String chat_invite_hash;
    public int flags;
    public String id;
    public boolean missing_balance;
    public TLRPC$Peer peer;
    public TLRPC$TL_starsSubscriptionPricing pricing;
    public int until_date;

    public static TLRPC$StarsSubscription TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$TL_starsSubscription tLRPC$TL_starsSubscription = i != -797707802 ? i != 1401868056 ? null : new TLRPC$TL_starsSubscription() : new TLRPC$TL_starsSubscription() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.canceled = (readInt32 & 1) != 0;
                this.can_refulfill = (readInt32 & 2) != 0;
                this.missing_balance = (readInt32 & 4) != 0;
                this.id = abstractSerializedData2.readString(z2);
                this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                this.until_date = abstractSerializedData2.readInt32(z2);
                this.pricing = TLRPC$TL_starsSubscriptionPricing.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(-797707802);
                int i2 = this.canceled ? this.flags | 1 : this.flags & (-2);
                this.flags = i2;
                int i3 = this.can_refulfill ? i2 | 2 : i2 & (-3);
                this.flags = i3;
                int i4 = this.missing_balance ? i3 | 4 : i3 & (-5);
                this.flags = i4;
                abstractSerializedData2.writeInt32(i4);
                abstractSerializedData2.writeString(this.id);
                this.peer.serializeToStream(abstractSerializedData2);
                abstractSerializedData2.writeInt32(this.until_date);
                this.pricing.serializeToStream(abstractSerializedData2);
            }
        };
        if (tLRPC$TL_starsSubscription == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in StarsTransaction", Integer.valueOf(i)));
        }
        if (tLRPC$TL_starsSubscription != null) {
            tLRPC$TL_starsSubscription.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_starsSubscription;
    }
}
