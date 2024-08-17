package org.telegram.tgnet;

public abstract class TLRPC$GeoPoint extends TLObject {
    public double _long;
    public long access_hash;
    public int accuracy_radius;
    public int flags;
    public double lat;

    public static TLRPC$GeoPoint TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$GeoPoint tLRPC$TL_geoPoint;
        if (i == -1297942941) {
            tLRPC$TL_geoPoint = new TLRPC$TL_geoPoint();
        } else if (i == 43446532) {
            tLRPC$TL_geoPoint = new TLRPC$TL_geoPoint() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this._long = abstractSerializedData2.readDouble(z2);
                    this.lat = abstractSerializedData2.readDouble(z2);
                    this.access_hash = abstractSerializedData2.readInt64(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(43446532);
                    abstractSerializedData2.writeDouble(this._long);
                    abstractSerializedData2.writeDouble(this.lat);
                    abstractSerializedData2.writeInt64(this.access_hash);
                }
            };
        } else if (i != 286776671) {
            tLRPC$TL_geoPoint = i != 541710092 ? null : new TLRPC$TL_geoPoint() {
                @Override
                public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    this._long = abstractSerializedData2.readDouble(z2);
                    this.lat = abstractSerializedData2.readDouble(z2);
                }

                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(541710092);
                    abstractSerializedData2.writeDouble(this._long);
                    abstractSerializedData2.writeDouble(this.lat);
                }
            };
        } else {
            tLRPC$TL_geoPoint = new TLRPC$GeoPoint() {
                @Override
                public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                    abstractSerializedData2.writeInt32(286776671);
                }
            };
        }
        if (tLRPC$TL_geoPoint == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in GeoPoint", Integer.valueOf(i)));
        }
        if (tLRPC$TL_geoPoint != null) {
            tLRPC$TL_geoPoint.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_geoPoint;
    }
}
