package org.telegram.tgnet;

public class TLRPC$TL_groupCallStreamChannel extends TLObject {
    public int channel;
    public long last_timestamp_ms;
    public int scale;

    public static TLRPC$TL_groupCallStreamChannel TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        if (-2132064081 != i) {
            if (z) {
                throw new RuntimeException(String.format("can't parse magic %x in TL_groupCallStreamChannel", Integer.valueOf(i)));
            }
            return null;
        }
        TLRPC$TL_groupCallStreamChannel tLRPC$TL_groupCallStreamChannel = new TLRPC$TL_groupCallStreamChannel();
        tLRPC$TL_groupCallStreamChannel.readParams(abstractSerializedData, z);
        return tLRPC$TL_groupCallStreamChannel;
    }

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.channel = abstractSerializedData.readInt32(z);
        this.scale = abstractSerializedData.readInt32(z);
        this.last_timestamp_ms = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-2132064081);
        abstractSerializedData.writeInt32(this.channel);
        abstractSerializedData.writeInt32(this.scale);
        abstractSerializedData.writeInt64(this.last_timestamp_ms);
    }
}
