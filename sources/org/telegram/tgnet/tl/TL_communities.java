package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.l;
public class TL_communities {

    public static class CommunityPeer extends TLObject {
        public static final int constructor = 1981030077;
        public boolean can_view_history;
        public int flags;
        public TLRPC.Peer peer;
        public boolean visible;

        public static CommunityPeer TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            CommunityPeer communityPeer;
            if (i10 != 1981030077) {
                communityPeer = null;
            } else {
                communityPeer = new CommunityPeer();
            }
            return (CommunityPeer) TLObject.TLdeserialize(CommunityPeer.class, communityPeer, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.can_view_history = TLObject.hasFlag(readInt32, 4);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.visible = inputSerializedData.readBool(z10);
            }
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
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

        public static CommunityPeerRequest TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            CommunityPeerRequest communityPeerRequest;
            if (i10 != 2078997125) {
                communityPeerRequest = null;
            } else {
                communityPeerRequest = new CommunityPeerRequest();
            }
            return (CommunityPeerRequest) TLObject.TLdeserialize(CommunityPeerRequest.class, communityPeerRequest, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.visible = TLObject.hasFlag(readInt32, 1);
            this.peer = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.requested_by = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
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

    public static class ParticipantJoinedChats extends TLObject {
        public static final int constructor = -1921494742;
        public ArrayList<Long> creator_chat_ids = new ArrayList<>();
        public ArrayList<Long> joined_chat_ids = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static ParticipantJoinedChats TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            ParticipantJoinedChats participantJoinedChats;
            if (i10 != -1921494742) {
                participantJoinedChats = null;
            } else {
                participantJoinedChats = new ParticipantJoinedChats();
            }
            return (ParticipantJoinedChats) TLObject.TLdeserialize(ParticipantJoinedChats.class, participantJoinedChats, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.creator_chat_ids = Vector.deserializeLong(inputSerializedData, z10);
            this.joined_chat_ids = Vector.deserializeLong(inputSerializedData, z10);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
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

        public static PeerLinkRequests TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            PeerLinkRequests peerLinkRequests;
            if (i10 != 574926765) {
                peerLinkRequests = null;
            } else {
                peerLinkRequests = new PeerLinkRequests();
            }
            return (PeerLinkRequests) TLObject.TLdeserialize(PeerLinkRequests.class, peerLinkRequests, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.flags = inputSerializedData.readInt32(z10);
            this.total_count = inputSerializedData.readInt32(z10);
            this.requests = Vector.deserialize(inputSerializedData, new c(21), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.next_offset = inputSerializedData.readString(z10);
            }
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(574926765);
            int i10 = this.flags;
            if (this.next_offset != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 1, z10);
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

    public static class TL_communities_create extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1506256404;
        public String about;
        public int flags;
        public boolean hidden;
        public TLRPC.InputPeer peer;
        public String title;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-1506256404);
            int flag = TLObject.setFlag(this.flags, 2, this.hidden);
            this.flags = flag;
            if (this.about != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag2 = TLObject.setFlag(flag, 1, z10);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeString(this.title);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.about);
            }
            this.peer.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_communities_getJoinedCommunities extends TLMethod<TLRPC.messages_Chats> {
        public static final int constructor = -1503401936;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1503401936);
        }

        @Override
        public TLRPC.messages_Chats deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.messages_Chats.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_communities_getParticipantJoinedChats extends TLMethod<ParticipantJoinedChats> {
        public static final int constructor = -125916245;
        public TLRPC.InputChannel community;
        public TLRPC.InputPeer participant;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-125916245);
            this.community.serializeToStream(outputSerializedData);
            this.participant.serializeToStream(outputSerializedData);
        }

        @Override
        public ParticipantJoinedChats deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return ParticipantJoinedChats.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_communities_getPeerLinkRequests extends TLMethod<PeerLinkRequests> {
        public static final int constructor = -1820904636;
        public TLRPC.InputChannel community;
        public int limit;
        public String offset;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1820904636);
            this.community.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }

        @Override
        public PeerLinkRequests deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return PeerLinkRequests.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_communities_toggleAllPeerLinkRequestApproval extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1075585731;
        public TLRPC.InputChannel community;
        public int flags;
        public boolean reject;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1075585731);
            int flag = TLObject.setFlag(this.flags, 1, this.reject);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_communities_toggleCommunityCollapsedInDialogs extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -681122838;
        public boolean collapsed;
        public TLRPC.InputChannel community;
        public int flags;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-681122838);
            int flag = TLObject.setFlag(this.flags, 1, this.collapsed);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_communities_toggleParticipantBanned extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1721258737;
        public TLRPC.InputChannel community;
        public int flags;
        public TLRPC.InputPeer participant;
        public boolean unban;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1721258737);
            int flag = TLObject.setFlag(this.flags, 1, this.unban);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
            this.participant.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
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

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class TL_communities_togglePeerLinkRequestApproval extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -1937630808;
        public TLRPC.InputChannel community;
        public int flags;
        public TLRPC.InputPeer peer;
        public boolean reject;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1937630808);
            int flag = TLObject.setFlag(this.flags, 1, this.reject);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.community.serializeToStream(outputSerializedData);
            this.peer.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    private TL_communities() {
    }
}
