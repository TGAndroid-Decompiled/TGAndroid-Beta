package org.telegram.tgnet;
public class TLRPC$TL_channels_viewSponsoredMessage extends TLObject {
    public TLRPC$InputChannel channel;
    public byte[] random_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1095836780);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeByteArray(this.random_id);
    }
}
