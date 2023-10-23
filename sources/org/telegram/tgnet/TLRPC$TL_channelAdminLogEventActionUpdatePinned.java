package org.telegram.tgnet;
public class TLRPC$TL_channelAdminLogEventActionUpdatePinned extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$Message message;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.message = TLRPC$Message.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-370660328);
        this.message.serializeToStream(abstractSerializedData);
    }
}
