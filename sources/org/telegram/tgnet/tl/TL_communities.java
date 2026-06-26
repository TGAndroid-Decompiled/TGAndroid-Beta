package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.messenger.MessagesStorage$$ExternalSyntheticLambda210;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_communities;

public class TL_communities {
    private TL_communities() {
    }

    public static class ParticipantJoinedChats extends TLObject {
        public static final int constructor = -1921494742;
        public ArrayList<Long> creator_chat_ids = new ArrayList<>();
        public ArrayList<Long> joined_chat_ids = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static ParticipantJoinedChats TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (ParticipantJoinedChats) TLObject.TLdeserialize(ParticipantJoinedChats.class, i != -1921494742 ? null : new ParticipantJoinedChats(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.creator_chat_ids = Vector.deserializeLong(inputSerializedData, z);
            this.joined_chat_ids = Vector.deserializeLong(inputSerializedData, z);
            this.chats = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda210(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1921494742);
            Vector.serializeLong(outputSerializedData, this.creator_chat_ids);
            Vector.serializeLong(outputSerializedData, this.joined_chat_ids);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class PeerLinkRequests extends TLObject {
        public static final int constructor = 574926765;
        public int flags;
        public String next_offset;
        public int total_count;
        public ArrayList<CommunityPeerRequest> requests = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static PeerLinkRequests TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (PeerLinkRequests) TLObject.TLdeserialize(PeerLinkRequests.class, i != 574926765 ? null : new PeerLinkRequests(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            this.flags = inputSerializedData.readInt32(z);
            this.total_count = inputSerializedData.readInt32(z);
            this.requests = Vector.deserialize(inputSerializedData, new Vector.TLDeserializer() {
                @Override
                public final TLObject deserialize(InputSerializedData inputSerializedData2, int i, boolean z2) {
                    return TL_communities.CommunityPeerRequest.TLdeserialize(inputSerializedData2, i, z2);
                }
            }, z);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z);
            }
            this.chats = Vector.deserialize(inputSerializedData, new MessagesStorage$$ExternalSyntheticLambda210(), z);
            this.users = Vector.deserialize(inputSerializedData, new TLRPC$TL_attachMenuBots$$ExternalSyntheticLambda1(), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(574926765);
            int flag = TLObject.setFlag(this.flags, 1, this.next_offset != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt32(this.total_count);
            Vector.serialize(outputSerializedData, this.requests);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.next_offset);
            }
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class CommunityPeer extends TLObject {
        public static final int constructor = 1981030077;
        public boolean can_view_history;
        public int flags;
        public TLRPC.Peer peer;
        public boolean visible;

        public static CommunityPeer TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (CommunityPeer) TLObject.TLdeserialize(CommunityPeer.class, i != 1981030077 ? null : new CommunityPeer(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.can_view_history = TLObject.hasFlag(int32, 4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.visible = inputSerializedData.readBool(z);
            }
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1981030077);
            int flag = TLObject.setFlag(this.flags, 4, this.can_view_history);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.visible);
            }
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class CommunityPeerRequest extends TLObject {
        public static final int constructor = 2078997125;
        public int date;
        public int flags;
        public TLRPC.Peer peer;
        public long requested_by;
        public boolean visible;

        public static CommunityPeerRequest TLdeserialize(InputSerializedData inputSerializedData, int i, boolean z) {
            return (CommunityPeerRequest) TLObject.TLdeserialize(CommunityPeerRequest.class, i != 2078997125 ? null : new CommunityPeerRequest(), inputSerializedData, i, z);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            int int32 = inputSerializedData.readInt32(z);
            this.flags = int32;
            this.visible = TLObject.hasFlag(int32, 1);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            this.requested_by = inputSerializedData.readInt64(z);
            this.date = inputSerializedData.readInt32(z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2078997125);
            int flag = TLObject.setFlag(this.flags, 1, this.visible);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.requested_by);
            outputSerializedData.writeInt32(this.date);
        }
    }

    public static class TL_communities_create extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1506256404;
        public String about;
        public int flags;
        public TLRPC.InputPeer peer;
        public String title;

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1506256404);
            int flag = TLObject.setFlag(this.flags, 1, this.about != null);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.about);
            }
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_communities_togglePeerLink extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 1936576490;
        public TLRPC.InputChannel community;
        public boolean deleted;
        public int flags;
        public boolean hidden;
        public TLRPC.InputPeer peer;
        public boolean visible;

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1936576490);
            int flag = TLObject.setFlag(this.flags, 1, this.visible);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.hidden);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.deleted);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            this.community.serializeToStream(outputSerializedData);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_communities_getJoinedCommunities extends TLMethod<TLRPC.messages_Chats> {
        public static final int constructor = -1503401936;

        @Override
        public TLRPC.messages_Chats deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.messages_Chats.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1503401936);
        }
    }

    public static class TL_communities_toggleCommunityCollapsedInDialogs extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -681122838;
        public boolean collapsed;
        public TLRPC.InputChannel community;
        public int flags;

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-681122838);
            int flag = TLObject.setFlag(this.flags, 1, this.collapsed);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_communities_getPeerLinkRequests extends TLMethod<PeerLinkRequests> {
        public static final int constructor = -1820904636;
        public TLRPC.InputChannel community;
        public int limit;
        public String offset;

        @Override
        public PeerLinkRequests deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return PeerLinkRequests.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1820904636);
            this.community.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class TL_communities_togglePeerLinkRequestApproval extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1937630808;
        public TLRPC.InputChannel community;
        public int flags;
        public TLRPC.InputPeer peer;
        public boolean reject;

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1937630808);
            int flag = TLObject.setFlag(this.flags, 1, this.reject);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_communities_toggleAllPeerLinkRequestApproval extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1075585731;
        public TLRPC.InputChannel community;
        public int flags;
        public boolean reject;

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1075585731);
            int flag = TLObject.setFlag(this.flags, 1, this.reject);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_communities_toggleParticipantBanned extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1721258737;
        public TLRPC.InputChannel community;
        public int flags;
        public TLRPC.InputPeer participant;
        public boolean unban;

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1721258737);
            int flag = TLObject.setFlag(this.flags, 1, this.unban);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
            this.participant.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_communities_getParticipantJoinedChats extends TLMethod<ParticipantJoinedChats> {
        public static final int constructor = -125916245;
        public TLRPC.InputChannel community;
        public TLRPC.InputPeer participant;

        @Override
        public ParticipantJoinedChats deserializeResponseT(InputSerializedData inputSerializedData, int i, boolean z) {
            return ParticipantJoinedChats.TLdeserialize(inputSerializedData, i, z);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-125916245);
            this.community.serializeToStream(outputSerializedData);
            this.participant.serializeToStream(outputSerializedData);
        }
    }
}
