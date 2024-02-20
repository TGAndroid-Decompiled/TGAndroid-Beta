package org.telegram.tgnet;
public class TLRPC$TL_inputMediaVenue extends TLRPC$InputMedia {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.geo_point = TLRPC$InputGeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.title = abstractSerializedData.readString(z);
        this.address = abstractSerializedData.readString(z);
        this.provider = abstractSerializedData.readString(z);
        this.venue_id = abstractSerializedData.readString(z);
        this.venue_type = abstractSerializedData.readString(z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1052959727);
        this.geo_point.serializeToStream(abstractSerializedData);
        abstractSerializedData.writeString(this.title);
        abstractSerializedData.writeString(this.address);
        abstractSerializedData.writeString(this.provider);
        abstractSerializedData.writeString(this.venue_id);
        abstractSerializedData.writeString(this.venue_type);
    }
}
