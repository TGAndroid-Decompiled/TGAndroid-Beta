package org.telegram.tgnet;

public class TLRPC$TL_messageActionGiveawayLaunch extends TLRPC$MessageAction {
    public int flags;
    public long stars;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        if ((readInt32 & 1) != 0) {
            this.stars = abstractSerializedData.readInt64(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1475391004);
        abstractSerializedData.writeInt32(this.flags);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt64(this.stars);
        }
    }
}
