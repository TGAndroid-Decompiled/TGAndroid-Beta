package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$GeoPoint;
public class TL_stories$TL_mediaAreaGeoPoint extends TL_stories$MediaArea {
    public TL_stories$TL_geoPointAddress address;
    public TLRPC$GeoPoint geo;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this.coordinates = TL_stories$MediaAreaCoordinates.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 1) != 0) {
            this.address = TL_stories$TL_geoPointAddress.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-891992787);
        abstractSerializedData.writeInt32(this.flags);
        this.coordinates.serializeToStream(abstractSerializedData);
        this.geo.serializeToStream(abstractSerializedData);
        if ((this.flags & 1) != 0) {
            this.address.serializeToStream(abstractSerializedData);
        }
    }
}
