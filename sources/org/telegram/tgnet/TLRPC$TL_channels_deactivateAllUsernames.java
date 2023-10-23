package org.telegram.tgnet;
public class TLRPC$TL_channels_deactivateAllUsernames extends TLObject {
    public TLRPC$InputChannel channel;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(170155475);
        this.channel.serializeToStream(abstractSerializedData);
    }
}
