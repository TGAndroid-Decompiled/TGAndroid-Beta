package org.telegram.tgnet;
public class TLRPC$TL_stories_boostsStatus extends TLObject {
    public static int constructor = 1726619631;
    public int boosts;
    public int current_level_boosts;
    public int flags;
    public int level;
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
        this.flags = abstractSerializedData.readInt32(z);
        this.level = abstractSerializedData.readInt32(z);
        this.current_level_boosts = abstractSerializedData.readInt32(z);
        this.boosts = abstractSerializedData.readInt32(z);
        if ((this.flags & 1) != 0) {
            this.next_level_boosts = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.premium_audience = TLRPC$TL_statsPercentValue.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeInt32(this.level);
        abstractSerializedData.writeInt32(this.current_level_boosts);
        abstractSerializedData.writeInt32(this.boosts);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.next_level_boosts);
        }
        if ((this.flags & 2) != 0) {
            this.premium_audience.serializeToStream(abstractSerializedData);
        }
    }
}
