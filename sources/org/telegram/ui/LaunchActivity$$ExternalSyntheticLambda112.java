package org.telegram.ui;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Pair;
import androidx.collection.LongSparseArray;
import com.google.android.datatransport.Priority;
import com.google.android.datatransport.runtime.AutoValue_TransportContext;
import com.google.android.datatransport.runtime.scheduling.persistence.SQLiteEventStore;
import com.google.android.datatransport.runtime.util.PriorityMapping;
import com.google.android.exoplayer2.upstream.DataSource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegateTimestamp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.SearchViewPager;
import org.telegram.ui.Components.TopicsTabsView;
import org.telegram.ui.Components.VideoPlayer;
import org.telegram.ui.Stories.LivePlayer;
import org.telegram.ui.Stories.LivePlayer$$ExternalSyntheticLambda13;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6;

public final class LaunchActivity$$ExternalSyntheticLambda112 implements SQLiteEventStore.Function, ImageReceiver.ImageReceiverDelegate, AlertsCreator.ScheduleDatePickerDelegate, LocationActivity.LocationActivityDelegate, MessagesStorage.BooleanCallback, DataSource.Factory, AlertDialog.OnButtonClickListener, RequestDelegateTimestamp, MessagesStorage.StringCallback, GroupCreateActivity.ContactsAddActivityDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;

    public LaunchActivity$$ExternalSyntheticLambda112(long j, AutoValue_TransportContext autoValue_TransportContext) {
        this.$r8$classId = 1;
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
    public DataSource createDataSource() {
        return new VideoPlayer.OffsetDataSource(((VideoPlayer) this.f$0).mediaDataSourceFactory.createDataSource(), this.f$1);
    }

    @Override
    public void didSelectDate(int i, int i2, boolean z) {
        boolean zSendPressed;
        ChatAttachAlert chatAttachAlert = (ChatAttachAlert) this.f$0;
        ChatAttachAlert.AttachAlertLayout attachAlertLayout = chatAttachAlert.currentAttachLayout;
        long j = this.f$1;
        if (attachAlertLayout == chatAttachAlert.photoLayout || attachAlertLayout == chatAttachAlert.photoPreviewLayout) {
            zSendPressed = chatAttachAlert.sendPressed(i, z, i2, chatAttachAlert.isCaptionAbove(), j);
        } else {
            if (!attachAlertLayout.sendSelectedItems(i, z, i2, chatAttachAlert.isCaptionAbove(), j)) {
                chatAttachAlert.allowPassConfirmationAlert = true;
                chatAttachAlert.lambda$showGiftOfferSheet$15();
            }
            zSendPressed = false;
        }
        ChatAttachAlert.AnonymousClass25 anonymousClass25 = chatAttachAlert.messageSendPreview;
        if (anonymousClass25 != null) {
            anonymousClass25.sent = !zSendPressed;
            anonymousClass25.dismiss();
            chatAttachAlert.messageSendPreview = null;
        }
    }

    @Override
    public void didSelectLocation(TLRPC.MessageMedia messageMedia, int i, boolean z, int i2, long j) {
        Object obj = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                Pattern pattern = LaunchActivity.PREFIX_T_ME_PATTERN;
                SendMessagesHelper.getInstance(((int[]) obj)[0]).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f$1, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
            default:
                SendMessagesHelper.getInstance(((LocationController.SharingLocationInfo) obj).messageObject.currentAccount).sendMessage(SendMessagesHelper.SendMessageParams.of(messageMedia, this.f$1, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0));
                break;
        }
    }

    @Override
    public void didSelectUsers(int i, ArrayList arrayList) {
        TopicsFragment.AnonymousClass2 anonymousClass2 = (TopicsFragment.AnonymousClass2) this.f$0;
        int size = arrayList.size();
        int[] iArr = new int[1];
        TLRPC.TL_messages_invitedUsers tL_messages_invitedUsers = new TLRPC.TL_messages_invitedUsers();
        tL_messages_invitedUsers.updates = new TLRPC.TL_updates();
        for (int i2 = 0; i2 < size; i2++) {
            TLRPC.User user = (TLRPC.User) arrayList.get(i2);
            BaseFragment baseFragment = TopicsFragment.this;
            MessagesController messagesController = baseFragment.getMessagesController();
            ChatActivity$$ExternalSyntheticLambda470 chatActivity$$ExternalSyntheticLambda470 = new ChatActivity$$ExternalSyntheticLambda470(5);
            long j = this.f$1;
            messagesController.addUserToChat(j, user, i, null, baseFragment, false, chatActivity$$ExternalSyntheticLambda470, null, new TopicsFragment$2$$ExternalSyntheticLambda4(anonymousClass2, tL_messages_invitedUsers, iArr, size, arrayList, j));
        }
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
        ((ChatActivity$$ExternalSyntheticLambda189) this.f$0).onComplete(new Pair(Long.valueOf(this.f$1), bitmap));
    }

    @Override
    public void didSetImageBitmap(int i, String str, Drawable drawable) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$didSetImageBitmap(this, i, str, drawable);
    }

    @Override
    public void needAddBot(TLRPC.User user) {
    }

    @Override
    public void onAnimationReady(ImageReceiver imageReceiver) {
        ImageReceiver.ImageReceiverDelegate.CC.$default$onAnimationReady(this, imageReceiver);
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        switch (this.$r8$classId) {
            case 7:
                SearchViewPager.AnonymousClass1 anonymousClass1 = ((DialogsActivity) this.f$0).searchViewPager.dialogsSearchAdapter;
                LongSparseArray longSparseArray = anonymousClass1.recentSearchObjectsById;
                long j = this.f$1;
                DialogsSearchAdapter.RecentSearchObject recentSearchObject = (DialogsSearchAdapter.RecentSearchObject) longSparseArray.get(j);
                if (recentSearchObject != null) {
                    anonymousClass1.recentSearchObjectsById.remove(j);
                    anonymousClass1.recentSearchObjects.remove(recentSearchObject);
                    anonymousClass1.filtered2RecentSearchObjects.remove(recentSearchObject);
                    anonymousClass1.filteredRecentSearchObjects.remove(recentSearchObject);
                    anonymousClass1.notifyDataSetChanged();
                    MessagesStorage.getInstance(anonymousClass1.currentAccount).getStorageQueue().postRunnable(new LinkManager$3$$ExternalSyntheticLambda0(anonymousClass1, j, 7));
                    break;
                }
                break;
            default:
                DialogsActivity.this.getMediaDataController().removePeer(this.f$1);
                break;
        }
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

    public LaunchActivity$$ExternalSyntheticLambda112(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override
    public void run(String str) {
        StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
        StoriesController storiesController = StoryPrivacyBottomSheet.this.getStoriesController();
        storiesController.getStoryAlbumsList(this.f$1, true).createCollection(str, new StoryPrivacyBottomSheet$Page$$ExternalSyntheticLambda6(page, 3));
    }

    @Override
    public void run(boolean z) {
        ChatActivity chatActivity = ((TopicsTabsView) this.f$0).fragment;
        if (chatActivity != null) {
            chatActivity.performHistoryClear(this.f$1, false);
        }
    }
}
