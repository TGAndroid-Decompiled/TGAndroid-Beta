package org.telegram.ui.Stories;

import android.content.Context;
import android.media.AudioManager;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DispatchQueue;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.tlutils.TlUtils;
import org.telegram.messenger.voip.Instance;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPService$1$$ExternalSyntheticLambda0;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.PhotoViewer$$ExternalSyntheticLambda97;
import org.webrtc.VideoFrame;
import org.webrtc.VideoSink;
import org.webrtc.voiceengine.WebRtcAudioTrack;

public final class LivePlayer implements NotificationCenter.NotificationCenterDelegate, AudioManager.OnAudioFocusChangeListener {
    public static LivePlayer recording;
    public TLRPC.GroupCall call;
    public int connectionState;
    public final Context context;
    public final int currentAccount;
    public final long dialogId;
    public VideoSink displaySink;
    public final TLRPC.InputGroupCall inputCall;
    public NativeInstance instance;
    public final AnonymousClass1 instanceSink;
    public boolean isFront;
    public final boolean isRtmpStream;
    public boolean joined;
    public boolean listeningToAudioFocus;
    public ArrayList messages;
    public int mySource;
    public boolean outgoing;
    public TLRPC.GroupCallParticipant participant;
    public Runnable poll2Runnable;
    public Runnable pollRunnable;
    public boolean polling;
    public long recordingVideoCapturer;
    public final int storyId;
    public final TL_stories.StoryItem storyItem;
    public ArrayList topMessages;
    public boolean isMuted = false;
    public boolean emptyStream = false;
    public boolean destroyed = false;
    public final HashMap currentStreamRequestTimestamp = new HashMap();
    public final HashSet srcs = new HashSet();
    public float volume = 1.0f;
    public int pollingRequestId = -1;
    public int polling2RequestId = -1;

    public final class AnonymousClass1 extends VoIPService.ProxyVideoSink {
        public AnonymousClass1() {
        }

        @Override
        public final synchronized void onFrame(VideoFrame videoFrame) {
            super.onFrame(videoFrame);
            if (LivePlayer.this.emptyStream) {
                AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(this, 0));
            }
        }
    }

    public final class AnonymousClass2 implements Instance.OnStateUpdatedListener {
        public AnonymousClass2() {
        }

        @Override
        public final void onStateUpdated(int i, boolean z) {
            LivePlayer livePlayer = LivePlayer.this;
            boolean zIsConnected = livePlayer.isConnected();
            livePlayer.connectionState = i;
            FileLog.d("[LivePlayer] connectionState = " + i);
            if (zIsConnected != livePlayer.isConnected()) {
                AndroidUtilities.runOnUIThread(new LivePlayer$1$$ExternalSyntheticLambda0(this, 6));
            }
        }
    }

    public LivePlayer(Context context, int i, TL_stories.StoryItem storyItem, long j, int i2, boolean z, TLRPC.InputGroupCall inputGroupCall, boolean z2, boolean z3) {
        this.isFront = false;
        this.context = context;
        this.currentAccount = i;
        this.inputCall = inputGroupCall;
        this.storyItem = storyItem;
        this.dialogId = j;
        this.storyId = i2;
        this.isRtmpStream = z;
        this.outgoing = z2;
        this.isFront = z3;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1();
        this.instanceSink = anonymousClass1;
        FileLog.d("[LivePlayer] setup to call " + inputGroupCall.id);
        NotificationCenter.getInstance(i).addObserver(this, NotificationCenter.storyGroupCallUpdated);
        if (z2) {
            this.recordingVideoCapturer = NativeInstance.createVideoCapturer(anonymousClass1, z3 ? 1 : 0);
        }
        configureAudio();
        init$4();
    }

    public static NativeInstance.SsrcGroup[] createSsrcGroups$1(TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo) {
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

    public final boolean commentsDisabled() {
        if (this.call == null || isAdmin()) {
            return false;
        }
        return !this.call.messages_enabled;
    }

    public final void configureAudio() {
        WebRtcAudioTrack.setAudioTrackUsageAttribute(1);
        WebRtcAudioTrack.setAudioStreamType(Integer.MIN_VALUE);
        AudioManager audioManager = (AudioManager) this.context.getSystemService("audio");
        if (this.isRtmpStream) {
            audioManager.setMode(0);
            audioManager.setBluetoothScoOn(false);
        } else if (this.outgoing) {
            audioManager.setMode(3);
            this.listeningToAudioFocus = audioManager.requestAudioFocus(this, 0, 2) == 1;
            VoipAudioManager voipAudioManager = VoipAudioManager.get();
            audioManager.setBluetoothScoOn(false);
            voipAudioManager.setSpeakerphoneOn(true);
        }
    }

    public final void destroy() {
        int i = 0;
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
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(leavegroupcall, new LivePlayer$$ExternalSyntheticLambda6(this, i));
        }
        if (this.outgoing) {
            this.instanceSink.setTarget(null);
            NativeInstance.destroyVideoCapturer(this.recordingVideoCapturer);
        }
        if (this.instance != null) {
            DispatchQueue dispatchQueue = Utilities.globalQueue;
            NativeInstance nativeInstance = this.instance;
            Objects.requireNonNull(nativeInstance);
            dispatchQueue.postRunnable(new VoIPService$1$$ExternalSyntheticLambda0(nativeInstance, 4));
            this.srcs.clear();
            this.instance = null;
        }
        if (this.listeningToAudioFocus) {
            ((AudioManager) this.context.getSystemService("audio")).abandonAudioFocus(this);
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

    @Override
    public final void didReceivedNotification(int i, int i2, Object... objArr) {
        if (i == NotificationCenter.storyGroupCallUpdated) {
            long jLongValue = ((Long) objArr[0]).longValue();
            TLRPC.GroupCall groupCall = (TLRPC.GroupCall) objArr[1];
            if (this.dialogId == jLongValue) {
                this.call = TlUtils.applyGroupCallUpdate(this.call, groupCall);
                NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(groupCall.id));
            }
        }
    }

    public final boolean equals(TLRPC.InputGroupCall inputGroupCall) {
        TLRPC.InputGroupCall inputGroupCall2 = this.inputCall;
        return inputGroupCall2 == inputGroupCall || inputGroupCall2.id == inputGroupCall.id;
    }

    public final long getCallId() {
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

    public final TLRPC.Peer getDefaultSendAs() {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall == null) {
            return null;
        }
        return groupCall.default_send_as;
    }

    public final long getSendPaidMessagesStars() {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall == null) {
            return 0L;
        }
        return groupCall.send_paid_messages_stars;
    }

    public final void init$4() {
        if (this.destroyed) {
            return;
        }
        NativeInstance nativeInstanceMakeGroup = NativeInstance.makeGroup(VoIPHelper.getLogFilePath("live_" + this.inputCall.id), 0L, false, SharedConfig.noiseSupression, new LivePlayer$$ExternalSyntheticLambda0(this, 0), new PhotoViewer$$ExternalSyntheticLambda97(22), new LivePlayer$$ExternalSyntheticLambda0(this, 2), new LivePlayer$$ExternalSyntheticLambda0(this, 3), new LivePlayer$$ExternalSyntheticLambda0(this, 4), new LivePlayer$$ExternalSyntheticLambda0(this, 5), false);
        this.instance = nativeInstanceMakeGroup;
        nativeInstanceMakeGroup.setOnStateUpdatedListener(new AnonymousClass2());
        this.instance.resetGroupInstance(false, false);
    }

    public final boolean isAdmin() {
        TLRPC.GroupCall groupCall = this.call;
        if (groupCall != null && groupCall.creator) {
            return true;
        }
        int i = this.currentAccount;
        long j = this.dialogId;
        if (j >= 0) {
            return UserConfig.getInstance(i).getClientUserId() == j;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i).getChat(Long.valueOf(-j)), 14);
    }

    public final boolean isConnected() {
        int i = this.connectionState;
        return i == 3 || i == 1 || i == 2;
    }

    @Override
    public final void onAudioFocusChange(int i) {
    }

    public final void poll() {
        this.pollRunnable = null;
        if (this.destroyed) {
            return;
        }
        TL_phone.checkGroupCall checkgroupcall = new TL_phone.checkGroupCall();
        checkgroupcall.call = this.inputCall;
        checkgroupcall.sources.add(Integer.valueOf(this.mySource));
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(checkgroupcall, new LivePlayer$$ExternalSyntheticLambda6(this, 4));
    }

    public final void poll2() {
        this.poll2Runnable = null;
        if (this.destroyed) {
            return;
        }
        TL_phone.getGroupCall getgroupcall = new TL_phone.getGroupCall();
        getgroupcall.call = this.inputCall;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcall, new LivePlayer$$ExternalSyntheticLambda6(this, 2));
    }

    public final void pushSources(NativeInstance.SsrcGroup[] ssrcGroupArr) {
        HashSet hashSet;
        int i = 0;
        while (true) {
            int length = ssrcGroupArr == null ? 0 : ssrcGroupArr.length;
            hashSet = this.srcs;
            if (i >= length) {
                break;
            }
            int i2 = 0;
            while (true) {
                int[] iArr = ssrcGroupArr[i].ssrcs;
                if (i2 < iArr.length) {
                    hashSet.add(Integer.valueOf(iArr[i2]));
                    i2++;
                }
            }
            i++;
        }
        if (this.destroyed || this.instance == null) {
            return;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.instance.setVolume(((Integer) it.next()).intValue(), this.volume);
        }
    }

    public final void setDisplaySink(VideoSink videoSink) {
        if (this.displaySink == videoSink) {
            return;
        }
        this.displaySink = videoSink;
        this.instanceSink.setTarget(videoSink);
    }

    public final void setEmptyStream(boolean z) {
        if (this.destroyed || this.emptyStream == z) {
            return;
        }
        if (this.outgoing && z) {
            return;
        }
        this.emptyStream = z;
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(getCallId()));
    }

    public final void setPolling(boolean z) {
        if (this.destroyed) {
            z = false;
        }
        if (this.polling == z) {
            return;
        }
        this.polling = z;
        if (z) {
            Runnable runnable = this.pollRunnable;
            if (runnable != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable);
            }
            LivePlayer$$ExternalSyntheticLambda13 livePlayer$$ExternalSyntheticLambda13 = new LivePlayer$$ExternalSyntheticLambda13(this, 0);
            this.pollRunnable = livePlayer$$ExternalSyntheticLambda13;
            AndroidUtilities.runOnUIThread(livePlayer$$ExternalSyntheticLambda13, 4000L);
            Runnable runnable2 = this.poll2Runnable;
            if (runnable2 != null) {
                AndroidUtilities.cancelRunOnUIThread(runnable2);
            }
            LivePlayer$$ExternalSyntheticLambda13 livePlayer$$ExternalSyntheticLambda14 = new LivePlayer$$ExternalSyntheticLambda13(this, 1);
            this.poll2Runnable = livePlayer$$ExternalSyntheticLambda14;
            AndroidUtilities.runOnUIThread(livePlayer$$ExternalSyntheticLambda14, isAdmin() ? 5000 : 20000);
            return;
        }
        int i = this.pollingRequestId;
        int i2 = this.currentAccount;
        if (i != -1) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.pollingRequestId, true);
            this.pollingRequestId = -1;
        }
        if (this.polling2RequestId != -1) {
            ConnectionsManager.getInstance(i2).cancelRequest(this.polling2RequestId, true);
            this.polling2RequestId = -1;
        }
        Runnable runnable3 = this.pollRunnable;
        if (runnable3 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable3);
            this.pollRunnable = null;
        }
        Runnable runnable4 = this.poll2Runnable;
        if (runnable4 != null) {
            AndroidUtilities.cancelRunOnUIThread(runnable4);
            this.poll2Runnable = null;
        }
    }

    public final void setVolume(float f) {
        float fClamp01 = Utilities.clamp01(f);
        LiveStoryPipOverlay liveStoryPipOverlay = LiveStoryPipOverlay.instance;
        if (liveStoryPipOverlay.isVisible && liveStoryPipOverlay.livePlayer == this) {
            fClamp01 = 1.0f;
        }
        FileLog.d("setVolume(" + fClamp01 + ")");
        if (Math.abs(fClamp01 - this.volume) < 0.01f) {
            return;
        }
        this.volume = fClamp01;
        if (this.destroyed || this.instance == null) {
            return;
        }
        Iterator it = this.srcs.iterator();
        while (it.hasNext()) {
            this.instance.setVolume(((Integer) it.next()).intValue(), this.volume);
        }
    }

    public final void storyDeleted() {
        TL_stories.TL_updateStory tL_updateStory = new TL_stories.TL_updateStory();
        int i = this.currentAccount;
        tL_updateStory.peer = MessagesController.getInstance(i).getPeer(this.dialogId);
        TL_stories.TL_storyItemDeleted tL_storyItemDeleted = new TL_stories.TL_storyItemDeleted();
        tL_updateStory.story = tL_storyItemDeleted;
        tL_storyItemDeleted.id = this.storyId;
        MessagesController.getInstance(i).getStoriesController().processUpdate(tL_updateStory);
        destroy();
    }
}
