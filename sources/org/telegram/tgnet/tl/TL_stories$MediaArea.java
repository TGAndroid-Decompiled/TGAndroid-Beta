package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$Reaction;
public class TL_stories$MediaArea extends TLObject {
    public TL_stories$TL_mediaAreaCoordinates coordinates;
    public boolean dark;
    public int flags;
    public boolean flipped;
    public TLRPC$Reaction reaction;

    public static TL_stories$MediaArea TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TL_stories$MediaArea tL_stories$TL_inputMediaAreaVenue;
        switch (i) {
            case -1300094593:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_inputMediaAreaVenue();
                break;
            case -1098720356:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_mediaAreaVenue();
                break;
            case -544523486:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_mediaAreaGeoPoint();
                break;
            case 340088945:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_mediaAreaSuggestedReaction();
                break;
            default:
                tL_stories$TL_inputMediaAreaVenue = null;
                break;
        }
        if (tL_stories$TL_inputMediaAreaVenue == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MediaArea", Integer.valueOf(i)));
        }
        if (tL_stories$TL_inputMediaAreaVenue != null) {
            tL_stories$TL_inputMediaAreaVenue.readParams(abstractSerializedData, z);
        }
        return tL_stories$TL_inputMediaAreaVenue;
    }
}
