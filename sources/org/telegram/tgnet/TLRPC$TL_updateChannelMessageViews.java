package org.telegram.tgnet;

public class TLRPC$TL_updateChannelMessageViews extends TLRPC$Update {
    public static int constructor = -232346616;
    public long channel_id;
    public int f988id;
    public int views;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel_id = abstractSerializedData.readInt64(z);
        this.f988id = abstractSerializedData.readInt32(z);
        this.views = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.channel_id);
        abstractSerializedData.writeInt32(this.f988id);
        abstractSerializedData.writeInt32(this.views);
    }
}
