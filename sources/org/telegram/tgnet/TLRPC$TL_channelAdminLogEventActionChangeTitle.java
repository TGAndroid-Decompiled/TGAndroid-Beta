package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionChangeTitle extends TLRPC$ChannelAdminLogEventAction {
    public String new_value;
    public String prev_value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.prev_value = abstractSerializedData.readString(z);
        this.new_value = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-421545947);
        abstractSerializedData.writeString(this.prev_value);
        abstractSerializedData.writeString(this.new_value);
    }
}
