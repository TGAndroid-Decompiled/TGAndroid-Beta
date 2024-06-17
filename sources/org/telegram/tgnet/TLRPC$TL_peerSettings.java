package org.telegram.tgnet;

import org.telegram.messenger.LiteMode;

public class TLRPC$TL_peerSettings extends TLRPC$PeerSettings {
    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.report_spam = (readInt32 & 1) != 0;
        this.add_contact = (readInt32 & 2) != 0;
        this.block_contact = (readInt32 & 4) != 0;
        this.share_contact = (readInt32 & 8) != 0;
        this.need_contacts_exception = (readInt32 & 16) != 0;
        this.report_geo = (readInt32 & 32) != 0;
        this.autoarchived = (readInt32 & 128) != 0;
        this.invite_members = (readInt32 & LiteMode.FLAG_CHAT_BLUR) != 0;
        this.request_chat_broadcast = (readInt32 & 1024) != 0;
        this.business_bot_paused = (readInt32 & 2048) != 0;
        this.business_bot_can_reply = (readInt32 & LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM) != 0;
        if ((readInt32 & 64) != 0) {
            this.geo_distance = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            this.request_chat_title = abstractSerializedData.readString(z);
        }
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            this.request_chat_date = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
            this.business_bot_id = abstractSerializedData.readInt64(z);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
            this.business_bot_manage_url = abstractSerializedData.readString(z);
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(-1395233698);
        int i = this.report_spam ? this.flags | 1 : this.flags & (-2);
        this.flags = i;
        int i2 = this.add_contact ? i | 2 : i & (-3);
        this.flags = i2;
        int i3 = this.block_contact ? i2 | 4 : i2 & (-5);
        this.flags = i3;
        int i4 = this.share_contact ? i3 | 8 : i3 & (-9);
        this.flags = i4;
        int i5 = this.need_contacts_exception ? i4 | 16 : i4 & (-17);
        this.flags = i5;
        int i6 = this.report_geo ? i5 | 32 : i5 & (-33);
        this.flags = i6;
        int i7 = this.autoarchived ? i6 | 128 : i6 & (-129);
        this.flags = i7;
        int i8 = this.invite_members ? i7 | LiteMode.FLAG_CHAT_BLUR : i7 & (-257);
        this.flags = i8;
        int i9 = this.request_chat_broadcast ? i8 | 1024 : i8 & (-1025);
        this.flags = i9;
        int i10 = this.business_bot_paused ? i9 | 2048 : i9 & (-2049);
        this.flags = i10;
        int i11 = this.business_bot_can_reply ? i10 | LiteMode.FLAG_ANIMATED_EMOJI_CHAT_NOT_PREMIUM : i10 & (-4097);
        this.flags = i11;
        abstractSerializedData.writeInt32(i11);
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeInt32(this.geo_distance);
        }
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            abstractSerializedData.writeString(this.request_chat_title);
        }
        if ((this.flags & LiteMode.FLAG_CALLS_ANIMATIONS) != 0) {
            abstractSerializedData.writeInt32(this.request_chat_date);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
            abstractSerializedData.writeInt64(this.business_bot_id);
        }
        if ((this.flags & LiteMode.FLAG_ANIMATED_EMOJI_REACTIONS_NOT_PREMIUM) != 0) {
            abstractSerializedData.writeString(this.business_bot_manage_url);
        }
    }
}
