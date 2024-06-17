package org.telegram.tgnet;

public class TLRPC$TL_channels_getSponsoredMessages extends TLObject {
    public TLRPC$InputChannel channel;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$messages_SponsoredMessages.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-333377601);
        this.channel.serializeToStream(abstractSerializedData);
    }
}
