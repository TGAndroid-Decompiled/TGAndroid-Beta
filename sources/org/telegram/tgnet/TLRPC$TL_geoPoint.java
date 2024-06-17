package org.telegram.tgnet;

public class TLRPC$TL_geoPoint extends TLRPC$GeoPoint {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        this.flags = abstractSerializedData.readInt32(z);
        this._long = abstractSerializedData.readDouble(z);
        this.lat = abstractSerializedData.readDouble(z);
        this.access_hash = abstractSerializedData.readInt64(z);
        if ((this.flags & 1) != 0) {
            this.accuracy_radius = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1297942941);
        abstractSerializedData.writeInt32(this.flags);
        abstractSerializedData.writeDouble(this._long);
        abstractSerializedData.writeDouble(this.lat);
        abstractSerializedData.writeInt64(this.access_hash);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.accuracy_radius);
        }
    }
}
