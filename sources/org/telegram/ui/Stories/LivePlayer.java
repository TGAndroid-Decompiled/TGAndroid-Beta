package org.telegram.ui.Stories;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPService$$ExternalSyntheticLambda105;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.PermissionRequest;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public class LivePlayer implements NotificationCenter.NotificationCenterDelegate, AudioManager.OnAudioFocusChangeListener {
    public static LivePlayer recording;
    private TLRPC.GroupCall call;
    private int connectionState;
    public final Context context;
    public final int currentAccount;
    private final HashMap currentStreamRequestTimestamp;
    public boolean destroyed;
    public final long dialogId;
    private VideoSink displaySink;
    private boolean emptyStream;
    private boolean hasAudioFocus;
    public final TLRPC.InputGroupCall inputCall;
    private NativeInstance instance;
    private VoIPService.ProxyVideoSink instanceSink;
    private boolean isFront;
    private boolean isMuted;
    public final boolean isRtmpStream;
    private boolean joined;
    private boolean listeningToAudioFocus;
    public ArrayList messages;
    private int mySource;
    public boolean outgoing;
    private TLRPC.GroupCallParticipant participant;
    private Runnable poll2Runnable;
    private Runnable pollRunnable;
    private boolean polling;
    private int polling2RequestId;
    private int pollingRequestId;
    private long recordingVideoCapturer;
    private final HashSet srcs;
    public final int storyId;
    public TL_stories.StoryItem storyItem;
    public ArrayList topMessages;
    private float volume;

    public static void lambda$init$11(int[] iArr, float[] fArr, boolean[] zArr) {
    }

    public boolean isMuted() {
        return this.outgoing && this.isMuted;
    }

    public void setMuted(boolean z) {
        if (!this.outgoing || this.isMuted == z) {
            return;
        }
        this.isMuted = z;
        NativeInstance nativeInstance = this.instance;
        if (nativeInstance != null) {
            nativeInstance.setMuteMicrophone(z);
        }
    }

    public void setEmptyStream(boolean z) {
        if (this.destroyed || this.emptyStream == z) {
            return;
        }
        if (this.outgoing && z) {
            return;
        }
        this.emptyStream = z;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(getCallId()));
    }

    public boolean isEmptyStream() {
        return !this.destroyed && this.emptyStream;
    }

    public boolean canContinueEmptyStream() {
        TLRPC.GroupCall groupCall;
        return (this.destroyed || this.outgoing || !this.emptyStream || recording != null || (groupCall = this.call) == null || groupCall.rtmp_stream || !groupCall.creator) ? false : true;
    }

    public void continueStreaming() {
        if (this.outgoing) {
            return;
        }
        PermissionRequest.ensureAllPermissions(R.raw.permission_request_camera, R.string.PermissionNoCameraMicVideo, new String[]{"android.permission.CAMERA", "android.permission.RECORD_AUDIO"}, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                this.f$0.lambda$continueStreaming$0((Boolean) obj);
            }
        });
    }

    public void lambda$continueStreaming$0(Boolean bool) {
        if (bool.booleanValue() && !this.destroyed) {
            this.outgoing = true;
            this.isFront = true;
            setPolling(false);
            recording = this;
            this.recordingVideoCapturer = NativeInstance.createVideoCapturer(this.instanceSink, this.isFront ? 1 : 0);
            if (this.instance != null) {
                DispatchQueue dispatchQueue = Utilities.globalQueue;
                NativeInstance nativeInstance = this.instance;
                Objects.requireNonNull(nativeInstance);
                dispatchQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda105(nativeInstance));
                this.srcs.clear();
                this.instance = null;
            }
            configureAudio();
            init();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(this.inputCall.id));
        }
    }

    public LivePlayer(Context context, int i, TL_stories.StoryItem storyItem, long j, int i2, boolean z, TLRPC.InputGroupCall inputGroupCall) {
        this(context, i, storyItem, j, i2, z, inputGroupCall, false, false);
    }

    public LivePlayer(Context context, int i, TL_stories.StoryItem storyItem, long j, int i2, boolean z, TLRPC.InputGroupCall inputGroupCall, boolean z2, boolean z3) {
        this.isMuted = false;
        this.emptyStream = false;
        this.destroyed = false;
        this.currentStreamRequestTimestamp = new HashMap();
        this.isFront = false;
        this.srcs = new HashSet();
        this.volume = 1.0f;
        this.pollingRequestId = -1;
        this.polling2RequestId = -1;
        this.context = context;
        this.currentAccount = i;
        this.inputCall = inputGroupCall;
        this.storyItem = storyItem;
        this.dialogId = j;
        this.storyId = i2;
        this.isRtmpStream = z;
        this.outgoing = z2;
        this.isFront = z3;
        this.instanceSink = new AnonymousClass1();
        FileLog.d("[LivePlayer] setup to call " + inputGroupCall.id);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storyGroupCallUpdated);
        if (z2) {
            this.recordingVideoCapturer = NativeInstance.createVideoCapturer(this.instanceSink, z3 ? 1 : 0);
        }
        configureAudio();
        init();
    }

    class AnonymousClass1 extends VoIPService.ProxyVideoSink {
        AnonymousClass1() {
        }

        @Override
        public synchronized void onFrame(VideoFrame videoFrame) {
            super.onFrame(videoFrame);
            if (LivePlayer.this.emptyStream) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onFrame$0();
                    }
                });
            }
        }

        public void lambda$onFrame$0() {
            LivePlayer.this.setEmptyStream(false);
        }
    }

    private void configureAudio() {
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
        if (this.isRtmpStream) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.outgoing) {
            audioManager.setMode(3);
            boolean z = audioManager.requestAudioFocus(this, 0, 2) == 1;
            this.hasAudioFocus = z;
            this.listeningToAudioFocus = z;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    @Override
    public void onAudioFocusChange(int i) {
        this.hasAudioFocus = i == 1;
    }

    private void init() {
        if (this.destroyed) {
            return;
        }
        NativeInstance nativeInstanceMakeGroup = NativeInstance.makeGroup(VoIPHelper.getLogFilePath("live_" + this.inputCall.id), 0L, false, SharedConfig.noiseSupression, new NativeInstance.PayloadCallback() {
            @Override
            public final void run(int i, String str) {
                this.f$0.lambda$init$10(i, str);
            }
        }, new NativeInstance.AudioLevelsCallback() {
            @Override
            public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
                LivePlayer.lambda$init$11(iArr, fArr, zArr);
            }
        }, new NativeInstance.VideoSourcesCallback() {
            @Override
            public final void run(long j, int[] iArr) {
                this.f$0.lambda$init$13(j, iArr);
            }
        }, new NativeInstance.RequestBroadcastPartCallback() {
            @Override
            public final void run(long j, long j2, int i, int i2) {
                this.f$0.lambda$init$18(j, j2, i, i2);
            }
        }, new NativeInstance.RequestBroadcastPartCallback() {
            @Override
            public final void run(long j, long j2, int i, int i2) {
                this.f$0.lambda$init$20(j, j2, i, i2);
            }
        }, new NativeInstance.RequestCurrentTimeCallback() {
            @Override
            public final void run(long j) {
                this.f$0.lambda$init$23(j);
            }
        }, false);
        this.instance = nativeInstanceMakeGroup;
        nativeInstanceMakeGroup.setOnStateUpdatedListener(new AnonymousClass2());
        this.instance.resetGroupInstance(false, false);
    }

    public void lambda$init$10(int i, String str) {
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
                this.f$0.lambda$init$9(tLObject, tL_error);
            }
        });
    }

    public void lambda$init$9(final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
            Iterator it = MessagesController.findUpdates(updates, TLRPC.TL_updateGroupCall.class).iterator();
            while (it.hasNext()) {
                this.call = ((TLRPC.TL_updateGroupCall) it.next()).call;
            }
            final ArrayList arrayListFindUpdatesAndRemove = MessagesController.findUpdatesAndRemove(updates, TLRPC.TL_updateGroupCallMessage.class);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$init$1(arrayListFindUpdatesAndRemove);
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
            FileLog.d("[LivePlayer] joined call " + this.inputCall.id);
            this.joined = true;
            if (this.destroyed || this.instance == null) {
                TL_phone.leaveGroupCall leavegroupcall = new TL_phone.leaveGroupCall();
                leavegroupcall.call = this.inputCall;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcall, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        this.f$0.lambda$init$2(tLObject, tLObject2, tL_error2);
                    }
                });
                return;
            }
            if (tL_dataJSON != null && !tL_dataJSON.data.startsWith("{\"stream\":true")) {
                this.instance.setJoinResponsePayload(tL_dataJSON.data);
            } else {
                this.instance.prepareForStream(z);
            }
            if (this.outgoing) {
                this.instance.setMuteMicrophone(this.isMuted);
                this.instance.activateVideoCapturer(this.recordingVideoCapturer);
                this.instance.setupOutgoingVideoCreated(this.recordingVideoCapturer);
            } else {
                TLRPC.GroupCallParticipant groupCallParticipant = this.participant;
                if (groupCallParticipant != null) {
                    TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo = groupCallParticipant.video;
                    if (tL_groupCallParticipantVideo != null) {
                        this.instance.addIncomingVideoOutput(2, tL_groupCallParticipantVideo.endpoint, pushSources(createSsrcGroups(tL_groupCallParticipantVideo)), this.instanceSink, DialogObject.getPeerDialogId(this.participant.peer));
                    } else {
                        AndroidUtilities.runOnUIThread(new Runnable() {
                            @Override
                            public final void run() {
                                this.f$0.lambda$init$7();
                            }
                        });
                    }
                } else if (z) {
                    TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
                    getgroupcallstreamchannels.call = this.inputCall;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamchannels, new RequestDelegateTimestamp() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2, long j) {
                            this.f$0.lambda$init$4(tLObject2, tL_error2, j);
                        }
                    }, 65536, 2, getCallStreamDatacenterId());
                } else {
                    TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
                    getgroupcall.call = this.inputCall;
                    getgroupcall.limit = 10;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                            this.f$0.lambda$init$6(tLObject2, tL_error2);
                        }
                    });
                }
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$init$8();
                }
            });
            return;
        }
        if (tL_error == null || !"GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda23(this));
    }

    public void lambda$init$1(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TLRPC.TL_updateGroupCallMessage tL_updateGroupCallMessage = (TLRPC.TL_updateGroupCallMessage) it.next();
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryMessageUpdate, Long.valueOf(tL_updateGroupCallMessage.call.id), tL_updateGroupCallMessage, Boolean.TRUE);
        }
    }

    public void lambda$init$2(TLObject tLObject, TLObject tLObject2, TLRPC.TL_error tL_error) {
        if (tLObject2 instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public void lambda$init$4(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        if (tL_error != null || this.instance == null || this.destroyed) {
            return;
        }
        TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
        if (!groupcallstreamchannels.channels.isEmpty()) {
            long j2 = groupcallstreamchannels.channels.get(0).last_timestamp_ms;
        }
        if (groupcallstreamchannels.channels.isEmpty()) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$init$3();
                }
            });
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
            this.instance.addIncomingVideoOutput(2, "unified", pushSources(createSsrcGroups(tL_groupCallParticipantVideo)), this.instanceSink, DialogObject.getPeerDialogId(this.participant.peer));
        }
    }

    public void lambda$init$3() {
        setEmptyStream(true);
    }

    public void lambda$init$6(TLObject tLObject, TLRPC.TL_error tL_error) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            int i = 0;
            MessagesController.getInstance(this.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(groupcall.chats, false);
            if (this.instance == null || this.destroyed) {
                return;
            }
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
            if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                this.instance.addIncomingVideoOutput(2, tL_groupCallParticipantVideo.endpoint, pushSources(createSsrcGroups(tL_groupCallParticipantVideo)), this.instanceSink, DialogObject.getPeerDialogId(this.participant.peer));
            } else {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$init$5();
                    }
                });
            }
        }
    }

    public void lambda$init$5() {
        setEmptyStream(true);
    }

    public void lambda$init$7() {
        setEmptyStream(true);
    }

    public void lambda$init$8() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(this.call.id));
        setPolling(true);
    }

    public void lambda$init$13(final long j, final int[] iArr) {
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
                this.f$0.lambda$init$12(iArr, j, tLObject, tL_error);
            }
        });
    }

    public void lambda$init$12(int[] iArr, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
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

    public void lambda$init$18(final long j, final long j2, final int i, final int i2) {
        StringBuilder sb;
        if (this.call == null) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("[LivePlayer] sending getFile time_ms=");
        sb2.append(j);
        sb2.append(j2 == 500 ? ", scale = 1" : "");
        sb2.append(", video_channel = ");
        sb2.append(i);
        sb2.append(", video_quality = ");
        sb2.append(i2);
        FileLog.d(sb2.toString());
        final long jCurrentTimeMillis = System.currentTimeMillis();
        TLRPC.TL_upload_getFile tL_upload_getFile = new TLRPC.TL_upload_getFile();
        tL_upload_getFile.limit = 131072;
        TLRPC.TL_inputGroupCallStream tL_inputGroupCallStream = new TLRPC.TL_inputGroupCallStream();
        tL_inputGroupCallStream.call = this.inputCall;
        tL_inputGroupCallStream.time_ms = j;
        if (j2 == 500) {
            tL_inputGroupCallStream.scale = 1;
        }
        if (i != 0) {
            tL_inputGroupCallStream.flags = 1 | tL_inputGroupCallStream.flags;
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
        final String string = sb.toString();
        final int iSendRequest = AccountInstance.getInstance(this.currentAccount).getConnectionsManager().sendRequest(tL_upload_getFile, new RequestDelegateTimestamp() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j3) {
                this.f$0.lambda$init$16(string, jCurrentTimeMillis, j, j2, i, i2, tLObject, tL_error, j3);
            }
        }, 2, 2, getCallStreamDatacenterId());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$init$17(string, iSendRequest);
            }
        });
    }

    public void lambda$init$16(final String str, long j, long j2, long j3, int i, int i2, TLObject tLObject, TLRPC.TL_error tL_error, long j4) {
        if (this.destroyed || this.instance == null) {
            return;
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$init$14(str);
            }
        });
        if (tLObject != null) {
            TLRPC.TL_upload_file tL_upload_file = (TLRPC.TL_upload_file) tLObject;
            StringBuilder sb = new StringBuilder();
            sb.append("[LivePlayer] received in ");
            sb.append(System.currentTimeMillis() - j);
            sb.append("ms getFile{time_ms=");
            sb.append(j2);
            sb.append(j3 == 500 ? ", scale = 1" : "");
            sb.append(", video_channel = ");
            sb.append(i);
            sb.append(", video_quality = ");
            sb.append(i2);
            sb.append("}: ");
            sb.append(tL_upload_file.bytes.limit());
            sb.append(" bytes");
            FileLog.d(sb.toString());
            NativeInstance nativeInstance = this.instance;
            NativeByteBuffer nativeByteBuffer = tL_upload_file.bytes;
            nativeInstance.onStreamPartAvailable(j2, nativeByteBuffer.buffer, nativeByteBuffer.limit(), j4, i, i2);
            return;
        }
        if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            this.instance.onStreamPartAvailable(j2, null, -1, j4, i, i2);
            AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda23(this));
            return;
        }
        if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$init$15();
                }
            });
            StringBuilder sb2 = new StringBuilder();
            sb2.append("[LivePlayer] received in ");
            sb2.append(System.currentTimeMillis() - j);
            sb2.append("ms getFile{time_ms=");
            sb2.append(j2);
            sb2.append(j3 == 500 ? ", scale = 1" : "");
            sb2.append(", video_channel = ");
            sb2.append(i);
            sb2.append(", video_quality = ");
            sb2.append(i2);
            sb2.append("}: ");
            sb2.append(tL_error.text);
            sb2.append(" => rejoining");
            FileLog.d(sb2.toString());
            return;
        }
        int i3 = ("TIME_TOO_BIG".equals(tL_error.text) || tL_error.text.startsWith("FLOOD_WAIT")) ? 0 : -1;
        StringBuilder sb3 = new StringBuilder();
        sb3.append("[LivePlayer] received in ");
        sb3.append(System.currentTimeMillis() - j);
        sb3.append("ms getFile{time_ms=");
        sb3.append(j2);
        sb3.append(j3 == 500 ? ", scale = 1" : "");
        sb3.append(", video_channel = ");
        sb3.append(i);
        sb3.append(", video_quality = ");
        sb3.append(i2);
        sb3.append("}: ");
        sb3.append(tL_error.text);
        sb3.append(" => ");
        sb3.append(i3);
        FileLog.d(sb3.toString());
        this.instance.onStreamPartAvailable(j2, null, i3, j4, i, i2);
    }

    public void lambda$init$14(String str) {
        this.currentStreamRequestTimestamp.remove(str);
    }

    public void lambda$init$15() {
        if (this.instance != null) {
            DispatchQueue dispatchQueue = Utilities.globalQueue;
            NativeInstance nativeInstance = this.instance;
            Objects.requireNonNull(nativeInstance);
            dispatchQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda105(nativeInstance));
            this.srcs.clear();
            this.instance = null;
        }
        init();
    }

    public void lambda$init$17(String str, int i) {
        this.currentStreamRequestTimestamp.put(str, Integer.valueOf(i));
    }

    public void lambda$init$20(final long j, long j2, final int i, final int i2) {
        StringBuilder sb = new StringBuilder();
        sb.append("[LivePlayer] cancelling getFile time_ms=");
        sb.append(j);
        String str = "";
        sb.append(j2 == 500 ? ", scale = 1" : "");
        if (i != 0) {
            str = ", video_channel = " + i + ", video_quality = " + i2;
        }
        sb.append(str);
        FileLog.d(sb.toString());
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$init$19(i, j, i2);
            }
        });
    }

    public void lambda$init$19(int i, long j, int i2) {
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

    public void lambda$init$23(final long j) {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall != null && groupCall.rtmp_stream) {
            TL_phone.getGroupCallStreamChannels getgroupcallstreamchannels = new TL_phone.getGroupCallStreamChannels();
            getgroupcallstreamchannels.call = this.inputCall;
            if (this.call == null || this.instance == null) {
                return;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallstreamchannels, new RequestDelegateTimestamp() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
                    this.f$0.lambda$init$22(j, tLObject, tL_error, j2);
                }
            }, 65536, 2, getCallStreamDatacenterId());
            return;
        }
        NativeInstance nativeInstance = this.instance;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j, ConnectionsManager.getInstance(this.currentAccount).getCurrentTimeMillis());
        }
    }

    public void lambda$init$22(long j, TLObject tLObject, TLRPC.TL_error tL_error, long j2) {
        if (tL_error == null) {
            if (this.instance == null || this.destroyed) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            j = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$init$21();
                    }
                });
            }
            if (this.participant == null && !groupcallstreamchannels.channels.isEmpty()) {
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
                this.instance.addIncomingVideoOutput(2, "unified", pushSources(createSsrcGroups(tL_groupCallParticipantVideo)), this.instanceSink, DialogObject.getPeerDialogId(this.participant.peer));
            }
        }
        NativeInstance nativeInstance = this.instance;
        if (nativeInstance != null) {
            nativeInstance.onRequestTimeComplete(j, j);
        }
    }

    public void lambda$init$21() {
        setEmptyStream(true);
    }

    class AnonymousClass2 implements Instance.OnStateUpdatedListener {
        AnonymousClass2() {
        }

        @Override
        public void onStateUpdated(int i, boolean z) {
            boolean zIsConnected = LivePlayer.this.isConnected();
            LivePlayer.this.connectionState = i;
            FileLog.d("[LivePlayer] connectionState = " + i);
            if (zIsConnected != LivePlayer.this.isConnected()) {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$onStateUpdated$0();
                    }
                });
            }
        }

        public void lambda$onStateUpdated$0() {
            NotificationCenter.getInstance(LivePlayer.this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(LivePlayer.this.getCallId()));
        }
    }

    public boolean isConnected() {
        int i = this.connectionState;
        return i == 3 || i == 1 || i == 2;
    }

    public void setVolume(float f) {
        float fClamp01 = Utilities.clamp01(f);
        if (LiveStoryPipOverlay.isVisible(this)) {
            fClamp01 = 1.0f;
        }
        FileLog.d("setVolume(" + fClamp01 + ")");
        if (Math.abs(fClamp01 - this.volume) < 0.01f) {
            return;
        }
        this.volume = fClamp01;
        updateVolumes();
    }

    private void updateVolumes() {
        if (this.destroyed || this.instance == null) {
            return;
        }
        Iterator it = this.srcs.iterator();
        while (it.hasNext()) {
            this.instance.setVolume(((Integer) it.next()).intValue(), this.volume);
        }
    }

    private NativeInstance.SsrcGroup[] pushSources(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        int i = 0;
        while (true) {
            if (i >= (ssrcGroupArr == null ? 0 : ssrcGroupArr.length)) {
                updateVolumes();
                return ssrcGroupArr;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i].ssrcs;
                if (i2 < iArr.length) {
                    this.srcs.add(Integer.valueOf(iArr[i2]));
                    i2++;
                }
            }
            i++;
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
            long jLongValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.dialogId == jLongValue) {
                this.call = TlUtils.applyGroupCallUpdate(this.call, groupCall);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(groupCall.id));
            }
        }
    }

    public void storyDeleted() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        tL_updateStory.peer = MessagesController.getInstance(this.currentAccount).getPeer(this.dialogId);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.id = this.storyId;
        MessagesController.getInstance(this.currentAccount).getStoriesController().processUpdate(tL_updateStory);
        destroy();
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
                    this.f$0.lambda$destroy$24(tLObject, tL_error);
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
            dispatchQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda105(nativeInstance));
            this.srcs.clear();
            this.instance = null;
        }
        if (this.listeningToAudioFocus) {
            ((AudioManager) this.context.getSystemService("audio")).abandonAudioFocus(this);
            this.hasAudioFocus = false;
            this.listeningToAudioFocus = false;
        }
        if (this.outgoing) {
            VoipAudioManager.get().setSpeakerphoneOn(false);
        }
        if (recording == this) {
            recording = null;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(getCallId()));
        }
    }

    public void lambda$destroy$24(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
    }

    public int getWatchersCount() {
        TLRPC.GroupCall groupCall = this.call;
        return Math.max(1, groupCall == null ? 0 : groupCall.participants_count);
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
        if (this.destroyed) {
            z = false;
        }
        if (this.polling == z) {
            return;
        }
        this.polling = z;
        if (!z) {
            if (this.pollingRequestId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.pollingRequestId, true);
                this.pollingRequestId = -1;
            }
            if (this.polling2RequestId != -1) {
                ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.polling2RequestId, true);
                this.polling2RequestId = -1;
            }
            Runnable runnable = this.pollRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
                this.pollRunnable = null;
            }
            Runnable runnable2 = this.poll2Runnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
                this.poll2Runnable = null;
                return;
            }
            return;
        }
        Runnable runnable3 = this.pollRunnable;
        if (runnable3 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable3);
        }
        Runnable runnable4 = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setPolling$25();
            }
        };
        this.pollRunnable = runnable4;
        AndroidUtilities.runOnUIThread(runnable4, 4000L);
        Runnable runnable5 = this.poll2Runnable;
        if (runnable5 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable5);
        }
        Runnable runnable6 = new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$setPolling$26();
            }
        };
        this.poll2Runnable = runnable6;
        AndroidUtilities.runOnUIThread(runnable6, pollingGroupCallInterval());
    }

    private int pollingGroupCallInterval() {
        return isAdmin() ? 5000 : 20000;
    }

    public void lambda$setPolling$26() {
        this.poll2Runnable = null;
        if (this.destroyed) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.inputCall;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$poll2$29(tLObject, tL_error);
            }
        });
    }

    public void lambda$poll2$29(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$poll2$28(tLObject, tL_error);
            }
        });
    }

    public void lambda$poll2$28(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (this.destroyed) {
            return;
        }
        if (tLObject instanceof TL_phone.groupCall) {
            TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(groupcall.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(groupcall.chats, false);
            this.call = groupcall.call;
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(this.call.id));
        } else if (tL_error != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
            AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda23(this));
        }
        if (this.polling) {
            Runnable runnable = this.poll2Runnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$poll2$27();
                }
            };
            this.poll2Runnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, pollingGroupCallInterval());
        }
    }

    public void lambda$setPolling$25() {
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
                this.f$0.lambda$poll$33(tLObject, tL_error);
            }
        });
    }

    public void lambda$poll$33(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$poll$32(tLObject, tL_error);
            }
        });
    }

    public void lambda$poll$32(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (this.destroyed) {
            return;
        }
        if (tLObject instanceof Vector) {
            if (!((Vector) tLObject).toIntArray().contains(Integer.valueOf(this.mySource))) {
                if (this.instance != null) {
                    DispatchQueue dispatchQueue = Utilities.globalQueue;
                    NativeInstance nativeInstance = this.instance;
                    Objects.requireNonNull(nativeInstance);
                    dispatchQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda105(nativeInstance));
                    this.srcs.clear();
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
        } else if (tL_error != null) {
            if ("GROUPCALL_JOIN_MISSING".equals(tL_error.text)) {
                FileLog.d("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        this.f$0.lambda$poll$30();
                    }
                });
            } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error.text)) {
                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda23(this));
            }
        }
        if (this.polling) {
            Runnable runnable = this.pollRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            Runnable runnable2 = new Runnable() {
                @Override
                public final void run() {
                    this.f$0.lambda$poll$31();
                }
            };
            this.pollRunnable = runnable2;
            AndroidUtilities.runOnUIThread(runnable2, 4000L);
        }
    }

    public void lambda$poll$30() {
        if (this.instance != null) {
            DispatchQueue dispatchQueue = Utilities.globalQueue;
            NativeInstance nativeInstance = this.instance;
            Objects.requireNonNull(nativeInstance);
            dispatchQueue.postRunnable(new VoIPService$$ExternalSyntheticLambda105(nativeInstance));
            this.srcs.clear();
            this.instance = null;
        }
        init();
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

    public boolean commentsDisabled() {
        if (this.call == null || isAdmin()) {
            return false;
        }
        return !this.call.messages_enabled;
    }

    public boolean sendAsDisabled() {
        if (this.call == null) {
            return false;
        }
        return !r0.messages_enabled;
    }

    public boolean isCreator() {
        TLRPC.GroupCall groupCall = this.call;
        return groupCall != null && groupCall.creator;
    }

    public boolean isAdmin() {
        return isAdmin(14);
    }

    public boolean isAdmin(int i) {
        if (isCreator()) {
            return true;
        }
        if (this.dialogId >= 0) {
            return UserConfig.getInstance(this.currentAccount).getClientUserId() == this.dialogId;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-this.dialogId)), i);
    }

    public void end() {
        if (this.destroyed) {
            return;
        }
        TL_phone.discardGroupCall discardgroupcall = new TL_phone.discardGroupCall();
        discardgroupcall.call = this.inputCall;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(discardgroupcall, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$end$34(tLObject, tL_error);
            }
        });
        destroy();
    }

    public void lambda$end$34(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(this.currentAccount).putChats(updates.chats, false);
            MessagesController.getInstance(this.currentAccount).processUpdates(updates, false);
            return;
        }
        if (tL_error == null || !"GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
            return;
        }
        AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda23(this));
    }

    public TLRPC.Peer getDefaultSendAs() {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public void setDefaultSendAs(TLRPC.Peer peer) {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall == null) {
            return;
        }
        groupCall.flags = TLObject.setFlag(groupCall.flags, 2097152, peer != null);
        this.call.default_send_as = peer;
    }
}
