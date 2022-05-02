package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.CharacterCompat;

public abstract class TLRPC$User extends TLObject {
    public long access_hash;
    public boolean apply_min_photo;
    public boolean bot;
    public boolean bot_attach_menu;
    public boolean bot_chat_history;
    public int bot_info_version;
    public boolean bot_inline_geo;
    public String bot_inline_placeholder;
    public boolean bot_menu_webview;
    public boolean bot_nochats;
    public boolean contact;
    public boolean deleted;
    public boolean explicit_content;
    public boolean fake;
    public String first_name;
    public int flags;
    public long f974id;
    public boolean inactive;
    public String lang_code;
    public String last_name;
    public boolean min;
    public boolean mutual_contact;
    public String phone;
    public TLRPC$UserProfilePhoto photo;
    public boolean restricted;
    public ArrayList<TLRPC$TL_restrictionReason> restriction_reason = new ArrayList<>();
    public boolean scam;
    public boolean self;
    public TLRPC$UserStatus status;
    public boolean support;
    public String username;
    public boolean verified;

    public static TLRPC$User TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$User tLRPC$User;
        switch (i) {
            case -1820043071:
                tLRPC$User = new TLRPC$TL_user() {
                    public static int constructor = -1820043071;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & 4096) != 0;
                        this.deleted = (readInt32 & 8192) != 0;
                        this.bot = (readInt32 & 16384) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        this.bot_inline_geo = (2097152 & readInt32) != 0;
                        this.support = (8388608 & readInt32) != 0;
                        this.scam = (16777216 & readInt32) != 0;
                        this.apply_min_photo = (33554432 & readInt32) != 0;
                        this.fake = (readInt32 & ConnectionsManager.FileTypeFile) != 0;
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.first_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.last_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.username = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.phone = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 == 481674261) {
                                int readInt323 = abstractSerializedData2.readInt32(z2);
                                for (int i2 = 0; i2 < readInt323; i2++) {
                                    TLRPC$TL_restrictionReason TLdeserialize = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                    if (TLdeserialize != null) {
                                        this.restriction_reason.add(TLdeserialize);
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
                        if ((this.flags & 524288) != 0) {
                            this.bot_inline_placeholder = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.lang_code = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | 4096 : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | 32768 : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | 1048576 : i10 & (-1048577);
                        this.flags = i11;
                        int i12 = this.bot_inline_geo ? i11 | 2097152 : i11 & (-2097153);
                        this.flags = i12;
                        int i13 = this.support ? i12 | 8388608 : i12 & (-8388609);
                        this.flags = i13;
                        int i14 = this.scam ? i13 | ConnectionsManager.FileTypePhoto : i13 & (-16777217);
                        this.flags = i14;
                        int i15 = this.apply_min_photo ? i14 | ConnectionsManager.FileTypeVideo : i14 & (-33554433);
                        this.flags = i15;
                        int i16 = this.fake ? i15 | ConnectionsManager.FileTypeFile : i15 & (-67108865);
                        this.flags = i16;
                        abstractSerializedData2.writeInt32(i16);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.first_name);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.last_name);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeString(this.phone);
                        }
                        if ((this.flags & 32) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.status.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i17 = 0; i17 < size; i17++) {
                                this.restriction_reason.get(i17).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeString(this.bot_inline_placeholder);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeString(this.lang_code);
                        }
                    }
                };
                break;
            case -1298475060:
                tLRPC$User = new TLRPC$TL_userDeleted_old2() {
                    public static int constructor = -1298475060;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                    }
                };
                break;
            case -894214632:
                tLRPC$User = new TLRPC$TL_userContact_old2();
                break;
            case -787638374:
                tLRPC$User = new TLRPC$TL_user() {
                    public static int constructor = -787638374;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & 4096) != 0;
                        this.deleted = (readInt32 & 8192) != 0;
                        this.bot = (readInt32 & 16384) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        if ((readInt32 & 2097152) != 0) {
                            z3 = true;
                        }
                        this.bot_inline_geo = z3;
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.first_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.last_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.username = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.phone = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            this.bot_inline_placeholder = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | 4096 : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | 32768 : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | 1048576 : i10 & (-1048577);
                        this.flags = i11;
                        int i12 = this.bot_inline_geo ? i11 | 2097152 : i11 & (-2097153);
                        this.flags = i12;
                        abstractSerializedData2.writeInt32(i12);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.first_name);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.last_name);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeString(this.phone);
                        }
                        if ((this.flags & 32) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.status.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeString("");
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeString(this.bot_inline_placeholder);
                        }
                    }
                };
                break;
            case -742634630:
                tLRPC$User = new TLRPC$TL_userEmpty();
                break;
            case -704549510:
                tLRPC$User = new TLRPC$TL_userDeleted_old2();
                break;
            case -640891665:
                tLRPC$User = new TLRPC$TL_userRequest_old2();
                break;
            case -218397927:
                tLRPC$User = new TLRPC$TL_userContact_old2() {
                    public static int constructor = -218397927;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.phone = abstractSerializedData2.readString(z2);
                        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.phone);
                        this.photo.serializeToStream(abstractSerializedData2);
                        this.status.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 123533224:
                tLRPC$User = new TLRPC$TL_userForeign_old2();
                break;
            case 476112392:
                tLRPC$User = new TLRPC$TL_userSelf_old3();
                break;
            case 537022650:
                tLRPC$User = new TLRPC$TL_userEmpty() {
                    public static int constructor = 537022650;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f974id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                    }
                };
                break;
            case 585404530:
                tLRPC$User = new TLRPC$TL_user() {
                    public static int constructor = 585404530;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & 4096) != 0;
                        this.deleted = (readInt32 & 8192) != 0;
                        this.bot = (readInt32 & 16384) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        if ((readInt32 & 262144) != 0) {
                            z3 = true;
                        }
                        this.explicit_content = z3;
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.first_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.last_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.username = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.phone = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | 4096 : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | 32768 : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.explicit_content ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        abstractSerializedData2.writeInt32(i10);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.first_name);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.last_name);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeString(this.phone);
                        }
                        if ((this.flags & 32) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.status.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                    }
                };
                break;
            case 585682608:
                tLRPC$User = new TLRPC$TL_userRequest_old2() {
                    public static int constructor = 585682608;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.phone = abstractSerializedData2.readString(z2);
                        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.phone);
                        this.photo.serializeToStream(abstractSerializedData2);
                        this.status.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 773059779:
                tLRPC$User = new TLRPC$TL_user() {
                    public static int constructor = 773059779;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        boolean z3 = false;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & 4096) != 0;
                        this.deleted = (readInt32 & 8192) != 0;
                        this.bot = (readInt32 & 16384) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        this.bot_inline_geo = (2097152 & readInt32) != 0;
                        this.support = (8388608 & readInt32) != 0;
                        if ((readInt32 & ConnectionsManager.FileTypePhoto) != 0) {
                            z3 = true;
                        }
                        this.scam = z3;
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 1) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.first_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.last_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.username = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.phone = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            this.bot_inline_placeholder = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.lang_code = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | 4096 : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | 32768 : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | 1048576 : i10 & (-1048577);
                        this.flags = i11;
                        int i12 = this.bot_inline_geo ? i11 | 2097152 : i11 & (-2097153);
                        this.flags = i12;
                        int i13 = this.support ? i12 | 8388608 : i12 & (-8388609);
                        this.flags = i13;
                        int i14 = this.scam ? i13 | ConnectionsManager.FileTypePhoto : i13 & (-16777217);
                        this.flags = i14;
                        abstractSerializedData2.writeInt32(i14);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.first_name);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeString(this.last_name);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeString(this.phone);
                        }
                        if ((this.flags & 32) != 0) {
                            this.photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.status.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeString("");
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeString(this.bot_inline_placeholder);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeString(this.lang_code);
                        }
                    }
                };
                break;
            case 1073147056:
                tLRPC$User = new TLRPC$TL_user();
                break;
            case 1377093789:
                tLRPC$User = new TLRPC$TL_userForeign_old2() {
                    public static int constructor = 1377093789;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        this.photo.serializeToStream(abstractSerializedData2);
                        this.status.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 1879553105:
                tLRPC$User = new TLRPC$TL_userSelf_old3() {
                    public static int constructor = 1879553105;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.username = abstractSerializedData2.readString(z2);
                        this.phone = abstractSerializedData2.readString(z2);
                        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.inactive = abstractSerializedData2.readBool(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                        abstractSerializedData2.writeString(this.username);
                        abstractSerializedData2.writeString(this.phone);
                        this.photo.serializeToStream(abstractSerializedData2);
                        this.status.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeBool(this.inactive);
                    }
                };
                break;
            case 1912944108:
                tLRPC$User = new TLRPC$TL_userSelf_old3() {
                    public static int constructor = 1912944108;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f974id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.phone = abstractSerializedData2.readString(z2);
                        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.inactive = abstractSerializedData2.readBool(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.f974id);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                        abstractSerializedData2.writeString(this.phone);
                        this.photo.serializeToStream(abstractSerializedData2);
                        this.status.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeBool(this.inactive);
                    }
                };
                break;
            default:
                tLRPC$User = null;
                break;
        }
        if (tLRPC$User != null || !z) {
            if (tLRPC$User != null) {
                tLRPC$User.readParams(abstractSerializedData, z);
            }
            return tLRPC$User;
        }
        throw new RuntimeException(String.format("can't parse magic %x in User", Integer.valueOf(i)));
    }
}
