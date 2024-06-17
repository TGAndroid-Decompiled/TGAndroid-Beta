package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$InputMedia extends TLObject {
    public String address;
    public TLRPC$InputFile file;
    public String first_name;
    public int flags;
    public boolean force_file;
    public TLRPC$InputGeoPoint geo_point;
    public int heading;
    public String last_name;
    public String mime_type;
    public boolean nosound_video;
    public int period;
    public String phone_number;
    public String provider;
    public int proximity_notification_radius;
    public boolean spoiler;
    public boolean stopped;
    public TLRPC$InputFile thumb;
    public String title;
    public int ttl_seconds;
    public String vcard;
    public String venue_id;
    public String venue_type;
    public ArrayList<TLRPC$InputDocument> stickers = new ArrayList<>();
    public ArrayList<TLRPC$DocumentAttribute> attributes = new ArrayList<>();

    public static TLRPC$InputMedia TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$InputMedia tLRPC$TL_inputMediaEmpty;
        switch (i) {
            case -1771768449:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaEmpty();
                break;
            case -1759532989:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaGeoLive();
                break;
            case -1279654347:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaPhoto();
                break;
            case -1052959727:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaVenue();
                break;
            case -1038383031:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaWebPage();
                break;
            case -750828557:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaGame();
                break;
            case -440664550:
                tLRPC$TL_inputMediaEmpty = new TLRPC$InputMedia() {
                    public String url;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.spoiler = (readInt32 & 2) != 0;
                        this.url = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.ttl_seconds = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-440664550);
                        int i2 = this.spoiler ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeString(this.url);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_seconds);
                        }
                    }
                };
                break;
            case -428884101:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaDice();
                break;
            case -122978821:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaContact();
                break;
            case -104578748:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaGeoPoint();
                break;
            case -78455655:
                tLRPC$TL_inputMediaEmpty = new TLRPC$InputMedia() {
                    public String url;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.spoiler = (readInt32 & 2) != 0;
                        this.url = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.ttl_seconds = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-78455655);
                        int i2 = this.spoiler ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeString(this.url);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_seconds);
                        }
                    }
                };
                break;
            case 261416433:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaPoll();
                break;
            case 505969924:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaUploadedPhoto();
                break;
            case 860303448:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaDocument();
                break;
            case 1530447553:
                tLRPC$TL_inputMediaEmpty = new TLRPC$TL_inputMediaUploadedDocument();
                break;
            default:
                tLRPC$TL_inputMediaEmpty = null;
                break;
        }
        if (tLRPC$TL_inputMediaEmpty == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in InputMedia", Integer.valueOf(i)));
        }
        if (tLRPC$TL_inputMediaEmpty != null) {
            tLRPC$TL_inputMediaEmpty.readParams(abstractSerializedData, z);
        }
        return tLRPC$TL_inputMediaEmpty;
    }
}
