package org.telegram.tgnet;

import java.util.ArrayList;
public abstract class TLRPC$MessageAction extends TLObject {
    public String address;
    public long amount;
    public TLRPC$TL_inputGroupCall call;
    public long call_id;
    public long channel_id;
    public long chat_id;
    public long cryptoAmount;
    public String cryptoCurrency;
    public String currency;
    public int duration;
    public TLRPC$DecryptedMessageAction encryptedAction;
    public int flags;
    public long game_id;
    public long inviter_id;
    public String invoice_slug;
    public String message;
    public int months;
    public TLRPC$UserProfilePhoto newUserPhoto;
    public TLRPC$Photo photo;
    public TLRPC$PhoneCallDiscardReason reason;
    public boolean recurring_init;
    public boolean recurring_used;
    public int score;
    public String title;
    public long total_amount;
    public int ttl;
    public long user_id;
    public ArrayList<Long> users = new ArrayList<>();
    public boolean video;
    public TLRPC$WallPaper wallpaper;

    public static TLRPC$MessageAction TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$MessageAction tLRPC$MessageAction;
        switch (i) {
            case -2132731265:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -2132731265;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.video = (readInt32 & 4) != 0;
                        this.call_id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 1) != 0) {
                            this.reason = TLRPC$PhoneCallDiscardReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.duration = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.video ? this.flags | 4 : this.flags & (-5);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt64(this.call_id);
                        if ((this.flags & 1) != 0) {
                            this.reason.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.duration);
                        }
                    }
                };
                break;
            case -1892568281:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -1892568281;
                    public int flags;
                    public TLRPC$TL_paymentRequestedInfo info;
                    public byte[] payload;
                    public String shipping_option_id;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.recurring_init = (readInt32 & 4) != 0;
                        this.recurring_used = (readInt32 & 8) != 0;
                        this.currency = abstractSerializedData2.readString(z2);
                        this.total_amount = abstractSerializedData2.readInt64(z2);
                        this.payload = abstractSerializedData2.readByteArray(z2);
                        if ((this.flags & 1) != 0) {
                            this.info = TLRPC$TL_paymentRequestedInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.shipping_option_id = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.recurring_init ? this.flags | 4 : this.flags & (-5);
                        this.flags = i2;
                        int i3 = this.recurring_used ? i2 | 8 : i2 & (-9);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeString(this.currency);
                        abstractSerializedData2.writeInt64(this.total_amount);
                        abstractSerializedData2.writeByteArray(this.payload);
                        if ((this.flags & 1) != 0) {
                            this.info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.shipping_option_id);
                        }
                    }
                };
                break;
            case -1834538890:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -1834538890;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.game_id = abstractSerializedData2.readInt64(z2);
                        this.score = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt64(this.game_id);
                        abstractSerializedData2.writeInt32(this.score);
                    }
                };
                break;
            case -1799538451:
                tLRPC$MessageAction = new TLRPC$TL_messageActionPinMessage();
                break;
            case -1781355374:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -1781355374;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.title = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.title);
                    }
                };
                break;
            case -1780220945:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatDeletePhoto();
                break;
            case -1776926890:
                tLRPC$MessageAction = new TLRPC$TL_messageActionPaymentSent();
                break;
            case -1730095465:
                tLRPC$MessageAction = new TLRPC$TL_messageActionGeoProximityReached();
                break;
            case -1615153660:
                tLRPC$MessageAction = new TLRPC$TL_messageActionHistoryClear();
                break;
            case -1539362612:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatDeleteUser();
                break;
            case -1503425638:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatCreate() {
                    public static int constructor = -1503425638;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.title = abstractSerializedData2.readString(z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            this.users.add(Long.valueOf(abstractSerializedData2.readInt32(z2)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.title);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.users.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            abstractSerializedData2.writeInt32((int) this.users.get(i2).longValue());
                        }
                    }
                };
                break;
            case -1441072131:
                tLRPC$MessageAction = new TLRPC$TL_messageActionSetMessagesTTL() {
                    public static int constructor = -1441072131;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.period = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.period);
                    }
                };
                break;
            case -1434950843:
                tLRPC$MessageAction = new TLRPC$TL_messageActionSetChatTheme();
                break;
            case -1410748418:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -1410748418;
                    public String domain;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.domain = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.domain);
                    }
                };
                break;
            case -1336546578:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChannelMigrateFrom() {
                    public static int constructor = -1336546578;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.title = abstractSerializedData2.readString(z2);
                        this.chat_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.title);
                        abstractSerializedData2.writeInt32((int) this.chat_id);
                    }
                };
                break;
            case -1316338916:
                tLRPC$MessageAction = new TLRPC$TL_messageActionTopicEdit() {
                    public static int constructor = -1316338916;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        if ((readInt32 & 1) != 0) {
                            this.title = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.icon_emoji_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.closed = abstractSerializedData2.readBool(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.title);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt64(this.icon_emoji_id);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeBool(this.closed);
                        }
                    }
                };
                break;
            case -1297179892:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatDeleteUser() {
                    public static int constructor = -1297179892;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                    }
                };
                break;
            case -1281329567:
                tLRPC$MessageAction = new TLRPC$TL_messageActionGroupCallScheduled();
                break;
            case -1262252875:
                tLRPC$MessageAction = new TLRPC$TL_messageActionWebViewDataSent();
                break;
            case -1247687078:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -1247687078;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.title = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.title);
                    }
                };
                break;
            case -1230047312:
                tLRPC$MessageAction = new TLRPC$TL_messageActionEmpty();
                break;
            case -1136350937:
                tLRPC$MessageAction = new TLRPC$TL_messageActionSetChatWallPaper();
                break;
            case -1119368275:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatCreate();
                break;
            case -1065845395:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -1065845395;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.wallpaper.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -1064024032:
                tLRPC$MessageAction = new TLRPC$TL_messageActionTopicEdit();
                break;
            case -988359047:
                tLRPC$MessageAction = new TLRPC$TL_messageActionBotAllowed();
                break;
            case -935499028:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -935499028;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.currency = abstractSerializedData2.readString(z2);
                        this.amount = abstractSerializedData2.readInt64(z2);
                        this.months = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.cryptoCurrency = abstractSerializedData2.readString(z2);
                            this.cryptoAmount = abstractSerializedData2.readInt64(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeString(this.currency);
                        abstractSerializedData2.writeInt64(this.amount);
                        abstractSerializedData2.writeInt32(this.months);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeString(this.cryptoCurrency);
                            abstractSerializedData2.writeInt64(this.cryptoAmount);
                        }
                    }
                };
                break;
            case -648257196:
                tLRPC$MessageAction = new TLRPC$TL_messageActionSecureValuesSent();
                break;
            case -519864430:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatMigrateTo();
                break;
            case -404267113:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -404267113;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -365344535:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChannelMigrateFrom();
                break;
            case -339958837:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatJoinedByRequest();
                break;
            case -202219658:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -202219658;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case -123931160:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatJoinedByLink() {
                    public static int constructor = -123931160;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.inviter_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.inviter_id);
                    }
                };
                break;
            case -85549226:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = -85549226;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.message = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.message);
                    }
                };
                break;
            case -25742243:
                tLRPC$MessageAction = new TLRPC$TL_messageActionRequestedPeer();
                break;
            case 29007925:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = 29007925;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 51520707:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatJoinedByLink();
                break;
            case 228168278:
                tLRPC$MessageAction = new TLRPC$TL_messageActionTopicCreate();
                break;
            case 365886720:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatAddUser();
                break;
            case 1007897979:
                tLRPC$MessageAction = new TLRPC$TL_messageActionSetMessagesTTL();
                break;
            case 1080663248:
                tLRPC$MessageAction = new TLRPC$TL_messageActionPaymentSent() {
                    public static int constructor = 1080663248;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.currency = abstractSerializedData2.readString(z2);
                        this.total_amount = abstractSerializedData2.readInt64(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.currency);
                        abstractSerializedData2.writeInt64(this.total_amount);
                    }
                };
                break;
            case 1200788123:
                tLRPC$MessageAction = new TLRPC$TL_messageActionScreenshotTaken();
                break;
            case 1205698681:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = 1205698681;
                    public String data;
                    public String text;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.text = abstractSerializedData2.readString(z2);
                        this.data = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.text);
                        abstractSerializedData2.writeString(this.data);
                    }
                };
                break;
            case 1217033015:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatAddUser() {
                    public static int constructor = 1217033015;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            this.users.add(Long.valueOf(abstractSerializedData2.readInt32(z2)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.users.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            abstractSerializedData2.writeInt32((int) this.users.get(i2).longValue());
                        }
                    }
                };
                break;
            case 1345295095:
                tLRPC$MessageAction = new TLRPC$TL_messageActionInviteToGroupCall();
                break;
            case 1371385889:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatMigrateTo() {
                    public static int constructor = 1371385889;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.channel_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.channel_id);
                    }
                };
                break;
            case 1431655760:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = 1431655760;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1431655761:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = 1431655761;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.newUserPhoto = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.newUserPhoto.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 1431655762:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = 1431655762;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.ttl = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.ttl);
                    }
                };
                break;
            case 1431655767:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = 1431655767;

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                    }
                };
                break;
            case 1431655925:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = 1431655925;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.title = abstractSerializedData2.readString(z2);
                        this.address = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeString(this.title);
                        abstractSerializedData2.writeString(this.address);
                    }
                };
                break;
            case 1431655927:
                tLRPC$MessageAction = new TLRPC$TL_messageEncryptedAction();
                break;
            case 1474192222:
                tLRPC$MessageAction = new TLRPC$TL_messageActionSuggestProfilePhoto();
                break;
            case 1581055051:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatAddUser() {
                    public static int constructor = 1581055051;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.user_id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.user_id);
                    }
                };
                break;
            case 1991897370:
                tLRPC$MessageAction = new TLRPC$TL_messageActionInviteToGroupCall() {
                    public static int constructor = 1991897370;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            this.users.add(Long.valueOf(abstractSerializedData2.readInt32(z2)));
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        this.call.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.users.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            abstractSerializedData2.writeInt32((int) this.users.get(i2).longValue());
                        }
                    }
                };
                break;
            case 2047704898:
                tLRPC$MessageAction = new TLRPC$MessageAction() {
                    public static int constructor = 2047704898;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 1) != 0) {
                            this.duration = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        this.call.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.duration);
                        }
                    }
                };
                break;
            case 2144015272:
                tLRPC$MessageAction = new TLRPC$TL_messageActionChatEditPhoto();
                break;
            default:
                tLRPC$MessageAction = null;
                break;
        }
        if (tLRPC$MessageAction == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in MessageAction", Integer.valueOf(i)));
        }
        if (tLRPC$MessageAction != null) {
            tLRPC$MessageAction.readParams(abstractSerializedData, z);
        }
        return tLRPC$MessageAction;
    }
}
