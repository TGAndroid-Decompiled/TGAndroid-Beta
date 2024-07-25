package org.telegram.tgnet;
public class TLRPC$TL_channels_toggleJoinRequest extends TLObject {
    public TLRPC$InputChannel channel;
    public boolean enabled;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1277789622);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.enabled);
    }
}
