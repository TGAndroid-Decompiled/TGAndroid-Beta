package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionToggleGroupCallSetting extends TLRPC$ChannelAdminLogEventAction {
    public boolean join_muted;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.join_muted = abstractSerializedData.readBool(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1456906823);
        abstractSerializedData.writeBool(this.join_muted);
    }
}
