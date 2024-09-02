package org.telegram.tgnet;

public class TLRPC$TL_messageActionGiveawayResults extends TLRPC$MessageAction {
    public int flags;
    public boolean stars;
    public int unclaimed_count;
    public int winners_count;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.stars = (readInt32 & 1) != 0;
        this.winners_count = abstractSerializedData.readInt32(z);
        this.unclaimed_count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2015170219);
        int i = this.stars ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        abstractSerializedData.writeInt32(i);
        abstractSerializedData.writeInt32(this.winners_count);
        abstractSerializedData.writeInt32(this.unclaimed_count);
    }
}
