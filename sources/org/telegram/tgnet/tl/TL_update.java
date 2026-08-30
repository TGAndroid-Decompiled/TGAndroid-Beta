package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.l;
import org.telegram.tgnet.o;
import org.telegram.tgnet.q;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.u;
public class TL_update {

    public static class TL_updateAiComposeTones extends TLRPC.Update {
        public static final int constructor = -1945136645;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1945136645);
        }
    }

    public static class TL_updateAttachMenuBots extends TLRPC.Update {
        public static final int constructor = 397910539;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(397910539);
        }
    }

    public static class TL_updateBotCommands extends TLRPC.Update {
        public static final int constructor = 1299263278;
        public long bot_id;
        public ArrayList<TLRPC.BotCommand> commands = new ArrayList<>();
        public TLRPC.Peer peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.bot_id = inputSerializedData.readInt64(z4);
            this.commands = Vector.deserialize(inputSerializedData, new c(18), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1299263278);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.bot_id);
            Vector.serialize(outputSerializedData, this.commands);
        }
    }

    public static class TL_updateBotPurchasedPaidMedia extends TLRPC.Update {
        public static final int constructor = 675009298;
        public String payload;
        public int qts;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.user_id = inputSerializedData.readInt64(z4);
            this.payload = inputSerializedData.readString(z4);
            this.qts = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(675009298);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeString(this.payload);
            outputSerializedData.writeInt32(this.qts);
        }
    }

    public static class TL_updateBotSubscriptionExpire extends TLRPC.Update {
        public static final int constructor = -1464975695;
        public String payload;
        public int qts;
        public int until_date;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.user_id = inputSerializedData.readInt64(z4);
            this.payload = inputSerializedData.readString(z4);
            this.until_date = inputSerializedData.readInt32(z4);
            this.qts = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1464975695);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeString(this.payload);
            outputSerializedData.writeInt32(this.until_date);
            outputSerializedData.writeInt32(this.qts);
        }
    }

    public static class TL_updateChannel extends TLRPC.Update {
        public static final int constructor = 1666927625;
        public long channel_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1666927625);
            outputSerializedData.writeInt64(this.channel_id);
        }
    }

    public static class TL_updateChannelAvailableMessages extends TLRPC.Update {
        public static final int constructor = -1304443240;
        public int available_min_id;
        public long channel_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.available_min_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1304443240);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.available_min_id);
        }
    }

    public static class TL_updateChannelMessageForwards extends TLRPC.Update {
        public static final int constructor = -761649164;
        public long channel_id;
        public int forwards;
        public int f19434id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.f19434id = inputSerializedData.readInt32(z4);
            this.forwards = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-761649164);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.f19434id);
            outputSerializedData.writeInt32(this.forwards);
        }
    }

    public static class TL_updateChannelMessageViews extends TLRPC.Update {
        public static final int constructor = -232346616;
        public long channel_id;
        public int f19435id;
        public int views;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.f19435id = inputSerializedData.readInt32(z4);
            this.views = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-232346616);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.f19435id);
            outputSerializedData.writeInt32(this.views);
        }
    }

    public static class TL_updateChannelParticipant extends TLRPC.Update {
        public static final int constructor = -1738720581;
        public long actor_id;
        public long channel_id;
        public int date;
        public int flags;
        public TLRPC.ExportedChatInvite invite;
        public TLRPC.ChannelParticipant new_participant;
        public TLRPC.ChannelParticipant prev_participant;
        public int qts;
        public long user_id;
        public boolean via_chatlist;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.channel_id = inputSerializedData.readInt64(z4);
            this.date = inputSerializedData.readInt32(z4);
            this.actor_id = inputSerializedData.readInt64(z4);
            this.user_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.prev_participant = TLRPC.ChannelParticipant.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.new_participant = TLRPC.ChannelParticipant.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.invite = TLRPC.ExportedChatInvite.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.via_chatlist = TLObject.hasFlag(this.flags, 8);
            this.qts = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1738720581);
            int flag = TLObject.setFlag(this.flags, 8, this.via_chatlist);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.actor_id);
            outputSerializedData.writeInt64(this.user_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.prev_participant.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.new_participant.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.invite.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.qts);
        }
    }

    public static class TL_updateChannelReadMessagesContents extends TLRPC.Update {
        public static final int constructor = 636691703;
        public long channel_id;
        public int flags;
        public ArrayList<Integer> messages = new ArrayList<>();
        public TLRPC.Peer saved_peer_id;
        public int top_msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.channel_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.messages = Vector.deserializeInt(inputSerializedData, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(636691703);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.channel_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            Vector.serializeInt(outputSerializedData, this.messages);
        }
    }

    public static class TL_updateChannelTooLong extends TLRPC.Update {
        public static final int constructor = 277713951;
        public long channel_id;
        public int flags;
        public int pts;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.channel_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.pts = inputSerializedData.readInt32(z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(277713951);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.channel_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.pts);
            }
        }
    }

    public static class TL_updateChannelUserTyping extends TLRPC.Update {
        public static final int constructor = -1937192669;
        public TLRPC.SendMessageAction action;
        public long channel_id;
        public int flags;
        public TLRPC.Peer from_id;
        public int top_msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.channel_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.action = TLRPC.SendMessageAction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1937192669);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.channel_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            this.from_id.serializeToStream(outputSerializedData);
            this.action.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateChannelViewForumAsMessages extends TLRPC.Update {
        public static final int constructor = 129403168;
        public long channel_id;
        public boolean enabled;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.enabled = inputSerializedData.readBool(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(129403168);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeBool(this.enabled);
        }
    }

    public static class TL_updateChannelWebPage extends TLRPC.Update {
        public static final int constructor = 791390623;
        public long channel_id;
        public int pts;
        public int pts_count;
        public TLRPC.WebPage webpage;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.webpage = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(791390623);
            outputSerializedData.writeInt64(this.channel_id);
            this.webpage.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateChat extends TLRPC.Update {
        public static final int constructor = -124097970;
        public long chat_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.chat_id = inputSerializedData.readInt64(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-124097970);
            outputSerializedData.writeInt64(this.chat_id);
        }
    }

    public static class TL_updateChatDefaultBannedRights extends TLRPC.Update {
        public static final int constructor = 1421875280;
        public TLRPC.TL_chatBannedRights default_banned_rights;
        public TLRPC.Peer peer;
        public int version;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.default_banned_rights = TLRPC.TL_chatBannedRights.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.version = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1421875280);
            this.peer.serializeToStream(outputSerializedData);
            this.default_banned_rights.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.version);
        }
    }

    public static class TL_updateChatParticipantAdd extends TLRPC.Update {
        public static final int constructor = 1037718609;
        public long chat_id;
        public int date;
        public long inviter_id;
        public long user_id;
        public int version;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.chat_id = inputSerializedData.readInt64(z4);
            this.user_id = inputSerializedData.readInt64(z4);
            this.inviter_id = inputSerializedData.readInt64(z4);
            this.date = inputSerializedData.readInt32(z4);
            this.version = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1037718609);
            outputSerializedData.writeInt64(this.chat_id);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeInt64(this.inviter_id);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt32(this.version);
        }
    }

    public static class TL_updateChatParticipantAdmin extends TLRPC.Update {
        public static final int constructor = -674602590;
        public long chat_id;
        public boolean is_admin;
        public long user_id;
        public int version;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.chat_id = inputSerializedData.readInt64(z4);
            this.user_id = inputSerializedData.readInt64(z4);
            this.is_admin = inputSerializedData.readBool(z4);
            this.version = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-674602590);
            outputSerializedData.writeInt64(this.chat_id);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeBool(this.is_admin);
            outputSerializedData.writeInt32(this.version);
        }
    }

    public static class TL_updateChatParticipantDelete extends TLRPC.Update {
        public static final int constructor = -483443337;
        public long chat_id;
        public long user_id;
        public int version;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.chat_id = inputSerializedData.readInt64(z4);
            this.user_id = inputSerializedData.readInt64(z4);
            this.version = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-483443337);
            outputSerializedData.writeInt64(this.chat_id);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeInt32(this.version);
        }
    }

    public static class TL_updateChatParticipantRank extends TLRPC.Update {
        public static final int constructor = -1115461703;
        public long chat_id;
        public String rank;
        public long user_id;
        public int version;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.chat_id = inputSerializedData.readInt64(z4);
            this.user_id = inputSerializedData.readInt64(z4);
            this.rank = inputSerializedData.readString(z4);
            this.version = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1115461703);
            outputSerializedData.writeInt64(this.chat_id);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeString(this.rank);
            outputSerializedData.writeInt32(this.version);
        }
    }

    public static class TL_updateChatParticipants extends TLRPC.Update {
        public static final int constructor = 125178264;
        public TLRPC.ChatParticipants participants;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.participants = TLRPC.ChatParticipants.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(125178264);
            this.participants.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateChatUserTyping extends TLRPC.Update {
        public static final int constructor = -2092401936;
        public TLRPC.SendMessageAction action;
        public long chat_id;
        public TLRPC.Peer from_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.chat_id = inputSerializedData.readInt64(z4);
            this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.action = TLRPC.SendMessageAction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2092401936);
            outputSerializedData.writeInt64(this.chat_id);
            this.from_id.serializeToStream(outputSerializedData);
            this.action.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateConfig extends TLRPC.Update {
        public static final int constructor = -1574314746;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1574314746);
        }
    }

    public static class TL_updateContactsReset extends TLRPC.Update {
        public static final int constructor = 1887741886;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1887741886);
        }
    }

    public static class TL_updateDcOptions extends TLRPC.Update {
        public static final int constructor = -1906403213;
        public ArrayList<TLRPC.TL_dcOption> dc_options = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.dc_options = Vector.deserialize(inputSerializedData, new l(18), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1906403213);
            Vector.serialize(outputSerializedData, this.dc_options);
        }
    }

    public static class TL_updateDeleteChannelMessages extends TLRPC.Update {
        public static final int constructor = -1020437742;
        public long channel_id;
        public ArrayList<Integer> messages = new ArrayList<>();
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.messages = Vector.deserializeInt(inputSerializedData, z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1020437742);
            outputSerializedData.writeInt64(this.channel_id);
            Vector.serializeInt(outputSerializedData, this.messages);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateDeleteEphemeralMessages extends TLRPC.Update {
        public static final int constructor = 1457257720;
        public ArrayList<Integer> ids = new ArrayList<>();
        public TLRPC.Peer peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.ids = Vector.deserializeInt(inputSerializedData, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1457257720);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.ids);
        }
    }

    public static class TL_updateDeleteGroupCallMessages extends TLRPC.Update {
        public static final int constructor = 1048963372;
        public TLRPC.InputGroupCall call;
        public ArrayList<Integer> messages = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.call = TLRPC.InputGroupCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.messages = Vector.deserializeInt(inputSerializedData, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1048963372);
            this.call.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.messages);
        }
    }

    public static class TL_updateDeleteMessages extends TLRPC.Update {
        public static final int constructor = -1576161051;
        public ArrayList<Integer> messages = new ArrayList<>();
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.messages = Vector.deserializeInt(inputSerializedData, z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1576161051);
            Vector.serializeInt(outputSerializedData, this.messages);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateDeleteQuickReply extends TLRPC.Update {
        public static final int constructor = 1407644140;
        public int shortcut_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.shortcut_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1407644140);
            outputSerializedData.writeInt32(this.shortcut_id);
        }
    }

    public static class TL_updateDeleteQuickReplyMessages extends TLRPC.Update {
        public static final int constructor = 1450174413;
        public ArrayList<Integer> messages = new ArrayList<>();
        public int shortcut_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.shortcut_id = inputSerializedData.readInt32(z4);
            this.messages = Vector.deserializeInt(inputSerializedData, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1450174413);
            outputSerializedData.writeInt32(this.shortcut_id);
            Vector.serializeInt(outputSerializedData, this.messages);
        }
    }

    public static class TL_updateDeleteScheduledMessages extends TLRPC.Update {
        public static final int constructor = -223929981;
        public int flags;
        public TLRPC.Peer peer;
        public ArrayList<Integer> messages = new ArrayList<>();
        public ArrayList<Integer> sent_messages = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.messages = Vector.deserializeInt(inputSerializedData, z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.sent_messages = Vector.deserializeInt(inputSerializedData, z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-223929981);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.messages);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serializeInt(outputSerializedData, this.sent_messages);
            }
        }
    }

    public static class TL_updateDialogFilter extends TLRPC.Update {
        public static final int constructor = 654302845;
        public TLRPC.DialogFilter filter;
        public int flags;
        public int f19436id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.f19436id = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.filter = TLRPC.DialogFilter.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(654302845);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt32(this.f19436id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.filter.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_updateDialogFilterOrder extends TLRPC.Update {
        public static final int constructor = -1512627963;
        public ArrayList<Integer> order = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.order = Vector.deserializeInt(inputSerializedData, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1512627963);
            Vector.serializeInt(outputSerializedData, this.order);
        }
    }

    public static class TL_updateDialogFilters extends TLRPC.Update {
        public static final int constructor = 889491791;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(889491791);
        }
    }

    public static class TL_updateDialogPinned extends TLRPC.Update {
        public static final int constructor = 1852826908;
        public int flags;
        public int folder_id;
        public TLRPC.DialogPeer peer;
        public boolean pinned;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 1);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.folder_id = inputSerializedData.readInt32(z4);
            }
            this.peer = TLRPC.DialogPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1852826908);
            int flag = TLObject.setFlag(this.flags, 1, this.pinned);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.folder_id);
            }
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateDialogUnreadMark extends TLRPC.Update {
        public static final int constructor = -1235684802;
        public int flags;
        public TLRPC.DialogPeer peer;
        public TLRPC.Peer saved_peer_id;
        public boolean unread;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.unread = TLObject.hasFlag(readInt32, 1);
            this.peer = TLRPC.DialogPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1235684802);
            int flag = TLObject.setFlag(this.flags, 1, this.unread);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_updateDraftMessage extends TLRPC.Update {
        public static final int constructor = -302247650;
        public TLRPC.DraftMessage draft;
        public int flags;
        public TLRPC.Peer peer;
        public TLRPC.Peer saved_peer_id;
        public int top_msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.draft = TLRPC.DraftMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-302247650);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            this.draft.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateEditChannelMessage extends TLRPC.Update {
        public static final int constructor = 457133559;
        public TLRPC.Message message;
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(457133559);
            this.message.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateEditEphemeralMessage extends TLRPC.Update {
        public static final int constructor = 1270583041;
        public TL_ephemeral.EphemeralMessage message;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1270583041);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateEditMessage extends TLRPC.Update {
        public static final int constructor = -469536605;
        public TLRPC.Message message;
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-469536605);
            this.message.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateEmojiGameInfo extends TLRPC.Update {
        public static final int constructor = -73640838;
        public TLRPC.EmojiGameInfo info;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.info = TLRPC.EmojiGameInfo.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-73640838);
            this.info.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateEncryptedChatTyping extends TLRPC.Update {
        public static final int constructor = 386986326;
        public int chat_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.chat_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(386986326);
            outputSerializedData.writeInt32(this.chat_id);
        }
    }

    public static class TL_updateEncryptedMessagesRead extends TLRPC.Update {
        public static final int constructor = 956179895;
        public int chat_id;
        public int date;
        public int max_date;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.chat_id = inputSerializedData.readInt32(z4);
            this.max_date = inputSerializedData.readInt32(z4);
            this.date = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(956179895);
            outputSerializedData.writeInt32(this.chat_id);
            outputSerializedData.writeInt32(this.max_date);
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class TL_updateEncryption extends TLRPC.Update {
        public static final int constructor = -1264392051;
        public TLRPC.EncryptedChat chat;
        public int date;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.chat = TLRPC.EncryptedChat.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.date = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1264392051);
            this.chat.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class TL_updateEphemeralBotCallbackQuery extends TLRPC.Update {
        public static final int constructor = 2081454550;
        public long chat_instance;
        public byte[] data;
        public int flags;
        public TL_ephemeral.EphemeralMessage message;
        public int msg_id;
        public TLRPC.Peer peer;
        public long query_id;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.query_id = inputSerializedData.readInt64(z4);
            this.user_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.msg_id = inputSerializedData.readInt32(z4);
            this.data = inputSerializedData.readByteArray(z4);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.chat_instance = inputSerializedData.readInt64(z4);
            }
            this.message = TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            outputSerializedData.writeInt32(2081454550);
            int i10 = this.flags;
            boolean z10 = false;
            if (this.peer != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z4);
            this.flags = flag;
            if (this.chat_instance != 0) {
                z10 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z10);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.query_id);
            outputSerializedData.writeInt64(this.user_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.peer.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt32(this.msg_id);
            outputSerializedData.writeByteArray(this.data);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt64(this.chat_instance);
            }
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateFavedStickers extends TLRPC.Update {
        public static final int constructor = -451831443;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-451831443);
        }
    }

    public static class TL_updateFolderPeers extends TLRPC.Update {
        public static final int constructor = 422972864;
        public ArrayList<TLRPC.TL_folderPeer> folder_peers = new ArrayList<>();
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.folder_peers = Vector.deserialize(inputSerializedData, new d(15), z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(422972864);
            Vector.serialize(outputSerializedData, this.folder_peers);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateGeoLiveViewed extends TLRPC.Update {
        public static final int constructor = -2027964103;
        public int msg_id;
        public TLRPC.Peer peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.msg_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2027964103);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
        }
    }

    public static class TL_updateGroupCall extends TLRPC.Update {
        public static final int constructor = -1658710304;
        public TLRPC.GroupCall call;
        public int flags;
        public boolean live_story;
        public TLRPC.Peer peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.live_story = TLObject.hasFlag(readInt32, 4);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.call = TLRPC.GroupCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1658710304);
            int flag = TLObject.setFlag(this.flags, 4, this.live_story);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.peer.serializeToStream(outputSerializedData);
            }
            this.call.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateGroupCallChainBlocks extends TLRPC.Update {
        public static final int constructor = -1535694705;
        public ArrayList<byte[]> blocks = new ArrayList<>();
        public TLRPC.InputGroupCall call;
        public int next_offset;
        public int sub_chain_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.call = TLRPC.InputGroupCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.sub_chain_id = inputSerializedData.readInt32(z4);
            this.blocks = Vector.deserializeByteArray(inputSerializedData, z4);
            this.next_offset = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1535694705);
            this.call.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.sub_chain_id);
            Vector.serialize(outputSerializedData, new u(outputSerializedData, 2), this.blocks);
            outputSerializedData.writeInt32(this.next_offset);
        }
    }

    public static class TL_updateGroupCallConnection extends TLRPC.Update {
        public static final int constructor = 192428418;
        public int flags;
        public TLRPC.TL_dataJSON params;
        public boolean presentation;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.presentation = TLObject.hasFlag(readInt32, 1);
            this.params = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(192428418);
            int flag = TLObject.setFlag(this.flags, 1, this.presentation);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.params.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateGroupCallEncryptedMessage extends TLRPC.Update {
        public static final int constructor = -917002394;
        public TLRPC.InputGroupCall call;
        public byte[] encrypted_message;
        public TLRPC.Peer from_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.call = TLRPC.InputGroupCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.from_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.encrypted_message = inputSerializedData.readByteArray(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-917002394);
            this.call.serializeToStream(outputSerializedData);
            this.from_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.encrypted_message);
        }
    }

    public static class TL_updateGroupCallMessage extends TLRPC.Update {
        public static final int constructor = -667783411;
        public TLRPC.InputGroupCall call;
        public TLRPC.GroupCallMessage message;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.call = TLRPC.InputGroupCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.message = TLRPC.GroupCallMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-667783411);
            this.call.serializeToStream(outputSerializedData);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateGroupCallParticipants extends TLRPC.Update {
        public static final int constructor = -219423922;
        public TLRPC.InputGroupCall call;
        public ArrayList<TLRPC.GroupCallParticipant> participants = new ArrayList<>();
        public int version;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.call = TLRPC.InputGroupCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.participants = Vector.deserialize(inputSerializedData, new a(8), z4);
            this.version = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-219423922);
            this.call.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.participants);
            outputSerializedData.writeInt32(this.version);
        }
    }

    public static class TL_updateGroupCall_layer216 extends TL_updateGroupCall {
        public static final int constructor = -1747565759;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.live_story = TLObject.hasFlag(readInt32, 4);
            if (TLObject.hasFlag(this.flags, 1)) {
                long readInt64 = inputSerializedData.readInt64(z4);
                TLRPC.TL_peerChannel tL_peerChannel = new TLRPC.TL_peerChannel();
                this.peer = tL_peerChannel;
                tL_peerChannel.channel_id = -readInt64;
            }
            this.call = TLRPC.GroupCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1747565759);
            int flag = TLObject.setFlag(this.flags, 4, this.live_story);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(-DialogObject.getPeerDialogId(this.peer));
            }
            this.call.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateJoinChatWebViewDecision extends TLRPC.Update {
        public static final int constructor = -1112768912;
        public TLRPC.Peer peer;
        public long query_id;
        public TLRPC.JoinChatBotResult result;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.query_id = inputSerializedData.readInt64(z4);
            this.result = TLRPC.JoinChatBotResult.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1112768912);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.query_id);
            this.result.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateLangPack extends TLRPC.Update {
        public static final int constructor = 1442983757;
        public TLRPC.TL_langPackDifference difference;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.difference = TLRPC.TL_langPackDifference.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1442983757);
            this.difference.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateLangPackTooLong extends TLRPC.Update {
        public static final int constructor = 1180041828;
        public String lang_code;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.lang_code = inputSerializedData.readString(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1180041828);
            outputSerializedData.writeString(this.lang_code);
        }
    }

    public static class TL_updateLoginToken extends TLRPC.Update {
        public static final int constructor = 1448076945;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1448076945);
        }
    }

    public static class TL_updateManagedBot extends TLRPC.Update {
        public static final int constructor = 1216408986;
        public long bot_id;
        public int qts;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.user_id = inputSerializedData.readInt64(z4);
            this.bot_id = inputSerializedData.readInt64(z4);
            this.qts = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1216408986);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeInt64(this.bot_id);
            outputSerializedData.writeInt32(this.qts);
        }
    }

    public static class TL_updateMessageExtendedMedia extends TLRPC.Update {
        public static final int constructor = -710666460;
        public ArrayList<TLRPC.MessageExtendedMedia> extended_media = new ArrayList<>();
        public int msg_id;
        public TLRPC.Peer peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.msg_id = inputSerializedData.readInt32(z4);
            this.extended_media = Vector.deserialize(inputSerializedData, new o(20), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-710666460);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
            Vector.serialize(outputSerializedData, this.extended_media);
        }
    }

    public static class TL_updateMessageID extends TLRPC.Update {
        public static final int constructor = 1318109142;
        public int f19437id;
        public long random_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.f19437id = inputSerializedData.readInt32(z4);
            this.random_id = inputSerializedData.readInt64(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1318109142);
            outputSerializedData.writeInt32(this.f19437id);
            outputSerializedData.writeInt64(this.random_id);
        }
    }

    public static class TL_updateMessagePoll extends TLRPC.Update {
        public static final int constructor = -699641301;
        public int flags;
        public int msg_id;
        public TLRPC.Peer peer;
        public TLRPC.Poll poll;
        public long poll_id;
        public TLRPC.PollResults results;
        public int top_msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 2)) {
                this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
                this.msg_id = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            this.poll_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.poll = TLRPC.Poll.TLdeserialize(inputSerializedData, z4);
            }
            this.results = TLRPC.PollResults.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z4;
            outputSerializedData.writeInt32(-699641301);
            int i10 = this.flags;
            boolean z10 = false;
            if (this.poll != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z4);
            this.flags = flag;
            if (this.peer != null) {
                z10 = true;
            }
            int flag2 = TLObject.setFlag(flag, 2, z10);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.peer.serializeToStream(outputSerializedData);
                outputSerializedData.writeInt32(this.msg_id);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            outputSerializedData.writeInt64(this.poll_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.poll.serializeToStream(outputSerializedData);
            }
            this.results.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateMessagePollVote extends TLRPC.Update {
        public static final int constructor = 1989799956;
        public TLRPC.Peer peer;
        public long poll_id;
        public int qts;
        public ArrayList<byte[]> options = new ArrayList<>();
        public ArrayList<Integer> positions = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.poll_id = inputSerializedData.readInt64(z4);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.options = Vector.deserializeByteArray(inputSerializedData, z4);
            this.positions = Vector.deserializeInt(inputSerializedData, z4);
            this.qts = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1989799956);
            outputSerializedData.writeInt64(this.poll_id);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeByteArray(outputSerializedData, this.options);
            Vector.serializeInt(outputSerializedData, this.positions);
            outputSerializedData.writeInt32(this.qts);
        }
    }

    public static class TL_updateMessageReactions extends TLRPC.Update {
        public static final int constructor = 506035194;
        public int flags;
        public int msg_id;
        public TLRPC.Peer peer;
        public TLRPC.TL_messageReactions reactions;
        public TLRPC.Peer saved_peer_id;
        public int top_msg_id;
        public boolean updateUnreadState = true;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.msg_id = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
            this.reactions = TLRPC.MessageReactions.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(506035194);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.saved_peer_id.serializeToStream(outputSerializedData);
            }
            this.reactions.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateMonoForumNoPaidException extends TLRPC.Update {
        public static final int constructor = -1618924792;
        public long channel_id;
        public boolean exception;
        public int flags;
        public TLRPC.Peer saved_peer_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.exception = TLObject.hasFlag(readInt32, 1);
            this.channel_id = inputSerializedData.readInt64(z4);
            this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1618924792);
            int flag = TLObject.setFlag(this.flags, 1, this.exception);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.channel_id);
            this.saved_peer_id.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateMoveStickerSetToTop extends TLRPC.Update {
        public static final int constructor = -2030252155;
        public boolean emojis;
        public int flags;
        public boolean masks;
        public long stickerset;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.masks = TLObject.hasFlag(readInt32, 1);
            this.emojis = TLObject.hasFlag(this.flags, 2);
            this.stickerset = inputSerializedData.readInt64(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2030252155);
            int flag = TLObject.setFlag(this.flags, 1, this.masks);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.emojis);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.stickerset);
        }
    }

    public static class TL_updateNewAuthorization extends TLRPC.Update {
        public static final int constructor = -1991136273;
        public int date;
        public String device;
        public int flags;
        public long hash;
        public String location;
        public boolean unconfirmed;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.unconfirmed = TLObject.hasFlag(readInt32, 1);
            this.hash = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.date = inputSerializedData.readInt32(z4);
                this.device = inputSerializedData.readString(z4);
                this.location = inputSerializedData.readString(z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1991136273);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.hash);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.date);
                outputSerializedData.writeString(this.device);
                outputSerializedData.writeString(this.location);
            }
        }
    }

    public static class TL_updateNewBotConnection extends TLRPC.Update {
        public static final int constructor = -1306491994;
        public long bot_id;
        public boolean confirmed;
        public int date;
        public String device;
        public int flags;
        public String location;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.confirmed = TLObject.hasFlag(readInt32, 1);
            this.bot_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.date = inputSerializedData.readInt32(z4);
                this.device = inputSerializedData.readString(z4);
                this.location = inputSerializedData.readString(z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1306491994);
            int flag = TLObject.setFlag(this.flags, 1, this.confirmed);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.bot_id);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.date);
                outputSerializedData.writeString(this.device);
                outputSerializedData.writeString(this.location);
            }
        }
    }

    public static class TL_updateNewChannelMessage extends TLRPC.Update {
        public static final int constructor = 1656358105;
        public TLRPC.Message message;
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1656358105);
            this.message.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateNewEncryptedMessage extends TLRPC.Update {
        public static final int constructor = 314359194;
        public TLRPC.EncryptedMessage message;
        public int qts;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TLRPC.EncryptedMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.qts = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(314359194);
            this.message.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.qts);
        }
    }

    public static class TL_updateNewEphemeralMessage extends TLRPC.Update {
        public static final int constructor = 549239713;
        public TL_ephemeral.EphemeralMessage message;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(549239713);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateNewMessage extends TLRPC.Update {
        public static final int constructor = 522914557;
        public TLRPC.Message message;
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(522914557);
            this.message.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateNewQuickReply extends TLRPC.Update {
        public static final int constructor = -180508905;
        public TLRPC.TL_quickReply quick_reply;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.quick_reply = TLRPC.TL_quickReply.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-180508905);
            this.quick_reply.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateNewScheduledMessage extends TLRPC.Update {
        public static final int constructor = 967122427;
        public TLRPC.Message message;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(967122427);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateNewStickerSet extends TLRPC.Update {
        public static final int constructor = 1753886890;
        public TLRPC.TL_messages_stickerSet stickerset;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.stickerset = TLRPC.messages_StickerSet.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1753886890);
            this.stickerset.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateNewStoryReaction extends TLRPC.Update {
        public static final int constructor = 405070859;
        public TLRPC.Peer peer;
        public TLRPC.Reaction reaction;
        public int story_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.story_id = inputSerializedData.readInt32(z4);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(405070859);
            outputSerializedData.writeInt32(this.story_id);
            this.peer.serializeToStream(outputSerializedData);
            this.reaction.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateNotifySettings extends TLRPC.Update {
        public static final int constructor = -1094555409;
        public TLRPC.PeerNotifySettings notify_settings;
        public TLRPC.NotifyPeer peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.NotifyPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.notify_settings = TLRPC.PeerNotifySettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1094555409);
            this.peer.serializeToStream(outputSerializedData);
            this.notify_settings.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updatePaidReactionPrivacy extends TLRPC.Update {
        public static final int constructor = -1955438642;
        public TL_stars.PaidReactionPrivacy privacy;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.privacy = TL_stars.PaidReactionPrivacy.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1955438642);
            this.privacy.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updatePeerBlocked extends TLRPC.Update {
        public static final int constructor = -337610926;
        public boolean blocked;
        public boolean blocked_my_stories_from;
        public int flags;
        public TLRPC.Peer peer_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.blocked = TLObject.hasFlag(readInt32, 1);
            this.blocked_my_stories_from = TLObject.hasFlag(this.flags, 2);
            this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-337610926);
            int flag = TLObject.setFlag(this.flags, 1, this.blocked);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.blocked_my_stories_from);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.peer_id.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updatePeerHistoryTTL extends TLRPC.Update {
        public static final int constructor = -1147422299;
        public int flags;
        public TLRPC.Peer peer;
        public int ttl_period;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.ttl_period = inputSerializedData.readInt32(z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1147422299);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.ttl_period);
            }
        }
    }

    public static class TL_updatePeerLocated extends TLRPC.Update {
        public static final int constructor = -1263546448;
        public ArrayList<TLRPC.PeerLocated> peers = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peers = Vector.deserialize(inputSerializedData, new d(16), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1263546448);
            Vector.serialize(outputSerializedData, this.peers);
        }
    }

    public static class TL_updatePeerSettings extends TLRPC.Update {
        public static final int constructor = 1786671974;
        public TLRPC.Peer peer;
        public TLRPC.PeerSettings settings;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.settings = TLRPC.PeerSettings.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1786671974);
            this.peer.serializeToStream(outputSerializedData);
            this.settings.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updatePeerWallpaper extends TLRPC.Update {
        public static final int constructor = -1371598819;
        public int flags;
        public TLRPC.Peer peer;
        public TLRPC.WallPaper wallpaper;
        public boolean wallpaper_overridden;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.wallpaper_overridden = TLObject.hasFlag(readInt32, 2);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.wallpaper = TLRPC.WallPaper.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1371598819);
            int flag = TLObject.setFlag(this.flags, 2, this.wallpaper_overridden);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.wallpaper.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_updatePendingJoinRequests extends TLRPC.Update {
        public static final int constructor = 1885586395;
        public TLRPC.Peer peer;
        public ArrayList<Long> recent_requesters = new ArrayList<>();
        public int requests_pending;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.requests_pending = inputSerializedData.readInt32(z4);
            this.recent_requesters = Vector.deserializeLong(inputSerializedData, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1885586395);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.requests_pending);
            Vector.serializeLong(outputSerializedData, this.recent_requesters);
        }
    }

    public static class TL_updatePhoneCall extends TLRPC.Update {
        public static final int constructor = -1425052898;
        public TL_phone.PhoneCall phone_call;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.phone_call = TL_phone.PhoneCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1425052898);
            this.phone_call.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updatePhoneCallSignalingData extends TLRPC.Update {
        public static final int constructor = 643940105;
        public byte[] data;
        public long phone_call_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.phone_call_id = inputSerializedData.readInt64(z4);
            this.data = inputSerializedData.readByteArray(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(643940105);
            outputSerializedData.writeInt64(this.phone_call_id);
            outputSerializedData.writeByteArray(this.data);
        }
    }

    public static class TL_updatePinnedChannelMessages extends TLRPC.Update {
        public static final int constructor = 1538885128;
        public long channel_id;
        public int flags;
        public ArrayList<Integer> messages = new ArrayList<>();
        public boolean pinned;
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 1);
            this.channel_id = inputSerializedData.readInt64(z4);
            this.messages = Vector.deserializeInt(inputSerializedData, z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1538885128);
            int flag = TLObject.setFlag(this.flags, 1, this.pinned);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.channel_id);
            Vector.serializeInt(outputSerializedData, this.messages);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updatePinnedDialogs extends TLRPC.Update {
        public static final int constructor = -99664734;
        public int flags;
        public int folder_id;
        public ArrayList<TLRPC.DialogPeer> order = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 2)) {
                this.folder_id = inputSerializedData.readInt32(z4);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.order = Vector.deserialize(inputSerializedData, new q(9), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-99664734);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.folder_id);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serialize(outputSerializedData, this.order);
            }
        }
    }

    public static class TL_updatePinnedForumTopic extends TLRPC.Update {
        public static final int constructor = 1748708434;
        public TLRPC.Peer peer;
        public boolean pinned;
        public int topic_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.pinned = TLObject.hasFlag(inputSerializedData.readInt32(z4), 1);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.topic_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1748708434);
            outputSerializedData.writeInt32(TLObject.setFlag(0, 1, this.pinned));
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.topic_id);
        }
    }

    public static class TL_updatePinnedForumTopics extends TLRPC.Update {
        public static final int constructor = -554613808;
        public int flags;
        public ArrayList<Integer> order = new ArrayList<>();
        public TLRPC.Peer peer;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.order = Vector.deserializeInt(inputSerializedData, z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-554613808);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serializeInt(outputSerializedData, this.order);
            }
        }
    }

    public static class TL_updatePinnedMessages extends TLRPC.Update {
        public static final int constructor = -309990731;
        public int flags;
        public ArrayList<Integer> messages = new ArrayList<>();
        public TLRPC.Peer peer;
        public boolean pinned;
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 1);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.messages = Vector.deserializeInt(inputSerializedData, z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-309990731);
            int flag = TLObject.setFlag(this.flags, 1, this.pinned);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.messages);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updatePinnedSavedDialogs extends TLRPC.Update {
        public static final int constructor = 1751942566;
        public int flags;
        public ArrayList<TLRPC.DialogPeer> order = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.order = Vector.deserialize(inputSerializedData, new q(9), z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1751942566);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                Vector.serialize(outputSerializedData, this.order);
            }
        }
    }

    public static class TL_updatePrivacy extends TLRPC.Update {
        public static final int constructor = -298113238;
        public TLRPC.PrivacyKey key;
        public ArrayList<TLRPC.PrivacyRule> rules = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.key = TLRPC.PrivacyKey.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.rules = Vector.deserialize(inputSerializedData, new c(15), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-298113238);
            this.key.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.rules);
        }
    }

    public static class TL_updateQuickReplies extends TLRPC.Update {
        public static final int constructor = -112784718;
        public ArrayList<TLRPC.TL_quickReply> quick_replies = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.quick_replies = Vector.deserialize(inputSerializedData, new q(18), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-112784718);
            Vector.serialize(outputSerializedData, this.quick_replies);
        }
    }

    public static class TL_updateQuickReplyMessage extends TLRPC.Update {
        public static final int constructor = 1040518415;
        public TLRPC.Message message;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.message = TLRPC.Message.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1040518415);
            this.message.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateReadChannelDiscussionInbox extends TLRPC.Update {
        public static final int constructor = -693004986;
        public long broadcast_id;
        public int broadcast_post;
        public long channel_id;
        public int flags;
        public int read_max_id;
        public int top_msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.channel_id = inputSerializedData.readInt64(z4);
            this.top_msg_id = inputSerializedData.readInt32(z4);
            this.read_max_id = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.broadcast_id = inputSerializedData.readInt64(z4);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                this.broadcast_post = inputSerializedData.readInt32(z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-693004986);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.top_msg_id);
            outputSerializedData.writeInt32(this.read_max_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.broadcast_id);
            }
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.broadcast_post);
            }
        }
    }

    public static class TL_updateReadChannelDiscussionOutbox extends TLRPC.Update {
        public static final int constructor = 1767677564;
        public long channel_id;
        public int read_max_id;
        public int top_msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.top_msg_id = inputSerializedData.readInt32(z4);
            this.read_max_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1767677564);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.top_msg_id);
            outputSerializedData.writeInt32(this.read_max_id);
        }
    }

    public static class TL_updateReadChannelInbox extends TLRPC.Update {
        public static final int constructor = -1842450928;
        public long channel_id;
        public int flags;
        public int folder_id;
        public int max_id;
        public int pts;
        public int still_unread_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.folder_id = inputSerializedData.readInt32(z4);
            }
            this.channel_id = inputSerializedData.readInt64(z4);
            this.max_id = inputSerializedData.readInt32(z4);
            this.still_unread_count = inputSerializedData.readInt32(z4);
            this.pts = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1842450928);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.folder_id);
            }
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.max_id);
            outputSerializedData.writeInt32(this.still_unread_count);
            outputSerializedData.writeInt32(this.pts);
        }
    }

    public static class TL_updateReadChannelOutbox extends TLRPC.Update {
        public static final int constructor = -1218471511;
        public long channel_id;
        public int max_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.max_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1218471511);
            outputSerializedData.writeInt64(this.channel_id);
            outputSerializedData.writeInt32(this.max_id);
        }
    }

    public static class TL_updateReadFeaturedEmojiStickers extends TLRPC.Update {
        public static final int constructor = -78886548;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-78886548);
        }
    }

    public static class TL_updateReadFeaturedStickers extends TLRPC.Update {
        public static final int constructor = 1461528386;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1461528386);
        }
    }

    public static class TL_updateReadHistoryInbox extends TLRPC.Update {
        public static final int constructor = -1635468135;
        public int flags;
        public int folder_id;
        public int max_id;
        public TLRPC.Peer peer;
        public int pts;
        public int pts_count;
        public int still_unread_count;
        public int top_msg_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            if (TLObject.hasFlag(readInt32, 1)) {
                this.folder_id = inputSerializedData.readInt32(z4);
            }
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            this.max_id = inputSerializedData.readInt32(z4);
            this.still_unread_count = inputSerializedData.readInt32(z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1635468135);
            outputSerializedData.writeInt32(this.flags);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.folder_id);
            }
            this.peer.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            outputSerializedData.writeInt32(this.max_id);
            outputSerializedData.writeInt32(this.still_unread_count);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateReadHistoryOutbox extends TLRPC.Update {
        public static final int constructor = 791617983;
        public int max_id;
        public TLRPC.Peer peer;
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.max_id = inputSerializedData.readInt32(z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(791617983);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.max_id);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateReadMessagesContents extends TLRPC.Update {
        public static final int constructor = -131960447;
        public int date;
        public int flags;
        public ArrayList<Integer> messages = new ArrayList<>();
        public int pts;
        public int pts_count;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.messages = Vector.deserializeInt(inputSerializedData, z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.date = inputSerializedData.readInt32(z4);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-131960447);
            outputSerializedData.writeInt32(this.flags);
            Vector.serializeInt(outputSerializedData, this.messages);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.date);
            }
        }
    }

    public static class TL_updateReadMonoForumInbox extends TLRPC.Update {
        public static final int constructor = 2008081266;
        public long channel_id;
        public int read_max_id;
        public TLRPC.Peer saved_peer_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.read_max_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2008081266);
            outputSerializedData.writeInt64(this.channel_id);
            this.saved_peer_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.read_max_id);
        }
    }

    public static class TL_updateReadMonoForumOutbox extends TLRPC.Update {
        public static final int constructor = -1532521610;
        public long channel_id;
        public int read_max_id;
        public TLRPC.Peer saved_peer_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.channel_id = inputSerializedData.readInt64(z4);
            this.saved_peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.read_max_id = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1532521610);
            outputSerializedData.writeInt64(this.channel_id);
            this.saved_peer_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.read_max_id);
        }
    }

    public static class TL_updateRecentEmojiStatuses extends TLRPC.Update {
        public static final int constructor = 821314523;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(821314523);
        }
    }

    public static class TL_updateRecentReactions extends TLRPC.Update {
        public static final int constructor = 1870160884;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1870160884);
        }
    }

    public static class TL_updateRecentStickers extends TLRPC.Update {
        public static final int constructor = -1706939360;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1706939360);
        }
    }

    public static class TL_updateSavedDialogPinned extends TLRPC.Update {
        public static final int constructor = -1364222348;
        public int flags;
        public TLRPC.DialogPeer peer;
        public boolean pinned;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pinned = TLObject.hasFlag(readInt32, 1);
            this.peer = TLRPC.DialogPeer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1364222348);
            int flag = TLObject.setFlag(this.flags, 1, this.pinned);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateSavedGifs extends TLRPC.Update {
        public static final int constructor = -1821035490;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1821035490);
        }
    }

    public static class TL_updateSavedReactionTags extends TLRPC.Update {
        public static final int constructor = 969307186;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(969307186);
        }
    }

    public static class TL_updateSavedRingtones extends TLRPC.Update {
        public static final int constructor = 1960361625;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1960361625);
        }
    }

    public static class TL_updateSentPhoneCode extends TLRPC.Update {
        public static final int constructor = 1347068303;
        public TLRPC.auth_SentCode sent_code;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.sent_code = TLRPC.auth_SentCode.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1347068303);
            this.sent_code.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateSentStoryReaction extends TLRPC.Update {
        public static final int constructor = 2103604867;
        public TLRPC.Peer peer;
        public TLRPC.Reaction reaction;
        public int story_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.story_id = inputSerializedData.readInt32(z4);
            this.reaction = TLRPC.Reaction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2103604867);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.story_id);
            this.reaction.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateServiceNotification extends TLRPC.Update {
        public static final int constructor = -337352679;
        public ArrayList<TLRPC.MessageEntity> entities = new ArrayList<>();
        public int flags;
        public int inbox_date;
        public boolean invert_media;
        public TLRPC.MessageMedia media;
        public String message;
        public boolean popup;
        public String type;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.popup = TLObject.hasFlag(readInt32, 1);
            if (TLObject.hasFlag(this.flags, 2)) {
                this.inbox_date = inputSerializedData.readInt32(z4);
            }
            this.invert_media = TLObject.hasFlag(this.flags, 4);
            this.type = inputSerializedData.readString(z4);
            this.message = inputSerializedData.readString(z4);
            this.media = TLRPC.MessageMedia.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.entities = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(28), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-337352679);
            int flag = TLObject.setFlag(this.flags, 1, this.popup);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.invert_media);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.inbox_date);
            }
            outputSerializedData.writeString(this.type);
            outputSerializedData.writeString(this.message);
            this.media.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.entities);
        }
    }

    public static class TL_updateStarGiftAuctionState extends TLRPC.Update {
        public static final int constructor = 1222788802;
        public long gift_id;
        public TL_stars.StarGiftAuctionState state;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.gift_id = inputSerializedData.readInt64(z4);
            this.state = TL_stars.StarGiftAuctionState.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1222788802);
            outputSerializedData.writeInt64(this.gift_id);
            this.state.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateStarGiftAuctionUserState extends TLRPC.Update {
        public static final int constructor = -598150370;
        public long gift_id;
        public TL_stars.TL_StarGiftAuctionUserState user_state;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.gift_id = inputSerializedData.readInt64(z4);
            this.user_state = TL_stars.TL_StarGiftAuctionUserState.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-598150370);
            outputSerializedData.writeInt64(this.gift_id);
            this.user_state.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateStarGiftCraftFail extends TLRPC.Update {
        public static final int constructor = -1408818108;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            super.readParams(inputSerializedData, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1408818108);
        }
    }

    public static class TL_updateStarsBalance extends TLRPC.Update {
        public static final int constructor = 1317053305;
        public TL_stars.StarsAmount balance;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.balance = TL_stars.StarsAmount.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1317053305);
            this.balance.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateStarsRevenueStatus extends TLRPC.Update {
        public static final int constructor = -1518030823;
        public TLRPC.Peer peer;
        public TLRPC.TL_starsRevenueStatus status;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.status = TLRPC.TL_starsRevenueStatus.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1518030823);
            this.peer.serializeToStream(outputSerializedData);
            this.status.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateStickerSets extends TLRPC.Update {
        public static final int constructor = 834816008;
        public boolean emojis;
        public int flags;
        public boolean masks;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.masks = TLObject.hasFlag(readInt32, 1);
            this.emojis = TLObject.hasFlag(this.flags, 2);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(834816008);
            int flag = TLObject.setFlag(this.flags, 1, this.masks);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.emojis);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
        }
    }

    public static class TL_updateStickerSetsOrder extends TLRPC.Update {
        public static final int constructor = 196268545;
        public boolean emojis;
        public int flags;
        public boolean masks;
        public ArrayList<Long> order = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.masks = TLObject.hasFlag(readInt32, 1);
            this.emojis = TLObject.hasFlag(this.flags, 2);
            this.order = Vector.deserializeLong(inputSerializedData, z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(196268545);
            int flag = TLObject.setFlag(this.flags, 1, this.masks);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.emojis);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            Vector.serializeLong(outputSerializedData, this.order);
        }
    }

    public static class TL_updateStoryID extends TLRPC.Update {
        public static final int constructor = 468923833;
        public int f19438id;
        public long random_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.f19438id = inputSerializedData.readInt32(z4);
            this.random_id = inputSerializedData.readInt64(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(468923833);
            outputSerializedData.writeInt32(this.f19438id);
            outputSerializedData.writeInt64(this.random_id);
        }
    }

    public static class TL_updateTheme extends TLRPC.Update {
        public static final int constructor = -2112423005;
        public TLRPC.Theme theme;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.theme = TLRPC.Theme.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2112423005);
            this.theme.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateTranscribeAudio extends TLRPC.Update {
        public static final int constructor = -2006880112;
        public int flags;
        public boolean isFinal;
        public String text;
        public long transcription_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.isFinal = TLObject.hasFlag(readInt32, 1);
            this.transcription_id = inputSerializedData.readInt64(z4);
            this.text = inputSerializedData.readString(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2006880112);
            int flag = TLObject.setFlag(this.flags, 1, this.isFinal);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.transcription_id);
            outputSerializedData.writeString(this.text);
        }
    }

    public static class TL_updateTranscribedAudio extends TLRPC.Update {
        public static final int constructor = 8703322;
        public int flags;
        public int msg_id;
        public TLRPC.Peer peer;
        public boolean pending;
        public String text;
        public long transcription_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.pending = TLObject.hasFlag(readInt32, 1);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.msg_id = inputSerializedData.readInt32(z4);
            this.transcription_id = inputSerializedData.readInt64(z4);
            this.text = inputSerializedData.readString(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(8703322);
            int flag = TLObject.setFlag(this.flags, 1, this.pending);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.msg_id);
            outputSerializedData.writeInt64(this.transcription_id);
            outputSerializedData.writeString(this.text);
        }
    }

    public static class TL_updateUser extends TLRPC.Update {
        public static final int constructor = 542282808;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.user_id = inputSerializedData.readInt64(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(542282808);
            outputSerializedData.writeInt64(this.user_id);
        }
    }

    public static class TL_updateUserEmojiStatus extends TLRPC.Update {
        public static final int constructor = 674706841;
        public TLRPC.EmojiStatus emoji_status;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.user_id = inputSerializedData.readInt64(z4);
            this.emoji_status = TLRPC.EmojiStatus.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(674706841);
            outputSerializedData.writeInt64(this.user_id);
            this.emoji_status.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateUserName extends TLRPC.Update {
        public static final int constructor = -1484486364;
        public String first_name;
        public String last_name;
        public long user_id;
        public ArrayList<TLRPC.TL_username> usernames = new ArrayList<>();

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.user_id = inputSerializedData.readInt64(z4);
            this.first_name = inputSerializedData.readString(z4);
            this.last_name = inputSerializedData.readString(z4);
            this.usernames = Vector.deserialize(inputSerializedData, new l(6), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1484486364);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeString(this.first_name);
            outputSerializedData.writeString(this.last_name);
            Vector.serialize(outputSerializedData, this.usernames);
        }
    }

    public static class TL_updateUserPhone extends TLRPC.Update {
        public static final int constructor = 88680979;
        public String phone;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.user_id = inputSerializedData.readInt64(z4);
            this.phone = inputSerializedData.readString(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(88680979);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeString(this.phone);
        }
    }

    public static class TL_updateUserPhoto extends TLRPC.Update {
        public static final int constructor = -232290676;
        public int date;
        public TLRPC.UserProfilePhoto photo;
        public boolean previous;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.user_id = inputSerializedData.readInt64(z4);
            this.date = inputSerializedData.readInt32(z4);
            this.photo = TLRPC.UserProfilePhoto.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.previous = inputSerializedData.readBool(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-232290676);
            outputSerializedData.writeInt64(this.user_id);
            outputSerializedData.writeInt32(this.date);
            this.photo.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.previous);
        }
    }

    public static class TL_updateUserStatus extends TLRPC.Update {
        public static final int constructor = -440534818;
        public TLRPC.UserStatus status;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.user_id = inputSerializedData.readInt64(z4);
            this.status = TLRPC.UserStatus.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-440534818);
            outputSerializedData.writeInt64(this.user_id);
            this.status.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateUserTyping extends TLRPC.Update {
        public static final int constructor = 706199388;
        public TLRPC.SendMessageAction action;
        public int flags;
        public int top_msg_id;
        public long user_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.flags = inputSerializedData.readInt32(z4);
            this.user_id = inputSerializedData.readInt64(z4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.top_msg_id = inputSerializedData.readInt32(z4);
            }
            this.action = TLRPC.SendMessageAction.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(706199388);
            outputSerializedData.writeInt32(this.flags);
            outputSerializedData.writeInt64(this.user_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.top_msg_id);
            }
            this.action.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateWebBrowserException extends TLRPC.Update {
        public static final int constructor = 335872721;
        public boolean delete;
        public TL_account.WebDomainException exception;
        public int flags;
        public boolean open_external_browser;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.delete = TLObject.hasFlag(readInt32, 2);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.open_external_browser = inputSerializedData.readBool(z4);
            }
            this.exception = TL_account.WebDomainException.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(335872721);
            int flag = TLObject.setFlag(this.flags, 2, this.delete);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.open_external_browser);
            }
            this.exception.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_updateWebBrowserSettings extends TLRPC.Update {
        public static final int constructor = -1013306658;
        public boolean display_close_button;
        public int flags;
        public boolean open_external_browser;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            int readInt32 = inputSerializedData.readInt32(z4);
            this.flags = readInt32;
            this.open_external_browser = TLObject.hasFlag(readInt32, 1);
            this.display_close_button = TLObject.hasFlag(this.flags, 2);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1013306658);
            int flag = TLObject.setFlag(this.flags, 1, this.open_external_browser);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.display_close_button);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
        }
    }

    public static class TL_updateWebPage extends TLRPC.Update {
        public static final int constructor = 2139689491;
        public int pts;
        public int pts_count;
        public TLRPC.WebPage webpage;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.webpage = TLRPC.WebPage.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z4), z4);
            this.pts = inputSerializedData.readInt32(z4);
            this.pts_count = inputSerializedData.readInt32(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2139689491);
            this.webpage.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.pts);
            outputSerializedData.writeInt32(this.pts_count);
        }
    }

    public static class TL_updateWebViewResultSent extends TLRPC.Update {
        public static final int constructor = 361936797;
        public long query_id;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z4) {
            this.query_id = inputSerializedData.readInt64(z4);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(361936797);
            outputSerializedData.writeInt64(this.query_id);
        }
    }

    private TL_update() {
    }
}
