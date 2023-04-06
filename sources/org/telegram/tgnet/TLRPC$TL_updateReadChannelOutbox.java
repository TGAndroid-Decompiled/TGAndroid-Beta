package org.telegram.tgnet;
public class TLRPC$TL_updateReadChannelOutbox extends TLRPC$Update {
    public static int constructor = -1218471511;
    public long channel_id;
    public int max_id;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel_id = abstractSerializedData.readInt64(z);
        this.max_id = abstractSerializedData.readInt32(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.channel_id);
        abstractSerializedData.writeInt32(this.max_id);
    }
}
