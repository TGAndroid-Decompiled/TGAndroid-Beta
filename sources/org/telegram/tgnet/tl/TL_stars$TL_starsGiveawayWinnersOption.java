package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;

public class TL_stars$TL_starsGiveawayWinnersOption extends TLObject {
    public int flags;
    public boolean isDefault;
    public long per_user_stars;
    public int users;

    public static TL_stars$TL_starsGiveawayWinnersOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1411605001 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_starsGiveawayWinnersOption", Integer.valueOf(i)));
            }
            return null;
        }
        TL_stars$TL_starsGiveawayWinnersOption tL_stars$TL_starsGiveawayWinnersOption = new TL_stars$TL_starsGiveawayWinnersOption();
        tL_stars$TL_starsGiveawayWinnersOption.readParams(abstractSerializedData, z);
        return tL_stars$TL_starsGiveawayWinnersOption;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.isDefault = (readInt32 & 1) != 0;
        this.users = abstractSerializedData.readInt32(z);
        this.per_user_stars = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1411605001);
        int i = this.isDefault ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.users);
        abstractSerializedData.writeInt64(this.per_user_stars);
    }
}
