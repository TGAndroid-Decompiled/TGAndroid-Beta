package org.telegram.tgnet;

import java.util.ArrayList;

public abstract class TLRPC$BotInlineMessage extends TLObject {
    public String address;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public String first_name;
    public int flags;
    public TLRPC$GeoPoint geo;
    public int heading;
    public String last_name;
    public String message;
    public boolean no_webpage;
    public int period;
    public String phone_number;
    public String provider;
    public int proximity_notification_radius;
    public TLRPC$ReplyMarkup reply_markup;
    public String title;
    public String vcard;
    public String venue_id;
    public String venue_type;

    public static TLRPC$BotInlineMessage TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$BotInlineMessage tLRPC$BotInlineMessage;
        switch (i) {
            case -1970903652:
                tLRPC$BotInlineMessage = new TLRPC$TL_botInlineMessageMediaVenue();
                break;
            case -1937807902:
                tLRPC$BotInlineMessage = new TLRPC$BotInlineMessage() {
                    public static int constructor = -1937807902;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.no_webpage = (readInt32 & 1) != 0;
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 2) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 == 481674261) {
                                int readInt323 = abstractSerializedData2.readInt32(z2);
                                for (int i2 = 0; i2 < readInt323; i2++) {
                                    TLRPC$MessageEntity TLdeserialize = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                    if (TLdeserialize != null) {
                                        this.entities.add(TLdeserialize);
                                    } else {
                                        return;
                                    }
                                }
                            } else if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            } else {
                                return;
                            }
                        }
                        if ((this.flags & 4) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
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
                    public static int constructor = -1222451611;

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
                        abstractSerializedData2.writeInt32(constructor);
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
                    public static int constructor = 175419739;

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
                        abstractSerializedData2.writeInt32(constructor);
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
                    public static int constructor = 904770772;

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
                        abstractSerializedData2.writeInt32(constructor);
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
                    public static int constructor = 982505656;

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
                        abstractSerializedData2.writeInt32(constructor);
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
                    public static int constructor = 1130767150;

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
                        abstractSerializedData2.writeInt32(constructor);
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
        if (tLRPC$BotInlineMessage != null || !z) {
            if (tLRPC$BotInlineMessage != null) {
                tLRPC$BotInlineMessage.readParams(abstractSerializedData, z);
            }
            return tLRPC$BotInlineMessage;
        }
        throw new RuntimeException(String.format("can't parse magic %x in BotInlineMessage", Integer.valueOf(i)));
    }
}
