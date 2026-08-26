package org.telegram.ui.Stories;

import androidx.car.app.SurfaceContainer$$ExternalSyntheticOutline0;
import com.google.android.exoplayer2.util.Log;
import java.util.ArrayList;
import org.telegram.SQLite.SQLitePreparedStatement$$ExternalSyntheticOutline0;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda112;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda51;
import org.telegram.ui.StickersActivity$$ExternalSyntheticLambda18;
import org.telegram.ui.TodoItemMenu$$ExternalSyntheticLambda2;

public final class LivePlayer$$ExternalSyntheticLambda0 implements NativeInstance.PayloadCallback, RequestDelegateTimestamp, NativeInstance.VideoSourcesCallback, NativeInstance.RequestBroadcastPartCallback, NativeInstance.RequestCurrentTimeCallback {
    public final int $r8$classId;
    public final LivePlayer f$0;

    public LivePlayer$$ExternalSyntheticLambda0(LivePlayer livePlayer, int i) {
        this.$r8$classId = i;
        this.f$0 = livePlayer;
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        LivePlayer livePlayer = this.f$0;
        if (tL_error != null) {
            livePlayer.getClass();
            return;
        }
        if (livePlayer.instance == null || livePlayer.destroyed) {
            return;
        }
        TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
        int i = 0;
        if (!groupcallstreamchannels.channels.isEmpty()) {
            long j2 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
        }
        if (groupcallstreamchannels.channels.isEmpty()) {
            AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer, 8));
        }
        if (livePlayer.participant == null) {
            TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
            livePlayer.participant = tL_groupCallParticipant;
            tL_groupCallParticipant.peer = MessagesController.getInstance(livePlayer.currentAccount).getPeer(livePlayer.dialogId);
            livePlayer.participant.video = new TLRPC.TL_groupCallParticipantVideo();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
            tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
            ArrayList<TL_phone.TL_groupCallStreamChannel> arrayList = groupcallstreamchannels.channels;
            int size = arrayList.size();
            while (i < size) {
                TL_phone.TL_groupCallStreamChannel tL_groupCallStreamChannel = arrayList.get(i);
                i++;
                tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(tL_groupCallStreamChannel.channel));
            }
            livePlayer.participant.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
            TLRPC.GroupCallParticipant groupCallParticipant = livePlayer.participant;
            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
            tL_groupCallParticipantVideo.endpoint = "unified";
            groupCallParticipant.videoEndpoint = "unified";
            NativeInstance nativeInstance = livePlayer.instance;
            NativeInstance.SsrcGroup[] ssrcGroupArrCreateSsrcGroups$1 = LivePlayer.createSsrcGroups$1(tL_groupCallParticipantVideo);
            livePlayer.pushSources(ssrcGroupArrCreateSsrcGroups$1);
            nativeInstance.addIncomingVideoOutput(2, "unified", ssrcGroupArrCreateSsrcGroups$1, livePlayer.instanceSink, DialogObject.getPeerDialogId(livePlayer.participant.peer));
        }
    }

    @Override
    public void run(int i, String str) {
        LivePlayer livePlayer = this.f$0;
        livePlayer.mySource = i;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z = !livePlayer.outgoing;
        joingroupcall.muted = z;
        joingroupcall.video_stopped = z;
        joingroupcall.call = livePlayer.inputCall;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        int i2 = livePlayer.currentAccount;
        tL_inputPeerUser.user_id = AccountInstance.getInstance(i2).getUserConfig().getClientUserId();
        ConnectionsManager.getInstance(i2).sendRequest(joingroupcall, new LivePlayer$$ExternalSyntheticLambda6(livePlayer, 1));
    }

    @Override
    public void run(long j) {
        LivePlayer livePlayer = this.f$0;
        TLRPC.GroupCall groupCall = livePlayer.call;
        int i = livePlayer.currentAccount;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = livePlayer.inputCall;
            if (livePlayer.call == null || livePlayer.instance == null) {
                return;
            }
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
            LaunchActivity$$ExternalSyntheticLambda112 launchActivity$$ExternalSyntheticLambda112 = new LaunchActivity$$ExternalSyntheticLambda112(livePlayer, j, 9);
            TLRPC.GroupCall groupCall2 = livePlayer.call;
            connectionsManager.sendRequest(getgroupcallstreamchannels, launchActivity$$ExternalSyntheticLambda112, 65536, 2, (groupCall2 == null || (groupCall2.flags & 16) == 0) ? Integer.MAX_VALUE : groupCall2.stream_dc_id);
            return;
        }
        NativeInstance nativeInstance = livePlayer.instance;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j, ConnectionsManager.getInstance(i).getCurrentTimeMillis());
        }
    }

    @Override
    public void run(final long j, final long j2, final int i, final int i2) {
        String strM;
        switch (this.$r8$classId) {
            case 3:
                final LivePlayer livePlayer = this.f$0;
                if (livePlayer.call != null) {
                    StringBuilder sb = new StringBuilder("[LivePlayer] sending getFile time_ms=");
                    sb.append(j);
                    sb.append(j2 == 500 ? ", scale = 1" : "");
                    sb.append(", video_channel = ");
                    sb.append(i);
                    sb.append(", video_quality = ");
                    sb.append(i2);
                    FileLog.d(sb.toString());
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
                    tL_upload_getFile.limit = 131072;
                    TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
                    tL_inputGroupCallStream.call = livePlayer.inputCall;
                    tL_inputGroupCallStream.time_ms = j;
                    if (j2 == 500) {
                        tL_inputGroupCallStream.scale = 1;
                    }
                    if (i != 0) {
                        tL_inputGroupCallStream.flags |= 1;
                        tL_inputGroupCallStream.video_channel = i;
                        tL_inputGroupCallStream.video_quality = i2;
                    }
                    tL_upload_getFile.location = tL_inputGroupCallStream;
                    if (i == 0) {
                        strM = Log.m(j, "");
                    } else {
                        strM = i + "_" + j + "_" + i2;
                    }
                    ConnectionsManager connectionsManager = AccountInstance.getInstance(livePlayer.currentAccount).getConnectionsManager();
                    final String str = strM;
                    RequestDelegateTimestamp requestDelegateTimestamp = new RequestDelegateTimestamp() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
                            LivePlayer livePlayer2 = livePlayer;
                            if (livePlayer2.destroyed || livePlayer2.instance == null) {
                                return;
                            }
                            AndroidUtilities.runOnUIThread(new StickersActivity$$ExternalSyntheticLambda18(19, livePlayer2, str));
                            long j4 = jCurrentTimeMillis;
                            long j5 = j;
                            long j6 = j2;
                            int i3 = i;
                            int i4 = i2;
                            if (tLObject != null) {
                                TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
                                StringBuilder sb2 = new StringBuilder("[LivePlayer] received in ");
                                sb2.append(System.currentTimeMillis() - j4);
                                sb2.append("ms getFile{time_ms=");
                                sb2.append(j5);
                                sb2.append(j6 == 500 ? ", scale = 1" : "");
                                sb2.append(", video_channel = ");
                                sb2.append(i3);
                                sb2.append(", video_quality = ");
                                sb2.append(i4);
                                sb2.append("}: ");
                                sb2.append(tL_upload_file.bytes.limit());
                                sb2.append(" bytes");
                                FileLog.d(sb2.toString());
                                NativeInstance nativeInstance = livePlayer2.instance;
                                NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
                                nativeInstance.onStreamPartAvailable(j5, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j3, i3, i4);
                                return;
                            }
                            if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                                livePlayer2.instance.onStreamPartAvailable(j5, null, -1, j3, i3, i4);
                                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer2, 4));
                                return;
                            }
                            if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer2, 6));
                                StringBuilder sb3 = new StringBuilder("[LivePlayer] received in ");
                                sb3.append(System.currentTimeMillis() - j4);
                                sb3.append("ms getFile{time_ms=");
                                sb3.append(j5);
                                sb3.append(j6 == 500 ? ", scale = 1" : "");
                                sb3.append(", video_channel = ");
                                sb3.append(i3);
                                sb3.append(", video_quality = ");
                                sb3.append(i4);
                                sb3.append("}: ");
                                sb3.append(tL_error.text);
                                sb3.append(" => rejoining");
                                FileLog.d(sb3.toString());
                                return;
                            }
                            int i5 = ("TIME_TOO_BIG".equals(tL_error.text) || tL_error.text.startsWith("FLOOD_WAIT")) ? 0 : -1;
                            StringBuilder sb4 = new StringBuilder("[LivePlayer] received in ");
                            sb4.append(System.currentTimeMillis() - j4);
                            sb4.append("ms getFile{time_ms=");
                            sb4.append(j5);
                            sb4.append(j6 == 500 ? ", scale = 1" : "");
                            sb4.append(", video_channel = ");
                            sb4.append(i3);
                            sb4.append(", video_quality = ");
                            sb4.append(i4);
                            sb4.append("}: ");
                            sb4.append(tL_error.text);
                            sb4.append(" => ");
                            sb4.append(i5);
                            FileLog.d(sb4.toString());
                            livePlayer2.instance.onStreamPartAvailable(j5, null, i5, j3, i3, i4);
                        }
                    };
                    TLRPC.GroupCall groupCall = livePlayer.call;
                    AndroidUtilities.runOnUIThread(new TodoItemMenu$$ExternalSyntheticLambda2(livePlayer, str, connectionsManager.sendRequest(tL_upload_getFile, requestDelegateTimestamp, 2, 2, (groupCall == null || (groupCall.flags & 16) == 0) ? Integer.MAX_VALUE : groupCall.stream_dc_id), 7));
                    break;
                }
                break;
            default:
                LivePlayer livePlayer2 = this.f$0;
                livePlayer2.getClass();
                StringBuilder sb2 = new StringBuilder("[LivePlayer] cancelling getFile time_ms=");
                sb2.append(j);
                sb2.append(j2 == 500 ? ", scale = 1" : "");
                SQLitePreparedStatement$$ExternalSyntheticOutline0.m(i != 0 ? SurfaceContainer$$ExternalSyntheticOutline0.m(i, i2, ", video_channel = ", ", video_quality = ") : "", sb2);
                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda9(i, i2, 0, j, livePlayer2));
                break;
        }
    }

    @Override
    public void run(long j, int[] iArr) {
        LivePlayer livePlayer = this.f$0;
        if (livePlayer.instance == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = livePlayer.inputCall;
        getgroupparticipants.offset = "";
        int iM = 0;
        while (iM < iArr.length) {
            iM = LocationController$$ExternalSyntheticOutline0.m(iArr[iM], iM, 1, getgroupparticipants.sources);
        }
        ConnectionsManager.getInstance(livePlayer.currentAccount).sendRequest(getgroupparticipants, new LaunchActivity$$ExternalSyntheticLambda51(livePlayer, iArr, j));
    }
}
