package org.telegram.tgnet;
public class TLRPC$TL_channels_getFullChannel extends TLObject {
    public TLRPC$InputChannel channel;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$TL_messages_chatFull.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(141781513);
        this.channel.serializeToStream(abstractSerializedData);
    }
}
