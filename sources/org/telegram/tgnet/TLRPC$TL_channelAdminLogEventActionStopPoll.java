package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionStopPoll extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$Message message;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.message = TLRPC$Message.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1895328189);
        this.message.serializeToStream(abstractSerializedData);
    }
}
