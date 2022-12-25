package org.telegram.tgnet;

import org.telegram.messenger.BuildConfig;

public abstract class TLRPC$MessageMedia extends TLObject {
    public String address;
    public TLRPC$Audio audio_unused;
    public byte[] bytes;
    public String captionLegacy;
    public String currency;
    public String description;
    public TLRPC$Document document;
    public TLRPC$MessageExtendedMedia extended_media;
    public String first_name;
    public int flags;
    public TLRPC$TL_game game;
    public TLRPC$GeoPoint geo;
    public int heading;
    public String last_name;
    public boolean nopremium;
    public int period;
    public String phone_number;
    public TLRPC$Photo photo;
    public String provider;
    public int proximity_notification_radius;
    public int receipt_msg_id;
    public boolean shipping_address_requested;
    public String start_param;
    public boolean test;
    public String title;
    public long total_amount;
    public int ttl_seconds;
    public long user_id;
    public String vcard;
    public String venue_id;
    public String venue_type;
    public TLRPC$Video video_unused;
    public TLRPC$WebPage webpage;

    public static TLRPC$MessageMedia TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MessageMedia tLRPC$MessageMedia;
        TLRPC$TL_messageMediaDocument tLRPC$TL_messageMediaDocument;
        switch (i) {
            case -2074799289:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaInvoice() {
                    public static int constructor = -2074799289;
                    public TLRPC$WebDocument photo;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.shipping_address_requested = (readInt32 & 2) != 0;
                        this.test = (readInt32 & 8) != 0;
                        this.title = abstractSerializedData2.readString(z2);
                        this.description = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.photo = TLRPC$WebDocument.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.receipt_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.currency = abstractSerializedData2.readString(z2);
                        this.total_amount = abstractSerializedData2.readInt64(z2);
                        this.start_param = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.shipping_address_requested ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.test ? i2 | 8 : i2 & (-9);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeString(this.title);
                        abstractSerializedData2.writeString(this.description);
                        if ((this.flags & 1) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.receipt_msg_id);
                        }
                        abstractSerializedData2.writeString(this.currency);
                        abstractSerializedData2.writeInt64(this.total_amount);
                        abstractSerializedData2.writeString(this.start_param);
                    }
                };
                break;
            case -1666158377:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaDocument();
                break;
            case -1618676578:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaUnsupported();
                break;
            case -1563278704:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaVideo_layer45() {
                    public static int constructor = -1563278704;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.video_unused = TLRPC$Video.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.video_unused.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -1557277184:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaWebPage();
                break;
            case -1256047857:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaPhoto() {
                    public static int constructor = -1256047857;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        } else {
                            this.photo = new TLRPC$TL_photoEmpty();
                        }
                        if ((this.flags & 2) != 0) {
                            this.captionLegacy = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.ttl_seconds = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.captionLegacy);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_seconds);
                        }
                    }
                };
                break;
            case -1186937242:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaGeoLive();
                break;
            case -961117440:
                tLRPC$MessageMedia = new TLRPC$MessageMedia() {
                    public static int constructor = -961117440;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.audio_unused = TLRPC$Audio.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.audio_unused.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -926655958:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaPhoto() {
                    public static int constructor = -926655958;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.photo.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -873313984:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaContact() {
                    public static int constructor = -873313984;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.phone_number = abstractSerializedData2.readString(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.vcard = abstractSerializedData2.readString(z2);
                        this.user_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.phone_number);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                        abstractSerializedData2.writeString(this.vcard);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                    }
                };
                break;
            case -203411800:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaDocument() {
                    public static int constructor = -203411800;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.captionLegacy = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.document.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeString(this.captionLegacy);
                    }
                };
                break;
            case -156940077:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaInvoice();
                break;
            case -38694904:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaGame();
                break;
            case 694364726:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaUnsupported_old();
                break;
            case 784356159:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaVenue();
                break;
            case 802824708:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaDocument() {
                    public static int constructor = 802824708;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.document.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 1032643901:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaPhoto() {
                    public static int constructor = 1032643901;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.captionLegacy = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeString(this.captionLegacy);
                    }
                };
                break;
            case 1038967584:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaEmpty();
                break;
            case 1065280907:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaDice();
                break;
            case 1272375192:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaPoll();
                break;
            case 1457575028:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaGeo();
                break;
            case 1540298357:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaVideo_layer45();
                break;
            case 1585262393:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaContact() {
                    public static int constructor = 1585262393;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.phone_number = abstractSerializedData2.readString(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.user_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.phone_number);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                    }
                };
                break;
            case 1670374507:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaDice() {
                    public static int constructor = 1670374507;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.value = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.value);
                    }
                };
                break;
            case 1766936791:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaPhoto();
                break;
            case 1882335561:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaContact();
                break;
            case 2031269663:
                tLRPC$MessageMedia = new TLRPC$MessageMedia() {
                    public static int constructor = 2031269663;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.title = abstractSerializedData2.readString(z2);
                        this.address = abstractSerializedData2.readString(z2);
                        this.provider = abstractSerializedData2.readString(z2);
                        this.venue_id = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.geo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeString(this.title);
                        abstractSerializedData2.writeString(this.address);
                        abstractSerializedData2.writeString(this.provider);
                        abstractSerializedData2.writeString(this.venue_id);
                    }
                };
                break;
            case 2084316681:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaGeoLive() {
                    public static int constructor = 2084316681;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.period = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.geo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.period);
                    }
                };
                break;
            case 2084836563:
                tLRPC$MessageMedia = new TLRPC$TL_messageMediaDocument() {
                    public static int constructor = 2084836563;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            this.document = TLRPC$Document.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        } else {
                            this.document = new TLRPC$TL_documentEmpty();
                        }
                        if ((this.flags & 2) != 0) {
                            this.captionLegacy = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.ttl_seconds = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            this.document.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.captionLegacy);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_seconds);
                        }
                    }
                };
                break;
            default:
                tLRPC$MessageMedia = null;
                break;
        }
        if (tLRPC$MessageMedia == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessageMedia", Integer.valueOf(i)));
        }
        if (tLRPC$MessageMedia != null) {
            tLRPC$MessageMedia.readParams(abstractSerializedData, z);
            if (tLRPC$MessageMedia.video_unused != null) {
                tLRPC$TL_messageMediaDocument = new TLRPC$TL_messageMediaDocument();
                if (tLRPC$MessageMedia.video_unused instanceof TLRPC$TL_videoEncrypted) {
                    TLRPC$TL_documentEncrypted tLRPC$TL_documentEncrypted = new TLRPC$TL_documentEncrypted();
                    tLRPC$TL_messageMediaDocument.document = tLRPC$TL_documentEncrypted;
                    TLRPC$Video tLRPC$Video = tLRPC$MessageMedia.video_unused;
                    tLRPC$TL_documentEncrypted.key = tLRPC$Video.key;
                    tLRPC$TL_documentEncrypted.f857iv = tLRPC$Video.f990iv;
                } else {
                    tLRPC$TL_messageMediaDocument.document = new TLRPC$TL_document();
                }
                tLRPC$TL_messageMediaDocument.flags = 3;
                TLRPC$Document tLRPC$Document = tLRPC$TL_messageMediaDocument.document;
                tLRPC$Document.file_reference = new byte[0];
                TLRPC$Video tLRPC$Video2 = tLRPC$MessageMedia.video_unused;
                tLRPC$Document.f856id = tLRPC$Video2.f989id;
                tLRPC$Document.access_hash = tLRPC$Video2.access_hash;
                tLRPC$Document.date = tLRPC$Video2.date;
                String str = tLRPC$Video2.mime_type;
                if (str != null) {
                    tLRPC$Document.mime_type = str;
                } else {
                    tLRPC$Document.mime_type = "video/mp4";
                }
                tLRPC$Document.size = tLRPC$Video2.size;
                tLRPC$Document.thumbs.add(tLRPC$Video2.thumb);
                tLRPC$TL_messageMediaDocument.document.dc_id = tLRPC$MessageMedia.video_unused.dc_id;
                tLRPC$TL_messageMediaDocument.captionLegacy = tLRPC$MessageMedia.captionLegacy;
                TLRPC$TL_documentAttributeVideo tLRPC$TL_documentAttributeVideo = new TLRPC$TL_documentAttributeVideo();
                TLRPC$Video tLRPC$Video3 = tLRPC$MessageMedia.video_unused;
                tLRPC$TL_documentAttributeVideo.f859w = tLRPC$Video3.f991w;
                tLRPC$TL_documentAttributeVideo.f858h = tLRPC$Video3.f988h;
                tLRPC$TL_documentAttributeVideo.duration = tLRPC$Video3.duration;
                tLRPC$TL_messageMediaDocument.document.attributes.add(tLRPC$TL_documentAttributeVideo);
                if (tLRPC$TL_messageMediaDocument.captionLegacy == null) {
                    tLRPC$TL_messageMediaDocument.captionLegacy = BuildConfig.APP_CENTER_HASH;
                }
            } else if (tLRPC$MessageMedia.audio_unused == null) {
                return tLRPC$MessageMedia;
            } else {
                tLRPC$TL_messageMediaDocument = new TLRPC$TL_messageMediaDocument();
                if (tLRPC$MessageMedia.audio_unused instanceof TLRPC$TL_audioEncrypted) {
                    TLRPC$TL_documentEncrypted tLRPC$TL_documentEncrypted2 = new TLRPC$TL_documentEncrypted();
                    tLRPC$TL_messageMediaDocument.document = tLRPC$TL_documentEncrypted2;
                    TLRPC$Audio tLRPC$Audio = tLRPC$MessageMedia.audio_unused;
                    tLRPC$TL_documentEncrypted2.key = tLRPC$Audio.key;
                    tLRPC$TL_documentEncrypted2.f857iv = tLRPC$Audio.f845iv;
                } else {
                    tLRPC$TL_messageMediaDocument.document = new TLRPC$TL_document();
                }
                tLRPC$TL_messageMediaDocument.flags = 3;
                TLRPC$Document tLRPC$Document2 = tLRPC$TL_messageMediaDocument.document;
                tLRPC$Document2.file_reference = new byte[0];
                TLRPC$Audio tLRPC$Audio2 = tLRPC$MessageMedia.audio_unused;
                tLRPC$Document2.f856id = tLRPC$Audio2.f844id;
                tLRPC$Document2.access_hash = tLRPC$Audio2.access_hash;
                tLRPC$Document2.date = tLRPC$Audio2.date;
                String str2 = tLRPC$Audio2.mime_type;
                if (str2 != null) {
                    tLRPC$Document2.mime_type = str2;
                } else {
                    tLRPC$Document2.mime_type = "audio/ogg";
                }
                tLRPC$Document2.size = tLRPC$Audio2.size;
                TLRPC$TL_photoSizeEmpty tLRPC$TL_photoSizeEmpty = new TLRPC$TL_photoSizeEmpty();
                tLRPC$TL_photoSizeEmpty.type = "s";
                tLRPC$TL_messageMediaDocument.document.thumbs.add(tLRPC$TL_photoSizeEmpty);
                tLRPC$TL_messageMediaDocument.document.dc_id = tLRPC$MessageMedia.audio_unused.dc_id;
                tLRPC$TL_messageMediaDocument.captionLegacy = tLRPC$MessageMedia.captionLegacy;
                TLRPC$TL_documentAttributeAudio tLRPC$TL_documentAttributeAudio = new TLRPC$TL_documentAttributeAudio();
                tLRPC$TL_documentAttributeAudio.duration = tLRPC$MessageMedia.audio_unused.duration;
                tLRPC$TL_documentAttributeAudio.voice = true;
                tLRPC$TL_messageMediaDocument.document.attributes.add(tLRPC$TL_documentAttributeAudio);
                if (tLRPC$TL_messageMediaDocument.captionLegacy == null) {
                    tLRPC$TL_messageMediaDocument.captionLegacy = BuildConfig.APP_CENTER_HASH;
                }
            }
            return tLRPC$TL_messageMediaDocument;
        }
        return tLRPC$MessageMedia;
    }
}
