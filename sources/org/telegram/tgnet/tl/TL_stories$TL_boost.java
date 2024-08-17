package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stories$TL_boost extends TLObject {
    public static int constructor = 706514033;
    public int date;
    public int expires;
    public int flags;
    public boolean gift;
    public boolean giveaway;
    public int giveaway_msg_id;
    public String id;
    public int multiplier;
    public boolean unclaimed;
    public String used_gift_slug;
    public long user_id = -1;

    public static TL_stories$TL_boost TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_boost", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_boost tL_stories$TL_boost = new TL_stories$TL_boost();
        tL_stories$TL_boost.readParams(abstractSerializedData, z);
        return tL_stories$TL_boost;
    }

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
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
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
    }
}
