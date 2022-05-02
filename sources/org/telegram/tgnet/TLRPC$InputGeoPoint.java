package org.telegram.tgnet;

public abstract class TLRPC$InputGeoPoint extends TLObject {
    public double _long;
    public int accuracy_radius;
    public int flags;
    public double lat;

    public static TLRPC$InputGeoPoint TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputGeoPoint tLRPC$InputGeoPoint;
        if (i != -457104426) {
            tLRPC$InputGeoPoint = i != 1210199983 ? null : new TLRPC$TL_inputGeoPoint();
        } else {
            tLRPC$InputGeoPoint = new TLRPC$TL_inputGeoPointEmpty();
        }
        if (tLRPC$InputGeoPoint != null || !z) {
            if (tLRPC$InputGeoPoint != null) {
                tLRPC$InputGeoPoint.readParams(abstractSerializedData, z);
            }
            return tLRPC$InputGeoPoint;
        }
        throw new RuntimeException(String.format("can't parse magic %x in InputGeoPoint", Integer.valueOf(i)));
    }
}
