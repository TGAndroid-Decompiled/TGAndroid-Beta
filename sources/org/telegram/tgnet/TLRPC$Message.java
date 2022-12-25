package org.telegram.tgnet;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.CharacterCompat;

public class TLRPC$Message extends TLObject {
    public TLRPC$MessageAction action;
    public int date;
    public int destroyTime;
    public long dialog_id;
    public int edit_date;
    public boolean edit_hide;
    public int flags;
    public int forwards;
    public TLRPC$Peer from_id;
    public boolean from_scheduled;
    public TLRPC$MessageFwdHeader fwd_from;
    public long grouped_id;
    public int f881id;
    public boolean isThreadMessage;
    public int layer;
    public boolean legacy;
    public TLRPC$MessageMedia media;
    public boolean media_unread;
    public boolean mentioned;
    public String message;
    public boolean noforwards;
    public boolean out;
    public HashMap<String, String> params;
    public TLRPC$Peer peer_id;
    public boolean pinned;
    public boolean post;
    public String post_author;
    public boolean premiumEffectWasPlayed;
    public long random_id;
    public TLRPC$TL_messageReactions reactions;
    public int realId;
    public TLRPC$MessageReplies replies;
    public TLRPC$Message replyMessage;
    public TLRPC$ReplyMarkup reply_markup;
    public TLRPC$TL_messageReplyHeader reply_to;
    public int reqId;
    public int seq_in;
    public int seq_out;
    public boolean silent;
    public boolean topic_start;
    public int ttl;
    public int ttl_period;
    public boolean unread;
    public long via_bot_id;
    public String via_bot_name;
    public int views;
    public String voiceTranscription;
    public boolean voiceTranscriptionFinal;
    public boolean voiceTranscriptionForce;
    public long voiceTranscriptionId;
    public boolean voiceTranscriptionOpen;
    public boolean voiceTranscriptionRated;
    public boolean with_my_score;
    public ArrayList<TLRPC$MessageEntity> entities = new ArrayList<>();
    public ArrayList<TLRPC$TL_restrictionReason> restriction_reason = new ArrayList<>();
    public int send_state = 0;
    public int fwd_msg_id = 0;
    public String attachPath = "";
    public int local_id = 0;
    public int stickerVerified = 1;

    public static TLRPC$Message TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$Message tLRPC$Message;
        switch (i) {
            case -2082087340:
                tLRPC$Message = new TLRPC$TL_messageEmpty() {
                    public static int constructor = -2082087340;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = new TLRPC$TL_peerUser();
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.f881id);
                    }
                };
                break;
            case -2049520670:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -2049520670;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.from_scheduled = (262144 & readInt32) != 0;
                        this.legacy = (524288 & readInt32) != 0;
                        this.edit_hide = (2097152 & readInt32) != 0;
                        this.pinned = (16777216 & readInt32) != 0;
                        this.noforwards = (readInt32 & ConnectionsManager.FileTypeFile) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.reply_to = TLRPC$TL_messageReplyHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null) {
                                this.ttl = TLdeserialize.ttl_seconds;
                            }
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.forwards = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8388608) != 0) {
                            this.replies = TLRPC$MessageReplies.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.grouped_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                TLRPC$TL_restrictionReason TLdeserialize3 = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize3 == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize3);
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.from_scheduled ? i6 | 262144 : i6 & (-262145);
                        this.flags = i7;
                        int i8 = this.legacy ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        int i9 = this.edit_hide ? i8 | 2097152 : i8 & (-2097153);
                        this.flags = i9;
                        int i10 = this.pinned ? i9 | ConnectionsManager.FileTypePhoto : i9 & (-16777217);
                        this.flags = i10;
                        int i11 = this.noforwards ? i10 | ConnectionsManager.FileTypeFile : i10 & (-67108865);
                        this.flags = i11;
                        abstractSerializedData2.writeInt32(i11);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            this.from_id.serializeToStream(abstractSerializedData2);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt64(this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            this.reply_to.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i12 = 0; i12 < size; i12++) {
                                this.entities.get(i12).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.forwards);
                        }
                        if ((this.flags & 8388608) != 0) {
                            this.replies.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt64(this.grouped_id);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i13 = 0; i13 < size2; i13++) {
                                this.restriction_reason.get(i13).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -1868117372:
                tLRPC$Message = new TLRPC$TL_messageEmpty();
                break;
            case -1864508399:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -1864508399;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null) {
                                this.ttl = TLdeserialize.ttl_seconds;
                            }
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        abstractSerializedData2.writeInt32(i6);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i7 = 0; i7 < size; i7++) {
                                this.entities.get(i7).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -1752573244:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -1752573244;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.from_scheduled = (262144 & readInt32) != 0;
                        this.legacy = (524288 & readInt32) != 0;
                        this.edit_hide = (readInt32 & 2097152) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null) {
                                this.ttl = TLdeserialize.ttl_seconds;
                            }
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.grouped_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 1048576) != 0) {
                            this.reactions = TLRPC$MessageReactions.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                TLRPC$TL_restrictionReason TLdeserialize3 = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize3 == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize3);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.from_scheduled ? i6 | 262144 : i6 & (-262145);
                        this.flags = i7;
                        int i8 = this.legacy ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        int i9 = this.edit_hide ? i8 | 2097152 : i8 & (-2097153);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i10 = 0; i10 < size; i10++) {
                                this.entities.get(i10).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt64(this.grouped_id);
                        }
                        if ((this.flags & 1048576) != 0) {
                            this.reactions.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                this.restriction_reason.get(i11).serializeToStream(abstractSerializedData2);
                            }
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -1642487306:
                tLRPC$Message = new TLRPC$TL_messageService() {
                    public static int constructor = -1642487306;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.legacy = (readInt32 & 524288) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.action = TLRPC$MessageAction.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        int i6 = this.silent ? i5 | 8192 : i5 & (-8193);
                        this.flags = i6;
                        int i7 = this.post ? i6 | 16384 : i6 & (-16385);
                        this.flags = i7;
                        int i8 = this.legacy ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        abstractSerializedData2.writeInt32(i8);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        this.action.serializeToStream(abstractSerializedData2);
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -1618124613:
                tLRPC$Message = new TLRPC$TL_messageService() {
                    public static int constructor = -1618124613;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.out = abstractSerializedData2.readBool(z2);
                        this.unread = abstractSerializedData2.readBool(z2);
                        this.flags |= 256;
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.action = TLRPC$MessageAction.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.f881id);
                        abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeBool(this.out);
                        abstractSerializedData2.writeBool(this.unread);
                        abstractSerializedData2.writeInt32(this.date);
                        this.action.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -1553471722:
                tLRPC$Message = new TLRPC$TL_messageForwarded_old2();
                break;
            case -1481959023:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -1481959023;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2) | 256 | 512;
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
                            this.fwd_from = tLRPC$TL_messageFwdHeader;
                            tLRPC$TL_messageFwdHeader.from_id = new TLRPC$TL_peerUser();
                            this.fwd_from.from_id.user_id = abstractSerializedData2.readInt32(z2);
                            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.fwd_from;
                            tLRPC$MessageFwdHeader.flags |= 1;
                            tLRPC$MessageFwdHeader.date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.media = TLdeserialize;
                        if (TLdeserialize == null || TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                            return;
                        }
                        this.message = this.media.captionLegacy;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32(this.f881id);
                        abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32((int) this.fwd_from.from_id.user_id);
                            abstractSerializedData2.writeInt32(this.fwd_from.date);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        this.media.serializeToStream(abstractSerializedData2);
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -1125940270:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -1125940270;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.from_scheduled = (262144 & readInt32) != 0;
                        this.legacy = (524288 & readInt32) != 0;
                        this.edit_hide = (2097152 & readInt32) != 0;
                        this.pinned = (readInt32 & ConnectionsManager.FileTypePhoto) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.reply_to = TLRPC$TL_messageReplyHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null) {
                                this.ttl = TLdeserialize.ttl_seconds;
                            }
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.forwards = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8388608) != 0) {
                            this.replies = TLRPC$MessageReplies.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.grouped_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                TLRPC$TL_restrictionReason TLdeserialize3 = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize3 == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize3);
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.from_scheduled ? i6 | 262144 : i6 & (-262145);
                        this.flags = i7;
                        int i8 = this.legacy ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        int i9 = this.edit_hide ? i8 | 2097152 : i8 & (-2097153);
                        this.flags = i9;
                        int i10 = this.pinned ? i9 | ConnectionsManager.FileTypePhoto : i9 & (-16777217);
                        this.flags = i10;
                        abstractSerializedData2.writeInt32(i10);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            this.from_id.serializeToStream(abstractSerializedData2);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            this.reply_to.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i11 = 0; i11 < size; i11++) {
                                this.entities.get(i11).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.forwards);
                        }
                        if ((this.flags & 8388608) != 0) {
                            this.replies.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt64(this.grouped_id);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i12 = 0; i12 < size2; i12++) {
                                this.restriction_reason.get(i12).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -1066691065:
                tLRPC$Message = new TLRPC$TL_messageService() {
                    public static int constructor = -1066691065;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        TLRPC$Peer TLdeserialize = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.peer_id = TLdeserialize;
                        if (this.from_id == null) {
                            this.from_id = TLdeserialize;
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.action = TLRPC$MessageAction.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        int i6 = this.silent ? i5 | 8192 : i5 & (-8193);
                        this.flags = i6;
                        int i7 = this.post ? i6 | 16384 : i6 & (-16385);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        this.action.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case -1063525281:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -1063525281;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.with_my_score = (readInt32 & 1073741824) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        TLRPC$Peer TLdeserialize = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.peer_id = TLdeserialize;
                        if (this.from_id == null) {
                            this.from_id = TLdeserialize;
                        }
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize2 = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize2;
                            if (TLdeserialize2 != null && !TextUtils.isEmpty(TLdeserialize2.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        } else {
                            this.media = new TLRPC$TL_messageMediaEmpty();
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize3 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize3 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize3);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        int i6 = this.silent ? i5 | 8192 : i5 & (-8193);
                        this.flags = i6;
                        int i7 = this.post ? i6 | 16384 : i6 & (-16385);
                        this.flags = i7;
                        int i8 = this.with_my_score ? i7 | 1073741824 : i7 & (-1073741825);
                        this.flags = i8;
                        abstractSerializedData2.writeInt32(i8);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i9 = 0; i9 < size; i9++) {
                                this.entities.get(i9).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -1023016155:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -1023016155;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2) | 256 | 512;
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
                            this.fwd_from = tLRPC$TL_messageFwdHeader;
                            tLRPC$TL_messageFwdHeader.from_id = new TLRPC$TL_peerUser();
                            this.fwd_from.from_id.user_id = abstractSerializedData2.readInt32(z2);
                            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.fwd_from;
                            tLRPC$MessageFwdHeader.flags |= 1;
                            tLRPC$MessageFwdHeader.date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.media = TLdeserialize;
                        if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                            this.message = this.media.captionLegacy;
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32(this.f881id);
                        abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32((int) this.fwd_from.from_id.user_id);
                            abstractSerializedData2.writeInt32(this.fwd_from.date);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        this.media.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -913120932:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -913120932;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        TLRPC$Peer TLdeserialize = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.peer_id = TLdeserialize;
                        if (this.from_id == null) {
                            this.from_id = TLdeserialize;
                        }
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = new TLRPC$TL_messageFwdHeader();
                            TLRPC$Peer TLdeserialize2 = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 != null) {
                                TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.fwd_from;
                                tLRPC$MessageFwdHeader.from_id = TLdeserialize2;
                                tLRPC$MessageFwdHeader.flags |= 1;
                            }
                            this.fwd_from.date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize3 = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize3;
                            if (TLdeserialize3 != null && !TextUtils.isEmpty(TLdeserialize3.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        } else {
                            this.media = new TLRPC$TL_messageMediaEmpty();
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize4 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize4 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize4);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            TLRPC$Peer tLRPC$Peer = this.fwd_from.from_id;
                            if (tLRPC$Peer != null) {
                                tLRPC$Peer.serializeToStream(abstractSerializedData2);
                            }
                            abstractSerializedData2.writeInt32(this.fwd_from.date);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i6 = 0; i6 < size; i6++) {
                                this.entities.get(i6).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -260565816:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -260565816;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2) | 256 | 512;
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
                            this.fwd_from = tLRPC$TL_messageFwdHeader;
                            tLRPC$TL_messageFwdHeader.from_id = new TLRPC$TL_peerUser();
                            this.fwd_from.from_id.user_id = abstractSerializedData2.readInt32(z2);
                            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.fwd_from;
                            tLRPC$MessageFwdHeader.flags |= 1;
                            tLRPC$MessageFwdHeader.date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.media = TLdeserialize;
                        if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                            this.message = this.media.captionLegacy;
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32(this.f881id);
                        abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32((int) this.fwd_from.from_id.user_id);
                            abstractSerializedData2.writeInt32(this.fwd_from.date);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        this.media.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i6 = 0; i6 < size; i6++) {
                                this.entities.get(i6).serializeToStream(abstractSerializedData2);
                            }
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case -181507201:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = -181507201;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.from_scheduled = (262144 & readInt32) != 0;
                        this.legacy = (524288 & readInt32) != 0;
                        this.edit_hide = (readInt32 & 2097152) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null) {
                                this.ttl = TLdeserialize.ttl_seconds;
                            }
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.forwards = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.grouped_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                TLRPC$TL_restrictionReason TLdeserialize3 = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize3 == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize3);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.from_scheduled ? i6 | 262144 : i6 & (-262145);
                        this.flags = i7;
                        int i8 = this.legacy ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        int i9 = this.edit_hide ? i8 | 2097152 : i8 & (-2097153);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i10 = 0; i10 < size; i10++) {
                                this.entities.get(i10).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.forwards);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt64(this.grouped_id);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                this.restriction_reason.get(i11).serializeToStream(abstractSerializedData2);
                            }
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 99903492:
                tLRPC$Message = new TLRPC$TL_messageForwarded_old2() {
                    public static int constructor = 99903492;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
                        this.fwd_from = tLRPC$TL_messageFwdHeader;
                        tLRPC$TL_messageFwdHeader.from_id = new TLRPC$TL_peerUser();
                        this.fwd_from.from_id.user_id = abstractSerializedData2.readInt32(z2);
                        TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.fwd_from;
                        tLRPC$MessageFwdHeader.flags |= 1;
                        tLRPC$MessageFwdHeader.date = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.out = abstractSerializedData2.readBool(z2);
                        this.unread = abstractSerializedData2.readBool(z2);
                        this.flags |= 772;
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.media = TLdeserialize;
                        if (TLdeserialize == null || TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                            return;
                        }
                        this.message = this.media.captionLegacy;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.f881id);
                        abstractSerializedData2.writeInt32((int) this.fwd_from.from_id.user_id);
                        abstractSerializedData2.writeInt32(this.fwd_from.date);
                        abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeBool(this.out);
                        abstractSerializedData2.writeBool(this.unread);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        this.media.serializeToStream(abstractSerializedData2);
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 479924263:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = 479924263;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.from_scheduled = (262144 & readInt32) != 0;
                        this.legacy = (524288 & readInt32) != 0;
                        this.edit_hide = (readInt32 & 2097152) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null) {
                                this.ttl = TLdeserialize.ttl_seconds;
                            }
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.grouped_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 1048576) != 0) {
                            this.reactions = TLRPC$MessageReactions.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.from_scheduled ? i6 | 262144 : i6 & (-262145);
                        this.flags = i7;
                        int i8 = this.legacy ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        int i9 = this.edit_hide ? i8 | 2097152 : i8 & (-2097153);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i10 = 0; i10 < size; i10++) {
                                this.entities.get(i10).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt64(this.grouped_id);
                        }
                        if ((this.flags & 1048576) != 0) {
                            this.reactions.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeString("");
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 495384334:
                tLRPC$Message = new TLRPC$TL_messageService() {
                    public static int constructor = 495384334;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.action = TLRPC$MessageAction.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.flags |= 256;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32(this.f881id);
                        abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        this.action.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 585853626:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = 585853626;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.out = abstractSerializedData2.readBool(z2);
                        this.unread = abstractSerializedData2.readBool(z2);
                        this.flags |= 768;
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.media = TLdeserialize;
                        if (TLdeserialize == null || TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                            return;
                        }
                        this.message = this.media.captionLegacy;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.f881id);
                        abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeBool(this.out);
                        abstractSerializedData2.writeBool(this.unread);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        this.media.serializeToStream(abstractSerializedData2);
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 678405636:
                tLRPC$Message = new TLRPC$TL_messageService() {
                    public static int constructor = 678405636;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.legacy = (readInt32 & 524288) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8) != 0) {
                            this.reply_to = TLRPC$TL_messageReplyHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.action = TLRPC$MessageAction.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.legacy ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            this.from_id.serializeToStream(abstractSerializedData2);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            this.reply_to.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        this.action.serializeToStream(abstractSerializedData2);
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 721967202:
                tLRPC$Message = new TLRPC$TL_messageService();
                break;
            case 736885382:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = 736885382;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2) | 256;
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            TLRPC$TL_messageFwdHeader tLRPC$TL_messageFwdHeader = new TLRPC$TL_messageFwdHeader();
                            this.fwd_from = tLRPC$TL_messageFwdHeader;
                            tLRPC$TL_messageFwdHeader.from_id = new TLRPC$TL_peerUser();
                            this.fwd_from.from_id.user_id = abstractSerializedData2.readInt32(z2);
                            TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.fwd_from;
                            tLRPC$MessageFwdHeader.flags |= 1;
                            tLRPC$MessageFwdHeader.date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        } else {
                            this.media = new TLRPC$TL_messageMediaEmpty();
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32(this.f881id);
                        abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32((int) this.fwd_from.from_id.user_id);
                            abstractSerializedData2.writeInt32(this.fwd_from.date);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i6 = 0; i6 < size; i6++) {
                                this.entities.get(i6).serializeToStream(abstractSerializedData2);
                            }
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 940666592:
                tLRPC$Message = new TLRPC$TL_message();
                break;
            case 1157215293:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = 1157215293;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.from_scheduled = (262144 & readInt32) != 0;
                        this.legacy = (readInt32 & 524288) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null) {
                                this.ttl = TLdeserialize.ttl_seconds;
                            }
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.grouped_id = abstractSerializedData2.readInt64(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.from_scheduled ? i6 | 262144 : i6 & (-262145);
                        this.flags = i7;
                        int i8 = this.legacy ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        abstractSerializedData2.writeInt32(i8);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i9 = 0; i9 < size; i9++) {
                                this.entities.get(i9).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt64(this.grouped_id);
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 1160515173:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = 1160515173;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.from_scheduled = (262144 & readInt32) != 0;
                        this.legacy = (524288 & readInt32) != 0;
                        this.edit_hide = (readInt32 & 2097152) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null) {
                                this.ttl = TLdeserialize.ttl_seconds;
                            }
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.grouped_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                TLRPC$TL_restrictionReason TLdeserialize3 = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize3 == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize3);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.from_scheduled ? i6 | 262144 : i6 & (-262145);
                        this.flags = i7;
                        int i8 = this.legacy ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        int i9 = this.edit_hide ? i8 | 2097152 : i8 & (-2097153);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i10 = 0; i10 < size; i10++) {
                                this.entities.get(i10).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt64(this.grouped_id);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                this.restriction_reason.get(i11).serializeToStream(abstractSerializedData2);
                            }
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 1431655928:
                tLRPC$Message = new TLRPC$TL_message_secret_old();
                break;
            case 1431655929:
                tLRPC$Message = new TLRPC$TL_message_secret_layer72();
                break;
            case 1431655930:
                tLRPC$Message = new TLRPC$TL_message_secret();
                break;
            case 1450613171:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = 1450613171;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2) | 256 | 512;
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                        this.from_id = tLRPC$TL_peerUser;
                        tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.media = TLdeserialize;
                        if (TLdeserialize == null || TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                            return;
                        }
                        this.message = this.media.captionLegacy;
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32(this.f881id);
                        abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        this.media.serializeToStream(abstractSerializedData2);
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 1487813065:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = 1487813065;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.silent = (readInt32 & 8192) != 0;
                        this.post = (readInt32 & 16384) != 0;
                        this.from_scheduled = (262144 & readInt32) != 0;
                        this.legacy = (524288 & readInt32) != 0;
                        this.edit_hide = (2097152 & readInt32) != 0;
                        this.pinned = (readInt32 & ConnectionsManager.FileTypePhoto) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            this.from_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.peer_id = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = TLRPC$MessageFwdHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.via_bot_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            this.reply_to = TLRPC$TL_messageReplyHeader.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize;
                            if (TLdeserialize != null) {
                                this.ttl = TLdeserialize.ttl_seconds;
                            }
                            if (TLdeserialize != null && !TextUtils.isEmpty(TLdeserialize.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize2 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.forwards = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8388608) != 0) {
                            this.replies = TLRPC$MessageReplies.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.edit_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.post_author = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.grouped_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 4194304) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                TLRPC$TL_restrictionReason TLdeserialize3 = TLRPC$TL_restrictionReason.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize3 == null) {
                                    return;
                                }
                                this.restriction_reason.add(TLdeserialize3);
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.out ? this.flags | 2 : this.flags & (-3);
                        this.flags = i2;
                        int i3 = this.mentioned ? i2 | 16 : i2 & (-17);
                        this.flags = i3;
                        int i4 = this.media_unread ? i3 | 32 : i3 & (-33);
                        this.flags = i4;
                        int i5 = this.silent ? i4 | 8192 : i4 & (-8193);
                        this.flags = i5;
                        int i6 = this.post ? i5 | 16384 : i5 & (-16385);
                        this.flags = i6;
                        int i7 = this.from_scheduled ? i6 | 262144 : i6 & (-262145);
                        this.flags = i7;
                        int i8 = this.legacy ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        int i9 = this.edit_hide ? i8 | 2097152 : i8 & (-2097153);
                        this.flags = i9;
                        int i10 = this.pinned ? i9 | ConnectionsManager.FileTypePhoto : i9 & (-16777217);
                        this.flags = i10;
                        abstractSerializedData2.writeInt32(i10);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            this.from_id.serializeToStream(abstractSerializedData2);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.fwd_from.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32((int) this.via_bot_id);
                        }
                        if ((this.flags & 8) != 0) {
                            this.reply_to.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i11 = 0; i11 < size; i11++) {
                                this.entities.get(i11).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.forwards);
                        }
                        if ((this.flags & 8388608) != 0) {
                            this.replies.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 32768) != 0) {
                            abstractSerializedData2.writeInt32(this.edit_date);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.post_author);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt64(this.grouped_id);
                        }
                        if ((this.flags & 4194304) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.restriction_reason.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i12 = 0; i12 < size2; i12++) {
                                this.restriction_reason.get(i12).serializeToStream(abstractSerializedData2);
                            }
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            case 1537633299:
                tLRPC$Message = new TLRPC$TL_message() {
                    public static int constructor = 1537633299;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.unread = (readInt32 & 1) != 0;
                        this.out = (readInt32 & 2) != 0;
                        this.mentioned = (readInt32 & 16) != 0;
                        this.media_unread = (readInt32 & 32) != 0;
                        this.f881id = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 256) != 0) {
                            TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
                            this.from_id = tLRPC$TL_peerUser;
                            tLRPC$TL_peerUser.user_id = abstractSerializedData2.readInt32(z2);
                        }
                        TLRPC$Peer TLdeserialize = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.peer_id = TLdeserialize;
                        if (this.from_id == null) {
                            this.from_id = TLdeserialize;
                        }
                        if ((this.flags & 4) != 0) {
                            this.fwd_from = new TLRPC$TL_messageFwdHeader();
                            TLRPC$Peer TLdeserialize2 = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 != null) {
                                TLRPC$MessageFwdHeader tLRPC$MessageFwdHeader = this.fwd_from;
                                tLRPC$MessageFwdHeader.from_id = TLdeserialize2;
                                tLRPC$MessageFwdHeader.flags |= 1;
                            }
                            this.fwd_from.date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8) != 0) {
                            TLRPC$TL_messageReplyHeader tLRPC$TL_messageReplyHeader = new TLRPC$TL_messageReplyHeader();
                            this.reply_to = tLRPC$TL_messageReplyHeader;
                            tLRPC$TL_messageReplyHeader.reply_to_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.date = abstractSerializedData2.readInt32(z2);
                        this.message = abstractSerializedData2.readString(z2);
                        if ((this.flags & 512) != 0) {
                            TLRPC$MessageMedia TLdeserialize3 = TLRPC$MessageMedia.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            this.media = TLdeserialize3;
                            if (TLdeserialize3 != null && !TextUtils.isEmpty(TLdeserialize3.captionLegacy)) {
                                this.message = this.media.captionLegacy;
                            }
                        } else {
                            this.media = new TLRPC$TL_messageMediaEmpty();
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup = TLRPC$ReplyMarkup.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$MessageEntity TLdeserialize4 = TLRPC$MessageEntity.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize4 == null) {
                                    return;
                                }
                                this.entities.add(TLdeserialize4);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            this.views = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.unread ? this.flags | 1 : this.flags & (-2);
                        this.flags = i2;
                        int i3 = this.out ? i2 | 2 : i2 & (-3);
                        this.flags = i3;
                        int i4 = this.mentioned ? i3 | 16 : i3 & (-17);
                        this.flags = i4;
                        int i5 = this.media_unread ? i4 | 32 : i4 & (-33);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32(this.f881id);
                        if ((this.flags & 256) != 0) {
                            abstractSerializedData2.writeInt32((int) this.from_id.user_id);
                        }
                        this.peer_id.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            TLRPC$Peer tLRPC$Peer = this.fwd_from.from_id;
                            if (tLRPC$Peer != null) {
                                tLRPC$Peer.serializeToStream(abstractSerializedData2);
                            }
                            abstractSerializedData2.writeInt32(this.fwd_from.date);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(this.reply_to.reply_to_msg_id);
                        }
                        abstractSerializedData2.writeInt32(this.date);
                        abstractSerializedData2.writeString(this.message);
                        if ((this.flags & 512) != 0) {
                            this.media.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 64) != 0) {
                            this.reply_markup.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagNeedQuickAck) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.entities.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i6 = 0; i6 < size; i6++) {
                                this.entities.get(i6).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0) {
                            abstractSerializedData2.writeInt32(this.views);
                        }
                        writeAttachPath(abstractSerializedData2);
                    }
                };
                break;
            default:
                tLRPC$Message = null;
                break;
        }
        if (tLRPC$Message == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in Message", Integer.valueOf(i)));
        }
        if (tLRPC$Message != null) {
            tLRPC$Message.readParams(abstractSerializedData, z);
            if (tLRPC$Message.from_id == null) {
                tLRPC$Message.from_id = tLRPC$Message.peer_id;
            }
        }
        return tLRPC$Message;
    }

    public void readAttachPath(org.telegram.tgnet.AbstractSerializedData r12, long r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.tgnet.TLRPC$Message.readAttachPath(org.telegram.tgnet.AbstractSerializedData, long):void");
    }

    public void writeAttachPath(AbstractSerializedData abstractSerializedData) {
        HashMap<String, String> hashMap;
        HashMap<String, String> hashMap2;
        if ((this instanceof TLRPC$TL_message_secret) || (this instanceof TLRPC$TL_message_secret_layer72)) {
            String str = this.attachPath;
            if (str == null) {
                str = "";
            }
            if (this.send_state == 1 && (hashMap = this.params) != null && hashMap.size() > 0) {
                for (Map.Entry<String, String> entry : this.params.entrySet()) {
                    str = entry.getKey() + "|=|" + entry.getValue() + "||" + str;
                }
                str = "||" + str;
            }
            abstractSerializedData.writeString(str);
            return;
        }
        String str2 = !TextUtils.isEmpty(this.attachPath) ? this.attachPath : " ";
        if (this.legacy) {
            if (this.params == null) {
                this.params = new HashMap<>();
            }
            this.layer = 151;
            this.params.put("legacy_layer", "151");
        }
        if ((this.f881id < 0 || this.send_state == 3 || this.legacy) && (hashMap2 = this.params) != null && hashMap2.size() > 0) {
            for (Map.Entry<String, String> entry2 : this.params.entrySet()) {
                str2 = entry2.getKey() + "|=|" + entry2.getValue() + "||" + str2;
            }
            str2 = "||" + str2;
        }
        abstractSerializedData.writeString(str2);
        if ((this.flags & 4) == 0 || this.f881id >= 0) {
            return;
        }
        abstractSerializedData.writeInt32(this.fwd_msg_id);
    }
}
