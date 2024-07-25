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
        TL_stories$MediaArea tL_stories$MediaArea;
        switch (i) {
            case -2057362882:
                tL_stories$MediaArea = new TL_stories$MediaArea() {
                    public String emoji;
                    public int temperature_c;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.dark = (readInt32 & 1) != 0;
                        this.coordinates = TL_stories$MediaAreaCoordinates.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.emoji = abstractSerializedData2.readString(z2);
                        this.temperature_c = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-2057362882);
                        int i2 = this.dark ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        this.coordinates.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeString(this.emoji);
                        abstractSerializedData2.writeInt32(this.temperature_c);
                    }
                };
                break;
            case -1300094593:
                tL_stories$MediaArea = new TL_stories$TL_inputMediaAreaVenue();
                break;
            case -1098720356:
                tL_stories$MediaArea = new TL_stories$TL_mediaAreaVenue();
                break;
            case -891992787:
                tL_stories$MediaArea = new TL_stories$TL_mediaAreaGeoPoint();
                break;
            case -544523486:
                tL_stories$MediaArea = new TL_stories$TL_mediaAreaGeoPoint() {
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
                tL_stories$MediaArea = new TL_stories$TL_mediaAreaSuggestedReaction();
                break;
            case 577893055:
                tL_stories$MediaArea = new TL_stories$TL_inputMediaAreaChannelPost();
                break;
            case 926421125:
                tL_stories$MediaArea = new TL_stories$TL_mediaAreaUrl();
                break;
            case 1132918857:
                tL_stories$MediaArea = new TL_stories$MediaArea() {
                    public String emoji;
                    public double temperature_c;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.dark = (readInt32 & 1) != 0;
                        this.coordinates = TL_stories$MediaAreaCoordinates.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.emoji = abstractSerializedData2.readString(z2);
                        this.temperature_c = abstractSerializedData2.readDouble(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1132918857);
                        int i2 = this.dark ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        this.coordinates.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeString(this.emoji);
                        abstractSerializedData2.writeDouble(this.temperature_c);
                    }
                };
                break;
            case 1235637404:
                tL_stories$MediaArea = new TL_stories$TL_mediaAreaWeather();
                break;
            case 1996756655:
                tL_stories$MediaArea = new TL_stories$TL_mediaAreaChannelPost();
                break;
            default:
                tL_stories$MediaArea = null;
                break;
        }
        if (tL_stories$MediaArea == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MediaArea", Integer.valueOf(i)));
        }
        if (tL_stories$MediaArea != null) {
            tL_stories$MediaArea.readParams(abstractSerializedData, z);
        }
        return tL_stories$MediaArea;
    }
}
