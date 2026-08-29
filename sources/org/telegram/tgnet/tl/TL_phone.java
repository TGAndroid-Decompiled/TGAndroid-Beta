package org.telegram.tgnet.tl;

import java.util.ArrayList;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLMethod;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.l;
public class TL_phone {

    public static abstract class PhoneCall extends TLObject {
        public long access_hash;
        public long admin_id;
        public boolean conference_supported;
        public ArrayList<TLRPC.PhoneConnection> connections = new ArrayList<>();
        public TLRPC.TL_dataJSON custom_parameters;
        public int date;
        public int duration;
        public int flags;
        public byte[] g_a_hash;
        public byte[] g_a_or_b;
        public byte[] g_b;
        public long f22618id;
        public long key_fingerprint;
        public boolean need_debug;
        public boolean need_rating;
        public boolean p2p_allowed;
        public long participant_id;
        public PhoneCallProtocol protocol;
        public TLRPC.PhoneCallDiscardReason reason;
        public int receive_date;
        public int start_date;
        public boolean video;

        public static PhoneCall TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_phoneCall_layer176;
            switch (i10) {
                case -1770029977:
                    tL_phoneCall_layer176 = new TL_phoneCall_layer176();
                    break;
                case -987599081:
                    tL_phoneCall_layer176 = new TL_phoneCallWaiting();
                    break;
                case 347139340:
                    tL_phoneCall_layer176 = new phoneCallRequested();
                    break;
                case 810769141:
                    tL_phoneCall_layer176 = new TL_phoneCall();
                    break;
                case 912311057:
                    tL_phoneCall_layer176 = new TL_phoneCallAccepted();
                    break;
                case 1355435489:
                    tL_phoneCall_layer176 = new TL_phoneCallDiscarded();
                    break;
                case 1399245077:
                    tL_phoneCall_layer176 = new TL_phoneCallEmpty();
                    break;
                default:
                    tL_phoneCall_layer176 = null;
                    break;
            }
            return (PhoneCall) TLObject.TLdeserialize(PhoneCall.class, tL_phoneCall_layer176, inputSerializedData, i10, z10);
        }
    }

    public static abstract class PhoneCallProtocol extends TLObject {
        public int flags;
        public ArrayList<String> library_versions = new ArrayList<>();
        public int max_layer;
        public int min_layer;
        public boolean udp_p2p;
        public boolean udp_reflector;

        public static PhoneCallProtocol TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TLObject tL_phoneCallProtocol_layer110;
            if (i10 != -1564789301) {
                if (i10 != -58224696) {
                    tL_phoneCallProtocol_layer110 = null;
                } else {
                    tL_phoneCallProtocol_layer110 = new TL_phoneCallProtocol();
                }
            } else {
                tL_phoneCallProtocol_layer110 = new TL_phoneCallProtocol_layer110();
            }
            return (PhoneCallProtocol) TLObject.TLdeserialize(PhoneCallProtocol.class, tL_phoneCallProtocol_layer110, inputSerializedData, i10, z10);
        }
    }

    public static class TL_groupCallStreamChannel extends TLObject {
        public static final int constructor = -2132064081;
        public int channel;
        public long last_timestamp_ms;
        public int scale;

        public static TL_groupCallStreamChannel TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_groupCallStreamChannel tL_groupCallStreamChannel;
            if (-2132064081 != i10) {
                tL_groupCallStreamChannel = null;
            } else {
                tL_groupCallStreamChannel = new TL_groupCallStreamChannel();
            }
            return (TL_groupCallStreamChannel) TLObject.TLdeserialize(TL_groupCallStreamChannel.class, tL_groupCallStreamChannel, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.channel = inputSerializedData.readInt32(z10);
            this.scale = inputSerializedData.readInt32(z10);
            this.last_timestamp_ms = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-2132064081);
            outputSerializedData.writeInt32(this.channel);
            outputSerializedData.writeInt32(this.scale);
            outputSerializedData.writeInt64(this.last_timestamp_ms);
        }
    }

    public static class TL_phoneCall extends PhoneCall {
        public static final int constructor = 810769141;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.p2p_allowed = TLObject.hasFlag(readInt32, 32);
            this.video = TLObject.hasFlag(this.flags, 64);
            this.conference_supported = TLObject.hasFlag(this.flags, 256);
            this.f22618id = inputSerializedData.readInt64(z10);
            this.access_hash = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
            this.admin_id = inputSerializedData.readInt64(z10);
            this.participant_id = inputSerializedData.readInt64(z10);
            this.g_a_or_b = inputSerializedData.readByteArray(z10);
            this.key_fingerprint = inputSerializedData.readInt64(z10);
            this.protocol = PhoneCallProtocol.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.connections = Vector.deserialize(inputSerializedData, new a(7), z10);
            this.start_date = inputSerializedData.readInt32(z10);
            if (TLObject.hasFlag(this.flags, 128)) {
                this.custom_parameters = TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(810769141);
            int flag = TLObject.setFlag(this.flags, 32, this.p2p_allowed);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.video);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 256, this.conference_supported);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt64(this.f22618id);
            outputSerializedData.writeInt64(this.access_hash);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.admin_id);
            outputSerializedData.writeInt64(this.participant_id);
            outputSerializedData.writeByteArray(this.g_a_or_b);
            outputSerializedData.writeInt64(this.key_fingerprint);
            this.protocol.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.connections);
            outputSerializedData.writeInt32(this.start_date);
            if (TLObject.hasFlag(this.flags, 128)) {
                this.custom_parameters.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class TL_phoneCallAccepted extends PhoneCall {
        public static final int constructor = 912311057;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.video = TLObject.hasFlag(readInt32, 64);
            this.f22618id = inputSerializedData.readInt64(z10);
            this.access_hash = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
            this.admin_id = inputSerializedData.readInt64(z10);
            this.participant_id = inputSerializedData.readInt64(z10);
            this.g_b = inputSerializedData.readByteArray(z10);
            this.protocol = PhoneCallProtocol.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(912311057);
            int flag = TLObject.setFlag(this.flags, 64, this.video);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.f22618id);
            outputSerializedData.writeInt64(this.access_hash);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.admin_id);
            outputSerializedData.writeInt64(this.participant_id);
            outputSerializedData.writeByteArray(this.g_b);
            this.protocol.serializeToStream(outputSerializedData);
        }
    }

    public static class TL_phoneCallDiscarded extends PhoneCall {
        public static final int constructor = 1355435489;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.need_rating = TLObject.hasFlag(readInt32, 4);
            this.need_debug = TLObject.hasFlag(this.flags, 8);
            this.video = TLObject.hasFlag(this.flags, 64);
            this.f22618id = inputSerializedData.readInt64(z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.reason = TLRPC.PhoneCallDiscardReason.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.duration = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1355435489);
            int flag = TLObject.setFlag(this.flags, 4, this.need_rating);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 8, this.need_debug);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 64, this.video);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt64(this.f22618id);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.reason.serializeToStream(outputSerializedData);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.duration);
            }
        }
    }

    public static class TL_phoneCallEmpty extends PhoneCall {
        public static final int constructor = 1399245077;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.f22618id = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1399245077);
            outputSerializedData.writeInt64(this.f22618id);
        }
    }

    public static class TL_phoneCallProtocol extends PhoneCallProtocol {
        public static final int constructor = -58224696;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.udp_p2p = TLObject.hasFlag(readInt32, 1);
            this.udp_reflector = TLObject.hasFlag(this.flags, 2);
            this.min_layer = inputSerializedData.readInt32(z10);
            this.max_layer = inputSerializedData.readInt32(z10);
            this.library_versions = Vector.deserializeString(inputSerializedData, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-58224696);
            int flag = TLObject.setFlag(this.flags, 1, this.udp_p2p);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.udp_reflector);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt32(this.min_layer);
            outputSerializedData.writeInt32(this.max_layer);
            Vector.serializeString(outputSerializedData, this.library_versions);
        }
    }

    public static class TL_phoneCallProtocol_layer110 extends TL_phoneCallProtocol {
        public static final int constructor = -1564789301;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.udp_p2p = TLObject.hasFlag(readInt32, 1);
            this.udp_reflector = TLObject.hasFlag(this.flags, 2);
            this.min_layer = inputSerializedData.readInt32(z10);
            this.max_layer = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1564789301);
            int flag = TLObject.setFlag(this.flags, 1, this.udp_p2p);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.udp_reflector);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt32(this.min_layer);
            outputSerializedData.writeInt32(this.max_layer);
        }
    }

    public static class TL_phoneCallWaiting extends PhoneCall {
        public static final int constructor = -987599081;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.video = TLObject.hasFlag(readInt32, 64);
            this.f22618id = inputSerializedData.readInt64(z10);
            this.access_hash = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
            this.admin_id = inputSerializedData.readInt64(z10);
            this.participant_id = inputSerializedData.readInt64(z10);
            this.protocol = PhoneCallProtocol.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (TLObject.hasFlag(this.flags, 1)) {
                this.receive_date = inputSerializedData.readInt32(z10);
            }
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-987599081);
            int flag = TLObject.setFlag(this.flags, 64, this.video);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.f22618id);
            outputSerializedData.writeInt64(this.access_hash);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.admin_id);
            outputSerializedData.writeInt64(this.participant_id);
            this.protocol.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt32(this.receive_date);
            }
        }
    }

    public static class TL_phoneCall_layer176 extends TL_phoneCall {
        public static final int constructor = -1770029977;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.p2p_allowed = TLObject.hasFlag(readInt32, 32);
            this.video = TLObject.hasFlag(this.flags, 64);
            this.f22618id = inputSerializedData.readInt64(z10);
            this.access_hash = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
            this.admin_id = inputSerializedData.readInt64(z10);
            this.participant_id = inputSerializedData.readInt64(z10);
            this.g_a_or_b = inputSerializedData.readByteArray(z10);
            this.key_fingerprint = inputSerializedData.readInt64(z10);
            this.protocol = PhoneCallProtocol.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.connections = Vector.deserialize(inputSerializedData, new a(7), z10);
            this.start_date = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1770029977);
            int flag = TLObject.setFlag(this.flags, 32, this.p2p_allowed);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 64, this.video);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            outputSerializedData.writeInt64(this.f22618id);
            outputSerializedData.writeInt64(this.access_hash);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.admin_id);
            outputSerializedData.writeInt64(this.participant_id);
            outputSerializedData.writeByteArray(this.g_a_or_b);
            outputSerializedData.writeInt64(this.key_fingerprint);
            this.protocol.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.connections);
            outputSerializedData.writeInt32(this.start_date);
        }
    }

    public static class TL_phone_phoneCall extends TLObject {
        public static final int constructor = -326966976;
        public PhoneCall phone_call;
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static TL_phone_phoneCall TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            TL_phone_phoneCall tL_phone_phoneCall;
            if (-326966976 != i10) {
                tL_phone_phoneCall = null;
            } else {
                tL_phone_phoneCall = new TL_phone_phoneCall();
            }
            return (TL_phone_phoneCall) TLObject.TLdeserialize(TL_phone_phoneCall.class, tL_phone_phoneCall, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.phone_call = PhoneCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-326966976);
            this.phone_call.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class acceptCall extends TLObject {
        public static final int constructor = 1003664544;
        public byte[] g_b;
        public TLRPC.TL_inputPhoneCall peer;
        public TL_phoneCallProtocol protocol;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_phone_phoneCall.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1003664544);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.g_b);
            this.protocol.serializeToStream(outputSerializedData);
        }
    }

    public static class checkGroupCall extends TLObject {
        public static final int constructor = -1248003721;
        public TLRPC.InputGroupCall call;
        public ArrayList<Integer> sources = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return Vector.TLDeserializeInt(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1248003721);
            this.call.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.sources);
        }
    }

    public static class confirmCall extends TLObject {
        public static final int constructor = 788404002;
        public byte[] g_a;
        public long key_fingerprint;
        public TLRPC.TL_inputPhoneCall peer;
        public TL_phoneCallProtocol protocol;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_phone_phoneCall.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(788404002);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.g_a);
            outputSerializedData.writeInt64(this.key_fingerprint);
            this.protocol.serializeToStream(outputSerializedData);
        }
    }

    public static class createConferenceCall extends TLObject {
        public static final int constructor = 2097431739;
        public byte[] block;
        public int flags;
        public boolean join;
        public boolean muted;
        public TLRPC.TL_dataJSON params;
        public byte[] public_key;
        public int random_id;
        public boolean video_stopped;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2097431739);
            int flag = TLObject.setFlag(this.flags, 1, this.muted);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.video_stopped);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 8, this.join);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            outputSerializedData.writeInt32(this.random_id);
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeBytes(this.public_key);
                outputSerializedData.writeByteArray(this.block);
                this.params.serializeToStream(outputSerializedData);
            }
        }
    }

    public static class createGroupCall extends TLObject {
        public static final int constructor = 1221445336;
        public int flags;
        public TLRPC.InputPeer peer;
        public int random_id;
        public int schedule_date;
        public String title;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1221445336);
            outputSerializedData.writeInt32(this.flags);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.random_id);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.schedule_date);
            }
        }
    }

    public static class declineConferenceCallInvite extends TLObject {
        public static final int constructor = 1011325297;
        public int msg_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1011325297);
            outputSerializedData.writeInt32(this.msg_id);
        }
    }

    public static class deleteConferenceCallParticipants extends TLObject {
        public static final int constructor = -1935276763;
        public byte[] block;
        public TLRPC.InputGroupCall call;
        public int flags;
        public ArrayList<Long> ids = new ArrayList<>();
        public boolean kick;
        public boolean only_left;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1935276763);
            int flag = TLObject.setFlag(this.flags, 1, this.only_left);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.kick);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.call.serializeToStream(outputSerializedData);
            Vector.serializeLong(outputSerializedData, this.ids);
            outputSerializedData.writeByteArray(this.block);
        }
    }

    public static class deleteGroupCallMessages extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -162573065;
        public TLRPC.InputGroupCall call;
        public int flags;
        public ArrayList<Integer> messages = new ArrayList<>();
        public boolean report_spam;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-162573065);
            int flag = TLObject.setFlag(this.flags, 1, this.report_spam);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.call.serializeToStream(outputSerializedData);
            Vector.serializeInt(outputSerializedData, this.messages);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class deleteGroupCallParticipantMessages extends TLMethod<TLRPC.Updates> {
        public static final int constructor = 499117216;
        public TLRPC.InputGroupCall call;
        public int flags;
        public TLRPC.InputPeer participant;
        public boolean report_spam;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(499117216);
            int flag = TLObject.setFlag(this.flags, 1, this.report_spam);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.call.serializeToStream(outputSerializedData);
            this.participant.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class discardCall extends TLObject {
        public static final int constructor = -1295269440;
        public long connection_id;
        public int duration;
        public int flags;
        public TLRPC.TL_inputPhoneCall peer;
        public TLRPC.PhoneCallDiscardReason reason;
        public boolean video;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1295269440);
            int flag = TLObject.setFlag(this.flags, 1, this.video);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.duration);
            this.reason.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.connection_id);
        }
    }

    public static class discardGroupCall extends TLObject {
        public static final int constructor = 2054648117;
        public TLRPC.InputGroupCall call;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2054648117);
            this.call.serializeToStream(outputSerializedData);
        }
    }

    public static class editGroupCallParticipant extends TLObject {
        public static final int constructor = -1524155713;
        public TLRPC.InputGroupCall call;
        public int flags;
        public boolean muted;
        public TLRPC.InputPeer participant;
        public boolean presentation_paused;
        public boolean raise_hand;
        public boolean video_paused;
        public boolean video_stopped;
        public int volume;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1524155713);
            outputSerializedData.writeInt32(this.flags);
            this.call.serializeToStream(outputSerializedData);
            this.participant.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeBool(this.muted);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeInt32(this.volume);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeBool(this.raise_hand);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeBool(this.video_stopped);
            }
            if (TLObject.hasFlag(this.flags, 16)) {
                outputSerializedData.writeBool(this.video_paused);
            }
            if (TLObject.hasFlag(this.flags, 32)) {
                outputSerializedData.writeBool(this.presentation_paused);
            }
        }
    }

    public static class editGroupCallTitle extends TLObject {
        public static final int constructor = 480685066;
        public TLRPC.InputGroupCall call;
        public String title;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(480685066);
            this.call.serializeToStream(outputSerializedData);
            outputSerializedData.writeString(this.title);
        }
    }

    public static class exportGroupCallInvite extends TLObject {
        public static final int constructor = -425040769;
        public TLRPC.InputGroupCall call;
        public boolean can_self_unmute;
        public int flags;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return exportedGroupCallInvite.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-425040769);
            int flag = TLObject.setFlag(this.flags, 1, this.can_self_unmute);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.call.serializeToStream(outputSerializedData);
        }
    }

    public static class exportedGroupCallInvite extends TLObject {
        public static final int constructor = 541839704;
        public String link;

        public static exportedGroupCallInvite TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            exportedGroupCallInvite exportedgroupcallinvite;
            if (541839704 != i10) {
                exportedgroupcallinvite = null;
            } else {
                exportedgroupcallinvite = new exportedGroupCallInvite();
            }
            return (exportedGroupCallInvite) TLObject.TLdeserialize(exportedGroupCallInvite.class, exportedgroupcallinvite, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.link = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(541839704);
            outputSerializedData.writeString(this.link);
        }
    }

    public static class getCallConfig extends TLObject {
        public static final int constructor = 1430593449;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.TL_dataJSON.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1430593449);
        }
    }

    public static class getGroupCall extends TLObject {
        public static final int constructor = 68699611;
        public TLRPC.InputGroupCall call;
        public int limit;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return groupCall.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(68699611);
            this.call.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class getGroupCallChainBlocks extends TLObject {
        public static final int constructor = -291534682;
        public TLRPC.InputGroupCall call;
        public int limit;
        public int offset;
        public int sub_chain_id;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-291534682);
            this.call.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.sub_chain_id);
            outputSerializedData.writeInt32(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class getGroupCallJoinAs extends TLObject {
        public static final int constructor = -277077702;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return joinAsPeers.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-277077702);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class getGroupCallStars extends TLMethod<groupCallStars> {
        public static final int constructor = 1868784386;
        public TLRPC.InputGroupCall call;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1868784386);
            this.call.serializeToStream(outputSerializedData);
        }

        @Override
        public groupCallStars deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return groupCallStars.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class getGroupCallStreamChannels extends TLObject {
        public static final int constructor = 447879488;
        public TLRPC.InputGroupCall call;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return groupCallStreamChannels.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(447879488);
            this.call.serializeToStream(outputSerializedData);
        }
    }

    public static class getGroupCallStreamRtmpUrl extends TLObject {
        public static final int constructor = 1525991226;
        public int flags;
        public boolean live_story;
        public TLRPC.InputPeer peer;
        public boolean revoke;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return groupCallStreamRtmpUrl.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1525991226);
            int flag = TLObject.setFlag(this.flags, 1, this.live_story);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.revoke);
        }
    }

    public static class getGroupParticipants extends TLObject {
        public static final int constructor = -984033109;
        public TLRPC.InputGroupCall call;
        public int limit;
        public String offset;
        public ArrayList<TLRPC.InputPeer> ids = new ArrayList<>();
        public ArrayList<Integer> sources = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return groupParticipants.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-984033109);
            this.call.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.ids);
            Vector.serializeInt(outputSerializedData, this.sources);
            outputSerializedData.writeString(this.offset);
            outputSerializedData.writeInt32(this.limit);
        }
    }

    public static class groupCall extends TLObject {
        public static final int constructor = -1636664659;
        public TLRPC.GroupCall call;
        public String participants_next_offset;
        public ArrayList<TLRPC.GroupCallParticipant> participants = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static groupCall TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            groupCall groupcall;
            if (-1636664659 != i10) {
                groupcall = null;
            } else {
                groupcall = new groupCall();
            }
            return (groupCall) TLObject.TLdeserialize(groupCall.class, groupcall, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.call = TLRPC.GroupCall.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            this.participants = Vector.deserialize(inputSerializedData, new a(8), z10);
            this.participants_next_offset = inputSerializedData.readString(z10);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1636664659);
            this.call.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.participants);
            outputSerializedData.writeString(this.participants_next_offset);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class groupCallDonor extends TLObject {
        public static final int constructor = -297595771;
        public boolean anonymous;
        public int flags;
        public boolean my;
        public TLRPC.Peer peer_id;
        public long stars;
        public boolean top;

        public static groupCallDonor TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            groupCallDonor groupcalldonor;
            if (i10 == -297595771) {
                groupcalldonor = new groupCallDonor();
            } else {
                groupcalldonor = null;
            }
            return (groupCallDonor) TLObject.TLdeserialize(groupCallDonor.class, groupcalldonor, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.top = TLObject.hasFlag(readInt32, 1);
            this.my = TLObject.hasFlag(this.flags, 2);
            this.anonymous = TLObject.hasFlag(this.flags, 4);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.peer_id = TLRPC.Peer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.stars = inputSerializedData.readInt64(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-297595771);
            int flag = TLObject.setFlag(this.flags, 1, this.top);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 2, this.my);
            this.flags = flag2;
            int flag3 = TLObject.setFlag(flag2, 4, this.anonymous);
            this.flags = flag3;
            outputSerializedData.writeInt32(flag3);
            if (TLObject.hasFlag(this.flags, 8)) {
                this.peer_id.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeInt64(this.stars);
        }
    }

    public static class groupCallStars extends TLObject {
        public static final int constructor = -1658995418;
        public long total_stars;
        public ArrayList<groupCallDonor> top_donors = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static groupCallStars TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            groupCallStars groupcallstars;
            if (i10 == -1658995418) {
                groupcallstars = new groupCallStars();
            } else {
                groupcallstars = null;
            }
            return (groupCallStars) TLObject.TLdeserialize(groupCallStars.class, groupcallstars, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.total_stars = inputSerializedData.readInt64(z10);
            this.top_donors = Vector.deserialize(inputSerializedData, new a(9), z10);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1658995418);
            outputSerializedData.writeInt64(this.total_stars);
            Vector.serialize(outputSerializedData, this.top_donors);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class groupCallStreamChannels extends TLObject {
        public static final int constructor = -790330702;
        public ArrayList<TL_groupCallStreamChannel> channels = new ArrayList<>();

        public static groupCallStreamChannels TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            groupCallStreamChannels groupcallstreamchannels;
            if (-790330702 != i10) {
                groupcallstreamchannels = null;
            } else {
                groupcallstreamchannels = new groupCallStreamChannels();
            }
            return (groupCallStreamChannels) TLObject.TLdeserialize(groupCallStreamChannels.class, groupcallstreamchannels, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.channels = Vector.deserialize(inputSerializedData, new a(10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-790330702);
            Vector.serialize(outputSerializedData, this.channels);
        }
    }

    public static class groupCallStreamRtmpUrl extends TLObject {
        public static final int constructor = 767505458;
        public String key;
        public String url;

        public static groupCallStreamRtmpUrl TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            groupCallStreamRtmpUrl groupcallstreamrtmpurl;
            if (767505458 != i10) {
                groupcallstreamrtmpurl = null;
            } else {
                groupcallstreamrtmpurl = new groupCallStreamRtmpUrl();
            }
            return (groupCallStreamRtmpUrl) TLObject.TLdeserialize(groupCallStreamRtmpUrl.class, groupcallstreamrtmpurl, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.url = inputSerializedData.readString(z10);
            this.key = inputSerializedData.readString(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(767505458);
            outputSerializedData.writeString(this.url);
            outputSerializedData.writeString(this.key);
        }
    }

    public static class groupParticipants extends TLObject {
        public static final int constructor = -193506890;
        public int count;
        public String next_offset;
        public int version;
        public ArrayList<TLRPC.GroupCallParticipant> participants = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static groupParticipants TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            groupParticipants groupparticipants;
            if (-193506890 != i10) {
                groupparticipants = null;
            } else {
                groupparticipants = new groupParticipants();
            }
            return (groupParticipants) TLObject.TLdeserialize(groupParticipants.class, groupparticipants, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.count = inputSerializedData.readInt32(z10);
            this.participants = Vector.deserialize(inputSerializedData, new a(8), z10);
            this.next_offset = inputSerializedData.readString(z10);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
            this.version = inputSerializedData.readInt32(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-193506890);
            outputSerializedData.writeInt32(this.count);
            Vector.serialize(outputSerializedData, this.participants);
            outputSerializedData.writeString(this.next_offset);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
            outputSerializedData.writeInt32(this.version);
        }
    }

    public static class inviteConferenceCallParticipant extends TLObject {
        public static final int constructor = -1124981115;
        public TLRPC.InputGroupCall call;
        public int flags;
        public TLRPC.InputUser user_id;
        public boolean video;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1124981115);
            int flag = TLObject.setFlag(this.flags, 1, this.video);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.call.serializeToStream(outputSerializedData);
            this.user_id.serializeToStream(outputSerializedData);
        }
    }

    public static class inviteToGroupCall extends TLObject {
        public static final int constructor = 2067345760;
        public TLRPC.InputGroupCall call;
        public ArrayList<TLRPC.InputUser> users = new ArrayList<>();

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(2067345760);
            this.call.serializeToStream(outputSerializedData);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class joinAsPeers extends TLObject {
        public static final int constructor = -1343921601;
        public ArrayList<TLRPC.Peer> peers = new ArrayList<>();
        public ArrayList<TLRPC.Chat> chats = new ArrayList<>();
        public ArrayList<TLRPC.User> users = new ArrayList<>();

        public static joinAsPeers TLdeserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
            joinAsPeers joinaspeers;
            if (-1343921601 != i10) {
                joinaspeers = null;
            } else {
                joinaspeers = new joinAsPeers();
            }
            return (joinAsPeers) TLObject.TLdeserialize(joinAsPeers.class, joinaspeers, inputSerializedData, i10, z10);
        }

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            this.peers = Vector.deserialize(inputSerializedData, new org.telegram.messenger.b(26), z10);
            this.chats = Vector.deserialize(inputSerializedData, new l(10), z10);
            this.users = Vector.deserialize(inputSerializedData, new l(4), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1343921601);
            Vector.serialize(outputSerializedData, this.peers);
            Vector.serialize(outputSerializedData, this.chats);
            Vector.serialize(outputSerializedData, this.users);
        }
    }

    public static class joinGroupCall extends TLObject {
        public static final int constructor = -1883951017;
        public byte[] block;
        public TLRPC.InputGroupCall call;
        public int flags;
        public String invite_hash;
        public TLRPC.InputPeer join_as;
        public boolean muted;
        public TLRPC.TL_dataJSON params;
        public byte[] public_key;
        public boolean video_stopped;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-1883951017);
            int flag = TLObject.setFlag(this.flags, 1, this.muted);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.video_stopped);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.call.serializeToStream(outputSerializedData);
            this.join_as.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.invite_hash);
            }
            if (TLObject.hasFlag(this.flags, 8)) {
                outputSerializedData.writeBytes(this.public_key);
                outputSerializedData.writeByteArray(this.block);
            }
            this.params.serializeToStream(outputSerializedData);
        }
    }

    public static class joinGroupCallPresentation extends TLObject {
        public static final int constructor = -873829436;
        public TLRPC.InputGroupCall call;
        public TLRPC.TL_dataJSON params;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-873829436);
            this.call.serializeToStream(outputSerializedData);
            this.params.serializeToStream(outputSerializedData);
        }
    }

    public static class leaveGroupCall extends TLObject {
        public static final int constructor = 1342404601;
        public TLRPC.InputGroupCall call;
        public int source;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1342404601);
            this.call.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.source);
        }
    }

    public static class leaveGroupCallPresentation extends TLObject {
        public static final int constructor = 475058500;
        public TLRPC.InputGroupCall call;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(475058500);
            this.call.serializeToStream(outputSerializedData);
        }
    }

    public static class phoneCallRequested extends PhoneCall {
        public static final int constructor = 347139340;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            int readInt32 = inputSerializedData.readInt32(z10);
            this.flags = readInt32;
            this.video = TLObject.hasFlag(readInt32, 64);
            this.f22618id = inputSerializedData.readInt64(z10);
            this.access_hash = inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
            this.admin_id = inputSerializedData.readInt64(z10);
            this.participant_id = inputSerializedData.readInt64(z10);
            this.g_a_hash = inputSerializedData.readByteArray(z10);
            this.protocol = PhoneCallProtocol.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(347139340);
            int flag = TLObject.setFlag(this.flags, 64, this.video);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            outputSerializedData.writeInt64(this.f22618id);
            outputSerializedData.writeInt64(this.access_hash);
            outputSerializedData.writeInt32(this.date);
            outputSerializedData.writeInt64(this.admin_id);
            outputSerializedData.writeInt64(this.participant_id);
            outputSerializedData.writeByteArray(this.g_a_hash);
            this.protocol.serializeToStream(outputSerializedData);
        }
    }

    public static class receivedCall extends TLObject {
        public static final int constructor = 399855457;
        public TLRPC.TL_inputPhoneCall peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(399855457);
            this.peer.serializeToStream(outputSerializedData);
        }
    }

    public static class requestCall extends TLObject {
        public static final int constructor = 1124046573;
        public int flags;
        public byte[] g_a_hash;
        public TL_phoneCallProtocol protocol;
        public int random_id;
        public TLRPC.InputUser user_id;
        public boolean video;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TL_phone_phoneCall.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1124046573);
            int flag = TLObject.setFlag(this.flags, 1, this.video);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.user_id.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.random_id);
            outputSerializedData.writeByteArray(this.g_a_hash);
            this.protocol.serializeToStream(outputSerializedData);
        }
    }

    public static class saveCallDebug extends TLObject {
        public static final int constructor = 662363518;
        public TLRPC.TL_dataJSON debug;
        public TLRPC.TL_inputPhoneCall peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(662363518);
            this.peer.serializeToStream(outputSerializedData);
            this.debug.serializeToStream(outputSerializedData);
        }
    }

    public static class saveCallLog extends TLObject {
        public static final int constructor = 1092913030;
        public TLRPC.InputFile file;
        public TLRPC.TL_inputPhoneCall peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1092913030);
            this.peer.serializeToStream(outputSerializedData);
            this.file.serializeToStream(outputSerializedData);
        }
    }

    public static class saveDefaultGroupCallJoinAs extends TLObject {
        public static final int constructor = 1465786252;
        public TLRPC.InputPeer join_as;
        public TLRPC.InputPeer peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1465786252);
            this.peer.serializeToStream(outputSerializedData);
            this.join_as.serializeToStream(outputSerializedData);
        }
    }

    public static class saveDefaultSendAs extends TLMethod<TLRPC.Bool> {
        public static final int constructor = 1097313745;
        public TLRPC.InputGroupCall call;
        public TLRPC.InputPeer send_as;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1097313745);
            this.call.serializeToStream(outputSerializedData);
            this.send_as.serializeToStream(outputSerializedData);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class sendConferenceCallBroadcast extends TLObject {
        public static final int constructor = -965732096;
        public byte[] block;
        public TLRPC.InputGroupCall call;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-965732096);
            this.call.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.block);
        }
    }

    public static class sendGroupCallEncryptedMessage extends TLMethod<TLRPC.Bool> {
        public static final int constructor = -441473683;
        public TLRPC.InputGroupCall call;
        public byte[] encrypted_message;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-441473683);
            this.call.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.encrypted_message);
        }

        @Override
        public TLRPC.Bool deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class sendGroupCallMessage extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1311697904;
        public long allow_paid_stars;
        public TLRPC.InputGroupCall call;
        public int flags;
        public TLRPC.TL_textWithEntities message;
        public long random_id;
        public TLRPC.InputPeer send_as;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(-1311697904);
            int i10 = this.flags;
            if (this.send_as != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(i10, 2, z10);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.call.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt64(this.random_id);
            this.message.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 1)) {
                outputSerializedData.writeInt64(this.allow_paid_stars);
            }
            if (TLObject.hasFlag(this.flags, 2)) {
                this.send_as.serializeToStream(outputSerializedData);
            }
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class sendSignalingData extends TLObject {
        public static final int constructor = -8744061;
        public byte[] data;
        public TLRPC.TL_inputPhoneCall peer;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Bool.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-8744061);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeByteArray(this.data);
        }
    }

    public static class setCallRating extends TLObject {
        public static final int constructor = 1508562471;
        public String comment;
        public int flags;
        public TLRPC.TL_inputPhoneCall peer;
        public int rating;
        public boolean user_initiative;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1508562471);
            int flag = TLObject.setFlag(this.flags, 1, this.user_initiative);
            this.flags = flag;
            outputSerializedData.writeInt32(flag);
            this.peer.serializeToStream(outputSerializedData);
            outputSerializedData.writeInt32(this.rating);
            outputSerializedData.writeString(this.comment);
        }
    }

    public static class startScheduledGroupCall extends TLObject {
        public static final int constructor = 1451287362;
        public TLRPC.InputGroupCall call;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(1451287362);
            this.call.serializeToStream(outputSerializedData);
        }
    }

    public static class toggleGroupCallRecord extends TLObject {
        public static final int constructor = -248985848;
        public TLRPC.InputGroupCall call;
        public int flags;
        public boolean start;
        public String title;
        public boolean video;
        public boolean video_portrait;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(-248985848);
            int flag = TLObject.setFlag(this.flags, 1, this.start);
            this.flags = flag;
            int flag2 = TLObject.setFlag(flag, 4, this.video);
            this.flags = flag2;
            outputSerializedData.writeInt32(flag2);
            this.call.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(this.flags, 2)) {
                outputSerializedData.writeString(this.title);
            }
            if (TLObject.hasFlag(this.flags, 4)) {
                outputSerializedData.writeBool(this.video_portrait);
            }
        }
    }

    public static class toggleGroupCallSettings extends TLMethod<TLRPC.Updates> {
        public static final int constructor = -1757179150;
        public TLRPC.InputGroupCall call;
        public Boolean join_muted;
        public Boolean messages_enabled;
        public boolean reset_invite_hash;
        public Long send_paid_messages_stars;

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            boolean z11;
            outputSerializedData.writeInt32(-1757179150);
            boolean z12 = false;
            if (this.join_muted != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            int flag = TLObject.setFlag(TLObject.setFlag(0, 1, z10), 2, this.reset_invite_hash);
            if (this.messages_enabled != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            int flag2 = TLObject.setFlag(flag, 4, z11);
            if (this.send_paid_messages_stars != null) {
                z12 = true;
            }
            int flag3 = TLObject.setFlag(flag2, 8, z12);
            outputSerializedData.writeInt32(flag3);
            this.call.serializeToStream(outputSerializedData);
            if (TLObject.hasFlag(flag3, 1)) {
                outputSerializedData.writeBool(this.join_muted.booleanValue());
            }
            if (TLObject.hasFlag(flag3, 4)) {
                outputSerializedData.writeBool(this.messages_enabled.booleanValue());
            }
            if (TLObject.hasFlag(flag3, 8)) {
                outputSerializedData.writeInt64(this.send_paid_messages_stars.longValue());
            }
        }

        @Override
        public TLRPC.Updates deserializeResponseT(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    public static class toggleGroupCallStartSubscription extends TLObject {
        public static final int constructor = 563885286;
        public TLRPC.InputGroupCall call;
        public boolean subscribed;

        @Override
        public TLObject deserializeResponse(InputSerializedData inputSerializedData, int i10, boolean z10) {
            return TLRPC.Updates.TLdeserialize(inputSerializedData, i10, z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            outputSerializedData.writeInt32(563885286);
            this.call.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.subscribed);
        }
    }
}
