package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stories$TL_premium_boostsStatus extends TLObject {
    public static int constructor = 1230586490;
    public String boost_url;
    public int boosts;
    public int current_level_boosts;
    public int flags;
    public int gift_boosts;
    public int level;
    public boolean my_boost;
    public int next_level_boosts;
    public TL_stats$TL_statsPercentValue premium_audience;
    public ArrayList prepaid_giveaways = new ArrayList();
    public ArrayList my_boost_slots = new ArrayList();

    public static TL_stories$TL_premium_boostsStatus TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_premium_boostsStatus", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stories$TL_premium_boostsStatus tL_stories$TL_premium_boostsStatus = new TL_stories$TL_premium_boostsStatus();
        tL_stories$TL_premium_boostsStatus.readParams(abstractSerializedData, z);
        return tL_stories$TL_premium_boostsStatus;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.my_boost = (readInt32 & 4) != 0;
        this.level = abstractSerializedData.readInt32(z);
        this.current_level_boosts = abstractSerializedData.readInt32(z);
        this.boosts = abstractSerializedData.readInt32(z);
        if ((this.flags & 16) != 0) {
            this.gift_boosts = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1) != 0) {
            this.next_level_boosts = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.premium_audience = TL_stats$TL_statsPercentValue.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.boost_url = abstractSerializedData.readString(z);
        if ((this.flags & 8) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                }
                return;
            }
            int readInt323 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt323; i++) {
                TL_stories$TL_prepaidGiveaway TLdeserialize = TL_stories$TL_prepaidGiveaway.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize == null) {
                    return;
                }
                this.prepaid_giveaways.add(TLdeserialize);
            }
        }
        if ((this.flags & 4) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                }
            } else {
                int readInt325 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt325; i2++) {
                    this.my_boost_slots.add(Integer.valueOf(abstractSerializedData.readInt32(z)));
                }
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.my_boost ? this.flags | 4 : this.flags & (-5);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.level);
        abstractSerializedData.writeInt32(this.current_level_boosts);
        abstractSerializedData.writeInt32(this.boosts);
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.gift_boosts);
        }
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.next_level_boosts);
        }
        if ((this.flags & 2) != 0) {
            this.premium_audience.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.boost_url);
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.prepaid_giveaways.size();
            abstractSerializedData.writeInt32(size);
            for (int i2 = 0; i2 < size; i2++) {
                ((TL_stories$TL_prepaidGiveaway) this.prepaid_giveaways.get(i2)).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.my_boost_slots.size();
            abstractSerializedData.writeInt32(size2);
            for (int i3 = 0; i3 < size2; i3++) {
                abstractSerializedData.writeInt32(((Integer) this.my_boost_slots.get(i3)).intValue());
            }
        }
    }
}
