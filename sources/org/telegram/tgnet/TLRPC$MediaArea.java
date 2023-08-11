package org.telegram.tgnet;
public class TLRPC$MediaArea extends TLObject {
    public TLRPC$TL_mediaAreaCoordinates coordinates;

    public static TLRPC$MediaArea TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MediaArea tLRPC$TL_mediaAreaGeoPoint = i != -1300094593 ? i != -1098720356 ? i != -544523486 ? null : new TLRPC$TL_mediaAreaGeoPoint() : new TLRPC$TL_mediaAreaVenue() : new TLRPC$TL_inputMediaAreaVenue();
        if (tLRPC$TL_mediaAreaGeoPoint == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MediaArea", Integer.valueOf(i)));
        }
        if (tLRPC$TL_mediaAreaGeoPoint != null) {
            tLRPC$TL_mediaAreaGeoPoint.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_mediaAreaGeoPoint;
    }
}
