package org.telegram.tgnet;

public class TLRPC$TL_channels_reportSponsoredMessage extends TLObject {
    public TLRPC$InputChannel channel;
    public byte[] option;
    public byte[] random_id;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$channels_SponsoredMessageReportResult.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1349519687);
        this.channel.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeByteArray(this.random_id);
        abstractSerializedData.writeByteArray(this.option);
    }
}
