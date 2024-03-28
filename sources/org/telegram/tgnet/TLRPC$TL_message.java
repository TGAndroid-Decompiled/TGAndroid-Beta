package org.telegram.tgnet;

import android.text.TextUtils;
import org.telegram.messenger.FileLoaderPriorityQueue;
import org.telegram.messenger.LiteMode;
public class TLRPC$TL_message extends TLRPC$Message {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.out = (readInt32 & 2) != 0;
        this.mentioned = (readInt32 & 16) != 0;
        this.media_unread = (readInt32 & 32) != 0;
        this.silent = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0;
        this.post = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM) != 0;
        this.from_scheduled = (262144 & readInt32) != 0;
        this.legacy = (524288 & readInt32) != 0;
        this.edit_hide = (2097152 & readInt32) != 0;
        this.pinned = (16777216 & readInt32) != 0;
        this.noforwards = (67108864 & readInt32) != 0;
        this.invert_media = (readInt32 & 134217728) != 0;
        int readInt322 = abstractSerializedData.readInt32(z);
        this.flags2 = readInt322;
        this.offline = (readInt322 & 2) != 0;
        this.id = abstractSerializedData.readInt32(z);
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 536870912) != 0) {
            this.from_boosts_applied = abstractSerializedData.readInt32(z);
        }
        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 268435456) != 0) {
            this.saved_peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4) != 0) {
            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 2048) != 0) {
            this.via_bot_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags2 & 1) != 0) {
            this.via_business_bot_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & 8) != 0) {
            this.reply_to = TLRPC$MessageReplyHeader.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.date = abstractSerializedData.readInt32(z);
        this.message = abstractSerializedData.readString(z);
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            this.media = TLdeserialize;
            if (TLdeserialize != null) {
                this.ttl = TLdeserialize.ttl_seconds;
            }
            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                this.message = this.media.captionLegacy;
            }
        }
        if ((this.flags & 64) != 0) {
            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 128) != 0) {
            int readInt323 = abstractSerializedData.readInt32(z);
            if (readInt323 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                }
                return;
            }
            int readInt324 = abstractSerializedData.readInt32(z);
            for (int i = 0; i < readInt324; i++) {
                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize2 == null) {
                    return;
                }
                this.entities.add(TLdeserialize2);
            }
        }
        if ((this.flags & 1024) != 0) {
            this.views = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1024) != 0) {
            this.forwards = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 8388608) != 0) {
            this.replies = TLRPC$MessageReplies.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
            this.edit_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 65536) != 0) {
            this.post_author = abstractSerializedData.readString(z);
        }
        if ((this.flags & 131072) != 0) {
            this.grouped_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & FileLoaderPriorityQueue.PRIORITY_VALUE_MAX) != 0) {
            this.reactions = TLRPC$MessageReactions.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 4194304) != 0) {
            int readInt325 = abstractSerializedData.readInt32(z);
            if (readInt325 != 481674261) {
                if (z) {
                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                }
                return;
            }
            int readInt326 = abstractSerializedData.readInt32(z);
            for (int i2 = 0; i2 < readInt326; i2++) {
                TLRPC$TL_restrictionReason TLdeserialize3 = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                if (TLdeserialize3 == null) {
                    return;
                }
                this.restriction_reason.add(TLdeserialize3);
            }
        }
        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
            this.ttl_period = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 1073741824) != 0) {
            this.quick_reply_shortcut_id = abstractSerializedData.readInt32(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(592953125);
        int i = this.out ? this.flags | 2 : this.flags & (-3);
        this.flags = i;
        int i2 = this.mentioned ? i | 16 : i & (-17);
        this.flags = i2;
        int i3 = this.media_unread ? i2 | 32 : i2 & (-33);
        this.flags = i3;
        int i4 = this.silent ? i3 | LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM : i3 & (-8193);
        this.flags = i4;
        int i5 = this.post ? i4 | LiteMode.FLAG_ANIMATED_EMOJI_KEYBOARD_NOT_PREMIUM : i4 & (-16385);
        this.flags = i5;
        int i6 = this.from_scheduled ? i5 | 262144 : i5 & (-262145);
        this.flags = i6;
        int i7 = this.legacy ? i6 | 524288 : i6 & (-524289);
        this.flags = i7;
        int i8 = this.edit_hide ? i7 | 2097152 : i7 & (-2097153);
        this.flags = i8;
        int i9 = this.pinned ? i8 | ConnectionsManager.FileTypePhoto : i8 & (-16777217);
        this.flags = i9;
        int i10 = this.noforwards ? i9 | ConnectionsManager.FileTypeFile : i9 & (-67108865);
        this.flags = i10;
        int i11 = this.invert_media ? i10 | 134217728 : i10 & (-134217729);
        this.flags = i11;
        abstractSerializedData.writeInt32(i11);
        int i12 = this.offline ? this.flags2 | 2 : this.flags2 & (-3);
        this.flags2 = i12;
        abstractSerializedData.writeInt32(i12);
        abstractSerializedData.writeInt32(this.id);
        if ((this.flags & LiteMode.FLAG_CHAT_BLUR) != 0) {
            this.from_id.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 536870912) != 0) {
            abstractSerializedData.writeInt32(this.from_boosts_applied);
        }
        this.peer_id.serializeToStream(abstractSerializedData);
        if ((this.flags & 268435456) != 0) {
            this.saved_peer_id.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4) != 0) {
            this.fwd_from.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 2048) != 0) {
            abstractSerializedData.writeInt64(this.via_bot_id);
        }
        if ((this.flags2 & 1) != 0) {
            abstractSerializedData.writeInt64(this.via_business_bot_id);
        }
        if ((this.flags & 8) != 0) {
            this.reply_to.serializeToStream(abstractSerializedData);
        }
        abstractSerializedData.writeInt32(this.date);
        abstractSerializedData.writeString(this.message);
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            this.media.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 64) != 0) {
            this.reply_markup.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 128) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.entities.size();
            abstractSerializedData.writeInt32(size);
            for (int i13 = 0; i13 < size; i13++) {
                this.entities.get(i13).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 1024) != 0) {
            abstractSerializedData.writeInt32(this.views);
        }
        if ((this.flags & 1024) != 0) {
            abstractSerializedData.writeInt32(this.forwards);
        }
        if ((this.flags & 8388608) != 0) {
            this.replies.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & LiteMode.FLAG_CHAT_SCALE) != 0) {
            abstractSerializedData.writeInt32(this.edit_date);
        }
        if ((this.flags & 65536) != 0) {
            abstractSerializedData.writeString(this.post_author);
        }
        if ((this.flags & 131072) != 0) {
            abstractSerializedData.writeInt64(this.grouped_id);
        }
        if ((this.flags & FileLoaderPriorityQueue.PRIORITY_VALUE_MAX) != 0) {
            this.reactions.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 4194304) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.restriction_reason.size();
            abstractSerializedData.writeInt32(size2);
            for (int i14 = 0; i14 < size2; i14++) {
                this.restriction_reason.get(i14).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
            abstractSerializedData.writeInt32(this.ttl_period);
        }
        if ((this.flags & 1073741824) != 0) {
            abstractSerializedData.writeInt32(this.quick_reply_shortcut_id);
        }
        writeAttachPath(abstractSerializedData);
    }
}
