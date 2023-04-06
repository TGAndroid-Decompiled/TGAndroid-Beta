package org.telegram.tgnet;
public class TLRPC$TL_channels_viewSponsoredMessage extends TLObject {
    public static int constructor = -1095836780;
    public TLRPC$InputChannel channel;
    public byte[] random_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeByteArray(this.random_id);
    }
}
