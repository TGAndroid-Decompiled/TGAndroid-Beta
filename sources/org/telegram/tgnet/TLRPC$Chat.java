package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.FileLoaderPriorityQueue;
import org.telegram.messenger.LiteMode;
public abstract class TLRPC$Chat extends TLObject {
    public long access_hash;
    public TLRPC$TL_chatAdminRights admin_rights;
    public TLRPC$TL_channelAdminRights_layer92 admin_rights_layer92;
    public TLRPC$TL_chatBannedRights banned_rights;
    public TLRPC$TL_channelBannedRights_layer92 banned_rights_layer92;
    public boolean broadcast;
    public boolean call_active;
    public boolean call_not_empty;
    public boolean creator;
    public int date;
    public boolean deactivated;
    public TLRPC$TL_chatBannedRights default_banned_rights;
    public boolean explicit_content;
    public boolean fake;
    public int flags;
    public int flags2;
    public boolean forum;
    public boolean gigagroup;
    public boolean has_geo;
    public boolean has_link;
    public long id;
    public boolean join_request;
    public boolean join_to_send;
    public boolean kicked;
    public boolean left;
    public boolean megagroup;
    public TLRPC$InputChannel migrated_to;
    public boolean min;
    public boolean moderator;
    public boolean noforwards;
    public int participants_count;
    public TLRPC$ChatPhoto photo;
    public boolean restricted;
    public boolean scam;
    public boolean signatures;
    public boolean slowmode_enabled;
    public String title;
    public int until_date;
    public String username;
    public boolean verified;
    public int version;
    public ArrayList<TLRPC$TL_restrictionReason> restriction_reason = new ArrayList<>();
    public ArrayList<TLRPC$TL_username> usernames = new ArrayList<>();

    public static TLRPC$Chat TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        return TLdeserialize(abstractSerializedData, i, z, true);
    }

    public static TLRPC$Chat TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z, boolean z2) {
        TLRPC$Chat tLRPC$Chat;
        switch (i) {
            case -2107528095:
                tLRPC$Chat = new TLRPC$TL_channel() {
                    public static int constructor = -2107528095;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.verified = (readInt32 & 128) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.restricted = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.signatures = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
                        this.min = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.scam = (524288 & readInt32) != 0;
                        this.has_link = (1048576 & readInt32) != 0;
                        this.has_geo = (2097152 & readInt32) != 0;
                        this.slowmode_enabled = (4194304 & readInt32) != 0;
                        this.call_active = (8388608 & readInt32) != 0;
                        this.call_not_empty = (16777216 & readInt32) != 0;
                        this.fake = (33554432 & readInt32) != 0;
                        this.gigagroup = (67108864 & readInt32) != 0;
                        this.noforwards = (134217728 & readInt32) != 0;
                        this.join_to_send = (268435456 & readInt32) != 0;
                        this.join_request = (536870912 & readInt32) != 0;
                        this.forum = (readInt32 & 1073741824) != 0;
                        this.id = abstractSerializedData2.readInt64(z3);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z3);
                        }
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 64) != 0) {
                            this.username = abstractSerializedData2.readString(z3);
                        }
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z3);
                            if (readInt322 != 481674261) {
                                if (z3) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z3);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_restrictionReason TLdeserialize = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            this.banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.default_banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.left ? i2 | 4 : i2 & (-5);
                        this.flags = i3;
                        int i4 = this.broadcast ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.verified ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.megagroup ? i5 | LiteMode.FLAG_CHAT_BLUR : i5 & (-257);
                        this.flags = i6;
                        int i7 = this.restricted ? i6 | LiteMode.FLAG_CALLS_ANIMATIONS : i6 & (-513);
                        this.flags = i7;
                        int i8 = this.signatures ? i7 | LiteMode.FLAG_AUTOPLAY_GIFS : i7 & (-2049);
                        this.flags = i8;
                        int i9 = this.min ? i8 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i8 & (-4097);
                        this.flags = i9;
                        int i10 = this.scam ? i9 | 524288 : i9 & (-524289);
                        this.flags = i10;
                        int i11 = this.has_link ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
                        this.flags = i11;
                        int i12 = this.has_geo ? i11 | 2097152 : i11 & (-2097153);
                        this.flags = i12;
                        int i13 = this.slowmode_enabled ? i12 | 4194304 : i12 & (-4194305);
                        this.flags = i13;
                        int i14 = this.call_active ? i13 | 8388608 : i13 & (-8388609);
                        this.flags = i14;
                        int i15 = this.call_not_empty ? i14 | ConnectionsManager.FileTypePhoto : i14 & (-16777217);
                        this.flags = i15;
                        int i16 = this.fake ? i15 | ConnectionsManager.FileTypeVideo : i15 & (-33554433);
                        this.flags = i16;
                        int i17 = this.gigagroup ? i16 | ConnectionsManager.FileTypeFile : i16 & (-67108865);
                        this.flags = i17;
                        int i18 = this.noforwards ? i17 | 134217728 : i17 & (-134217729);
                        this.flags = i18;
                        int i19 = this.join_to_send ? i18 | 268435456 : i18 & (-268435457);
                        this.flags = i19;
                        int i20 = this.join_request ? i19 | 536870912 : i19 & (-536870913);
                        this.flags = i20;
                        int i21 = this.forum ? i20 | 1073741824 : i20 & (-1073741825);
                        this.flags = i21;
                        abstractSerializedData2.writeInt32(i21);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i22 = 0; i22 < size; i22++) {
                                this.restriction_reason.get(i22).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            this.banned_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.default_banned_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                    }
                };
                break;
            case -2094689180:
                tLRPC$Chat = new TLRPC$TL_channel();
                break;
            case -2059962289:
                tLRPC$Chat = new TLRPC$TL_channelForbidden() {
                    public static int constructor = -2059962289;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.access_hash = abstractSerializedData2.readInt64(z3);
                        this.title = abstractSerializedData2.readString(z3);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.broadcast ? this.flags | 32 : this.flags & (-33);
                        this.flags = i2;
                        int i3 = this.megagroup ? i2 | LiteMode.FLAG_CHAT_BLUR : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.title);
                    }
                };
                break;
            case -1683826688:
                tLRPC$Chat = new TLRPC$TL_chatEmpty() {
                    public static int constructor = -1683826688;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.title = "DELETED";
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.id);
                    }
                };
                break;
            case -1588737454:
                tLRPC$Chat = new TLRPC$TL_channel() {
                    public static int constructor = -1588737454;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.kicked = (readInt32 & 2) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.moderator = (readInt32 & 16) != 0;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.verified = (readInt32 & 128) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.restricted = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.signatures = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
                        this.min = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z3);
                        }
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 64) != 0) {
                            this.username = abstractSerializedData2.readString(z3);
                        }
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.readString(z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.kicked ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.left ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.moderator ? i4 | 16 : i4 & (-17);
                        this.flags = i5;
                        int i6 = this.broadcast ? i5 | 32 : i5 & (-33);
                        this.flags = i6;
                        int i7 = this.verified ? i6 | 128 : i6 & (-129);
                        this.flags = i7;
                        int i8 = this.megagroup ? i7 | LiteMode.FLAG_CHAT_BLUR : i7 & (-257);
                        this.flags = i8;
                        int i9 = this.restricted ? i8 | LiteMode.FLAG_CALLS_ANIMATIONS : i8 & (-513);
                        this.flags = i9;
                        int i10 = this.signatures ? i9 | LiteMode.FLAG_AUTOPLAY_GIFS : i9 & (-2049);
                        this.flags = i10;
                        int i11 = this.min ? i10 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i10 & (-4097);
                        this.flags = i11;
                        abstractSerializedData2.writeInt32(i11);
                        abstractSerializedData2.writeInt32((int) this.id);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.writeString("");
                        }
                    }
                };
                break;
            case -930515796:
                tLRPC$Chat = new TLRPC$TL_channel() {
                    public static int constructor = -930515796;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.verified = (readInt32 & 128) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.restricted = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.signatures = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
                        this.min = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z3);
                        }
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 64) != 0) {
                            this.username = abstractSerializedData2.readString(z3);
                        }
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.readString(z3);
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            TLRPC$TL_channelAdminRights_layer92 TLdeserialize = TLRPC$TL_channelAdminRights_layer92.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                            this.admin_rights_layer92 = TLdeserialize;
                            this.admin_rights = TLRPC$Chat.mergeAdminRights(TLdeserialize);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            TLRPC$TL_channelBannedRights_layer92 TLdeserialize2 = TLRPC$TL_channelBannedRights_layer92.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                            this.banned_rights_layer92 = TLdeserialize2;
                            this.banned_rights = TLRPC$Chat.mergeBannedRights(TLdeserialize2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.left ? i2 | 4 : i2 & (-5);
                        this.flags = i3;
                        int i4 = this.broadcast ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.verified ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.megagroup ? i5 | LiteMode.FLAG_CHAT_BLUR : i5 & (-257);
                        this.flags = i6;
                        int i7 = this.restricted ? i6 | LiteMode.FLAG_CALLS_ANIMATIONS : i6 & (-513);
                        this.flags = i7;
                        int i8 = this.signatures ? i7 | LiteMode.FLAG_AUTOPLAY_GIFS : i7 & (-2049);
                        this.flags = i8;
                        int i9 = this.min ? i8 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i8 & (-4097);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32((int) this.id);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.writeString("");
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights_layer92.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            this.banned_rights_layer92.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                    }
                };
                break;
            case -753232354:
                tLRPC$Chat = new TLRPC$TL_channel() {
                    public static int constructor = -753232354;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.verified = (readInt32 & 128) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.restricted = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.signatures = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
                        this.min = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.scam = (524288 & readInt32) != 0;
                        this.has_link = (1048576 & readInt32) != 0;
                        this.has_geo = (2097152 & readInt32) != 0;
                        this.slowmode_enabled = (4194304 & readInt32) != 0;
                        this.call_active = (8388608 & readInt32) != 0;
                        this.call_not_empty = (16777216 & readInt32) != 0;
                        this.fake = (33554432 & readInt32) != 0;
                        this.gigagroup = (readInt32 & ConnectionsManager.FileTypeFile) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z3);
                        }
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 64) != 0) {
                            this.username = abstractSerializedData2.readString(z3);
                        }
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z3);
                            if (readInt322 != 481674261) {
                                if (z3) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z3);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_restrictionReason TLdeserialize = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            this.banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.default_banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.left ? i2 | 4 : i2 & (-5);
                        this.flags = i3;
                        int i4 = this.broadcast ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.verified ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.megagroup ? i5 | LiteMode.FLAG_CHAT_BLUR : i5 & (-257);
                        this.flags = i6;
                        int i7 = this.restricted ? i6 | LiteMode.FLAG_CALLS_ANIMATIONS : i6 & (-513);
                        this.flags = i7;
                        int i8 = this.signatures ? i7 | LiteMode.FLAG_AUTOPLAY_GIFS : i7 & (-2049);
                        this.flags = i8;
                        int i9 = this.min ? i8 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i8 & (-4097);
                        this.flags = i9;
                        int i10 = this.scam ? i9 | 524288 : i9 & (-524289);
                        this.flags = i10;
                        int i11 = this.has_link ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
                        this.flags = i11;
                        int i12 = this.has_geo ? i11 | 2097152 : i11 & (-2097153);
                        this.flags = i12;
                        int i13 = this.slowmode_enabled ? i12 | 4194304 : i12 & (-4194305);
                        this.flags = i13;
                        int i14 = this.call_active ? i13 | 8388608 : i13 & (-8388609);
                        this.flags = i14;
                        int i15 = this.call_not_empty ? i14 | ConnectionsManager.FileTypePhoto : i14 & (-16777217);
                        this.flags = i15;
                        int i16 = this.fake ? i15 | ConnectionsManager.FileTypeVideo : i15 & (-33554433);
                        this.flags = i16;
                        int i17 = this.gigagroup ? i16 | ConnectionsManager.FileTypeFile : i16 & (-67108865);
                        this.flags = i17;
                        abstractSerializedData2.writeInt32(i17);
                        abstractSerializedData2.writeInt32((int) this.id);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i18 = 0; i18 < size; i18++) {
                                this.restriction_reason.get(i18).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            this.banned_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.default_banned_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                    }
                };
                break;
            case -652419756:
                tLRPC$Chat = new TLRPC$TL_chat() {
                    public static int constructor = -652419756;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.kicked = (readInt32 & 2) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.deactivated = (readInt32 & 32) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.title = abstractSerializedData2.readString(z3);
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.participants_count = abstractSerializedData2.readInt32(z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & 64) != 0) {
                            this.migrated_to = TLRPC$InputChannel.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.kicked ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.left ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.deactivated ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeString(this.title);
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.participants_count);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                        if ((this.flags & 64) != 0) {
                            this.migrated_to.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -83047359:
                tLRPC$Chat = new TLRPC$TL_chatForbidden() {
                    public static int constructor = -83047359;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.title = abstractSerializedData2.readString(z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeString(this.title);
                        abstractSerializedData2.writeInt32(this.date);
                    }
                };
                break;
            case 120753115:
                tLRPC$Chat = new TLRPC$TL_chatForbidden() {
                    public static int constructor = 120753115;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.title = abstractSerializedData2.readString(z3);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeString(this.title);
                    }
                };
                break;
            case 213142300:
                tLRPC$Chat = new TLRPC$TL_channel() {
                    public static int constructor = 213142300;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.verified = (readInt32 & 128) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.restricted = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.signatures = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
                        this.min = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z3);
                        }
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 64) != 0) {
                            this.username = abstractSerializedData2.readString(z3);
                        }
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.readString(z3);
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            TLRPC$TL_channelAdminRights_layer92 TLdeserialize = TLRPC$TL_channelAdminRights_layer92.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                            this.admin_rights_layer92 = TLdeserialize;
                            this.admin_rights = TLRPC$Chat.mergeAdminRights(TLdeserialize);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            TLRPC$TL_channelBannedRights_layer92 TLdeserialize2 = TLRPC$TL_channelBannedRights_layer92.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                            this.banned_rights_layer92 = TLdeserialize2;
                            this.banned_rights = TLRPC$Chat.mergeBannedRights(TLdeserialize2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.kicked ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.left ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.broadcast ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        int i6 = this.verified ? i5 | 128 : i5 & (-129);
                        this.flags = i6;
                        int i7 = this.megagroup ? i6 | LiteMode.FLAG_CHAT_BLUR : i6 & (-257);
                        this.flags = i7;
                        int i8 = this.restricted ? i7 | LiteMode.FLAG_CALLS_ANIMATIONS : i7 & (-513);
                        this.flags = i8;
                        int i9 = this.signatures ? i8 | LiteMode.FLAG_AUTOPLAY_GIFS : i8 & (-2049);
                        this.flags = i9;
                        int i10 = this.min ? i9 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i9 & (-4097);
                        this.flags = i10;
                        abstractSerializedData2.writeInt32(i10);
                        abstractSerializedData2.writeInt32((int) this.id);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.writeString("");
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights_layer92.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            this.banned_rights_layer92.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 399807445:
                tLRPC$Chat = new TLRPC$TL_channelForbidden();
                break;
            case 681420594:
                tLRPC$Chat = new TLRPC$TL_channelForbidden() {
                    public static int constructor = 681420594;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.access_hash = abstractSerializedData2.readInt64(z3);
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 65536) != 0) {
                            this.until_date = abstractSerializedData2.readInt32(z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.broadcast ? this.flags | 32 : this.flags & (-33);
                        this.flags = i2;
                        int i3 = this.megagroup ? i2 | LiteMode.FLAG_CHAT_BLUR : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeInt32(this.until_date);
                        }
                    }
                };
                break;
            case 693512293:
                tLRPC$Chat = new TLRPC$TL_chatEmpty();
                break;
            case 763724588:
                tLRPC$Chat = new TLRPC$TL_channelForbidden() {
                    public static int constructor = 763724588;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.access_hash = abstractSerializedData2.readInt64(z3);
                        this.title = abstractSerializedData2.readString(z3);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.title);
                    }
                };
                break;
            case 1004149726:
                tLRPC$Chat = new TLRPC$TL_chat() {
                    public static int constructor = 1004149726;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.kicked = (readInt32 & 2) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.deactivated = (readInt32 & 32) != 0;
                        this.call_active = (8388608 & readInt32) != 0;
                        this.call_not_empty = (readInt32 & ConnectionsManager.FileTypePhoto) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.title = abstractSerializedData2.readString(z3);
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.participants_count = abstractSerializedData2.readInt32(z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & 64) != 0) {
                            this.migrated_to = TLRPC$InputChannel.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.default_banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.kicked ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.left ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.deactivated ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        int i6 = this.call_active ? i5 | 8388608 : i5 & (-8388609);
                        this.flags = i6;
                        int i7 = this.call_not_empty ? i6 | ConnectionsManager.FileTypePhoto : i6 & (-16777217);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeString(this.title);
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.participants_count);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                        if ((this.flags & 64) != 0) {
                            this.migrated_to.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.default_banned_rights.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1103884886:
                tLRPC$Chat = new TLRPC$TL_chat();
                break;
            case 1158377749:
                tLRPC$Chat = new TLRPC$TL_channel() {
                    public static int constructor = 1158377749;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.verified = (readInt32 & 128) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.restricted = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.signatures = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
                        this.min = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z3);
                        }
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 64) != 0) {
                            this.username = abstractSerializedData2.readString(z3);
                        }
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.readString(z3);
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            TLRPC$TL_channelAdminRights_layer92 TLdeserialize = TLRPC$TL_channelAdminRights_layer92.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                            this.admin_rights_layer92 = TLdeserialize;
                            this.admin_rights = TLRPC$Chat.mergeAdminRights(TLdeserialize);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            TLRPC$TL_channelBannedRights_layer92 TLdeserialize2 = TLRPC$TL_channelBannedRights_layer92.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                            this.banned_rights_layer92 = TLdeserialize2;
                            this.banned_rights = TLRPC$Chat.mergeBannedRights(TLdeserialize2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.left ? i2 | 4 : i2 & (-5);
                        this.flags = i3;
                        int i4 = this.broadcast ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.verified ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.megagroup ? i5 | LiteMode.FLAG_CHAT_BLUR : i5 & (-257);
                        this.flags = i6;
                        int i7 = this.restricted ? i6 | LiteMode.FLAG_CALLS_ANIMATIONS : i6 & (-513);
                        this.flags = i7;
                        int i8 = this.signatures ? i7 | LiteMode.FLAG_AUTOPLAY_GIFS : i7 & (-2049);
                        this.flags = i8;
                        int i9 = this.min ? i8 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i8 & (-4097);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32((int) this.id);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.writeString("");
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights_layer92.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            this.banned_rights_layer92.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                    }
                };
                break;
            case 1260090630:
                tLRPC$Chat = new TLRPC$TL_channel() {
                    public static int constructor = 1260090630;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.kicked = (readInt32 & 2) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.moderator = (readInt32 & 16) != 0;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.verified = (readInt32 & 128) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.restricted = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.signatures = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.access_hash = abstractSerializedData2.readInt64(z3);
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 64) != 0) {
                            this.username = abstractSerializedData2.readString(z3);
                        }
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.readString(z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.kicked ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.left ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.moderator ? i4 | 16 : i4 & (-17);
                        this.flags = i5;
                        int i6 = this.broadcast ? i5 | 32 : i5 & (-33);
                        this.flags = i6;
                        int i7 = this.verified ? i6 | 128 : i6 & (-129);
                        this.flags = i7;
                        int i8 = this.megagroup ? i7 | LiteMode.FLAG_CHAT_BLUR : i7 & (-257);
                        this.flags = i8;
                        int i9 = this.restricted ? i8 | LiteMode.FLAG_CALLS_ANIMATIONS : i8 & (-513);
                        this.flags = i9;
                        int i10 = this.signatures ? i9 | LiteMode.FLAG_AUTOPLAY_GIFS : i9 & (-2049);
                        this.flags = i10;
                        abstractSerializedData2.writeInt32(i10);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.writeString("");
                        }
                    }
                };
                break;
            case 1307772980:
                tLRPC$Chat = new TLRPC$TL_channel() {
                    public static int constructor = 1307772980;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.verified = (readInt32 & 128) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.restricted = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.signatures = (readInt32 & LiteMode.FLAG_AUTOPLAY_GIFS) != 0;
                        this.min = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
                        this.scam = (524288 & readInt32) != 0;
                        this.has_link = (1048576 & readInt32) != 0;
                        this.has_geo = (2097152 & readInt32) != 0;
                        this.slowmode_enabled = (readInt32 & 4194304) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            this.access_hash = abstractSerializedData2.readInt64(z3);
                        }
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 64) != 0) {
                            this.username = abstractSerializedData2.readString(z3);
                        }
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.readString(z3);
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            this.banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.default_banned_rights = TLRPC$TL_chatBannedRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z3);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.left ? i2 | 4 : i2 & (-5);
                        this.flags = i3;
                        int i4 = this.broadcast ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.verified ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.megagroup ? i5 | LiteMode.FLAG_CHAT_BLUR : i5 & (-257);
                        this.flags = i6;
                        int i7 = this.restricted ? i6 | LiteMode.FLAG_CALLS_ANIMATIONS : i6 & (-513);
                        this.flags = i7;
                        int i8 = this.signatures ? i7 | LiteMode.FLAG_AUTOPLAY_GIFS : i7 & (-2049);
                        this.flags = i8;
                        int i9 = this.min ? i8 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i8 & (-4097);
                        this.flags = i9;
                        int i10 = this.scam ? i9 | 524288 : i9 & (-524289);
                        this.flags = i10;
                        int i11 = this.has_link ? i10 | FileLoaderPriorityQueue.PRIORITY_VALUE_MAX : i10 & (-1048577);
                        this.flags = i11;
                        int i12 = this.has_geo ? i11 | 2097152 : i11 & (-2097153);
                        this.flags = i12;
                        int i13 = this.slowmode_enabled ? i12 | 4194304 : i12 & (-4194305);
                        this.flags = i13;
                        abstractSerializedData2.writeInt32(i13);
                        abstractSerializedData2.writeInt32((int) this.id);
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
                            abstractSerializedData2.writeInt64(this.access_hash);
                        }
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
                            abstractSerializedData2.writeString("");
                        }
                        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0) {
                            this.admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
                            this.banned_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.default_banned_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                    }
                };
                break;
            case 1704108455:
                tLRPC$Chat = new TLRPC$TL_chatForbidden();
                break;
            case 1737397639:
                tLRPC$Chat = new TLRPC$TL_channel() {
                    public static int constructor = 1737397639;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.kicked = (readInt32 & 2) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.moderator = (readInt32 & 16) != 0;
                        this.broadcast = (readInt32 & 32) != 0;
                        this.verified = (readInt32 & 128) != 0;
                        this.megagroup = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
                        this.explicit_content = (readInt32 & LiteMode.FLAG_CALLS_ANIMATIONS) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.access_hash = abstractSerializedData2.readInt64(z3);
                        this.title = abstractSerializedData2.readString(z3);
                        if ((this.flags & 64) != 0) {
                            this.username = abstractSerializedData2.readString(z3);
                        }
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.kicked ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.left ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.moderator ? i4 | 16 : i4 & (-17);
                        this.flags = i5;
                        int i6 = this.broadcast ? i5 | 32 : i5 & (-33);
                        this.flags = i6;
                        int i7 = this.verified ? i6 | 128 : i6 & (-129);
                        this.flags = i7;
                        int i8 = this.megagroup ? i7 | LiteMode.FLAG_CHAT_BLUR : i7 & (-257);
                        this.flags = i8;
                        int i9 = this.explicit_content ? i8 | LiteMode.FLAG_CALLS_ANIMATIONS : i8 & (-513);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeInt64(this.access_hash);
                        abstractSerializedData2.writeString(this.title);
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeString(this.username);
                        }
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                    }
                };
                break;
            case 1855757255:
                tLRPC$Chat = new TLRPC$TL_chat() {
                    public static int constructor = 1855757255;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.title = abstractSerializedData2.readString(z3);
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.participants_count = abstractSerializedData2.readInt32(z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.left = abstractSerializedData2.readBool(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeString(this.title);
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.participants_count);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeBool(this.left);
                        abstractSerializedData2.writeInt32(this.version);
                    }
                };
                break;
            case 1930607688:
                tLRPC$Chat = new TLRPC$TL_chat() {
                    public static int constructor = 1930607688;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z3) {
                        int readInt32 = abstractSerializedData2.readInt32(z3);
                        this.flags = readInt32;
                        this.creator = (readInt32 & 1) != 0;
                        this.kicked = (readInt32 & 2) != 0;
                        this.left = (readInt32 & 4) != 0;
                        this.deactivated = (readInt32 & 32) != 0;
                        this.id = abstractSerializedData2.readInt32(z3);
                        this.title = abstractSerializedData2.readString(z3);
                        this.photo = TLRPC$ChatPhoto.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z3), z3);
                        this.participants_count = abstractSerializedData2.readInt32(z3);
                        this.date = abstractSerializedData2.readInt32(z3);
                        this.version = abstractSerializedData2.readInt32(z3);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.creator ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.kicked ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.left ? i3 | 4 : i3 & (-5);
                        this.flags = i4;
                        int i5 = this.deactivated ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32((int) this.id);
                        abstractSerializedData2.writeString(this.title);
                        this.photo.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.participants_count);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeInt32(this.version);
                    }
                };
                break;
            default:
                tLRPC$Chat = null;
                break;
        }
        if (tLRPC$Chat == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Chat", Integer.valueOf(i)));
        }
        if (tLRPC$Chat != null) {
            tLRPC$Chat.readParams(abstractSerializedData, z, z2);
        }
        return tLRPC$Chat;
    }

    private void readParams(AbstractSerializedData abstractSerializedData, boolean z, boolean z2) {
        readParams(abstractSerializedData, z);
    }

    public static TLRPC$TL_chatBannedRights mergeBannedRights(TLRPC$TL_channelBannedRights_layer92 tLRPC$TL_channelBannedRights_layer92) {
        if (tLRPC$TL_channelBannedRights_layer92 == null) {
            return null;
        }
        TLRPC$TL_chatBannedRights tLRPC$TL_chatBannedRights = new TLRPC$TL_chatBannedRights();
        tLRPC$TL_chatBannedRights.view_messages = tLRPC$TL_channelBannedRights_layer92.view_messages;
        tLRPC$TL_chatBannedRights.send_messages = tLRPC$TL_channelBannedRights_layer92.send_messages;
        boolean z = tLRPC$TL_channelBannedRights_layer92.send_media;
        tLRPC$TL_chatBannedRights.send_media = z;
        tLRPC$TL_chatBannedRights.send_stickers = tLRPC$TL_channelBannedRights_layer92.send_stickers;
        tLRPC$TL_chatBannedRights.send_gifs = tLRPC$TL_channelBannedRights_layer92.send_gifs;
        tLRPC$TL_chatBannedRights.send_games = tLRPC$TL_channelBannedRights_layer92.send_games;
        tLRPC$TL_chatBannedRights.send_inline = tLRPC$TL_channelBannedRights_layer92.send_inline;
        tLRPC$TL_chatBannedRights.embed_links = tLRPC$TL_channelBannedRights_layer92.embed_links;
        tLRPC$TL_chatBannedRights.send_polls = z;
        tLRPC$TL_chatBannedRights.change_info = true;
        tLRPC$TL_chatBannedRights.invite_users = true;
        tLRPC$TL_chatBannedRights.pin_messages = true;
        tLRPC$TL_chatBannedRights.until_date = tLRPC$TL_channelBannedRights_layer92.until_date;
        return tLRPC$TL_chatBannedRights;
    }

    public static TLRPC$TL_chatAdminRights mergeAdminRights(TLRPC$TL_channelAdminRights_layer92 tLRPC$TL_channelAdminRights_layer92) {
        if (tLRPC$TL_channelAdminRights_layer92 == null) {
            return null;
        }
        TLRPC$TL_chatAdminRights tLRPC$TL_chatAdminRights = new TLRPC$TL_chatAdminRights();
        tLRPC$TL_chatAdminRights.change_info = tLRPC$TL_channelAdminRights_layer92.change_info;
        tLRPC$TL_chatAdminRights.post_messages = tLRPC$TL_channelAdminRights_layer92.post_messages;
        tLRPC$TL_chatAdminRights.edit_messages = tLRPC$TL_channelAdminRights_layer92.edit_messages;
        tLRPC$TL_chatAdminRights.delete_messages = tLRPC$TL_channelAdminRights_layer92.delete_messages;
        tLRPC$TL_chatAdminRights.ban_users = tLRPC$TL_channelAdminRights_layer92.ban_users;
        tLRPC$TL_chatAdminRights.invite_users = tLRPC$TL_channelAdminRights_layer92.invite_users;
        tLRPC$TL_chatAdminRights.pin_messages = tLRPC$TL_channelAdminRights_layer92.pin_messages;
        tLRPC$TL_chatAdminRights.add_admins = tLRPC$TL_channelAdminRights_layer92.add_admins;
        return tLRPC$TL_chatAdminRights;
    }
}
