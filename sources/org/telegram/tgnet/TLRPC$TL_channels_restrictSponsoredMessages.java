package org.telegram.tgnet;

public class TLRPC$TL_channels_restrictSponsoredMessages extends TLObject {
    public TLRPC$InputChannel channel;
    public boolean restricted;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Updates.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1696000743);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeBool(this.restricted);
    }
}
