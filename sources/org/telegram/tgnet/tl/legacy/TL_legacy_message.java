package org.telegram.tgnet.tl.legacy;

import android.text.TextUtils;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda115;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.TLRPC$TL_channel$$ExternalSyntheticLambda0;
import org.telegram.tgnet.Vector;

public class TL_legacy_message {
    private TL_legacy_message() {
    }

    public static class TL_message_layer226 extends TLRPC.TL_message {
        public static final int constructor = -1779470549;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.video_processing_pending = TLObject.hasFlag(this.flags2, 16);
            this.paid_suggested_post_stars = TLObject.hasFlag(this.flags2, 256);
            this.paid_suggested_post_ton = TLObject.hasFlag(this.flags2, 512);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4096)) {
                this.from_rank = inputSerializedData.readString(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 524288)) {
                this.guestchat_via_from = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                this.effect = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck = TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                this.report_delivery_until_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                this.paid_message_stars = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post = TLRPC.SuggestedPost.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 1024)) {
                this.schedule_repeat_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 2048)) {
                this.summary_from_language = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1779470549);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            int flag13 = TLObject.setFlag(flag12, 16, this.video_processing_pending);
            this.flags2 = flag13;
            int flag14 = TLObject.setFlag(flag13, 128, this.suggested_post != null);
            this.flags2 = flag14;
            int flag15 = TLObject.setFlag(flag14, 256, this.paid_suggested_post_stars);
            this.flags2 = flag15;
            int flag16 = TLObject.setFlag(flag15, 512, this.paid_suggested_post_ton);
            this.flags2 = flag16;
            int flag17 = TLObject.setFlag(flag16, 4096, this.from_rank != null);
            this.flags2 = flag17;
            int flag18 = TLObject.setFlag(flag17, 524288, this.guestchat_via_from != null);
            this.flags2 = flag18;
            outputSerializedData.writeInt32(flag18);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            if (TLObject.hasFlag(this.flags2, 4096)) {
                outputSerializedData.writeString(this.from_rank);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 524288)) {
                this.guestchat_via_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                outputSerializedData.writeInt64(this.effect);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                outputSerializedData.writeInt32(this.report_delivery_until_date);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                outputSerializedData.writeInt64(this.paid_message_stars);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 1024)) {
                outputSerializedData.writeInt32(this.schedule_repeat_period);
            }
            if (TLObject.hasFlag(this.flags2, 2048)) {
                outputSerializedData.writeString(this.summary_from_language);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer224 extends TLRPC.TL_message {
        public static final int constructor = 988112002;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.video_processing_pending = TLObject.hasFlag(this.flags2, 16);
            this.paid_suggested_post_stars = TLObject.hasFlag(this.flags2, 256);
            this.paid_suggested_post_ton = TLObject.hasFlag(this.flags2, 512);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4096)) {
                this.from_rank = inputSerializedData.readString(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                this.effect = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck = TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                this.report_delivery_until_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                this.paid_message_stars = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post = TLRPC.SuggestedPost.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 1024)) {
                this.schedule_repeat_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 2048)) {
                this.summary_from_language = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(988112002);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            int flag13 = TLObject.setFlag(flag12, 16, this.video_processing_pending);
            this.flags2 = flag13;
            int flag14 = TLObject.setFlag(flag13, 128, this.suggested_post != null);
            this.flags2 = flag14;
            int flag15 = TLObject.setFlag(flag14, 256, this.paid_suggested_post_stars);
            this.flags2 = flag15;
            int flag16 = TLObject.setFlag(flag15, 512, this.paid_suggested_post_ton);
            this.flags2 = flag16;
            int flag17 = TLObject.setFlag(flag16, 4096, this.from_rank != null);
            this.flags2 = flag17;
            outputSerializedData.writeInt32(flag17);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            if (TLObject.hasFlag(this.flags2, 4096)) {
                outputSerializedData.writeString(this.from_rank);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                outputSerializedData.writeInt64(this.effect);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                outputSerializedData.writeInt32(this.report_delivery_until_date);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                outputSerializedData.writeInt64(this.paid_message_stars);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 1024)) {
                outputSerializedData.writeInt32(this.schedule_repeat_period);
            }
            if (TLObject.hasFlag(this.flags2, 2048)) {
                outputSerializedData.writeString(this.summary_from_language);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer222 extends TLRPC.TL_message {
        public static final int constructor = -1665888023;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.video_processing_pending = TLObject.hasFlag(this.flags2, 16);
            this.paid_suggested_post_stars = TLObject.hasFlag(this.flags2, 256);
            this.paid_suggested_post_ton = TLObject.hasFlag(this.flags2, 512);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                this.effect = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck = TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                this.report_delivery_until_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                this.paid_message_stars = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post = TLRPC.SuggestedPost.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 1024)) {
                this.schedule_repeat_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 2048)) {
                this.summary_from_language = inputSerializedData.readString(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1665888023);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            int flag13 = TLObject.setFlag(flag12, 16, this.video_processing_pending);
            this.flags2 = flag13;
            int flag14 = TLObject.setFlag(flag13, 128, this.suggested_post != null);
            this.flags2 = flag14;
            int flag15 = TLObject.setFlag(flag14, 256, this.paid_suggested_post_stars);
            this.flags2 = flag15;
            int flag16 = TLObject.setFlag(flag15, 512, this.paid_suggested_post_ton);
            this.flags2 = flag16;
            outputSerializedData.writeInt32(flag16);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                outputSerializedData.writeInt64(this.effect);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                outputSerializedData.writeInt32(this.report_delivery_until_date);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                outputSerializedData.writeInt64(this.paid_message_stars);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 1024)) {
                outputSerializedData.writeInt32(this.schedule_repeat_period);
            }
            if (TLObject.hasFlag(this.flags2, 2048)) {
                outputSerializedData.writeString(this.summary_from_language);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer220 extends TLRPC.TL_message {
        public static final int constructor = -1188071729;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.video_processing_pending = TLObject.hasFlag(this.flags2, 16);
            this.paid_suggested_post_stars = TLObject.hasFlag(this.flags2, 256);
            this.paid_suggested_post_ton = TLObject.hasFlag(this.flags2, 512);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                this.effect = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck = TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                this.report_delivery_until_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                this.paid_message_stars = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post = TLRPC.SuggestedPost.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 1024)) {
                this.schedule_repeat_period = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1188071729);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            int flag13 = TLObject.setFlag(flag12, 16, this.video_processing_pending);
            this.flags2 = flag13;
            int flag14 = TLObject.setFlag(flag13, 128, this.suggested_post != null);
            this.flags2 = flag14;
            int flag15 = TLObject.setFlag(flag14, 256, this.paid_suggested_post_stars);
            this.flags2 = flag15;
            int flag16 = TLObject.setFlag(flag15, 512, this.paid_suggested_post_ton);
            this.flags2 = flag16;
            outputSerializedData.writeInt32(flag16);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                outputSerializedData.writeInt64(this.effect);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                outputSerializedData.writeInt32(this.report_delivery_until_date);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                outputSerializedData.writeInt64(this.paid_message_stars);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 1024)) {
                outputSerializedData.writeInt32(this.schedule_repeat_period);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer216 extends TLRPC.TL_message {
        public static final int constructor = -1743401272;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.video_processing_pending = TLObject.hasFlag(this.flags2, 16);
            this.paid_suggested_post_stars = TLObject.hasFlag(this.flags2, 256);
            this.paid_suggested_post_ton = TLObject.hasFlag(this.flags2, 512);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                this.effect = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck = TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                this.report_delivery_until_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                this.paid_message_stars = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post = TLRPC.SuggestedPost.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1743401272);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            int flag13 = TLObject.setFlag(flag12, 16, this.video_processing_pending);
            this.flags2 = flag13;
            int flag14 = TLObject.setFlag(flag13, 128, this.suggested_post != null);
            this.flags2 = flag14;
            int flag15 = TLObject.setFlag(flag14, 256, this.paid_suggested_post_stars);
            this.flags2 = flag15;
            int flag16 = TLObject.setFlag(flag15, 512, this.paid_suggested_post_ton);
            this.flags2 = flag16;
            outputSerializedData.writeInt32(flag16);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                outputSerializedData.writeInt64(this.effect);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                outputSerializedData.writeInt32(this.report_delivery_until_date);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                outputSerializedData.writeInt64(this.paid_message_stars);
            }
            if (TLObject.hasFlag(this.flags2, 128)) {
                this.suggested_post.serializeToStream(outputSerializedData);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer205 extends TLRPC.TL_message {
        public static final int constructor = -356721331;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.video_processing_pending = TLObject.hasFlag(this.flags2, 16);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                this.effect = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck = TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                this.report_delivery_until_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                this.paid_message_stars = inputSerializedData.readInt64(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-356721331);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            int flag13 = TLObject.setFlag(flag12, 16, this.video_processing_pending);
            this.flags2 = flag13;
            outputSerializedData.writeInt32(flag13);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                outputSerializedData.writeInt64(this.effect);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                outputSerializedData.writeInt32(this.report_delivery_until_date);
            }
            if (TLObject.hasFlag(this.flags2, 64)) {
                outputSerializedData.writeInt64(this.paid_message_stars);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer199 extends TLRPC.TL_message {
        public static final int constructor = -1761756183;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.video_processing_pending = TLObject.hasFlag(this.flags2, 16);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                this.effect = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck = TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                this.report_delivery_until_date = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1761756183);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            int flag13 = TLObject.setFlag(flag12, 16, this.video_processing_pending);
            this.flags2 = flag13;
            outputSerializedData.writeInt32(flag13);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                outputSerializedData.writeInt64(this.effect);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags2, 32)) {
                outputSerializedData.writeInt32(this.report_delivery_until_date);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer195 extends TLRPC.TL_message {
        public static final int constructor = -1808510398;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.video_processing_pending = TLObject.hasFlag(this.flags2, 16);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                this.effect = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck = TLRPC.TL_factCheck.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1808510398);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            int flag13 = TLObject.setFlag(flag12, 16, this.video_processing_pending);
            this.flags2 = flag13;
            outputSerializedData.writeInt32(flag13);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                outputSerializedData.writeInt64(this.effect);
            }
            if (TLObject.hasFlag(this.flags2, 8)) {
                this.factcheck.serializeToStream(outputSerializedData);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer180 extends TLRPC.TL_message {
        public static final int constructor = -1109353426;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                this.effect = inputSerializedData.readInt64(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1109353426);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            outputSerializedData.writeInt32(flag12);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            if (TLObject.hasFlag(this.flags2, 4)) {
                outputSerializedData.writeInt64(this.effect);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer179 extends TLRPC.TL_message {
        public static final int constructor = 592953125;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            int int33 = inputSerializedData.readInt32(z);
            this.flags2 = int33;
            this.offline = TLObject.hasFlag(int33, 2);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                this.via_business_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(592953125);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            int flag12 = TLObject.setFlag(this.flags2, 2, this.offline);
            this.flags2 = flag12;
            outputSerializedData.writeInt32(flag12);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags2, 1)) {
                outputSerializedData.writeInt64(this.via_business_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer176 extends TLRPC.TL_message {
        public static final int constructor = -1502839044;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                this.quick_reply_shortcut_id = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1502839044);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            if (TLObject.hasFlag(this.flags, 1073741824)) {
                outputSerializedData.writeInt32(this.quick_reply_shortcut_id);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer175 extends TLRPC.TL_message {
        public static final int constructor = 508332649;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                this.from_boosts_applied = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(508332649);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 536870912)) {
                outputSerializedData.writeInt32(this.from_boosts_applied);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer173 extends TLRPC.TL_message {
        public static final int constructor = 1992213009;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1992213009);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 268435456)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer169 extends TLRPC.TL_message {
        public static final int constructor = 940666592;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.invert_media = TLObject.hasFlag(this.flags, 134217728);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(940666592);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            int flag11 = TLObject.setFlag(flag10, 134217728, this.invert_media);
            this.flags = flag11;
            outputSerializedData.writeInt32(flag11);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 1048576)) {
                this.reactions.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer135 extends TLRPC.TL_message {
        public static final int constructor = -2049520670;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.noforwards = TLObject.hasFlag(this.flags, 67108864);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2049520670);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            int flag10 = TLObject.setFlag(flag9, 67108864, this.noforwards);
            this.flags = flag10;
            outputSerializedData.writeInt32(flag10);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt64(this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer131 extends TLRPC.TL_message {
        public static final int constructor = -1125940270;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                this.ttl_period = inputSerializedData.readInt32(z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1125940270);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            outputSerializedData.writeInt32(flag9);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt32((int) this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            if (TLObject.hasFlag(this.flags, 33554432)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer123 extends TLRPC.TL_message {
        public static final int constructor = 1487813065;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.pinned = TLObject.hasFlag(this.flags, 16777216);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to = TLRPC.MessageReplyHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies = TLRPC.MessageReplies.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1487813065);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            int flag9 = TLObject.setFlag(flag8, 16777216, this.pinned);
            this.flags = flag9;
            outputSerializedData.writeInt32(flag9);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                this.from_id.serializeToStream(outputSerializedData);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt32((int) this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                this.reply_to.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 8388608)) {
                this.replies.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            writeAttachPath(outputSerializedData);
        }
    }

    public static class TL_message_layer118 extends TLRPC.TL_message {
        public static final int constructor = -181507201;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.out = TLObject.hasFlag(int32, 2);
            this.mentioned = TLObject.hasFlag(this.flags, 16);
            this.media_unread = TLObject.hasFlag(this.flags, 32);
            this.silent = TLObject.hasFlag(this.flags, 8192);
            this.post = TLObject.hasFlag(this.flags, 16384);
            this.from_scheduled = TLObject.hasFlag(this.flags, 262144);
            this.legacy = TLObject.hasFlag(this.flags, 524288);
            this.edit_hide = TLObject.hasFlag(this.flags, 2097152);
            this.id = inputSerializedData.readInt32(z);
            if (TLObject.hasFlag(this.flags, 256)) {
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                this.from_id = tL_peerUser;
                tL_peerUser.user_id = inputSerializedData.readInt32(z);
            }
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from = TLRPC.MessageFwdHeader.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                this.via_bot_id = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                this.reply_to = tL_messageReplyHeader;
                tL_messageReplyHeader.flags = 16 | tL_messageReplyHeader.flags;
                tL_messageReplyHeader.reply_to_msg_id = inputSerializedData.readInt32(z);
            }
            this.date = inputSerializedData.readInt32(z);
            this.message = inputSerializedData.readString(z);
            if (TLObject.hasFlag(this.flags, 512)) {
                TLRPC.MessageMedia messageMediaTLdeserialize = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
                this.media = messageMediaTLdeserialize;
                if (messageMediaTLdeserialize != null) {
                    this.ttl = messageMediaTLdeserialize.ttl_seconds;
                }
                if (messageMediaTLdeserialize != null && !TextUtils.isEmpty(messageMediaTLdeserialize.captionLegacy)) {
                    this.message = this.media.captionLegacy;
                }
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup = TLRPC.ReplyMarkup.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                this.entities = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda115(), z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.views = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                this.forwards = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                this.edit_date = inputSerializedData.readInt32(z);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                this.post_author = inputSerializedData.readString(z);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                this.grouped_id = inputSerializedData.readInt64(z);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                this.restriction_reason = Vector.deserialize(inputSerializedData, new TLRPC$TL_channel$$ExternalSyntheticLambda0(), z);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-181507201);
            int flag = TLObject.setFlag(this.flags, 2, this.out);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 16, this.mentioned);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 32, this.media_unread);
            this.flags = flag3;
            int flag4 = TLObject.setFlag(flag3, 8192, this.silent);
            this.flags = flag4;
            int flag5 = TLObject.setFlag(flag4, 16384, this.post);
            this.flags = flag5;
            int flag6 = TLObject.setFlag(flag5, 262144, this.from_scheduled);
            this.flags = flag6;
            int flag7 = TLObject.setFlag(flag6, 524288, this.legacy);
            this.flags = flag7;
            int flag8 = TLObject.setFlag(flag7, 2097152, this.edit_hide);
            this.flags = flag8;
            outputSerializedData.writeInt32(flag8);
            outputSerializedData.writeInt32(this.id);
            if (TLObject.hasFlag(this.flags, 256)) {
                outputSerializedData.writeInt32((int) this.from_id.user_id);
            }
            this.peer_id.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 4)) {
                this.fwd_from.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2048)) {
                outputSerializedData.writeInt32((int) this.via_bot_id);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeInt32(this.reply_to.reply_to_msg_id);
            }
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeString(this.message);
            if (TLObject.hasFlag(this.flags, 512)) {
                this.media.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 64)) {
                this.reply_markup.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 128)) {
                Vector.serialize(outputSerializedData, this.entities);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.views);
            }
            if (TLObject.hasFlag(this.flags, 1024)) {
                outputSerializedData.writeInt32(this.forwards);
            }
            if (TLObject.hasFlag(this.flags, 32768)) {
                outputSerializedData.writeInt32(this.edit_date);
            }
            if (TLObject.hasFlag(this.flags, 65536)) {
                outputSerializedData.writeString(this.post_author);
            }
            if (TLObject.hasFlag(this.flags, 131072)) {
                outputSerializedData.writeInt64(this.grouped_id);
            }
            if (TLObject.hasFlag(this.flags, 4194304)) {
                Vector.serialize(outputSerializedData, this.restriction_reason);
            }
            writeAttachPath(outputSerializedData);
        }
    }
}
