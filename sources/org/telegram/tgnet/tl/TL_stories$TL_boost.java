package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;

public class TL_stories$TL_boost extends TL_stories$Boost {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.gift = (readInt32 & 2) != 0;
        this.giveaway = (readInt32 & 4) != 0;
        this.unclaimed = (readInt32 & 8) != 0;
        this.id = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            this.user_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 4) != 0) {
            this.giveaway_msg_id = abstractSerializedData.readInt32(z);
        }
        this.date = abstractSerializedData.readInt32(z);
        this.expires = abstractSerializedData.readInt32(z);
        if ((this.flags & 16) != 0) {
            this.used_gift_slug = abstractSerializedData.readString(z);
        }
        if ((this.flags & 32) != 0) {
            this.multiplier = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 64) != 0) {
            this.stars = abstractSerializedData.readInt64(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1262359766);
        int i = this.gift ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.giveaway ? i | 4 : i & (-5);
        this.flags = i2;
        int i3 = this.unclaimed ? i2 | 8 : i2 & (-9);
        this.flags = i3;
        abstractSerializedData.writeInt32(i3);
        abstractSerializedData.writeString(this.id);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.user_id);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.giveaway_msg_id);
        }
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeInt32(this.expires);
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeString(this.used_gift_slug);
        }
        if ((this.flags & 32) != 0) {
            abstractSerializedData.writeInt32(this.multiplier);
        }
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeInt64(this.stars);
        }
    }
}
