package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLRPC$GeoPoint;
public class TL_stories$TL_mediaAreaGeoPoint extends TL_stories$MediaArea {
    public TLRPC$GeoPoint geo;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.coordinates = TL_stories$TL_mediaAreaCoordinates.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-544523486);
        this.coordinates.serializeToStream(abstractSerializedData);
        this.geo.serializeToStream(abstractSerializedData);
    }
}
