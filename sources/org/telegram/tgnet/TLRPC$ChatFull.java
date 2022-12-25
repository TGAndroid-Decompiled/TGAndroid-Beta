package org.telegram.tgnet;

import java.util.ArrayList;
import org.telegram.messenger.CharacterCompat;

public abstract class TLRPC$ChatFull extends TLObject {
    public String about;
    public int admins_count;
    public boolean antispam;
    public int available_min_id;
    public TLRPC$ChatReactions available_reactions;
    public int banned_count;
    public boolean blocked;
    public TLRPC$TL_inputGroupCall call;
    public int call_msg_id;
    public boolean can_delete_channel;
    public boolean can_set_location;
    public boolean can_set_stickers;
    public boolean can_set_username;
    public boolean can_view_participants;
    public boolean can_view_stats;
    public TLRPC$Photo chat_photo;
    public TLRPC$Peer default_send_as;
    public TLRPC$TL_chatInviteExported exported_invite;
    public int flags;
    public int flags2;
    public int folder_id;
    public TLRPC$Peer groupcall_default_join_as;
    public boolean has_scheduled;
    public boolean hidden_prehistory;
    public long f858id;
    public long inviterId;
    public int invitesCount;
    public int kicked_count;
    public long linked_chat_id;
    public TLRPC$ChannelLocation location;
    public long migrated_from_chat_id;
    public int migrated_from_max_id;
    public TLRPC$PeerNotifySettings notify_settings;
    public int online_count;
    public TLRPC$ChatParticipants participants;
    public int participants_count;
    public boolean participants_hidden;
    public int pinned_msg_id;
    public int pts;
    public int read_inbox_max_id;
    public int read_outbox_max_id;
    public int requests_pending;
    public int slowmode_next_send_date;
    public int slowmode_seconds;
    public int stats_dc;
    public TLRPC$StickerSet stickerset;
    public String theme_emoticon;
    public int ttl_period;
    public int unread_count;
    public int unread_important_count;
    public ArrayList<TLRPC$BotInfo> bot_info = new ArrayList<>();
    public ArrayList<String> pending_suggestions = new ArrayList<>();
    public ArrayList<Long> recent_requesters = new ArrayList<>();
    public ArrayList<String> available_reactions_legacy = new ArrayList<>();

    public static TLRPC$ChatFull TLdeserialize(AbstractSerializedData abstractSerializedData, int i, boolean z) {
        TLRPC$ChatFull tLRPC$ChatFull;
        switch (i) {
            case -1977734781:
                tLRPC$ChatFull = new TLRPC$TL_chatFull() {
                    public static int constructor = -1977734781;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.has_scheduled = (readInt32 & 256) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        int i3 = this.has_scheduled ? i2 | 256 : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -1781833897:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = -1781833897;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                    }
                };
                break;
            case -1749097118:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = -1749097118;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.unread_important_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        abstractSerializedData2.writeInt32(this.unread_important_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                    }
                };
                break;
            case -1736252138:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = -1736252138;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_view_stats = (readInt32 & 4096) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_view_stats ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        abstractSerializedData2.writeInt32(i6);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i7 = 0; i7 < size; i7++) {
                            this.bot_info.get(i7).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32((int) this.linked_chat_id);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                    }
                };
                break;
            case -1640751649:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = -1640751649;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.unread_important_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        abstractSerializedData2.writeInt32(this.unread_important_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i3 = 0; i3 < size; i3++) {
                            this.bot_info.get(i3).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                    }
                };
                break;
            case -1009430225:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = -1009430225;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i4 = 0; i4 < size; i4++) {
                            this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                    }
                };
                break;
            case -908914376:
                tLRPC$ChatFull = new TLRPC$TL_chatFull();
                break;
            case -877254512:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = -877254512;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.call_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            this.bot_info.get(i6).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.call_msg_id);
                        }
                    }
                };
                break;
            case -779165146:
                tLRPC$ChatFull = new TLRPC$ChatFull() {
                    public static int constructor = -779165146;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.has_scheduled = (readInt32 & 256) != 0;
                        this.f858id = abstractSerializedData2.readInt64(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.requests_pending = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.recent_requesters.add(Long.valueOf(abstractSerializedData2.readInt64(z2)));
                            }
                        }
                        if ((this.flags & 262144) != 0) {
                            int readInt326 = abstractSerializedData2.readInt32(z2);
                            if (readInt326 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
                                }
                                return;
                            }
                            int readInt327 = abstractSerializedData2.readInt32(z2);
                            for (int i4 = 0; i4 < readInt327; i4++) {
                                this.available_reactions_legacy.add(abstractSerializedData2.readString(z2));
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        int i3 = this.has_scheduled ? i2 | 256 : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt64(this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.requests_pending);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.recent_requesters.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i5 = 0; i5 < size2; i5++) {
                                abstractSerializedData2.writeInt64(this.recent_requesters.get(i5).longValue());
                            }
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size3 = this.available_reactions_legacy.size();
                            abstractSerializedData2.writeInt32(size3);
                            for (int i6 = 0; i6 < size3; i6++) {
                                abstractSerializedData2.writeString(this.available_reactions_legacy.get(i6));
                            }
                        }
                    }
                };
                break;
            case -516145888:
                tLRPC$ChatFull = new TLRPC$ChatFull() {
                    public static int constructor = -516145888;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt64(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.pending_suggestions.add(abstractSerializedData2.readString(z2));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 268435456) != 0) {
                            this.requests_pending = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 268435456) != 0) {
                            int readInt326 = abstractSerializedData2.readInt32(z2);
                            if (readInt326 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
                                }
                                return;
                            }
                            int readInt327 = abstractSerializedData2.readInt32(z2);
                            for (int i4 = 0; i4 < readInt327; i4++) {
                                this.recent_requesters.add(Long.valueOf(abstractSerializedData2.readInt64(z2)));
                            }
                        }
                        if ((this.flags & 536870912) != 0) {
                            this.default_send_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            int readInt328 = abstractSerializedData2.readInt32(z2);
                            if (readInt328 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt328)));
                                }
                                return;
                            }
                            int readInt329 = abstractSerializedData2.readInt32(z2);
                            for (int i5 = 0; i5 < readInt329; i5++) {
                                this.available_reactions_legacy.add(abstractSerializedData2.readString(z2));
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt64(this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt64(this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt64(this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.pending_suggestions.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                abstractSerializedData2.writeString(this.pending_suggestions.get(i11));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 268435456) != 0) {
                            abstractSerializedData2.writeInt32(this.requests_pending);
                        }
                        if ((this.flags & 268435456) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size3 = this.recent_requesters.size();
                            abstractSerializedData2.writeInt32(size3);
                            for (int i12 = 0; i12 < size3; i12++) {
                                abstractSerializedData2.writeInt64(this.recent_requesters.get(i12).longValue());
                            }
                        }
                        if ((this.flags & 536870912) != 0) {
                            this.default_send_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size4 = this.available_reactions_legacy.size();
                            abstractSerializedData2.writeInt32(size4);
                            for (int i13 = 0; i13 < size4; i13++) {
                                abstractSerializedData2.writeString(this.available_reactions_legacy.get(i13));
                            }
                        }
                    }
                };
                break;
            case -374179305:
                tLRPC$ChatFull = new TLRPC$ChatFull() {
                    public static int constructor = -374179305;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt64(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.pending_suggestions.add(abstractSerializedData2.readString(z2));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt64(this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt64(this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt64(this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.pending_suggestions.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                abstractSerializedData2.writeString(this.pending_suggestions.get(i11));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                    }
                };
                break;
            case -362240487:
                tLRPC$ChatFull = new TLRPC$ChatFull() {
                    public static int constructor = -362240487;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        this.flags2 = readInt322;
                        this.can_delete_channel = (readInt322 & 1) != 0;
                        this.f858id = abstractSerializedData2.readInt64(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        if (readInt323 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt323)));
                            }
                            return;
                        }
                        int readInt324 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt324; i2++) {
                            TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            if (readInt325 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt325)));
                                }
                                return;
                            }
                            int readInt326 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt326; i3++) {
                                this.pending_suggestions.add(abstractSerializedData2.readString(z2));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 268435456) != 0) {
                            this.requests_pending = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 268435456) != 0) {
                            int readInt327 = abstractSerializedData2.readInt32(z2);
                            if (readInt327 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt327)));
                                }
                                return;
                            }
                            int readInt328 = abstractSerializedData2.readInt32(z2);
                            for (int i4 = 0; i4 < readInt328; i4++) {
                                this.recent_requesters.add(Long.valueOf(abstractSerializedData2.readInt64(z2)));
                            }
                        }
                        if ((this.flags & 536870912) != 0) {
                            this.default_send_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            int readInt329 = abstractSerializedData2.readInt32(z2);
                            if (readInt329 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt329)));
                                }
                                return;
                            }
                            int readInt3210 = abstractSerializedData2.readInt32(z2);
                            for (int i5 = 0; i5 < readInt3210; i5++) {
                                this.available_reactions_legacy.add(abstractSerializedData2.readString(z2));
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        int i10 = this.can_delete_channel ? this.flags2 | 1 : this.flags2 & (-2);
                        this.flags2 = i10;
                        abstractSerializedData2.writeInt32(i10);
                        abstractSerializedData2.writeInt64(this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i11 = 0; i11 < size; i11++) {
                            this.bot_info.get(i11).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt64(this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt64(this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.pending_suggestions.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i12 = 0; i12 < size2; i12++) {
                                abstractSerializedData2.writeString(this.pending_suggestions.get(i12));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 268435456) != 0) {
                            abstractSerializedData2.writeInt32(this.requests_pending);
                        }
                        if ((this.flags & 268435456) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size3 = this.recent_requesters.size();
                            abstractSerializedData2.writeInt32(size3);
                            for (int i13 = 0; i13 < size3; i13++) {
                                abstractSerializedData2.writeInt64(this.recent_requesters.get(i13).longValue());
                            }
                        }
                        if ((this.flags & 536870912) != 0) {
                            this.default_send_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 1073741824) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size4 = this.available_reactions_legacy.size();
                            abstractSerializedData2.writeInt32(size4);
                            for (int i14 = 0; i14 < size4; i14++) {
                                abstractSerializedData2.writeString(this.available_reactions_legacy.get(i14));
                            }
                        }
                    }
                };
                break;
            case -304961647:
                tLRPC$ChatFull = new TLRPC$TL_chatFull() {
                    public static int constructor = -304961647;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.flags = abstractSerializedData2.readInt32(z2);
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt32 = abstractSerializedData2.readInt32(z2);
                            if (readInt32 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                                }
                                return;
                            }
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt322; i2++) {
                                TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32(this.flags);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i2 = 0; i2 < size; i2++) {
                                this.bot_info.get(i2).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                    }
                };
                break;
            case -281384243:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = -281384243;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        TLRPC$TL_chatInviteExported tLRPC$TL_chatInviteExported = this.exported_invite;
                        if (tLRPC$TL_chatInviteExported != null) {
                            tLRPC$TL_chatInviteExported.serializeToStream(abstractSerializedData2);
                        } else {
                            new TLRPC$TL_chatInviteEmpty_layer122().serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32((int) this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -261341160:
                tLRPC$ChatFull = new TLRPC$TL_chatFull() {
                    public static int constructor = -261341160;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.has_scheduled = (readInt32 & 256) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        int i3 = this.has_scheduled ? i2 | 256 : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                    }
                };
                break;
            case -253335766:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = -253335766;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32((int) this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                    }
                };
                break;
            case -231385849:
                tLRPC$ChatFull = new TLRPC$TL_channelFull();
                break;
            case -213431562:
                tLRPC$ChatFull = new TLRPC$TL_chatFull() {
                    public static int constructor = -213431562;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.has_scheduled = (readInt32 & 256) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        int i3 = this.has_scheduled ? i2 | 256 : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case -88925533:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = -88925533;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.unread_important_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        abstractSerializedData2.writeInt32(this.unread_important_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                    }
                };
                break;
            case 56920439:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = 56920439;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_view_stats = (readInt32 & 4096) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_view_stats ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        abstractSerializedData2.writeInt32(i6);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i7 = 0; i7 < size; i7++) {
                            this.bot_info.get(i7).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                    }
                };
                break;
            case 231260545:
                tLRPC$ChatFull = new TLRPC$TL_chatFull() {
                    public static int constructor = 231260545;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.has_scheduled = (readInt32 & 256) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        int i3 = this.has_scheduled ? i2 | 256 : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 277964371:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = 277964371;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_view_stats = (readInt32 & 4096) != 0;
                        this.can_set_location = (readInt32 & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_view_stats ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.can_set_location ? i6 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i6 & (-65537);
                        this.flags = i7;
                        abstractSerializedData2.writeInt32(i7);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i8 = 0; i8 < size; i8++) {
                            this.bot_info.get(i8).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32((int) this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                    }
                };
                break;
            case 401891279:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = 401891279;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        abstractSerializedData2.writeInt32(i4);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i5 = 0; i5 < size; i5++) {
                            this.bot_info.get(i5).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 461151667:
                tLRPC$ChatFull = new TLRPC$TL_chatFull() {
                    public static int constructor = 461151667;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.has_scheduled = (readInt32 & 256) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        int i3 = this.has_scheduled ? i2 | 256 : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                    }
                };
                break;
            case 478652186:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = 478652186;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_view_stats = (readInt32 & 4096) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_view_stats ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        abstractSerializedData2.writeInt32(i6);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i7 = 0; i7 < size; i7++) {
                            this.bot_info.get(i7).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                    }
                };
                break;
            case 581055962:
                tLRPC$ChatFull = new TLRPC$TL_chatFull() {
                    public static int constructor = 581055962;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize2 == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        abstractSerializedData2.writeInt32(i2);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i3 = 0; i3 < size; i3++) {
                                this.bot_info.get(i3).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                    }
                };
                break;
            case 625524791:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = 625524791;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.pending_suggestions.add(abstractSerializedData2.readString(z2));
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32((int) this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.pending_suggestions.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                abstractSerializedData2.writeString(this.pending_suggestions.get(i11));
                            }
                        }
                    }
                };
                break;
            case 763976820:
                tLRPC$ChatFull = new TLRPC$ChatFull() {
                    public static int constructor = 763976820;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_view_stats = (readInt32 & 4096) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (readInt32 & 524288) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_view_stats ? i5 | 4096 : i5 & (-4097);
                        this.flags = i6;
                        int i7 = this.can_set_location ? i6 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i6 & (-65537);
                        this.flags = i7;
                        int i8 = this.has_scheduled ? i7 | 524288 : i7 & (-524289);
                        this.flags = i8;
                        abstractSerializedData2.writeInt32(i8);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i9 = 0; i9 < size; i9++) {
                            this.bot_info.get(i9).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32((int) this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                    }
                };
                break;
            case 771925524:
                tLRPC$ChatFull = new TLRPC$TL_chatFull() {
                    public static int constructor = 771925524;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        if (readInt32 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt32)));
                            }
                            return;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt322; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        this.participants.serializeToStream(abstractSerializedData2);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i2 = 0; i2 < size; i2++) {
                            this.bot_info.get(i2).serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 793980732:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = 793980732;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.pending_suggestions.add(abstractSerializedData2.readString(z2));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32((int) this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.pending_suggestions.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                abstractSerializedData2.writeString(this.pending_suggestions.get(i11));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                    }
                };
                break;
            case 1185349556:
                tLRPC$ChatFull = new TLRPC$ChatFull() {
                    public static int constructor = 1185349556;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.has_scheduled = (readInt32 & 256) != 0;
                        this.f858id = abstractSerializedData2.readInt64(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.requests_pending = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.recent_requesters.add(Long.valueOf(abstractSerializedData2.readInt64(z2)));
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        int i3 = this.has_scheduled ? i2 | 256 : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt64(this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.requests_pending);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.recent_requesters.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i5 = 0; i5 < size2; i5++) {
                                abstractSerializedData2.writeInt64(this.recent_requesters.get(i5).longValue());
                            }
                        }
                    }
                };
                break;
            case 1235264985:
                tLRPC$ChatFull = new TLRPC$TL_chatFull() {
                    public static int constructor = 1235264985;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.has_scheduled = (readInt32 & 256) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        int i3 = this.has_scheduled ? i2 | 256 : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                    }
                };
                break;
            case 1304281241:
                tLRPC$ChatFull = new TLRPC$ChatFull() {
                    public static int constructor = 1304281241;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_set_username = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.has_scheduled = (readInt32 & 256) != 0;
                        this.f858id = abstractSerializedData2.readInt64(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        this.participants = TLRPC$ChatParticipants.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 8) != 0) {
                            int readInt322 = abstractSerializedData2.readInt32(z2);
                            if (readInt322 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                                }
                                return;
                            }
                            int readInt323 = abstractSerializedData2.readInt32(z2);
                            for (int i2 = 0; i2 < readInt323; i2++) {
                                TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                                if (TLdeserialize == null) {
                                    return;
                                }
                                this.bot_info.add(TLdeserialize);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_set_username ? this.flags | ConnectionsManager.RequestFlagNeedQuickAck : this.flags & (-129);
                        this.flags = i2;
                        int i3 = this.has_scheduled ? i2 | 256 : i2 & (-257);
                        this.flags = i3;
                        abstractSerializedData2.writeInt32(i3);
                        abstractSerializedData2.writeInt64(this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        this.participants.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 4) != 0) {
                            this.chat_photo.serializeToStream(abstractSerializedData2);
                        }
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8192) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 8) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size = this.bot_info.size();
                            abstractSerializedData2.writeInt32(size);
                            for (int i4 = 0; i4 < size; i4++) {
                                this.bot_info.get(i4).serializeToStream(abstractSerializedData2);
                            }
                        }
                        if ((this.flags & 64) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                    }
                };
                break;
            case 1418477459:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = 1418477459;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt64(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.pending_suggestions.add(abstractSerializedData2.readString(z2));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt64(this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt64(this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt64(this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.pending_suggestions.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                abstractSerializedData2.writeString(this.pending_suggestions.get(i11));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1449537070:
                tLRPC$ChatFull = new TLRPC$ChatFull() {
                    public static int constructor = 1449537070;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt64(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.pending_suggestions.add(abstractSerializedData2.readString(z2));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 268435456) != 0) {
                            this.requests_pending = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 268435456) != 0) {
                            int readInt326 = abstractSerializedData2.readInt32(z2);
                            if (readInt326 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
                                }
                                return;
                            }
                            int readInt327 = abstractSerializedData2.readInt32(z2);
                            for (int i4 = 0; i4 < readInt327; i4++) {
                                this.recent_requesters.add(Long.valueOf(abstractSerializedData2.readInt64(z2)));
                            }
                        }
                        if ((this.flags & 536870912) != 0) {
                            this.default_send_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt64(this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt64(this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt64(this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.pending_suggestions.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                abstractSerializedData2.writeString(this.pending_suggestions.get(i11));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 268435456) != 0) {
                            abstractSerializedData2.writeInt32(this.requests_pending);
                        }
                        if ((this.flags & 268435456) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size3 = this.recent_requesters.size();
                            abstractSerializedData2.writeInt32(size3);
                            for (int i12 = 0; i12 < size3; i12++) {
                                abstractSerializedData2.writeInt64(this.recent_requesters.get(i12).longValue());
                            }
                        }
                        if ((this.flags & 536870912) != 0) {
                            this.default_send_as.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            case 1506802019:
                tLRPC$ChatFull = new TLRPC$ChatFull() {
                    public static int constructor = 1506802019;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt64(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt64(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            this.ttl_period = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            int readInt324 = abstractSerializedData2.readInt32(z2);
                            if (readInt324 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt324)));
                                }
                                return;
                            }
                            int readInt325 = abstractSerializedData2.readInt32(z2);
                            for (int i3 = 0; i3 < readInt325; i3++) {
                                this.pending_suggestions.add(abstractSerializedData2.readString(z2));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as = TLRPC$Peer.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            this.theme_emoticon = abstractSerializedData2.readString(z2);
                        }
                        if ((this.flags & 268435456) != 0) {
                            this.requests_pending = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 268435456) != 0) {
                            int readInt326 = abstractSerializedData2.readInt32(z2);
                            if (readInt326 != 481674261) {
                                if (z2) {
                                    throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt326)));
                                }
                                return;
                            }
                            int readInt327 = abstractSerializedData2.readInt32(z2);
                            for (int i4 = 0; i4 < readInt327; i4++) {
                                this.recent_requesters.add(Long.valueOf(abstractSerializedData2.readInt64(z2)));
                            }
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt64(this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt64(this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt64(this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & ConnectionsManager.FileTypePhoto) != 0) {
                            abstractSerializedData2.writeInt32(this.ttl_period);
                        }
                        if ((this.flags & ConnectionsManager.FileTypeVideo) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size2 = this.pending_suggestions.size();
                            abstractSerializedData2.writeInt32(size2);
                            for (int i11 = 0; i11 < size2; i11++) {
                                abstractSerializedData2.writeString(this.pending_suggestions.get(i11));
                            }
                        }
                        if ((this.flags & ConnectionsManager.FileTypeFile) != 0) {
                            this.groupcall_default_join_as.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 134217728) != 0) {
                            abstractSerializedData2.writeString(this.theme_emoticon);
                        }
                        if ((this.flags & 268435456) != 0) {
                            abstractSerializedData2.writeInt32(this.requests_pending);
                        }
                        if ((this.flags & 268435456) != 0) {
                            abstractSerializedData2.writeInt32(481674261);
                            int size3 = this.recent_requesters.size();
                            abstractSerializedData2.writeInt32(size3);
                            for (int i12 = 0; i12 < size3; i12++) {
                                abstractSerializedData2.writeInt64(this.recent_requesters.get(i12).longValue());
                            }
                        }
                    }
                };
                break;
            case 1991201921:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = 1991201921;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        TLRPC$TL_chatInviteExported TLdeserialize = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if (TLdeserialize instanceof TLRPC$TL_chatInviteExported) {
                            this.exported_invite = TLdeserialize;
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize2 = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize2 == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        abstractSerializedData2.writeInt32(i5);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        this.exported_invite.serializeToStream(abstractSerializedData2);
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i6 = 0; i6 < size; i6++) {
                            this.bot_info.get(i6).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                    }
                };
                break;
            case 2055070967:
                tLRPC$ChatFull = new TLRPC$TL_channelFull() {
                    public static int constructor = 2055070967;

                    @Override
                    public void readParams(AbstractSerializedData abstractSerializedData2, boolean z2) {
                        int readInt32 = abstractSerializedData2.readInt32(z2);
                        this.flags = readInt32;
                        this.can_view_participants = (readInt32 & 8) != 0;
                        this.can_set_username = (readInt32 & 64) != 0;
                        this.can_set_stickers = (readInt32 & ConnectionsManager.RequestFlagNeedQuickAck) != 0;
                        this.hidden_prehistory = (readInt32 & ConnectionsManager.RequestFlagDoNotWaitFloodWait) != 0;
                        this.can_set_location = (65536 & readInt32) != 0;
                        this.has_scheduled = (524288 & readInt32) != 0;
                        this.can_view_stats = (1048576 & readInt32) != 0;
                        this.blocked = (readInt32 & 4194304) != 0;
                        this.f858id = abstractSerializedData2.readInt32(z2);
                        this.about = abstractSerializedData2.readString(z2);
                        if ((this.flags & 1) != 0) {
                            this.participants_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2) != 0) {
                            this.admins_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.kicked_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4) != 0) {
                            this.banned_count = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 8192) != 0) {
                            this.online_count = abstractSerializedData2.readInt32(z2);
                        }
                        this.read_inbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.read_outbox_max_id = abstractSerializedData2.readInt32(z2);
                        this.unread_count = abstractSerializedData2.readInt32(z2);
                        this.chat_photo = TLRPC$Photo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        this.notify_settings = TLRPC$PeerNotifySettings.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite = TLRPC$ExportedChatInvite.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        int readInt322 = abstractSerializedData2.readInt32(z2);
                        if (readInt322 != 481674261) {
                            if (z2) {
                                throw new RuntimeException(String.format("wrong Vector magic, got %x", Integer.valueOf(readInt322)));
                            }
                            return;
                        }
                        int readInt323 = abstractSerializedData2.readInt32(z2);
                        for (int i2 = 0; i2 < readInt323; i2++) {
                            TLRPC$BotInfo TLdeserialize = TLRPC$BotInfo.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                            if (TLdeserialize == null) {
                                return;
                            }
                            this.bot_info.add(TLdeserialize);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16) != 0) {
                            this.migrated_from_max_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32) != 0) {
                            this.pinned_msg_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset = TLRPC$StickerSet.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 512) != 0) {
                            this.available_min_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 2048) != 0) {
                            this.folder_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 16384) != 0) {
                            this.linked_chat_id = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location = TLRPC$ChannelLocation.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                        if ((this.flags & 131072) != 0) {
                            this.slowmode_seconds = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 262144) != 0) {
                            this.slowmode_next_send_date = abstractSerializedData2.readInt32(z2);
                        }
                        if ((this.flags & 4096) != 0) {
                            this.stats_dc = abstractSerializedData2.readInt32(z2);
                        }
                        this.pts = abstractSerializedData2.readInt32(z2);
                        if ((this.flags & 2097152) != 0) {
                            this.call = TLRPC$TL_inputGroupCall.TLdeserialize(abstractSerializedData2, abstractSerializedData2.readInt32(z2), z2);
                        }
                    }

                    @Override
                    public void serializeToStream(AbstractSerializedData abstractSerializedData2) {
                        abstractSerializedData2.writeInt32(constructor);
                        int i2 = this.can_view_participants ? this.flags | 8 : this.flags & (-9);
                        this.flags = i2;
                        int i3 = this.can_set_username ? i2 | 64 : i2 & (-65);
                        this.flags = i3;
                        int i4 = this.can_set_stickers ? i3 | ConnectionsManager.RequestFlagNeedQuickAck : i3 & (-129);
                        this.flags = i4;
                        int i5 = this.hidden_prehistory ? i4 | ConnectionsManager.RequestFlagDoNotWaitFloodWait : i4 & (-1025);
                        this.flags = i5;
                        int i6 = this.can_set_location ? i5 | CharacterCompat.MIN_SUPPLEMENTARY_CODE_POINT : i5 & (-65537);
                        this.flags = i6;
                        int i7 = this.has_scheduled ? i6 | 524288 : i6 & (-524289);
                        this.flags = i7;
                        int i8 = this.can_view_stats ? i7 | 1048576 : i7 & (-1048577);
                        this.flags = i8;
                        int i9 = this.blocked ? i8 | 4194304 : i8 & (-4194305);
                        this.flags = i9;
                        abstractSerializedData2.writeInt32(i9);
                        abstractSerializedData2.writeInt32((int) this.f858id);
                        abstractSerializedData2.writeString(this.about);
                        if ((this.flags & 1) != 0) {
                            abstractSerializedData2.writeInt32(this.participants_count);
                        }
                        if ((this.flags & 2) != 0) {
                            abstractSerializedData2.writeInt32(this.admins_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.kicked_count);
                        }
                        if ((this.flags & 4) != 0) {
                            abstractSerializedData2.writeInt32(this.banned_count);
                        }
                        if ((this.flags & 8192) != 0) {
                            abstractSerializedData2.writeInt32(this.online_count);
                        }
                        abstractSerializedData2.writeInt32(this.read_inbox_max_id);
                        abstractSerializedData2.writeInt32(this.read_outbox_max_id);
                        abstractSerializedData2.writeInt32(this.unread_count);
                        this.chat_photo.serializeToStream(abstractSerializedData2);
                        this.notify_settings.serializeToStream(abstractSerializedData2);
                        if ((this.flags & 8388608) != 0) {
                            this.exported_invite.serializeToStream(abstractSerializedData2);
                        }
                        abstractSerializedData2.writeInt32(481674261);
                        int size = this.bot_info.size();
                        abstractSerializedData2.writeInt32(size);
                        for (int i10 = 0; i10 < size; i10++) {
                            this.bot_info.get(i10).serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32((int) this.migrated_from_chat_id);
                        }
                        if ((this.flags & 16) != 0) {
                            abstractSerializedData2.writeInt32(this.migrated_from_max_id);
                        }
                        if ((this.flags & 32) != 0) {
                            abstractSerializedData2.writeInt32(this.pinned_msg_id);
                        }
                        if ((this.flags & 256) != 0) {
                            this.stickerset.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 512) != 0) {
                            abstractSerializedData2.writeInt32(this.available_min_id);
                        }
                        if ((this.flags & 2048) != 0) {
                            abstractSerializedData2.writeInt32(this.folder_id);
                        }
                        if ((this.flags & 16384) != 0) {
                            abstractSerializedData2.writeInt32((int) this.linked_chat_id);
                        }
                        if ((this.flags & 32768) != 0) {
                            this.location.serializeToStream(abstractSerializedData2);
                        }
                        if ((this.flags & 131072) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_seconds);
                        }
                        if ((this.flags & 262144) != 0) {
                            abstractSerializedData2.writeInt32(this.slowmode_next_send_date);
                        }
                        if ((this.flags & 4096) != 0) {
                            abstractSerializedData2.writeInt32(this.stats_dc);
                        }
                        abstractSerializedData2.writeInt32(this.pts);
                        if ((this.flags & 2097152) != 0) {
                            this.call.serializeToStream(abstractSerializedData2);
                        }
                    }
                };
                break;
            default:
                tLRPC$ChatFull = null;
                break;
        }
        if (tLRPC$ChatFull == null && z) {
            throw new RuntimeException(String.format("can't parse magic %x in ChatFull", Integer.valueOf(i)));
        }
        if (tLRPC$ChatFull != null) {
            tLRPC$ChatFull.readParams(abstractSerializedData, z);
            if (tLRPC$ChatFull.available_reactions == null) {
                if (!tLRPC$ChatFull.available_reactions_legacy.isEmpty()) {
                    TLRPC$TL_chatReactionsSome tLRPC$TL_chatReactionsSome = new TLRPC$TL_chatReactionsSome();
                    for (int i2 = 0; i2 < tLRPC$ChatFull.available_reactions_legacy.size(); i2++) {
                        TLRPC$TL_reactionEmoji tLRPC$TL_reactionEmoji = new TLRPC$TL_reactionEmoji();
                        tLRPC$TL_reactionEmoji.emoticon = tLRPC$ChatFull.available_reactions_legacy.get(i2);
                        tLRPC$TL_chatReactionsSome.reactions.add(tLRPC$TL_reactionEmoji);
                    }
                    tLRPC$ChatFull.available_reactions = tLRPC$TL_chatReactionsSome;
                } else {
                    tLRPC$ChatFull.available_reactions = new TLRPC$TL_chatReactionsNone();
                }
            }
        }
        return tLRPC$ChatFull;
    }
}
