package org.telegram.tgnet;
public class TLRPC$MediaArea extends TLObject {
    public TLRPC$TL_mediaAreaCoordinates coordinates;
    public boolean dark;
    public int flags;
    public boolean flipped;
    public TLRPC$Reaction reaction;

    public static TLRPC$MediaArea TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MediaArea tLRPC$TL_inputMediaAreaVenue;
        switch (i) {
            case -1300094593:
                tLRPC$TL_inputMediaAreaVenue = new TLRPC$TL_inputMediaAreaVenue();
                break;
            case -1098720356:
                tLRPC$TL_inputMediaAreaVenue = new TLRPC$TL_mediaAreaVenue();
                break;
            case -544523486:
                tLRPC$TL_inputMediaAreaVenue = new TLRPC$TL_mediaAreaGeoPoint();
                break;
            case 340088945:
                tLRPC$TL_inputMediaAreaVenue = new TLRPC$TL_mediaAreaSuggestedReaction();
                break;
            default:
                tLRPC$TL_inputMediaAreaVenue = null;
                break;
        }
        if (tLRPC$TL_inputMediaAreaVenue == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MediaArea", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputMediaAreaVenue != null) {
            tLRPC$TL_inputMediaAreaVenue.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputMediaAreaVenue;
    }
}
