package org.telegram.tgnet;

public class TLRPC$TL_starsGiveawayWinnersOption extends TLObject {
    public int flags;
    public boolean isDefault;
    public long per_user_stars;
    public int users;

    public static TLRPC$TL_starsGiveawayWinnersOption TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (1411605001 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_starsGiveawayWinnersOption", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_starsGiveawayWinnersOption tLRPC$TL_starsGiveawayWinnersOption = new TLRPC$TL_starsGiveawayWinnersOption();
        tLRPC$TL_starsGiveawayWinnersOption.readParams(abstractSerializedData, z);
        return tLRPC$TL_starsGiveawayWinnersOption;
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
