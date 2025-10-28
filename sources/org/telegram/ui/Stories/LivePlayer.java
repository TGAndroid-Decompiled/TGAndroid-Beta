package org.telegram.ui.Stories;

import android.content.Context;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda106;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.webrtc.VideoSink;

public class LivePlayer implements NotificationCenter.NotificationCenterDelegate {
    public static LivePlayer recording;
    private TLRPC.GroupCall call;
    public final Context context;
    public final int currentAccount;
    public final long dialogId;
    private VideoSink displaySink;
    public final TLRPC.InputGroupCall inputCall;
    private NativeInstance instance;
    private boolean joined;
    private int mySource;
    public final boolean outgoing;
    private TLRPC.GroupCallParticipant participant;
    private Runnable pollRunnable;
    private boolean polling;
    private long recordingVideoCapturer;
    public boolean destroyed = false;
    private final HashMap currentStreamRequestTimestamp = new HashMap();
    private boolean isFront = false;
    private int pollingRequestId = -1;
    private VoIPService.ProxyVideoSink instanceSink = new VoIPService.ProxyVideoSink();

    public static void lambda$init$6(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    public LivePlayer(Context context, int i, long j, TLRPC.InputGroupCall inputGroupCall, boolean z) {
        this.context = context;
        this.currentAccount = i;
        this.inputCall = inputGroupCall;
        this.dialogId = j;
        this.outgoing = z;
        FileLog.d("[LivePlayer] setup to call " + inputGroupCall.id);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storyGroupCallUpdated);
        if (z) {
            this.recordingVideoCapturer = NativeInstance.createVideoCapturer(this.instanceSink, 0);
        }
        init();
    }

    private void init() {
        if (this.destroyed) {
            return;
        }
        NativeInstance makeGroup = NativeInstance.makeGroup(VoIPHelper.getLogFilePath("live_" + this.inputCall.id), 0L, false, false, new NativeInstance.PayloadCallback() {
            @Override
            public final void run(int i, String str) {
                LivePlayer.this.lambda$init$5(i, str);
            }
        }, new NativeInstance.AudioLevelsCallback() {
            @Override
            public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
                LivePlayer.lambda$init$6(iArr, fArr, zArr);
            }
        }, new NativeInstance.VideoSourcesCallback() {
            @Override
            public final void run(long j, int[] iArr) {
                LivePlayer.this.lambda$init$8(j, iArr);
            }
        }, new NativeInstance.RequestBroadcastPartCallback() {
            @Override
            public final void run(long j, long j2, int i, int i2) {
                LivePlayer.this.lambda$init$13(j, j2, i, i2);
            }
        }, new NativeInstance.RequestBroadcastPartCallback() {
            @Override
            public final void run(long j, long j2, int i, int i2) {
                LivePlayer.this.lambda$init$15(j, j2, i, i2);
            }
        }, new NativeInstance.RequestCurrentTimeCallback() {
            @Override
            public final void run(long j) {
                LivePlayer.this.lambda$init$17(j);
            }
        }, false);
        this.instance = makeGroup;
        makeGroup.resetGroupInstance(false, false);
    }

    public void lambda$init$5(int i, String str) {
        this.mySource = i;
        TL_phone.joinGroupCall joingroupcall = new TL_phone.joinGroupCall();
        boolean z = !this.outgoing;
        joingroupcall.muted = z;
        joingroupcall.video_stopped = z;
        joingroupcall.call = this.inputCall;
        TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
        joingroupcall.params = tL_dataJSON;
        tL_dataJSON.data = str;
        TLRPC.TL_inputPeerUser tL_inputPeerUser = new TLRPC.TL_inputPeerUser();
        joingroupcall.join_as = tL_inputPeerUser;
        tL_inputPeerUser.user_id = AccountInstance.getInstance(this.currentAccount).getUserConfig().getClientUserId();
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(joingroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LivePlayer.this.lambda$init$4(tLObject, tL_error);
            }
        });
    }

    public void lambda$init$4(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            Iterator it = MessagesController.findUpdates(updates, TLRPC.TL_updateGroupCall.class).iterator();
            while (it.hasNext()) {
                this.call = ((TLRPC.TL_updateGroupCall) it.next()).call;
            }
            final ArrayList findUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TLRPC.TL_updateGroupCallMessage.class);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LivePlayer.this.lambda$init$0(findUpdatesAndRemove);
                }
            });
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
            TLRPC.GroupCall groupCall = this.call;
            boolean z = groupCall != null && groupCall.rtmp_stream;
            Iterator it2 = MessagesController.findUpdates(updates, TLRPC.TL_updateGroupCallParticipants.class).iterator();
            while (it2.hasNext()) {
                TLRPC.TL_updateGroupCallParticipants tL_updateGroupCallParticipants = (TLRPC.TL_updateGroupCallParticipants) it2.next();
                if (tL_updateGroupCallParticipants.call.id == getCallId() && !z) {
                    int i = 0;
                    while (true) {
                        if (i >= tL_updateGroupCallParticipants.participants.size()) {
                            break;
                        }
                        if (DialogObject.getPeerDialogId(tL_updateGroupCallParticipants.participants.get(i).peer) == this.dialogId) {
                            this.participant = tL_updateGroupCallParticipants.participants.get(i);
                            break;
                        }
                        i++;
                    }
                    if (this.participant != null) {
                        break;
                    }
                }
            }
            Iterator it3 = MessagesController.findUpdates(updates, TLRPC.TL_updateGroupCallConnection.class).iterator();
            TLRPC.TL_dataJSON tL_dataJSON = null;
            while (it3.hasNext()) {
                tL_dataJSON = ((TLRPC.TL_updateGroupCallConnection) it3.next()).params;
            }
            if (this.destroyed || this.instance == null) {
                return;
            }
            FileLog.d("[LivePlayer] joined call " + this.inputCall.id);
            this.joined = true;
            if (this.outgoing) {
                this.instance.activateVideoCapturer(this.recordingVideoCapturer);
                this.instance.setupOutgoingVideoCreated(this.recordingVideoCapturer);
            } else {
                TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
                if (groupCallParticipant != null) {
                    TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                    if (tL_groupCallParticipantVideo != null) {
                        this.instance.addIncomingVideoOutput(2, tL_groupCallParticipantVideo.endpoint, createSsrcGroups(tL_groupCallParticipantVideo), this.instanceSink, DialogObject.getPeerDialogId(this.participant.peer));
                    }
                } else if (z) {
                    TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                    getgroupcallstreamchannels.call = this.inputCall;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamchannels, new RequestDelegateTimestamp() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2, long j) {
                            LivePlayer.this.lambda$init$1(tLObject2, tL_error2, j);
                        }
                    }, 65536, 2, getCallStreamDatacenterId());
                } else {
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = this.inputCall;
                    getgroupcall.limit = 10;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            LivePlayer.this.lambda$init$2(tLObject2, tL_error2);
                        }
                    });
                }
            }
            if (tL_dataJSON != null && !tL_dataJSON.data.startsWith("{\"stream\":true")) {
                this.instance.setJoinResponsePayload(tL_dataJSON.data);
            } else {
                this.instance.prepareForStream(z);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LivePlayer.this.lambda$init$3();
                }
            });
        }
    }

    public void lambda$init$0(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TLRPC.TL_updateGroupCallMessage) it.next();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
        }
    }

    public void lambda$init$1(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        if (tL_error != null || this.instance == null || this.destroyed) {
            return;
        }
        TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
        if (!groupcallstreamchannels.channels.isEmpty()) {
            long j2 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
        }
        if (this.participant == null) {
            TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
            this.participant = tL_groupCallParticipant;
            tL_groupCallParticipant.peer = MessagesController.getInstance(this.currentAccount).getPeer(this.dialogId);
            this.participant.video = new TLRPC.TL_groupCallParticipantVideo();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
            tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
            Iterator<TL_phone.TL_groupCallStreamChannel> it = groupcallstreamchannels.channels.iterator();
            while (it.hasNext()) {
                tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(it.next().channel));
            }
            this.participant.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
            TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
            TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
            tL_groupCallParticipantVideo.endpoint = "unified";
            groupCallParticipant.videoEndpoint = "unified";
            this.instance.addIncomingVideoOutput(2, "unified", createSsrcGroups(tL_groupCallParticipantVideo), this.instanceSink, DialogObject.getPeerDialogId(this.participant.peer));
        }
    }

    public void lambda$init$2(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            int i = 0;
            MessagesController.getInstance(this.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(groupcall.chats, false);
            while (true) {
                if (i >= groupcall.participants.size()) {
                    break;
                }
                if (DialogObject.getPeerDialogId(groupcall.participants.get(i).peer) == this.dialogId) {
                    this.participant = groupcall.participants.get(i);
                    break;
                }
                i++;
            }
            TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
            if (groupCallParticipant == null || (tL_groupCallParticipantVideo = groupCallParticipant.video) == null) {
                return;
            }
            this.instance.addIncomingVideoOutput(2, tL_groupCallParticipantVideo.endpoint, createSsrcGroups(tL_groupCallParticipantVideo), this.instanceSink, DialogObject.getPeerDialogId(this.participant.peer));
        }
    }

    public void lambda$init$3() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(this.call.id));
        setPolling(true);
    }

    public void lambda$init$8(final long j, final int[] iArr) {
        if (this.instance == null) {
            return;
        }
        TL_phone.getGroupParticipants getgroupparticipants = new TL_phone.getGroupParticipants();
        getgroupparticipants.call = this.inputCall;
        getgroupparticipants.offset = "";
        for (int i : iArr) {
            getgroupparticipants.sources.add(Integer.valueOf(i));
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupparticipants, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LivePlayer.this.lambda$init$7(iArr, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$init$7(int[] iArr, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_phone.groupParticipants) {
            TL_phone.groupParticipants groupparticipants = (TL_phone.groupParticipants) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(groupparticipants.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(groupparticipants.chats, false);
            if (this.instance == null) {
                return;
            }
            UserConfig.getInstance(this.currentAccount).getClientUserId();
            ArrayList arrayList = new ArrayList();
            for (int i : iArr) {
                Iterator<TLRPC.GroupCallParticipant> it = groupparticipants.participants.iterator();
                while (true) {
                    if (it.hasNext()) {
                        TLRPC.GroupCallParticipant next = it.next();
                        if (next.source == i) {
                            arrayList.add(new VoIPService.RequestedParticipant(next, i));
                            break;
                        }
                    }
                }
            }
            this.instance.onMediaDescriptionAvailable(j, (VoIPService.RequestedParticipant[]) arrayList.toArray(new VoIPService.RequestedParticipant[0]));
        }
    }

    public void lambda$init$13(final long j, long j2, final int i, final int i2) {
        StringBuilder sb;
        if (this.call == null) {
            return;
        }
        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
        tL_upload_getFile.limit = 131072;
        TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
        tL_inputGroupCallStream.call = this.inputCall;
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
            sb = new StringBuilder();
            sb.append("");
            sb.append(j);
        } else {
            sb = new StringBuilder();
            sb.append(i);
            sb.append("_");
            sb.append(j);
            sb.append("_");
            sb.append(i2);
        }
        final String sb2 = sb.toString();
        final int sendRequest = AccountInstance.getInstance(this.currentAccount).getConnectionsManager().sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
                LivePlayer.this.lambda$init$11(sb2, j, i, i2, tLObject, tL_error, j3);
            }
        }, 65536, 2, getCallStreamDatacenterId());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LivePlayer.this.lambda$init$12(sb2, sendRequest);
            }
        });
    }

    public void lambda$init$11(final String str, long j, int i, int i2, TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
        if (this.destroyed) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LivePlayer.this.lambda$init$9(str);
            }
        });
        if (tLObject != null) {
            NativeInstance nativeInstance = this.instance;
            NativeByteBuffer nativeByteBuffer = ((TLRPC.TL_upload_file) tLObject).bytes;
            nativeInstance.onStreamPartAvailable(j, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j2, i, i2);
        } else if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    LivePlayer.this.lambda$init$10();
                }
            });
        } else {
            this.instance.onStreamPartAvailable(j, null, ("TIME_TOO_BIG".equals(tL_error.text) || tL_error.text.startsWith("FLOOD_WAIT")) ? 0 : -1, j2, i, i2);
        }
    }

    public void lambda$init$9(String str) {
        this.currentStreamRequestTimestamp.remove(str);
    }

    public void lambda$init$10() {
        if (this.instance != null) {
            DispatchQueue dispatchQueue = Utilities.globalQueue;
            NativeInstance nativeInstance = this.instance;
            Objects.requireNonNull(nativeInstance);
            dispatchQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda106(nativeInstance));
            this.instance = null;
        }
        init();
    }

    public void lambda$init$12(String str, int i) {
        this.currentStreamRequestTimestamp.put(str, Integer.valueOf(i));
    }

    public void lambda$init$15(final long j, long j2, final int i, final int i2) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LivePlayer.this.lambda$init$14(i, j, i2);
            }
        });
    }

    public void lambda$init$14(int i, long j, int i2) {
        String str;
        if (i == 0) {
            str = "" + j;
        } else {
            str = i + "_" + j + "_" + i2;
        }
        Integer num = (Integer) this.currentStreamRequestTimestamp.get(str);
        if (num != null) {
            AccountInstance.getInstance(this.currentAccount).getConnectionsManager().cancelRequest(num.intValue(), true);
            this.currentStreamRequestTimestamp.remove(str);
        }
    }

    public void lambda$init$17(final long j) {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = this.inputCall;
            if (this.call == null || this.instance == null) {
                NativeInstance nativeInstance = this.instance;
                if (nativeInstance != null) {
                    nativeInstance.onRequestTimeComplete(j, 0L);
                    return;
                }
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamchannels, new RequestDelegateTimestamp() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
                    LivePlayer.this.lambda$init$16(j, tLObject, tL_error, j2);
                }
            }, 65536, 2, getCallStreamDatacenterId());
            return;
        }
        NativeInstance nativeInstance2 = this.instance;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(j, ConnectionsManager.getInstance(this.currentAccount).getCurrentTimeMillis());
        }
    }

    public void lambda$init$16(long j, TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
        if (tL_error == null) {
            if (this.instance == null || this.destroyed) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            r13 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (this.participant == null) {
                TLRPC.TL_groupCallParticipant tL_groupCallParticipant = new TLRPC.TL_groupCallParticipant();
                this.participant = tL_groupCallParticipant;
                tL_groupCallParticipant.peer = MessagesController.getInstance(this.currentAccount).getPeer(this.dialogId);
                this.participant.video = new TLRPC.TL_groupCallParticipantVideo();
                TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = new TLRPC.TL_groupCallParticipantVideoSourceGroup();
                tL_groupCallParticipantVideoSourceGroup.semantics = "SIM";
                Iterator<TL_phone.TL_groupCallStreamChannel> it = groupcallstreamchannels.channels.iterator();
                while (it.hasNext()) {
                    tL_groupCallParticipantVideoSourceGroup.sources.add(Integer.valueOf(it.next().channel));
                }
                this.participant.video.source_groups.add(tL_groupCallParticipantVideoSourceGroup);
                TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
                TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                tL_groupCallParticipantVideo.endpoint = "unified";
                groupCallParticipant.videoEndpoint = "unified";
                this.instance.addIncomingVideoOutput(2, "unified", createSsrcGroups(tL_groupCallParticipantVideo), this.instanceSink, DialogObject.getPeerDialogId(this.participant.peer));
            }
        }
        NativeInstance nativeInstance = this.instance;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j, r13);
        }
    }

    public VideoSink getDisplaySink() {
        return this.displaySink;
    }

    public void setDisplaySink(VideoSink videoSink) {
        if (this.displaySink == videoSink) {
            return;
        }
        VoIPService.ProxyVideoSink proxyVideoSink = this.instanceSink;
        this.displaySink = videoSink;
        proxyVideoSink.setTarget(videoSink);
    }

    @Override
    public void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storyGroupCallUpdated) {
            long longValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.dialogId == longValue) {
                this.call = TlUtils.applyGroupCallUpdate(this.call, groupCall);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(groupCall.id));
            }
        }
    }

    public boolean equals(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.inputCall;
        return inputGroupCall2 == inputGroupCall || inputGroupCall2.id == inputGroupCall.id;
    }

    public void destroy() {
        if (this.destroyed) {
            return;
        }
        this.destroyed = true;
        setPolling(false);
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.storyGroupCallUpdated);
        FileLog.d("[LivePlayer] destroyed");
        if (this.joined) {
            TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
            leavegroupcall.call = this.inputCall;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcall, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    LivePlayer.this.lambda$destroy$18(tLObject, tL_error);
                }
            });
        }
        if (this.outgoing) {
            this.instanceSink.setTarget(null);
            NativeInstance.destroyVideoCapturer(this.recordingVideoCapturer);
        }
        if (this.instance != null) {
            DispatchQueue dispatchQueue = Utilities.globalQueue;
            NativeInstance nativeInstance = this.instance;
            Objects.requireNonNull(nativeInstance);
            dispatchQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda106(nativeInstance));
            this.instance = null;
        }
        if (recording == this) {
            recording = null;
        }
    }

    public void lambda$destroy$18(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public int getWatchersCount() {
        int i = !BuildVars.DEBUG_PRIVATE_VERSION ? 1 : 0;
        TLRPC.GroupCall groupCall = this.call;
        return Math.max(i, groupCall == null ? 0 : groupCall.participants_count);
    }

    public boolean areMessagesEnabled() {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall == null) {
            return true;
        }
        return groupCall.messages_enabled;
    }

    public long getSendPaidMessagesStars() {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    private int getCallStreamDatacenterId() {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall == null || (groupCall.flags & 16) == 0) {
            return Integer.MAX_VALUE;
        }
        return groupCall.stream_dc_id;
    }

    private NativeInstance.SsrcGroup[] createSsrcGroups(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
        if (tL_groupCallParticipantVideo.source_groups.isEmpty()) {
            return null;
        }
        int size = tL_groupCallParticipantVideo.source_groups.size();
        NativeInstance.SsrcGroup[] ssrcGroupArr = new NativeInstance.SsrcGroup[size];
        for (int i = 0; i < size; i++) {
            ssrcGroupArr[i] = new NativeInstance.SsrcGroup();
            TLRPC.TL_groupCallParticipantVideoSourceGroup tL_groupCallParticipantVideoSourceGroup = tL_groupCallParticipantVideo.source_groups.get(i);
            NativeInstance.SsrcGroup ssrcGroup = ssrcGroupArr[i];
            ssrcGroup.semantics = tL_groupCallParticipantVideoSourceGroup.semantics;
            ssrcGroup.ssrcs = new int[tL_groupCallParticipantVideoSourceGroup.sources.size()];
            int i2 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i].ssrcs;
                if (i2 < iArr.length) {
                    iArr[i2] = tL_groupCallParticipantVideoSourceGroup.sources.get(i2).intValue();
                    i2++;
                }
            }
        }
        return ssrcGroupArr;
    }

    private void setPolling(boolean z) {
        if (this.polling == z) {
            return;
        }
        this.polling = z;
        if (!z) {
            if (this.pollingRequestId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.pollingRequestId, true);
                this.pollingRequestId = -1;
            }
            Runnable runnable = this.pollRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.pollRunnable = null;
                return;
            }
            return;
        }
        Runnable runnable2 = new Runnable() {
            @Override
            public final void run() {
                LivePlayer.this.lambda$setPolling$19();
            }
        };
        this.pollRunnable = runnable2;
        AndroidUtilities.runOnUIThread(runnable2, 4000L);
    }

    public void lambda$setPolling$19() {
        this.pollRunnable = null;
        if (this.destroyed) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.inputCall;
        checkgroupcall.sources.add(Integer.valueOf(this.mySource));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkgroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                LivePlayer.this.lambda$poll$22(tLObject, tL_error);
            }
        });
    }

    public void lambda$poll$22(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                LivePlayer.this.lambda$poll$21(tLObject, tL_error);
            }
        });
    }

    public void lambda$poll$21(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (this.destroyed) {
            return;
        }
        if (tLObject instanceof Vector) {
            if (!((Vector) tLObject).toIntArray().contains(Integer.valueOf(this.mySource))) {
                if (this.instance != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = this.instance;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda106(nativeInstance));
                    this.instance = null;
                }
                init();
            }
        } else if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(groupcall.chats, false);
            this.call = groupcall.call;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(this.call.id));
        }
        if (this.polling) {
            Runnable runnable = new Runnable() {
                @Override
                public final void run() {
                    LivePlayer.this.lambda$poll$20();
                }
            };
            this.pollRunnable = runnable;
            AndroidUtilities.runOnUIThread(runnable, 4000L);
        }
    }

    public void switchCamera() {
        if (this.outgoing) {
            long j = this.recordingVideoCapturer;
            boolean z = !this.isFront;
            this.isFront = z;
            NativeInstance.switchCameraCapturer(j, z);
        }
    }

    public long getCallId() {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall != null) {
            return groupCall.id;
        }
        TLRPC.InputGroupCall inputGroupCall = this.inputCall;
        if (inputGroupCall != null) {
            return inputGroupCall.id;
        }
        return 0L;
    }

    public void end() {
        if (this.destroyed) {
            return;
        }
        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
        discardgroupcall.call = this.inputCall;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardgroupcall, null);
        destroy();
    }
}
