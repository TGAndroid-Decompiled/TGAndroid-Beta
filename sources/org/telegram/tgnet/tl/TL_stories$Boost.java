package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public abstract class TL_stories$Boost extends TLObject {
    public int date;
    public int expires;
    public int flags;
    public boolean gift;
    public boolean giveaway;
    public int giveaway_msg_id;
    public String id;
    public int multiplier;
    public long stars;
    public boolean unclaimed;
    public String used_gift_slug;
    public long user_id = -1;

    public static TL_stories$Boost TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$TL_boost tL_stories$TL_boost = i != 706514033 ? i != 1262359766 ? null : new TL_stories$TL_boost() : new TL_stories$TL_boost() {
            @Override
            public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                int readInt32 = abstractSerializedData2.readInt32(z2);
                this.flags = readInt32;
                this.gift = (readInt32 & 2) != 0;
                this.giveaway = (readInt32 & 4) != 0;
                this.unclaimed = (readInt32 & 8) != 0;
                this.id = abstractSerializedData2.readString(z2);
                if ((this.flags & 1) != 0) {
                    this.user_id = abstractSerializedData2.readInt64(z2);
                }
                if ((this.flags & 4) != 0) {
                    this.giveaway_msg_id = abstractSerializedData2.readInt32(z2);
                }
                this.date = abstractSerializedData2.readInt32(z2);
                this.expires = abstractSerializedData2.readInt32(z2);
                if ((this.flags & 16) != 0) {
                    this.used_gift_slug = abstractSerializedData2.readString(z2);
                }
                if ((this.flags & 32) != 0) {
                    this.multiplier = abstractSerializedData2.readInt32(z2);
                }
            }

            @Override
            public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                abstractSerializedData2.writeInt32(706514033);
                int i2 = this.gift ? this.flags | 2 : this.flags & (-3);
                this.flags = i2;
                int i3 = this.giveaway ? i2 | 4 : i2 & (-5);
                this.flags = i3;
                int i4 = this.unclaimed ? i3 | 8 : i3 & (-9);
                this.flags = i4;
                abstractSerializedData2.writeInt32(i4);
                abstractSerializedData2.writeString(this.id);
                if ((this.flags & 1) != 0) {
                    abstractSerializedData2.writeInt64(this.user_id);
                }
                if ((this.flags & 4) != 0) {
                    abstractSerializedData2.writeInt32(this.giveaway_msg_id);
                }
                abstractSerializedData2.writeInt32(this.date);
                abstractSerializedData2.writeInt32(this.expires);
                if ((this.flags & 16) != 0) {
                    abstractSerializedData2.writeString(this.used_gift_slug);
                }
                if ((this.flags & 32) != 0) {
                    abstractSerializedData2.writeInt32(this.multiplier);
                }
            }
        };
        if (tL_stories$TL_boost == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Boost", Integer.valueOf(i)));
        }
        if (tL_stories$TL_boost != null) {
            tL_stories$TL_boost.readParams(abstractSerializedData, z);
        }
        return tL_stories$TL_boost;
    }
}
