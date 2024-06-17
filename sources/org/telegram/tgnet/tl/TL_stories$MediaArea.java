package org.telegram.tgnet.tl;

import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$GeoPoint;
import org.telegram.tgnet.TLRPC$Reaction;

public class TL_stories$MediaArea extends TLObject {
    public TL_stories$MediaAreaCoordinates coordinates;
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
            case -891992787:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_mediaAreaGeoPoint();
                break;
            case -544523486:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_mediaAreaGeoPoint() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.coordinates = TL_stories$MediaAreaCoordinates.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-544523486);
                        this.coordinates.serializeToStream(abstractSerializedData2);
                        this.geo.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 340088945:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_mediaAreaSuggestedReaction();
                break;
            case 577893055:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_inputMediaAreaChannelPost();
                break;
            case 926421125:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_mediaAreaUrl();
                break;
            case 1996756655:
                tL_stories$TL_inputMediaAreaVenue = new TL_stories$TL_mediaAreaChannelPost();
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
