package org.telegram.tgnet;

import org.telegram.messenger.CharacterCompat;

public class TLRPC$TL_chatFull extends TLRPC$ChatFull {
    public static int constructor = -779165146;

    @Override
    public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
        int readInt32 = abstractSerializedData.readInt32(z);
        this.flags = readInt32;
        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
        this.has_scheduled = (readInt32 & 256) != 0;
        this.f855id = abstractSerializedData.readInt64(z);
        this.about = abstractSerializedData.readString(z);
        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 4) != 0) {
            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        if ((this.flags & 8192) != 0) {
            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 8) != 0) {
            int readInt322 = abstractSerializedData.readInt32(z);
            if (readInt322 == 481674261) {
                int readInt323 = abstractSerializedData.readInt32(z);
                for (int i = 0; i < readInt323; i++) {
                    TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
                    if (TLdeserialize != null) {
                        this.bot_info.add(TLdeserialize);
                    } else {
                        return;
                    }
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
            } else {
                return;
            }
        }
        if ((this.flags & 64) != 0) {
            this.pinned_msg_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 2048) != 0) {
            this.folder_id = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 4096) != 0) {
            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & 16384) != 0) {
            this.ttl_period = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 32768) != 0) {
            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
        }
        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
            this.theme_emoticon = abstractSerializedData.readString(z);
        }
        if ((this.flags & 131072) != 0) {
            this.requests_pending = abstractSerializedData.readInt32(z);
        }
        if ((this.flags & 131072) != 0) {
            int readInt324 = abstractSerializedData.readInt32(z);
            if (readInt324 == 481674261) {
                int readInt325 = abstractSerializedData.readInt32(z);
                for (int i2 = 0; i2 < readInt325; i2++) {
                    this.recent_requesters.add(Long.valueOf(abstractSerializedData.readInt64(z)));
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
            } else {
                return;
            }
        }
        if ((this.flags & 262144) != 0) {
            int readInt326 = abstractSerializedData.readInt32(z);
            if (readInt326 == 481674261) {
                int readInt327 = abstractSerializedData.readInt32(z);
                for (int i3 = 0; i3 < readInt327; i3++) {
                    this.available_reactions.add(abstractSerializedData.readString(z));
                }
            } else if (z) {
                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
            }
        }
    }

    @Override
    public void serializeToStream(AbstractSerializedData abstractSerializedData) {
        abstractSerializedData.writeInt32(constructor);
        int i = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
        this.flags = i;
        int i2 = this.has_scheduled ? i | 256 : i & (-257);
        this.flags = i2;
        abstractSerializedData.writeInt32(i2);
        abstractSerializedData.writeInt64(this.f855id);
        abstractSerializedData.writeString(this.about);
        this.participants.serializeToStream(abstractSerializedData);
        if ((this.flags & 4) != 0) {
            this.chat_photo.serializeToStream(abstractSerializedData);
        }
        this.notify_settings.serializeToStream(abstractSerializedData);
        if ((this.flags & 8192) != 0) {
            this.exported_invite.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 8) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size = this.bot_info.size();
            abstractSerializedData.writeInt32(size);
            for (int i3 = 0; i3 < size; i3++) {
                this.bot_info.get(i3).serializeToStream(abstractSerializedData);
            }
        }
        if ((this.flags & 64) != 0) {
            abstractSerializedData.writeInt32(this.pinned_msg_id);
        }
        if ((this.flags & 2048) != 0) {
            abstractSerializedData.writeInt32(this.folder_id);
        }
        if ((this.flags & 4096) != 0) {
            this.call.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & 16384) != 0) {
            abstractSerializedData.writeInt32(this.ttl_period);
        }
        if ((this.flags & 32768) != 0) {
            this.groupcall_default_join_as.serializeToStream(abstractSerializedData);
        }
        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
            abstractSerializedData.writeString(this.theme_emoticon);
        }
        if ((this.flags & 131072) != 0) {
            abstractSerializedData.writeInt32(this.requests_pending);
        }
        if ((this.flags & 131072) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size2 = this.recent_requesters.size();
            abstractSerializedData.writeInt32(size2);
            for (int i4 = 0; i4 < size2; i4++) {
                abstractSerializedData.writeInt64(this.recent_requesters.get(i4).longValue());
            }
        }
        if ((this.flags & 262144) != 0) {
            abstractSerializedData.writeInt32(481674261);
            int size3 = this.available_reactions.size();
            abstractSerializedData.writeInt32(size3);
            for (int i5 = 0; i5 < size3; i5++) {
                abstractSerializedData.writeString(this.available_reactions.get(i5));
            }
        }
    }
}
