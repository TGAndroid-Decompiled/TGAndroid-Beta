package org.telegram.tgnet;

public abstract class TLRPC$GeoPoint extends TLObject {
    public double _long;
    public long access_hash;
    public int accuracy_radius;
    public int flags;
    public double lat;

    public static TLRPC$GeoPoint TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$GeoPoint tLRPC$GeoPoint;
        switch (i) {
            case -1297942941:
                tLRPC$GeoPoint = new TLRPC$TL_geoPoint();
                break;
            case 43446532:
                tLRPC$GeoPoint = new TLRPC$TL_geoPoint() {
                    public static int constructor = 43446532;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this._long = abstractSerializedData2.readDouble(z2);
                        this.lat = abstractSerializedData2.readDouble(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeDouble(this._long);
                        abstractSerializedData2.writeDouble(this.lat);
                        abstractSerializedData2.writeInt64(this.access_hash);
                    }
                };
                break;
            case 286776671:
                tLRPC$GeoPoint = new TLRPC$GeoPoint() {
                    public static int constructor = 286776671;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 541710092:
                tLRPC$GeoPoint = new TLRPC$TL_geoPoint() {
                    public static int constructor = 541710092;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this._long = abstractSerializedData2.readDouble(z2);
                        this.lat = abstractSerializedData2.readDouble(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeDouble(this._long);
                        abstractSerializedData2.writeDouble(this.lat);
                    }
                };
                break;
            default:
                tLRPC$GeoPoint = null;
                break;
        }
        if (tLRPC$GeoPoint != null || !z) {
            if (tLRPC$GeoPoint != null) {
                tLRPC$GeoPoint.readParams(abstractSerializedData, z);
            }
            return tLRPC$GeoPoint;
        }
        throw new RuntimeException(String.format("can't parse magic %x in GeoPoint", Integer.valueOf(i)));
    }
}
