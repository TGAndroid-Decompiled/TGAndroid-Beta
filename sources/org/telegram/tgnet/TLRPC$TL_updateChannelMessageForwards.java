package org.telegram.tgnet;

public class TLRPC$TL_updateChannelMessageForwards extends TLRPC$Update {
    public static int constructor = -761649164;
    public long channel_id;
    public int forwards;
    public int f978id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel_id = abstractSerializedData.readInt64(z);
        this.f978id = abstractSerializedData.readInt32(z);
        this.forwards = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.channel_id);
        abstractSerializedData.writeInt32(this.f978id);
        abstractSerializedData.writeInt32(this.forwards);
    }
}
