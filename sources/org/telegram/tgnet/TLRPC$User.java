package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.BuildConfig;
import org.telegram.messenger.FileLoaderPriorityQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LiteMode;
public abstract class TLRPC$User extends TLObject {
    public long access_hash;
    public boolean apply_min_photo;
    public boolean attach_menu_enabled;
    public boolean bot;
    public boolean bot_attach_menu;
    public boolean bot_can_edit;
    public boolean bot_chat_history;
    public int bot_info_version;
    public boolean bot_inline_geo;
    public String bot_inline_placeholder;
    public boolean bot_menu_webview;
    public boolean bot_nochats;
    public boolean close_friend;
    public TLRPC$TL_peerColor color;
    public boolean contact;
    public boolean contact_require_premium;
    public boolean deleted;
    public TLRPC$EmojiStatus emoji_status;
    public boolean explicit_content;
    public boolean fake;
    public String first_name;
    public int flags;
    public int flags2;
    public long id;
    public boolean inactive;
    public String lang_code;
    public String last_name;
    public boolean min;
    public boolean mutual_contact;
    public String phone;
    public TLRPC$UserProfilePhoto photo;
    public boolean premium;
    public TLRPC$TL_peerColor profile_color;
    public boolean restricted;
    public boolean scam;
    public boolean self;
    public TLRPC$UserStatus status;
    public boolean stories_hidden;
    public int stories_max_id;
    public boolean stories_unavailable;
    public boolean support;
    public String username;
    public boolean verified;
    public ArrayList<TLRPC$TL_restrictionReason> restriction_reason = new ArrayList<>();
    public ArrayList<TLRPC$TL_username> usernames = new ArrayList<>();

    public static TLRPC$User TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$User tLRPC$User;
        switch (i) {
            case -1885878744:
                tLRPC$User = new TLRPC$User() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.deleted = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.bot = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        this.bot_inline_geo = (2097152 & readInt32) != 0;
                        this.support = (8388608 & readInt32) != 0;
                        this.scam = (16777216 & readInt32) != 0;
                        this.apply_min_photo = (33554432 & readInt32) != 0;
                        this.fake = (67108864 & readInt32) != 0;
                        this.bot_attach_menu = (134217728 & readInt32) != 0;
                        this.premium = (268435456 & readInt32) != 0;
                        this.attach_menu_enabled = (readInt32 & 536870912) != 0;
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        this.flags2 = readInt322;
                        this.bot_can_edit = (readInt322 & 2) != 0;
                        this.close_friend = (readInt322 & 4) != 0;
                        this.stories_hidden = (readInt322 & 32) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            if (readInt323 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                                }
                                return;
                            }
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt324; i2++) {
                                TLRPC$TL_restrictionReason TLdeserialize = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 524288) != 0) {
                            this.bot_inline_placeholder = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.lang_code = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            this.emoji_status = TLRPC$EmojiStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            if (readInt325 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                                }
                                return;
                            }
                            int readInt326 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt326; i3++) {
                                TLRPC$TL_username TLdeserialize2 = TLRPC$TL_username.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.usernames.add(TLdeserialize2);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        if (this.username == null) {
                            this.flags &= -9;
                        }
                        abstractSerializedData2.writeInt32(-1885878744);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | LiteMode.FLAG_CHAT_SCALE : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | 65536 : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
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
                        int i17 = this.bot_attach_menu ? i16 | 134217728 : i16 & (-134217729);
                        this.flags = i17;
                        int i18 = this.premium ? i17 | 268435456 : i17 & (-268435457);
                        this.flags = i18;
                        int i19 = this.attach_menu_enabled ? i18 | 536870912 : i18 & (-536870913);
                        this.flags = i19;
                        int i20 = this.bot_can_edit ? this.flags2 | 2 : this.flags2 & (-3);
                        this.flags2 = i20;
                        int i21 = this.close_friend ? i20 | 4 : i20 & (-5);
                        this.flags2 = i21;
                        this.flags2 = this.stories_hidden ? i21 | 32 : i21 & (-33);
                        abstractSerializedData2.writeInt32(i19);
                        abstractSerializedData2.writeInt32(this.flags2);
                        abstractSerializedData2.writeInt64(this.id);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i22 = 0; i22 < size; i22++) {
                                this.restriction_reason.get(i22).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeString(this.bot_inline_placeholder);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeString(this.lang_code);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            this.emoji_status.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.usernames.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i23 = 0; i23 < size2; i23++) {
                                this.usernames.get(i23).serializeToStream(abstractSerializedData2);
                            }
                        }
                    }
                };
                break;
            case -1820043071:
                tLRPC$User = new TLRPC$TL_user() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.deleted = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.bot = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
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
                        this.id = abstractSerializedData2.readInt32(z2);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_restrictionReason TLdeserialize = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize);
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
                        abstractSerializedData2.writeInt32(-1820043071);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | LiteMode.FLAG_CHAT_SCALE : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | 65536 : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
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
                        abstractSerializedData2.writeInt32((int) this.id);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
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
            case -1414139616:
                tLRPC$User = new TLRPC$User() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.deleted = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.bot = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        this.bot_inline_geo = (2097152 & readInt32) != 0;
                        this.support = (8388608 & readInt32) != 0;
                        this.scam = (16777216 & readInt32) != 0;
                        this.apply_min_photo = (33554432 & readInt32) != 0;
                        this.fake = (67108864 & readInt32) != 0;
                        this.bot_attach_menu = (134217728 & readInt32) != 0;
                        this.premium = (268435456 & readInt32) != 0;
                        this.attach_menu_enabled = (readInt32 & 536870912) != 0;
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        this.flags2 = readInt322;
                        this.bot_can_edit = (readInt322 & 2) != 0;
                        this.close_friend = (readInt322 & 4) != 0;
                        this.stories_hidden = (readInt322 & 8) != 0;
                        this.stories_unavailable = (readInt322 & 16) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            if (readInt323 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                                }
                                return;
                            }
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt324; i2++) {
                                TLRPC$TL_restrictionReason TLdeserialize = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 524288) != 0) {
                            this.bot_inline_placeholder = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.lang_code = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            this.emoji_status = TLRPC$EmojiStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            if (readInt325 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                                }
                                return;
                            }
                            int readInt326 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt326; i3++) {
                                TLRPC$TL_username TLdeserialize2 = TLRPC$TL_username.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.usernames.add(TLdeserialize2);
                            }
                        }
                        try {
                            if ((this.flags2 & 32) != 0) {
                                this.stories_max_id = abstractSerializedData2.readInt32(z2);
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        if (this.username == null) {
                            this.flags &= -9;
                        }
                        abstractSerializedData2.writeInt32(-1414139616);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | LiteMode.FLAG_CHAT_SCALE : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | 65536 : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
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
                        int i17 = this.bot_attach_menu ? i16 | 134217728 : i16 & (-134217729);
                        this.flags = i17;
                        int i18 = this.premium ? i17 | 268435456 : i17 & (-268435457);
                        this.flags = i18;
                        int i19 = this.attach_menu_enabled ? i18 | 536870912 : i18 & (-536870913);
                        this.flags = i19;
                        abstractSerializedData2.writeInt32(i19);
                        int i20 = this.bot_can_edit ? this.flags2 | 2 : this.flags2 & (-3);
                        this.flags2 = i20;
                        int i21 = this.close_friend ? i20 | 4 : i20 & (-5);
                        this.flags2 = i21;
                        int i22 = this.stories_hidden ? i21 | 8 : i21 & (-9);
                        this.flags2 = i22;
                        int i23 = this.stories_unavailable ? i22 | 16 : i22 & (-17);
                        this.flags2 = i23;
                        abstractSerializedData2.writeInt32(i23);
                        abstractSerializedData2.writeInt64(this.id);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i24 = 0; i24 < size; i24++) {
                                this.restriction_reason.get(i24).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeString(this.bot_inline_placeholder);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeString(this.lang_code);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            this.emoji_status.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.usernames.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i25 = 0; i25 < size2; i25++) {
                                this.usernames.get(i25).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags2 & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.stories_max_id);
                        }
                    }
                };
                break;
            case -1298475060:
                tLRPC$User = new TLRPC$TL_userDeleted_old2() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1298475060);
                        abstractSerializedData2.writeInt32((int) this.id);
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
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.deleted = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.bot = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        this.bot_inline_geo = (readInt32 & 2097152) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
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
                        abstractSerializedData2.writeInt32(-787638374);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | LiteMode.FLAG_CHAT_SCALE : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | 65536 : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
                        this.flags = i11;
                        int i12 = this.bot_inline_geo ? i11 | 2097152 : i11 & (-2097153);
                        this.flags = i12;
                        abstractSerializedData2.writeInt32(i12);
                        abstractSerializedData2.writeInt32((int) this.id);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeString(BuildConfig.APP_CENTER_HASH);
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
            case -346018011:
                tLRPC$User = new TLRPC$TL_user() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.deleted = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.bot = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        this.bot_inline_geo = (2097152 & readInt32) != 0;
                        this.support = (8388608 & readInt32) != 0;
                        this.scam = (16777216 & readInt32) != 0;
                        this.apply_min_photo = (33554432 & readInt32) != 0;
                        this.fake = (67108864 & readInt32) != 0;
                        this.bot_attach_menu = (134217728 & readInt32) != 0;
                        this.premium = (268435456 & readInt32) != 0;
                        this.attach_menu_enabled = (readInt32 & 536870912) != 0;
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        this.flags2 = readInt322;
                        this.bot_can_edit = (readInt322 & 2) != 0;
                        this.close_friend = (readInt322 & 4) != 0;
                        this.stories_hidden = (readInt322 & 8) != 0;
                        this.stories_unavailable = (readInt322 & 16) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            if (readInt323 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                                }
                                return;
                            }
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt324; i2++) {
                                TLRPC$TL_restrictionReason TLdeserialize = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 524288) != 0) {
                            this.bot_inline_placeholder = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.lang_code = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            this.emoji_status = TLRPC$EmojiStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            if (readInt325 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                                }
                                return;
                            }
                            int readInt326 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt326; i3++) {
                                TLRPC$TL_username TLdeserialize2 = TLRPC$TL_username.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.usernames.add(TLdeserialize2);
                            }
                        }
                        try {
                            if ((this.flags2 & 32) != 0) {
                                this.stories_max_id = abstractSerializedData2.readInt32(z2);
                            }
                        } catch (Throwable th) {
                            FileLog.e(th);
                        }
                        if ((this.flags2 & 128) != 0) {
                            TLRPC$TL_peerColor tLRPC$TL_peerColor = new TLRPC$TL_peerColor();
                            this.color = tLRPC$TL_peerColor;
                            tLRPC$TL_peerColor.color = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags2 & 64) != 0) {
                            if (this.color == null) {
                                this.color = new TLRPC$TL_peerColor();
                            }
                            this.color.background_emoji_id = abstractSerializedData2.readInt64(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        if (this.username == null) {
                            this.flags &= -9;
                        }
                        abstractSerializedData2.writeInt32(-346018011);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | LiteMode.FLAG_CHAT_SCALE : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | 65536 : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
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
                        int i17 = this.bot_attach_menu ? i16 | 134217728 : i16 & (-134217729);
                        this.flags = i17;
                        int i18 = this.premium ? i17 | 268435456 : i17 & (-268435457);
                        this.flags = i18;
                        int i19 = this.attach_menu_enabled ? i18 | 536870912 : i18 & (-536870913);
                        this.flags = i19;
                        abstractSerializedData2.writeInt32(i19);
                        int i20 = this.bot_can_edit ? this.flags2 | 2 : this.flags2 & (-3);
                        this.flags2 = i20;
                        int i21 = this.close_friend ? i20 | 4 : i20 & (-5);
                        this.flags2 = i21;
                        int i22 = this.stories_hidden ? i21 | 8 : i21 & (-9);
                        this.flags2 = i22;
                        int i23 = this.stories_unavailable ? i22 | 16 : i22 & (-17);
                        this.flags2 = i23;
                        abstractSerializedData2.writeInt32(i23);
                        abstractSerializedData2.writeInt64(this.id);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i24 = 0; i24 < size; i24++) {
                                this.restriction_reason.get(i24).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeString(this.bot_inline_placeholder);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeString(this.lang_code);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            this.emoji_status.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.usernames.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i25 = 0; i25 < size2; i25++) {
                                this.usernames.get(i25).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags2 & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.stories_max_id);
                        }
                        if ((this.flags2 & 128) != 0) {
                            abstractSerializedData2.writeInt32(this.color.color);
                        }
                        if ((this.flags2 & 64) != 0) {
                            abstractSerializedData2.writeInt64(this.color.background_emoji_id);
                        }
                    }
                };
                break;
            case -218397927:
                tLRPC$User = new TLRPC$TL_userContact_old2() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.phone = abstractSerializedData2.readString(z2);
                        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-218397927);
                        abstractSerializedData2.writeInt32((int) this.id);
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
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(537022650);
                        abstractSerializedData2.writeInt32((int) this.id);
                    }
                };
                break;
            case 559694904:
                tLRPC$User = new TLRPC$TL_user();
                break;
            case 585404530:
                tLRPC$User = new TLRPC$TL_user() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.deleted = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.bot = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.explicit_content = (readInt32 & 262144) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(585404530);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | LiteMode.FLAG_CHAT_SCALE : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | 65536 : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.explicit_content ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        abstractSerializedData2.writeInt32(i10);
                        abstractSerializedData2.writeInt32((int) this.id);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                    }
                };
                break;
            case 585682608:
                tLRPC$User = new TLRPC$TL_userRequest_old2() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.phone = abstractSerializedData2.readString(z2);
                        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(585682608);
                        abstractSerializedData2.writeInt32((int) this.id);
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
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.deleted = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.bot = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        this.bot_inline_geo = (2097152 & readInt32) != 0;
                        this.support = (8388608 & readInt32) != 0;
                        this.scam = (readInt32 & ConnectionsManager.FileTypePhoto) != 0;
                        this.id = abstractSerializedData2.readInt32(z2);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
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
                        abstractSerializedData2.writeInt32(773059779);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | LiteMode.FLAG_CHAT_SCALE : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | 65536 : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
                        this.flags = i11;
                        int i12 = this.bot_inline_geo ? i11 | 2097152 : i11 & (-2097153);
                        this.flags = i12;
                        int i13 = this.support ? i12 | 8388608 : i12 & (-8388609);
                        this.flags = i13;
                        int i14 = this.scam ? i13 | ConnectionsManager.FileTypePhoto : i13 & (-16777217);
                        this.flags = i14;
                        abstractSerializedData2.writeInt32(i14);
                        abstractSerializedData2.writeInt32((int) this.id);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeString(BuildConfig.APP_CENTER_HASH);
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
                tLRPC$User = new TLRPC$User() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.deleted = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.bot = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        this.bot_inline_geo = (2097152 & readInt32) != 0;
                        this.support = (8388608 & readInt32) != 0;
                        this.scam = (16777216 & readInt32) != 0;
                        this.apply_min_photo = (33554432 & readInt32) != 0;
                        this.fake = (67108864 & readInt32) != 0;
                        this.bot_attach_menu = (134217728 & readInt32) != 0;
                        this.premium = (readInt32 & 268435456) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_restrictionReason TLdeserialize = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize);
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
                        abstractSerializedData2.writeInt32(1073147056);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | LiteMode.FLAG_CHAT_SCALE : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | 65536 : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
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
                        int i17 = this.bot_attach_menu ? i16 | 134217728 : i16 & (-134217729);
                        this.flags = i17;
                        int i18 = this.premium ? i17 | 268435456 : i17 & (-268435457);
                        this.flags = i18;
                        abstractSerializedData2.writeInt32(i18);
                        abstractSerializedData2.writeInt64(this.id);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i19 = 0; i19 < size; i19++) {
                                this.restriction_reason.get(i19).serializeToStream(abstractSerializedData2);
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
            case 1377093789:
                tLRPC$User = new TLRPC$TL_userForeign_old2() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.access_hash = abstractSerializedData2.readInt64(z2);
                        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1377093789);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeString(this.first_name);
                        abstractSerializedData2.writeString(this.last_name);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        this.photo.serializeToStream(abstractSerializedData2);
                        this.status.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 1570352622:
                tLRPC$User = new TLRPC$User() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.self = (readInt32 & 1024) != 0;
                        this.contact = (readInt32 & 2048) != 0;
                        this.mutual_contact = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.deleted = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
                        this.bot = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
                        this.bot_chat_history = (32768 & readInt32) != 0;
                        this.bot_nochats = (65536 & readInt32) != 0;
                        this.verified = (131072 & readInt32) != 0;
                        this.restricted = (readInt32 & 262144) != 0;
                        this.min = (1048576 & readInt32) != 0;
                        this.bot_inline_geo = (2097152 & readInt32) != 0;
                        this.support = (8388608 & readInt32) != 0;
                        this.scam = (16777216 & readInt32) != 0;
                        this.apply_min_photo = (33554432 & readInt32) != 0;
                        this.fake = (67108864 & readInt32) != 0;
                        this.bot_attach_menu = (134217728 & readInt32) != 0;
                        this.premium = (268435456 & readInt32) != 0;
                        this.attach_menu_enabled = (readInt32 & 536870912) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.bot_info_version = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_restrictionReason TLdeserialize = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 524288) != 0) {
                            this.bot_inline_placeholder = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.lang_code = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            this.emoji_status = TLRPC$EmojiStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1570352622);
                        int i2 = this.self ? this.flags | 1024 : this.flags & (-1025);
                        this.flags = i2;
                        int i3 = this.contact ? i2 | 2048 : i2 & (-2049);
                        this.flags = i3;
                        int i4 = this.mutual_contact ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i3 & (-4097);
                        this.flags = i4;
                        int i5 = this.deleted ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.bot ? i5 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.bot_chat_history ? i6 | LiteMode.FLAG_CHAT_SCALE : i6 & (-32769);
                        this.flags = i7;
                        int i8 = this.bot_nochats ? i7 | 65536 : i7 & (-65537);
                        this.flags = i8;
                        int i9 = this.verified ? i8 | 131072 : i8 & (-131073);
                        this.flags = i9;
                        int i10 = this.restricted ? i9 | 262144 : i9 & (-262145);
                        this.flags = i10;
                        int i11 = this.min ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
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
                        int i17 = this.bot_attach_menu ? i16 | 134217728 : i16 & (-134217729);
                        this.flags = i17;
                        int i18 = this.premium ? i17 | 268435456 : i17 & (-268435457);
                        this.flags = i18;
                        int i19 = this.attach_menu_enabled ? i18 | 536870912 : i18 & (-536870913);
                        this.flags = i19;
                        abstractSerializedData2.writeInt32(i19);
                        abstractSerializedData2.writeInt64(this.id);
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
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt32(this.bot_info_version);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i20 = 0; i20 < size; i20++) {
                                this.restriction_reason.get(i20).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeString(this.bot_inline_placeholder);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeString(this.lang_code);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            this.emoji_status.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1879553105:
                tLRPC$User = new TLRPC$TL_userSelf_old3() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
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
                        abstractSerializedData2.writeInt32(1879553105);
                        abstractSerializedData2.writeInt32((int) this.id);
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
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.id = abstractSerializedData2.readInt32(z2);
                        this.first_name = abstractSerializedData2.readString(z2);
                        this.last_name = abstractSerializedData2.readString(z2);
                        this.phone = abstractSerializedData2.readString(z2);
                        this.photo = TLRPC$UserProfilePhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.status = TLRPC$UserStatus.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.inactive = abstractSerializedData2.readBool(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1912944108);
                        abstractSerializedData2.writeInt32((int) this.id);
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
        if (tLRPC$User == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in User", Integer.valueOf(i)));
        }
        if (tLRPC$User != null) {
            tLRPC$User.readParams(abstractSerializedData, z);
        }
        return tLRPC$User;
    }
}
