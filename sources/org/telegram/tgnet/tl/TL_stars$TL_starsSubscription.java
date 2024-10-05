package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$Peer;

public class TL_stars$TL_starsSubscription extends TL_stars$StarsSubscription {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.canceled = (readInt32 & 1) != 0;
        this.can_refulfill = (readInt32 & 2) != 0;
        this.missing_balance = (readInt32 & 4) != 0;
        this.id = abstractSerializedData.readString(z);
        this.peer = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.until_date = abstractSerializedData.readInt32(z);
        this.pricing = TL_stars$TL_starsSubscriptionPricing.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 8) != 0) {
            this.chat_invite_hash = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1401868056);
        int i = this.canceled ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.can_refulfill ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.missing_balance ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        abstractSerializedData.writeString(this.id);
        this.peer.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.until_date);
        this.pricing.serializeToStream(abstractSerializedData);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeString(this.chat_invite_hash);
        }
    }
}
