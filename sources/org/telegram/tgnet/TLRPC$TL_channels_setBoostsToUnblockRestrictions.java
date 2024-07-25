package org.telegram.tgnet;
public class TLRPC$TL_channels_setBoostsToUnblockRestrictions extends TLObject {
    public int boosts;
    public TLRPC$InputChannel channel;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1388733202);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeInt32(this.boosts);
    }
}
