package org.telegram.tgnet;
public class TLRPC$TL_mediaAreaGeoPoint extends TLRPC$MediaArea {
    public TLRPC$GeoPoint geo;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.coordinates = TLRPC$TL_mediaAreaCoordinates.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-544523486);
        this.coordinates.serializeToStream(abstractSerializedData);
        this.geo.serializeToStream(abstractSerializedData);
    }
}
