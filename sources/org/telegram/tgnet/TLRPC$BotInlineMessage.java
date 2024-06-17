package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.LiteMode;

public abstract class TLRPC$BotInlineMessage extends TLObject {
    public String address;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public String first_name;
    public int flags;
    public boolean force_large_media;
    public boolean force_small_media;
    public TLRPC$GeoPoint geo;
    public int heading;
    public boolean invert_media;
    public String last_name;
    public boolean manual;
    public String message;
    public boolean no_webpage;
    public int period;
    public String phone_number;
    public String provider;
    public int proximity_notification_radius;
    public TLRPC$ReplyMarkup reply_markup;
    public boolean safe;
    public String title;
    public String url;
    public String vcard;
    public String venue_id;
    public String venue_type;

    public static TLRPC$BotInlineMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$BotInlineMessage tLRPC$BotInlineMessage;
        switch (i) {
            case -2137335386:
                tLRPC$BotInlineMessage = new TLRPC$BotInlineMessage() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.invert_media = (readInt32 & 8) != 0;
                        this.force_large_media = (readInt32 & 16) != 0;
                        this.force_small_media = (readInt32 & 32) != 0;
                        this.manual = (readInt32 & 128) != 0;
                        this.safe = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 2) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            } else {
                                int readInt323 = abstractSerializedData2.readInt32(z2);
                                for (int i2 = 0; i2 < readInt323; i2++) {
                                    this.entities.add(TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2));
                                }
                            }
                        }
                        this.url = abstractSerializedData2.readString(z2);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-2137335386);
                        int i2 = this.invert_media ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.force_large_media ? i2 | 8 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.force_small_media ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.manual ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.safe ? i5 | LiteMode.FLAG_CHAT_BLUR : i5 & (-257);
                        this.flags = i6;
                        abstractSerializedData2.writeInt32(i6);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i7 = 0; i7 < size; i7++) {
                                this.entities.get(i7).serializeToStream(abstractSerializedData2);
                            }
                        }
                        abstractSerializedData2.writeString(this.url);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1970903652:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaVenue();
                break;
            case -1937807902:
                tLRPC$BotInlineMessage = new TLRPC$BotInlineMessage() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.no_webpage = (readInt32 & 1) != 0;
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 2) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 4) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1937807902);
                        int i2 = this.no_webpage ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i3 = 0; i3 < size; i3++) {
                                this.entities.get(i3).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 4) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1222451611:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaGeo() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.period = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1222451611);
                        abstractSerializedData2.writeInt32(this.flags);
                        this.geo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.period);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 85477117:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaGeo();
                break;
            case 175419739:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaAuto() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(175419739);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 416402882:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaContact();
                break;
            case 894081801:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaInvoice();
                break;
            case 904770772:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaContact() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.phone_number = abstractSerializedData2.readString(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(904770772);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeString(this.phone_number);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 982505656:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaGeo() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(982505656);
                        abstractSerializedData2.writeInt32(this.flags);
                        this.geo.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1130767150:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaVenue() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.geo = TLRPC$GeoPoint.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.title = abstractSerializedData2.readString(z2);
                        this.address = abstractSerializedData2.readString(z2);
                        this.provider = abstractSerializedData2.readString(z2);
                        this.venue_id = abstractSerializedData2.readString(z2);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1130767150);
                        abstractSerializedData2.writeInt32(this.flags);
                        this.geo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeString(this.title);
                        abstractSerializedData2.writeString(this.address);
                        abstractSerializedData2.writeString(this.provider);
                        abstractSerializedData2.writeString(this.venue_id);
                        if ((this.flags & 4) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1984755728:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaAuto();
                break;
            default:
                tLRPC$BotInlineMessage = null;
                break;
        }
        if (tLRPC$BotInlineMessage == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in BotInlineMessage", Integer.valueOf(i)));
        }
        if (tLRPC$BotInlineMessage != null) {
            tLRPC$BotInlineMessage.readParams(abstractSerializedData, z);
        }
        return tLRPC$BotInlineMessage;
    }
}
