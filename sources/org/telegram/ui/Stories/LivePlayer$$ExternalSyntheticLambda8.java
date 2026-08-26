package org.telegram.ui.Stories;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.util.ListenerSet;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6;
import org.telegram.ui.WearAuthSheet$$ExternalSyntheticLambda3;

public final class LivePlayer$$ExternalSyntheticLambda8 implements SQLiteEventStore.Function, ListenerSet.Event, ImageReceiver.ImageReceiverDelegate, RequestDelegateTimestamp, MessagesStorage.StringCallback {
    public final Object f$0;
    public final long f$1;

    public LivePlayer$$ExternalSyntheticLambda8(long j, AutoValue_TransportContext autoValue_TransportContext) {
        this.f$1 = j;
        this.f$0 = autoValue_TransportContext;
    }

    @Override
    public Object apply(Object obj) {
        SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
        ContentValues contentValues = new ContentValues();
        contentValues.put("next_request_ms", Long.valueOf(this.f$1));
        AutoValue_TransportContext autoValue_TransportContext = (AutoValue_TransportContext) this.f$0;
        String str = autoValue_TransportContext.backendName;
        Priority priority = autoValue_TransportContext.priority;
        if (sQLiteDatabase.update("transport_contexts", contentValues, "backend_name = ? and priority = ?", new String[]{str, String.valueOf(PriorityMapping.toInt(priority))}) < 1) {
            contentValues.put("backend_name", autoValue_TransportContext.backendName);
            contentValues.put("priority", Integer.valueOf(PriorityMapping.toInt(priority)));
            sQLiteDatabase.insert("transport_contexts", null, contentValues);
        }
        return null;
    }

    @Override
    public void didSetImage(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
        ImageReceiver.BitmapHolder bitmapSafe = imageReceiver.getBitmapSafe();
        if (!z || bitmapSafe == null) {
            return;
        }
        Bitmap bitmap = bitmapSafe.bitmap;
        if (bitmap == null) {
            Drawable drawable = bitmapSafe.drawable;
            if (drawable instanceof BitmapDrawable) {
                bitmap = ((BitmapDrawable) drawable).getBitmap();
            }
        }
        ((WearAuthSheet$$ExternalSyntheticLambda3) this.f$0).onComplete(new Pair(Long.valueOf(this.f$1), bitmap));
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void invoke(Object obj) {
        ((AnalyticsListener) obj).onAudioPositionAdvancing((AnalyticsListener.EventTime) this.f$0, this.f$1);
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void run(TLObject tLObject, TLRPC.TL_error tL_error, long j) {
        LivePlayer livePlayer = (LivePlayer) this.f$0;
        long j2 = 0;
        if (tL_error == null) {
            if (livePlayer.instance == null || livePlayer.destroyed) {
                return;
            }
            TL_phone.groupCallStreamChannels groupcallstreamchannels = (TL_phone.groupCallStreamChannels) tLObject;
            int i = 0;
            j2 = groupcallstreamchannels.channels.isEmpty() ? 0L : groupcallstreamchannels.channels.get(0).last_timestamp_ms;
            if (groupcallstreamchannels.channels.isEmpty()) {
                AndroidUtilities.runOnUIThread(new LivePlayer$$ExternalSyntheticLambda13(livePlayer, 5));
            }
            if (livePlayer.participant == null && !groupcallstreamchannels.channels.isEmpty()) {
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
        NativeInstance nativeInstance2 = livePlayer.instance;
        if (nativeInstance2 != null) {
            nativeInstance2.onRequestTimeComplete(this.f$1, j2);
        }
    }

    public LivePlayer$$ExternalSyntheticLambda8(Object obj, long j) {
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public void run(String str) {
        StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
        StoriesController storiesController = StoryPrivacyBottomSheet.this.getStoriesController();
        storiesController.getStoryAlbumsList(this.f$1, true).createCollection(str, new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6(page, 3));
    }
}
