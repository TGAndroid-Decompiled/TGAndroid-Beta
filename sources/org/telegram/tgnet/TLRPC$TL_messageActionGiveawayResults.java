package org.telegram.tgnet;
public class TLRPC$TL_messageActionGiveawayResults extends TLRPC$MessageAction {
    public static int constructor = 715107781;
    public int unclaimed_count;
    public int winners_count;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.winners_count = abstractSerializedData.readInt32(z);
        this.unclaimed_count = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt32(this.winners_count);
        abstractSerializedData.writeInt32(this.unclaimed_count);
    }
}
