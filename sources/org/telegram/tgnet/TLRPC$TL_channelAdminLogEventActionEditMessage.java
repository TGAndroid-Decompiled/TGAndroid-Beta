package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionEditMessage extends TLRPC$ChannelAdminLogEventAction {
    public TLRPC$Message new_message;
    public TLRPC$Message prev_message;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.prev_message = TLRPC$Message.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.new_message = TLRPC$Message.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1889215493);
        this.prev_message.serializeToStream(abstractSerializedData);
        this.new_message.serializeToStream(abstractSerializedData);
    }
}
