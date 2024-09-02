package org.telegram.tgnet;

public class TLRPC$TL_channels_editLocation extends TLObject {
    public String address;
    public TLRPC$InputChannel channel;
    public TLRPC$InputGeoPoint geo_point;

    @Override
    public TLObject deserializeResponse(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLRPC$Bool.TLdeserialize(abstractSerializedData, i, z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(1491484525);
        this.channel.serializeToStream(abstractSerializedData);
        this.geo_point.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.address);
    }
}
