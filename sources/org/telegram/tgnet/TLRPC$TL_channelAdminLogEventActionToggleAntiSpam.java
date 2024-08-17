package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionToggleAntiSpam extends TLRPC$ChannelAdminLogEventAction {
    public boolean new_value;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.new_value = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1693675004);
        abstractSerializedData.writeBool(this.new_value);
    }
}
