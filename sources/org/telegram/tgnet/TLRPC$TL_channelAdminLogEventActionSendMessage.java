package org.telegram.tgnet;

public class TLRPC$TL_channelAdminLogEventActionSendMessage extends TLRPC$ChannelAdminLogEventAction {
    public static int constructor = 663693416;
    public TLRPC$Message message;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.message = TLRPC$Message.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.message.serializeToStream(abstractSerializedData);
    }
}
