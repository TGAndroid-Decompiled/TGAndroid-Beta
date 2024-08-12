package org.telegram.tgnet;

import org.telegram.tgnet.tl.TL_bots$BotInfo;
import org.telegram.tgnet.tl.TL_stories$PeerStories;
public class TLRPC$TL_channelFull extends TLRPC$ChatFull {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.can_view_participants = (readInt32 & 8) != 0;
        this.can_set_username = (readInt32 & 64) != 0;
        this.can_set_stickers = (readInt32 & 128) != 0;
        this.hidden_prehistory = (readInt32 & 1024) != 0;
        this.can_set_location = (readInt32 & 65536) != 0;
        this.has_scheduled = (524288 & readInt32) != 0;
        this.can_view_stats = (1048576 & readInt32) != 0;
        this.blocked = (readInt32 & 4194304) != 0;
        int readInt322 = abstractSerializedData.readInt32(z);
        this.flags2 = readInt322;
        this.can_delete_channel = (readInt322 & 1) != 0;
        this.antispam = (readInt322 & 2) != 0;
        this.participants_hidden = (readInt322 & 4) != 0;
        this.translations_disabled = (readInt322 & 8) != 0;
        this.stories_pinned_available = (readInt322 & 32) != 0;
        this.view_forum_as_messages = (readInt322 & 64) != 0;
        this.restricted_sponsored = (readInt322 & 2048) != 0;
        this.can_view_revenue = (readInt322 & 4096) != 0;
        this.can_view_stars_revenue = (readInt322 & 32768) != 0;
        this.paid_media_allowed = (readInt322 & 16384) != 0;
        this.paid_reactions_available = (readInt322 & 65536) != 0;
        this.id = abstractSerializedData.readInt64(z);
        this.about = abstractSerializedData.readString(z);
        if ((this.flags & 1) != 0) {
            this.participants_count = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2) != 0) {
            this.admins_count = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.kicked_count = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4) != 0) {
            this.banned_count = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8192) != 0) {
            this.online_count = abstractSerializedData.readInt32(z);
        }
        this.read_inbox_max_id = abstractSerializedData.readInt32(z);
        this.read_outbox_max_id = abstractSerializedData.readInt32(z);
        this.unread_count = abstractSerializedData.readInt32(z);
        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 8388608) != 0) {
            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        int readInt323 = abstractSerializedData.readInt32(z);
        if (readInt323 != 481674261) {
            if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
            }
            return;
        }
        int readInt324 = abstractSerializedData.readInt32(z);
        for (int i = 0; i < readInt324; i++) {
            TL_bots$BotInfo TLdeserialize = TL_bots$BotInfo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (TLdeserialize == null) {
                return;
            }
            this.bot_info.add(TLdeserialize);
        }
        if ((this.flags & 16) != 0) {
            this.migrated_from_chat_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 16) != 0) {
            this.migrated_from_max_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 32) != 0) {
            this.pinned_msg_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 256) != 0) {
            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 512) != 0) {
            this.available_min_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2048) != 0) {
            this.folder_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 16384) != 0) {
            this.linked_chat_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 32768) != 0) {
            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 131072) != 0) {
            this.slowmode_seconds = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 262144) != 0) {
            this.slowmode_next_send_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4096) != 0) {
            this.stats_dc = abstractSerializedData.readInt32(z);
        }
        this.pts = abstractSerializedData.readInt32(z);
        if ((this.flags & 2097152) != 0) {
            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 16777216) != 0) {
            this.ttl_period = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 33554432) != 0) {
            int readInt325 = abstractSerializedData.readInt32(z);
            if (readInt325 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                }
                return;
            }
            int readInt326 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt326; i2++) {
                this.pending_suggestions.add(abstractSerializedData.readString(z));
            }
        }
        if ((this.flags & 67108864) != 0) {
            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 134217728) != 0) {
            this.theme_emoticon = abstractSerializedData.readString(z);
        }
        if ((this.flags & 268435456) != 0) {
            this.requests_pending = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 268435456) != 0) {
            int readInt327 = abstractSerializedData.readInt32(z);
            if (readInt327 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt327)));
                }
                return;
            }
            int readInt328 = abstractSerializedData.readInt32(z);
            for (int i3 = 0; i3 < readInt328; i3++) {
                this.recent_requesters.add(Long.valueOf(abstractSerializedData.readInt64(z)));
            }
        }
        if ((this.flags & 536870912) != 0) {
            this.default_send_as = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 1073741824) != 0) {
            this.available_reactions = TLRPC$ChatReactions.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags2 & 8192) != 0) {
            this.reactions_limit = abstractSerializedData.readInt32(z);
        }
        if ((this.flags2 & 16) != 0) {
            this.stories = TL_stories$PeerStories.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags2 & 128) != 0) {
            this.wallpaper = TLRPC$WallPaper.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags2 & 256) != 0) {
            this.boosts_applied = abstractSerializedData.readInt32(z);
        }
        if ((this.flags2 & 512) != 0) {
            this.boosts_unrestrict = abstractSerializedData.readInt32(z);
        }
        if ((this.flags2 & 1024) != 0) {
            this.emojiset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1146407795);
        int i = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
        this.flags = i;
        int i2 = this.can_set_username ? i | 64 : i & (-65);
        this.flags = i2;
        int i3 = this.can_set_stickers ? i2 | 128 : i2 & (-129);
        this.flags = i3;
        int i4 = this.hidden_prehistory ? i3 | 1024 : i3 & (-1025);
        this.flags = i4;
        int i5 = this.can_set_location ? i4 | 65536 : i4 & (-65537);
        this.flags = i5;
        int i6 = this.has_scheduled ? i5 | 524288 : i5 & (-524289);
        this.flags = i6;
        int i7 = this.can_view_stats ? i6 | 1048576 : i6 & (-1048577);
        this.flags = i7;
        int i8 = this.blocked ? i7 | 4194304 : i7 & (-4194305);
        this.flags = i8;
        abstractSerializedData.writeInt32(i8);
        int i9 = this.can_delete_channel ? this.flags2 | 1 : this.flags2 & (-2);
        this.flags2 = i9;
        int i10 = this.antispam ? i9 | 2 : i9 & (-3);
        this.flags2 = i10;
        int i11 = this.participants_hidden ? i10 | 4 : i10 & (-5);
        this.flags2 = i11;
        int i12 = this.translations_disabled ? i11 | 8 : i11 & (-9);
        this.flags2 = i12;
        int i13 = this.stories_pinned_available ? i12 | 32 : i12 & (-33);
        this.flags2 = i13;
        int i14 = this.view_forum_as_messages ? i13 | 64 : i13 & (-65);
        this.flags2 = i14;
        int i15 = this.restricted_sponsored ? i14 | 2048 : i14 & (-2049);
        this.flags2 = i15;
        int i16 = this.can_view_revenue ? i15 | 4096 : i15 & (-4097);
        this.flags2 = i16;
        int i17 = this.paid_media_allowed ? i16 | 16384 : i16 & (-16385);
        this.flags2 = i17;
        int i18 = this.can_view_stars_revenue ? i17 | 32768 : i17 & (-32769);
        this.flags2 = i18;
        int i19 = this.paid_reactions_available ? i18 | 65536 : i18 & (-65537);
        this.flags2 = i19;
        abstractSerializedData.writeInt32(i19);
        abstractSerializedData.writeInt64(this.id);
        abstractSerializedData.writeString(this.about);
        if ((this.flags & 1) != 0) {
            abstractSerializedData.writeInt32(this.participants_count);
        }
        if ((this.flags & 2) != 0) {
            abstractSerializedData.writeInt32(this.admins_count);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.kicked_count);
        }
        if ((this.flags & 4) != 0) {
            abstractSerializedData.writeInt32(this.banned_count);
        }
        if ((this.flags & 8192) != 0) {
            abstractSerializedData.writeInt32(this.online_count);
        }
        abstractSerializedData.writeInt32(this.read_inbox_max_id);
        abstractSerializedData.writeInt32(this.read_outbox_max_id);
        abstractSerializedData.writeInt32(this.unread_count);
        this.chat_photo.serializeToStream(abstractSerializedData);
        this.notify_settings.serializeToStream(abstractSerializedData);
        if ((this.flags & 8388608) != 0) {
            this.exported_invite.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(481674261);
        int size = this.bot_info.size();
        abstractSerializedData.writeInt32(size);
        for (int i20 = 0; i20 < size; i20++) {
            this.bot_info.get(i20).serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt64(this.migrated_from_chat_id);
        }
        if ((this.flags & 16) != 0) {
            abstractSerializedData.writeInt32(this.migrated_from_max_id);
        }
        if ((this.flags & 32) != 0) {
            abstractSerializedData.writeInt32(this.pinned_msg_id);
        }
        if ((this.flags & 256) != 0) {
            this.stickerset.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 512) != 0) {
            abstractSerializedData.writeInt32(this.available_min_id);
        }
        if ((this.flags & 2048) != 0) {
            abstractSerializedData.writeInt32(this.folder_id);
        }
        if ((this.flags & 16384) != 0) {
            abstractSerializedData.writeInt64(this.linked_chat_id);
        }
        if ((this.flags & 32768) != 0) {
            this.location.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 131072) != 0) {
            abstractSerializedData.writeInt32(this.slowmode_seconds);
        }
        if ((this.flags & 262144) != 0) {
            abstractSerializedData.writeInt32(this.slowmode_next_send_date);
        }
        if ((this.flags & 4096) != 0) {
            abstractSerializedData.writeInt32(this.stats_dc);
        }
        abstractSerializedData.writeInt32(this.pts);
        if ((this.flags & 2097152) != 0) {
            this.call.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 16777216) != 0) {
            abstractSerializedData.writeInt32(this.ttl_period);
        }
        if ((this.flags & 33554432) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.pending_suggestions.size();
            abstractSerializedData.writeInt32(size2);
            for (int i21 = 0; i21 < size2; i21++) {
                abstractSerializedData.writeString(this.pending_suggestions.get(i21));
            }
        }
        if ((this.flags & 67108864) != 0) {
            this.groupcall_default_join_as.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 134217728) != 0) {
            abstractSerializedData.writeString(this.theme_emoticon);
        }
        if ((this.flags & 268435456) != 0) {
            abstractSerializedData.writeInt32(this.requests_pending);
        }
        if ((this.flags & 268435456) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size3 = this.recent_requesters.size();
            abstractSerializedData.writeInt32(size3);
            for (int i22 = 0; i22 < size3; i22++) {
                abstractSerializedData.writeInt64(this.recent_requesters.get(i22).longValue());
            }
        }
        if ((this.flags & 536870912) != 0) {
            this.default_send_as.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 1073741824) != 0) {
            this.available_reactions.serializeToStream(abstractSerializedData);
        }
        if ((this.flags2 & 8192) != 0) {
            abstractSerializedData.writeInt32(this.reactions_limit);
        }
        if ((this.flags2 & 16) != 0) {
            this.stories.serializeToStream(abstractSerializedData);
        }
        if ((this.flags2 & 128) != 0) {
            this.wallpaper.serializeToStream(abstractSerializedData);
        }
        if ((this.flags2 & 256) != 0) {
            abstractSerializedData.writeInt32(this.boosts_applied);
        }
        if ((this.flags2 & 512) != 0) {
            abstractSerializedData.writeInt32(this.boosts_unrestrict);
        }
        if ((this.flags2 & 1024) != 0) {
            this.emojiset.serializeToStream(abstractSerializedData);
        }
    }
}
