package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_bots$BotInfo;
import org.telegram.tgnet.tl.TL_stories$PeerStories;

public abstract class TLRPC$UserFull extends TLObject {
    public String about;
    public TLRPC$TL_birthday birthday;
    public boolean blocked;
    public boolean blocked_my_stories_from;
    public TLRPC$TL_chatAdminRights bot_broadcast_admin_rights;
    public TLRPC$TL_chatAdminRights bot_group_admin_rights;
    public TL_bots$BotInfo bot_info;
    public TLRPC$TL_businessAwayMessage business_away_message;
    public TLRPC$TL_businessGreetingMessage business_greeting_message;
    public TLRPC$TL_businessIntro business_intro;
    public TLRPC$TL_businessLocation business_location;
    public TLRPC$TL_businessWorkHours business_work_hours;
    public boolean can_pin_message;
    public int common_chats_count;
    public boolean contact_require_premium;
    public TLRPC$Photo fallback_photo;
    public int flags;
    public int flags2;
    public int folder_id;
    public boolean has_scheduled;
    public long id;
    public TLRPC$TL_contacts_link_layer101 link;
    public TLRPC$PeerNotifySettings notify_settings;
    public long personal_channel_id;
    public int personal_channel_message;
    public TLRPC$Photo personal_photo;
    public boolean phone_calls_available;
    public boolean phone_calls_private;
    public int pinned_msg_id;
    public ArrayList premium_gifts = new ArrayList();
    public String private_forward_name;
    public TLRPC$Photo profile_photo;
    public boolean read_dates_private;
    public TLRPC$PeerSettings settings;
    public boolean sponsored_enabled;
    public TL_stories$PeerStories stories;
    public boolean stories_pinned_available;
    public String theme_emoticon;
    public boolean translations_disabled;
    public int ttl_period;
    public TLRPC$User user;
    public boolean video_calls_available;
    public boolean voice_messages_forbidden;
    public TLRPC$WallPaper wallpaper;
    public boolean wallpaper_overridden;

    public static TLRPC$UserFull TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$UserFull tLRPC$UserFull;
        switch (i) {
            case -1938625919:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1938625919);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1901811583:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.user = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.link = TLRPC$TL_contacts_link_layer101.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1901811583);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        this.user.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.link.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                    }
                };
                break;
            case -1813324973:
                tLRPC$UserFull = new TLRPC$UserFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.voice_messages_forbidden = (1048576 & readInt32) != 0;
                        this.translations_disabled = (readInt32 & 8388608) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_premiumGiftOption TLdeserialize = TLRPC$TL_premiumGiftOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.premium_gifts.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1813324973);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        int i8 = this.voice_messages_forbidden ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.translations_disabled ? i8 | 8388608 : i8 & (-8388609);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.premium_gifts.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i10 = 0; i10 < size; i10++) {
                                ((TLRPC$TL_premiumGiftOption) this.premium_gifts.get(i10)).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1179571092:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.voice_messages_forbidden = (1048576 & readInt32) != 0;
                        this.translations_disabled = (8388608 & readInt32) != 0;
                        this.stories_pinned_available = (67108864 & readInt32) != 0;
                        this.blocked_my_stories_from = (134217728 & readInt32) != 0;
                        this.wallpaper_overridden = (268435456 & readInt32) != 0;
                        this.contact_require_premium = (536870912 & readInt32) != 0;
                        this.read_dates_private = (readInt32 & 1073741824) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_premiumGiftOption TLdeserialize = TLRPC$TL_premiumGiftOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.premium_gifts.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories = TL_stories$PeerStories.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-1179571092);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        int i8 = this.voice_messages_forbidden ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.translations_disabled ? i8 | 8388608 : i8 & (-8388609);
                        this.flags = i9;
                        int i10 = this.stories_pinned_available ? i9 | 67108864 : i9 & (-67108865);
                        this.flags = i10;
                        int i11 = this.blocked_my_stories_from ? i10 | 134217728 : i10 & (-134217729);
                        this.flags = i11;
                        int i12 = this.wallpaper_overridden ? i11 | 268435456 : i11 & (-268435457);
                        this.flags = i12;
                        int i13 = this.contact_require_premium ? i12 | 536870912 : i12 & (-536870913);
                        this.flags = i13;
                        int i14 = this.read_dates_private ? i13 | 1073741824 : i13 & (-1073741825);
                        this.flags = i14;
                        abstractSerializedData2.writeInt32(i14);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.premium_gifts.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i15 = 0; i15 < size; i15++) {
                                ((TLRPC$TL_premiumGiftOption) this.premium_gifts.get(i15)).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -994968513:
                tLRPC$UserFull = new TLRPC$UserFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.voice_messages_forbidden = (readInt32 & 1048576) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_premiumGiftOption TLdeserialize = TLRPC$TL_premiumGiftOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.premium_gifts.add(TLdeserialize);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-994968513);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        int i8 = this.voice_messages_forbidden ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        abstractSerializedData2.writeInt32(i8);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.premium_gifts.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i9 = 0; i9 < size; i9++) {
                                ((TLRPC$TL_premiumGiftOption) this.premium_gifts.get(i9)).serializeToStream(abstractSerializedData2);
                            }
                        }
                    }
                };
                break;
            case -862357728:
                tLRPC$UserFull = new TLRPC$TL_userFull();
                break;
            case -818518751:
                tLRPC$UserFull = new TLRPC$UserFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-818518751);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                    }
                };
                break;
            case -694681851:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.user = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-694681851);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        this.user.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                    }
                };
                break;
            case -328384029:
                tLRPC$UserFull = new TLRPC$UserFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.voice_messages_forbidden = (readInt32 & 1048576) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_premiumGiftOption TLdeserialize = TLRPC$TL_premiumGiftOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.premium_gifts.add(TLdeserialize);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-328384029);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        int i8 = this.voice_messages_forbidden ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        abstractSerializedData2.writeInt32(i8);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.premium_gifts.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i9 = 0; i9 < size; i9++) {
                                ((TLRPC$TL_premiumGiftOption) this.premium_gifts.get(i9)).serializeToStream(abstractSerializedData2);
                            }
                        }
                    }
                };
                break;
            case -321200917:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.voice_messages_forbidden = (1048576 & readInt32) != 0;
                        this.translations_disabled = (8388608 & readInt32) != 0;
                        this.stories_pinned_available = (67108864 & readInt32) != 0;
                        this.blocked_my_stories_from = (134217728 & readInt32) != 0;
                        this.wallpaper_overridden = (268435456 & readInt32) != 0;
                        this.contact_require_premium = (536870912 & readInt32) != 0;
                        this.read_dates_private = (readInt32 & 1073741824) != 0;
                        this.flags2 = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_premiumGiftOption TLdeserialize = TLRPC$TL_premiumGiftOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.premium_gifts.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories = TL_stories$PeerStories.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            this.business_work_hours = TLRPC$TL_businessWorkHours.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 2) != 0) {
                            this.business_location = TLRPC$TL_businessLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 4) != 0) {
                            this.business_greeting_message = TLRPC$TL_businessGreetingMessage.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 8) != 0) {
                            this.business_away_message = TLRPC$TL_businessAwayMessage.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 16) != 0) {
                            this.business_intro = TLRPC$TL_businessIntro.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 32) != 0) {
                            this.birthday = TLRPC$TL_birthday.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-321200917);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        int i8 = this.voice_messages_forbidden ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.translations_disabled ? i8 | 8388608 : i8 & (-8388609);
                        this.flags = i9;
                        int i10 = this.stories_pinned_available ? i9 | 67108864 : i9 & (-67108865);
                        this.flags = i10;
                        int i11 = this.blocked_my_stories_from ? i10 | 134217728 : i10 & (-134217729);
                        this.flags = i11;
                        int i12 = this.wallpaper_overridden ? i11 | 268435456 : i11 & (-268435457);
                        this.flags = i12;
                        int i13 = this.contact_require_premium ? i12 | 536870912 : i12 & (-536870913);
                        this.flags = i13;
                        int i14 = this.read_dates_private ? i13 | 1073741824 : i13 & (-1073741825);
                        this.flags = i14;
                        abstractSerializedData2.writeInt32(i14);
                        abstractSerializedData2.writeInt32(this.flags2);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.premium_gifts.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i15 = 0; i15 < size; i15++) {
                                ((TLRPC$TL_premiumGiftOption) this.premium_gifts.get(i15)).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            this.business_work_hours.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 2) != 0) {
                            this.business_location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 4) != 0) {
                            this.business_greeting_message.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 8) != 0) {
                            this.business_away_message.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 16) != 0) {
                            this.business_intro.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 32) != 0) {
                            this.birthday.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -302941166:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.user = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-302941166);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        abstractSerializedData2.writeInt32(i6);
                        this.user.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                    }
                };
                break;
            case -120378643:
                tLRPC$UserFull = new TLRPC$UserFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.voice_messages_forbidden = (1048576 & readInt32) != 0;
                        this.translations_disabled = (readInt32 & 8388608) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_premiumGiftOption TLdeserialize = TLRPC$TL_premiumGiftOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.premium_gifts.add(TLdeserialize);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(-120378643);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        int i8 = this.voice_messages_forbidden ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.translations_disabled ? i8 | 8388608 : i8 & (-8388609);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.premium_gifts.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i10 = 0; i10 < size; i10++) {
                                ((TLRPC$TL_premiumGiftOption) this.premium_gifts.get(i10)).serializeToStream(abstractSerializedData2);
                            }
                        }
                    }
                };
                break;
            case 328899191:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.user = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(328899191);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        this.user.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                    }
                };
                break;
            case 587153029:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.voice_messages_forbidden = (1048576 & readInt32) != 0;
                        this.translations_disabled = (8388608 & readInt32) != 0;
                        this.stories_pinned_available = (67108864 & readInt32) != 0;
                        this.blocked_my_stories_from = (134217728 & readInt32) != 0;
                        this.wallpaper_overridden = (268435456 & readInt32) != 0;
                        this.contact_require_premium = (536870912 & readInt32) != 0;
                        this.read_dates_private = (readInt32 & 1073741824) != 0;
                        this.flags2 = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_premiumGiftOption TLdeserialize = TLRPC$TL_premiumGiftOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.premium_gifts.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories = TL_stories$PeerStories.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            this.business_work_hours = TLRPC$TL_businessWorkHours.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 2) != 0) {
                            this.business_location = TLRPC$TL_businessLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 4) != 0) {
                            this.business_greeting_message = TLRPC$TL_businessGreetingMessage.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 8) != 0) {
                            this.business_away_message = TLRPC$TL_businessAwayMessage.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(587153029);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        int i8 = this.voice_messages_forbidden ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.translations_disabled ? i8 | 8388608 : i8 & (-8388609);
                        this.flags = i9;
                        int i10 = this.stories_pinned_available ? i9 | 67108864 : i9 & (-67108865);
                        this.flags = i10;
                        int i11 = this.blocked_my_stories_from ? i10 | 134217728 : i10 & (-134217729);
                        this.flags = i11;
                        int i12 = this.wallpaper_overridden ? i11 | 268435456 : i11 & (-268435457);
                        this.flags = i12;
                        int i13 = this.contact_require_premium ? i12 | 536870912 : i12 & (-536870913);
                        this.flags = i13;
                        int i14 = this.read_dates_private ? i13 | 1073741824 : i13 & (-1073741825);
                        this.flags = i14;
                        abstractSerializedData2.writeInt32(i14);
                        abstractSerializedData2.writeInt32(this.flags2);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.premium_gifts.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i15 = 0; i15 < size; i15++) {
                                ((TLRPC$TL_premiumGiftOption) this.premium_gifts.get(i15)).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            this.business_work_hours.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 2) != 0) {
                            this.business_location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 4) != 0) {
                            this.business_greeting_message.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 8) != 0) {
                            this.business_away_message.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1340198022:
                tLRPC$UserFull = new TLRPC$UserFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.voice_messages_forbidden = (1048576 & readInt32) != 0;
                        this.translations_disabled = (8388608 & readInt32) != 0;
                        this.stories_pinned_available = (67108864 & readInt32) != 0;
                        this.blocked_my_stories_from = (readInt32 & 134217728) != 0;
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_premiumGiftOption TLdeserialize = TLRPC$TL_premiumGiftOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.premium_gifts.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories = TL_stories$PeerStories.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1340198022);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        int i8 = this.voice_messages_forbidden ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.translations_disabled ? i8 | 8388608 : i8 & (-8388609);
                        this.flags = i9;
                        int i10 = this.stories_pinned_available ? i9 | 67108864 : i9 & (-67108865);
                        this.flags = i10;
                        int i11 = this.blocked_my_stories_from ? i10 | 134217728 : i10 & (-134217729);
                        this.flags = i11;
                        abstractSerializedData2.writeInt32(i11);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.premium_gifts.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i12 = 0; i12 < size; i12++) {
                                ((TLRPC$TL_premiumGiftOption) this.premium_gifts.get(i12)).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1728822428:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.has_scheduled = (readInt32 & 4096) != 0;
                        this.video_calls_available = (readInt32 & 8192) != 0;
                        this.voice_messages_forbidden = (1048576 & readInt32) != 0;
                        this.translations_disabled = (8388608 & readInt32) != 0;
                        this.stories_pinned_available = (67108864 & readInt32) != 0;
                        this.blocked_my_stories_from = (134217728 & readInt32) != 0;
                        this.wallpaper_overridden = (268435456 & readInt32) != 0;
                        this.contact_require_premium = (536870912 & readInt32) != 0;
                        this.read_dates_private = (readInt32 & 1073741824) != 0;
                        this.flags2 = abstractSerializedData2.readInt32(z2);
                        this.id = abstractSerializedData2.readInt64(z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.settings = TLRPC$PeerSettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 65536) != 0) {
                            this.private_forward_name = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights = TLRPC$TL_chatAdminRights.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 524288) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$TL_premiumGiftOption TLdeserialize = TLRPC$TL_premiumGiftOption.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.premium_gifts.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories = TL_stories$PeerStories.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            this.business_work_hours = TLRPC$TL_businessWorkHours.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 2) != 0) {
                            this.business_location = TLRPC$TL_businessLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 4) != 0) {
                            this.business_greeting_message = TLRPC$TL_businessGreetingMessage.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 8) != 0) {
                            this.business_away_message = TLRPC$TL_businessAwayMessage.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags2 & 16) != 0) {
                            this.business_intro = TLRPC$TL_businessIntro.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1728822428);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        int i6 = this.has_scheduled ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.video_calls_available ? i6 | 8192 : i6 & (-8193);
                        this.flags = i7;
                        int i8 = this.voice_messages_forbidden ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.translations_disabled ? i8 | 8388608 : i8 & (-8388609);
                        this.flags = i9;
                        int i10 = this.stories_pinned_available ? i9 | 67108864 : i9 & (-67108865);
                        this.flags = i10;
                        int i11 = this.blocked_my_stories_from ? i10 | 134217728 : i10 & (-134217729);
                        this.flags = i11;
                        int i12 = this.wallpaper_overridden ? i11 | 268435456 : i11 & (-268435457);
                        this.flags = i12;
                        int i13 = this.contact_require_premium ? i12 | 536870912 : i12 & (-536870913);
                        this.flags = i13;
                        int i14 = this.read_dates_private ? i13 | 1073741824 : i13 & (-1073741825);
                        this.flags = i14;
                        abstractSerializedData2.writeInt32(i14);
                        abstractSerializedData2.writeInt32(this.flags2);
                        abstractSerializedData2.writeInt64(this.id);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2097152) != 0) {
                            this.personal_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            this.fallback_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 65536) != 0) {
                            abstractSerializedData2.writeString(this.private_forward_name);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.bot_group_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.bot_broadcast_admin_rights.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 524288) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.premium_gifts.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i15 = 0; i15 < size; i15++) {
                                ((TLRPC$TL_premiumGiftOption) this.premium_gifts.get(i15)).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 16777216) != 0) {
                            this.wallpaper.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 33554432) != 0) {
                            this.stories.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 1) != 0) {
                            this.business_work_hours.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 2) != 0) {
                            this.business_location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 4) != 0) {
                            this.business_greeting_message.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 8) != 0) {
                            this.business_away_message.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags2 & 16) != 0) {
                            this.business_intro.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1951750604:
                tLRPC$UserFull = new TLRPC$TL_userFull() {
                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.blocked = (readInt32 & 1) != 0;
                        this.phone_calls_available = (readInt32 & 16) != 0;
                        this.phone_calls_private = (readInt32 & 32) != 0;
                        this.can_pin_message = (readInt32 & 128) != 0;
                        this.user = TLRPC$User.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 2) != 0) {
                            this.about = abstractSerializedData2.readString(z2);
                        }
                        this.link = TLRPC$TL_contacts_link_layer101.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info = TL_bots$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.common_chats_count = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(1951750604);
                        int i2 = this.blocked ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.phone_calls_available ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.phone_calls_private ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.can_pin_message ? i4 | 128 : i4 & (-129);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        this.user.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeString(this.about);
                        }
                        this.link.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.profile_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.bot_info.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.common_chats_count);
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                    }
                };
                break;
            default:
                tLRPC$UserFull = null;
                break;
        }
        if (tLRPC$UserFull == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in UserFull", Integer.valueOf(i)));
        }
        if (tLRPC$UserFull != null) {
            tLRPC$UserFull.readParams(abstractSerializedData, z);
        }
        return tLRPC$UserFull;
    }
}
