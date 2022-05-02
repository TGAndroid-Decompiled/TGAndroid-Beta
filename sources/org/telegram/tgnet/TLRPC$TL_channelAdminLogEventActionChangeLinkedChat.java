package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionChangeLinkedChat extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = 84703944;
    public long new_value;
    public long prev_value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.prev_value = abstractSerializedData.readInt64(z);
        this.new_value = abstractSerializedData.readInt64(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        abstractSerializedData.writeInt64(this.prev_value);
        abstractSerializedData.writeInt64(this.new_value);
    }
}
