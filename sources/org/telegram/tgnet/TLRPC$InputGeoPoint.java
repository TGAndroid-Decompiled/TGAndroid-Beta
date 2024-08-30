package org.telegram.tgnet;

public abstract class TLRPC$InputGeoPoint extends TLObject {
    public double _long;
    public int accuracy_radius;
    public int flags;
    public double lat;

    public static TLRPC$InputGeoPoint TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputGeoPoint tLRPC$TL_inputGeoPoint = i != -457104426 ? i != 1210199983 ? null : new TLRPC$TL_inputGeoPoint() : new TLRPC$TL_inputGeoPointEmpty();
        if (tLRPC$TL_inputGeoPoint == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputGeoPoint", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputGeoPoint != null) {
            tLRPC$TL_inputGeoPoint.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputGeoPoint;
    }
}
