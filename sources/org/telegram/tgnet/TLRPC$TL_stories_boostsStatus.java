package org.telegram.tgnet;
public class TLRPC$TL_stories_boostsStatus extends TLObject {
    public static int constructor = -440292772;
    public int boosts;
    public String boosts_url;
    public int current_level_boosts;
    public int flags;
    public int level;
    public boolean my_boost;
    public int next_level_boosts;
    public TLRPC$TL_statsPercentValue premium_audience;

    public static TLRPC$TL_stories_boostsStatus TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (constructor != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_stories_boostsStatus", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_stories_boostsStatus tLRPC$TL_stories_boostsStatus = new TLRPC$TL_stories_boostsStatus();
        tLRPC$TL_stories_boostsStatus.readParams(abstractSerializedData, z);
        return tLRPC$TL_stories_boostsStatus;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.my_boost = (readInt32 & 4) != 0;
        this.level = abstractSerializedData.readInt32(z);
        this.current_level_boosts = abstractSerializedData.readInt32(z);
        this.boosts = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.next_level_boosts = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.premium_audience = TLRPC$TL_statsPercentValue.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.boosts_url = abstractSerializedData.readString(z);
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
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.next_level_boosts);
        }
        if ((this.flags & 2) != 0) {
            this.premium_audience.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeString(this.boosts_url);
    }
}
