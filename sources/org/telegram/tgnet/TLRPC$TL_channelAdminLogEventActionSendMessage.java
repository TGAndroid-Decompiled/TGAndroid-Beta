package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionSendMessage extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$Message message;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.message = TLRPC$Message.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(663693416);
        this.message.serializeToStream(abstractSerializedData);
    }
}
