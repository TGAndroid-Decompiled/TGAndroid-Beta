package org.telegram.tgnet;

public class TLRPC$TL_messageActionGiftCode extends TLRPC$MessageAction {
    public TLRPC$Peer boost_peer;
    public String slug;
    public boolean unclaimed;
    public boolean via_giveaway;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.via_giveaway = (readInt32 & 1) != 0;
        this.unclaimed = (readInt32 & 4) != 0;
        if ((readInt32 & 2) != 0) {
            this.boost_peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.months = abstractSerializedData.readInt32(z);
        this.slug = abstractSerializedData.readString(z);
        if ((this.flags & 4) != 0) {
            this.currency = abstractSerializedData.readString(z);
        }
        if ((this.flags & 4) != 0) {
            this.amount = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 8) != 0) {
            this.cryptoCurrency = abstractSerializedData.readString(z);
        }
        if ((this.flags & 8) != 0) {
            this.cryptoAmount = abstractSerializedData.readInt64(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1737240073);
        int i = this.via_giveaway ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.unclaimed ? i | 4 : i & (-5);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        if ((this.flags & 2) != 0) {
            this.boost_peer.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.months);
        abstractSerializedData.writeString(this.slug);
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeString(this.currency);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt64(this.amount);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.cryptoCurrency);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt64(this.cryptoAmount);
        }
    }
}
