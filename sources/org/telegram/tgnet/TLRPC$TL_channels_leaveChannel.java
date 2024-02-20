package org.telegram.tgnet;
public class TLRPC$TL_channels_leaveChannel extends TLObject {
    public TLRPC$InputChannel channel;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-130635115);
        this.channel.serializeToStream(abstractSerializedData);
    }
}
