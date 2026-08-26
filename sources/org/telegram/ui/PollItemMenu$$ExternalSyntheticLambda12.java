package org.telegram.ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Point;
import android.graphics.RectF;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.core.view.DifferentialMotionFlingController$$ExternalSyntheticLambda0;
import com.google.android.exoplayer2.ExoPlayerImpl;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.exoplayer2.analytics.DefaultAnalyticsCollector;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.util.ListenerSet;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.cast.zzw;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedPrefsHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.browser.Browser;
import org.telegram.messenger.video.VideoFramesRewinder;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.Theme;
import org.telegram.ui.Components.AlertsCreator;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlert;
import org.telegram.ui.Components.ChatAttachAlert$$ExternalSyntheticLambda1;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$$ExternalSyntheticLambda3;
import org.telegram.ui.Components.JoinGroupAlert;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Components.StickerCategoriesListView;
import org.telegram.ui.Components.VideoEditTextureView$$ExternalSyntheticLambda1;
import org.telegram.ui.Gifts.GiftSheet;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stories.DialogStoriesCell;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesListPlaceProvider;
import org.telegram.ui.Stories.StoriesStorage;
import org.telegram.ui.Stories.StoriesStorage$$ExternalSyntheticLambda13;
import org.telegram.ui.Stories.StoryViewer;
import org.telegram.ui.Stories.recorder.DraftsController;
import org.telegram.ui.Stories.recorder.StoryEntry;

public final class PollItemMenu$$ExternalSyntheticLambda12 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final Object f$2;

    public PollItemMenu$$ExternalSyntheticLambda12(Object obj, long j, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = obj2;
    }

    @Override
    public final void run() {
        ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell mediaCell;
        int i;
        ArrayList arrayList;
        StoriesController storiesController;
        long j;
        int i2;
        boolean z;
        int i3;
        boolean z2;
        boolean z3;
        int i4;
        boolean z4;
        boolean z5;
        long j2 = this.f$1;
        Object obj = this.f$2;
        Object obj2 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                PollItemMenu pollItemMenu = (PollItemMenu) obj2;
                pollItemMenu.getClass();
                Bundle bundle = new Bundle();
                if (j2 > 0) {
                    bundle.putLong("user_id", j2);
                } else {
                    bundle.putLong("chat_id", -j2);
                }
                ((BaseFragment) obj).presentFragment(new ProfileActivity(bundle, null));
                pollItemMenu.dismiss(false);
                break;
            case 1:
                zzw zzwVar = (zzw) obj2;
                zzwVar.getClass();
                int i5 = Util.SDK_INT;
                ExoPlayerImpl exoPlayerImpl = ExoPlayerImpl.this;
                DefaultAnalyticsCollector defaultAnalyticsCollector = exoPlayerImpl.analyticsCollector;
                AnalyticsListener.EventTime eventTimeGenerateReadingMediaPeriodEventTime = defaultAnalyticsCollector.generateReadingMediaPeriodEventTime();
                defaultAnalyticsCollector.sendEvent(eventTimeGenerateReadingMediaPeriodEventTime, 26, new ArticleViewer$$ExternalSyntheticLambda16(eventTimeGenerateReadingMediaPeriodEventTime, obj, j2));
                if (exoPlayerImpl.videoOutput == obj) {
                    DifferentialMotionFlingController$$ExternalSyntheticLambda0 differentialMotionFlingController$$ExternalSyntheticLambda0 = new DifferentialMotionFlingController$$ExternalSyntheticLambda0(7);
                    ListenerSet listenerSet = exoPlayerImpl.listeners;
                    listenerSet.queueEvent(26, differentialMotionFlingController$$ExternalSyntheticLambda0);
                    listenerSet.flushEvents();
                }
                break;
            case 2:
                ((VideoFramesRewinder) obj2).lambda$new$1((ArrayList) obj, j2);
                break;
            case 3:
                ((NativeInstance) obj2).lambda$onParticipantDescriptionsRequired$2(j2, (int[]) obj);
                break;
            case 4:
                ((VideoCapturerDevice) obj2).lambda$init$5(j2, (String) obj);
                break;
            case 5:
                ((VideoCapturerDevice) obj2).lambda$init$2(j2, (Point) obj);
                break;
            case 6:
                ChatActivity chatActivity = (ChatActivity) obj2;
                chatActivity.getMessagesController().lambda$checkDeletingTask$84(this.f$1, chatActivity.dialog_id, ((MessageObject) obj).getId());
                break;
            case 7:
                ChatActivity chatActivity2 = ChatActivity.this;
                AlertsCreator.showSendMediaAlert(SendMessagesHelper.getInstance(((BaseFragment) chatActivity2).currentAccount).sendMessage((ArrayList) obj, this.f$1, false, false, true, 0, 0, null, -1, 0L, chatActivity2.getSendMonoForumPeerId(), chatActivity2.messageSuggestionParams), chatActivity2, null);
                break;
            case 8:
                ChatUsersActivity chatUsersActivity = (ChatUsersActivity) obj2;
                TLRPC.User user = (TLRPC.User) obj;
                chatUsersActivity.getMessagesController().deleteParticipantFromChat(chatUsersActivity.chatId, user);
                chatUsersActivity.removeParticipants(j2);
                if (chatUsersActivity.currentChat != null && user != null && BulletinFactory.canShowBulletin(chatUsersActivity)) {
                    BulletinFactory.createRemoveFromChatBulletin(chatUsersActivity, user, chatUsersActivity.currentChat.title).show();
                    break;
                }
                break;
            case 9:
                ChatLinkActivity$$ExternalSyntheticLambda9 chatLinkActivity$$ExternalSyntheticLambda9 = (ChatLinkActivity$$ExternalSyntheticLambda9) obj2;
                if (chatLinkActivity$$ExternalSyntheticLambda9 != null) {
                    chatLinkActivity$$ExternalSyntheticLambda9.run();
                }
                BaseFragment baseFragment = (BaseFragment) obj;
                if (baseFragment != null) {
                    baseFragment.presentFragment(ChatActivity.of(j2));
                }
                break;
            case 10:
                ChatActivityEnterView chatActivityEnterView = (ChatActivityEnterView) obj2;
                chatActivityEnterView.getClass();
                ((ChatActivityEnterView.AnonymousClass76) obj).run();
                SharedPrefsHelper.setWebViewConfirmShown(chatActivityEnterView.currentAccount, j2, true);
                break;
            case 11:
                ChatAttachAlert chatAttachAlert = (ChatAttachAlert) obj2;
                AlertsCreator.createScheduleDatePickerDialog(chatAttachAlert.getContext(), this.f$1, -1L, 0, new ChatAttachAlert$$ExternalSyntheticLambda1(chatAttachAlert, 14), null, (Theme.ResourcesProvider) obj);
                break;
            case 12:
                ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView previewGroupsView = (ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView) obj2;
                ChatAttachAlertPhotoLayoutPreview chatAttachAlertPhotoLayoutPreview = previewGroupsView.this$0;
                if (!chatAttachAlertPhotoLayoutPreview.listView.scrollingByUser && previewGroupsView.tapTime == j2 && (mediaCell = previewGroupsView.tapMediaCell) == ((ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell) obj)) {
                    chatAttachAlertPhotoLayoutPreview.draggingCell = mediaCell;
                    chatAttachAlertPhotoLayoutPreview.draggingCellGroupY = mediaCell.groupCell.y;
                    chatAttachAlertPhotoLayoutPreview.draggingCellHiding = false;
                    previewGroupsView.draggingT = 0.0f;
                    previewGroupsView.invalidate();
                    ValueAnimator valueAnimator = chatAttachAlertPhotoLayoutPreview.draggingAnimator;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                    }
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                    chatAttachAlertPhotoLayoutPreview.draggingAnimator = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new ChatAttachAlertPhotoLayoutPreview$PreviewGroupsView$$ExternalSyntheticLambda3(previewGroupsView, 0));
                    chatAttachAlertPhotoLayoutPreview.draggingAnimator.setDuration(200L);
                    chatAttachAlertPhotoLayoutPreview.draggingAnimator.start();
                    ChatAttachAlertPhotoLayoutPreview.PreviewGroupsView.PreviewGroupCell.MediaCell mediaCell2 = chatAttachAlertPhotoLayoutPreview.draggingCell;
                    RectF rectFRect = mediaCell2.rect(mediaCell2.getT());
                    RectF rectFDrawingRect = chatAttachAlertPhotoLayoutPreview.draggingCell.drawingRect();
                    chatAttachAlertPhotoLayoutPreview.draggingCellLeft = (((chatAttachAlertPhotoLayoutPreview.draggingCellTouchX - rectFRect.left) / rectFRect.width()) + 0.5f) / 2.0f;
                    chatAttachAlertPhotoLayoutPreview.draggingCellTop = (chatAttachAlertPhotoLayoutPreview.draggingCellTouchY - rectFRect.top) / rectFRect.height();
                    chatAttachAlertPhotoLayoutPreview.draggingCellFromWidth = rectFDrawingRect.width();
                    chatAttachAlertPhotoLayoutPreview.draggingCellFromHeight = rectFDrawingRect.height();
                    try {
                        chatAttachAlertPhotoLayoutPreview.performHapticFeedback(0, 2);
                    } catch (Exception unused) {
                        return;
                    }
                    break;
                }
                break;
            case 13:
                ((JoinGroupAlert.AnonymousClass1) obj2).lambda$onBecomeFullyVisible$0((TLRPC.Chat) obj, j2);
                break;
            case 14:
                SharedMediaLayout sharedMediaLayout = (SharedMediaLayout) obj2;
                sharedMediaLayout.getClass();
                sharedMediaLayout.profileActivity.presentFragment(ChatActivity.of(((MessageObject) obj).getId(), j2));
                break;
            case 15:
                ((StickerCategoriesListView) obj2).lambda$new$2((TLRPC.TL_messages_emojiGroups) obj, j2);
                break;
            case 16:
                DialogsActivity dialogsActivity = (DialogsActivity) obj2;
                LaunchActivity$$ExternalSyntheticLambda37 launchActivity$$ExternalSyntheticLambda37 = (LaunchActivity$$ExternalSyntheticLambda37) obj;
                if (dialogsActivity.requestPeerType.bot_admin_rights != null) {
                    dialogsActivity.getMessagesController().setUserAdminRole(-j2, dialogsActivity.getMessagesController().getUser(Long.valueOf(dialogsActivity.requestPeerBotId)), dialogsActivity.requestPeerType.bot_admin_rights, null, false, dialogsActivity, true, true, null, launchActivity$$ExternalSyntheticLambda37, new VideoEditTextureView$$ExternalSyntheticLambda1(launchActivity$$ExternalSyntheticLambda37, 15));
                } else {
                    launchActivity$$ExternalSyntheticLambda37.run();
                }
                break;
            case 17:
                GiftSheet giftSheet = (GiftSheet) obj2;
                giftSheet.getClass();
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    giftSheet.lambda$showGiftOfferSheet$15();
                    Utilities.Callback callback = (Utilities.Callback) obj;
                    if (callback != null) {
                        callback.run(Boolean.FALSE);
                    }
                    Bundle bundle2 = new Bundle();
                    bundle2.putLong("user_id", j2);
                    bundle2.putBoolean("open_gifts", true);
                    safeLastFragment.presentFragment(new ProfileActivity(bundle2, null));
                    break;
                }
                break;
            case 18:
                GroupCallActivity groupCallActivity = (GroupCallActivity) obj2;
                groupCallActivity.getClass();
                TLRPC.Updates updates = (TLRPC.Updates) obj;
                TLRPC.Update update = updates.update;
                if (update instanceof TL_update.TL_updateNewMessage) {
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) update).message;
                    if (message == null || !(message.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                        i = 0;
                    } else {
                        i = message.id;
                    }
                } else if (update instanceof TL_update.TL_updateMessageID) {
                    i = ((TL_update.TL_updateMessageID) update).id;
                } else if (updates.updates != null) {
                    int i6 = 0;
                    while (true) {
                        if (i6 < updates.updates.size()) {
                            TLRPC.Update update2 = updates.updates.get(i6);
                            if (update2 instanceof TL_update.TL_updateNewMessage) {
                                TLRPC.Message message2 = ((TL_update.TL_updateNewMessage) update2).message;
                                if (message2 != null && (message2.action instanceof TLRPC.TL_messageActionConferenceCall)) {
                                    i = message2.id;
                                }
                                i6++;
                            } else {
                                if (update2 instanceof TL_update.TL_updateMessageID) {
                                    i = ((TL_update.TL_updateMessageID) update2).id;
                                }
                                i6++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                } else {
                    i = 0;
                }
                ChatObject.Call call = groupCallActivity.call;
                if (call != null && i != 0) {
                    call.invitedUsersMessageIds.put(Long.valueOf(j2), ChatObject.Call.InvitedUser.make(i));
                    groupCallActivity.applyCallParticipantUpdates(true);
                    break;
                }
                break;
            case 19:
                LaunchActivity launchActivity = (LaunchActivity) obj2;
                launchActivity.getClass();
                BaseFragment safeLastFragment2 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment2 != null) {
                    Long l = (Long) obj;
                    ChatActivity chatActivityOf = ChatActivity.of(l.longValue());
                    safeLastFragment2.presentFragment(chatActivityOf);
                    TLRPC.Chat chat = MessagesController.getInstance(launchActivity.currentAccount).getChat(Long.valueOf(-l.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new LaunchActivity$$ExternalSyntheticLambda175(chatActivityOf, this.f$1, chat, 0), 250L);
                    }
                    break;
                }
                break;
            case 20:
                LaunchActivity launchActivity2 = (LaunchActivity) obj2;
                AndroidUtilities.runOnUIThread(new IntroActivity$$ExternalSyntheticLambda5(launchActivity2, MessagesStorage.getInstance(launchActivity2.currentAccount).getUser(j2), (LaunchActivity$$ExternalSyntheticLambda27) obj, 29));
                break;
            case 21:
                LocationActivity locationActivity = (LocationActivity) obj2;
                if (locationActivity.map != null) {
                    TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) ((TLObject) obj);
                    int i7 = 0;
                    while (i7 < messages_messages.messages.size()) {
                        if (!(messages_messages.messages.get(i7).media instanceof TLRPC.TL_messageMediaGeoLive)) {
                            messages_messages.messages.remove(i7);
                            i7--;
                        }
                        i7++;
                    }
                    locationActivity.getMessagesStorage().putUsersAndChats(messages_messages.users, messages_messages.chats, true, true);
                    locationActivity.getMessagesController().putUsers(messages_messages.users, false);
                    locationActivity.getMessagesController().putChats(messages_messages.chats, false);
                    locationActivity.getLocationController().locationsCache.put(messages_messages.messages, j2);
                    locationActivity.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveLocationsCacheChanged, Long.valueOf(j2));
                    locationActivity.fetchRecentLocations(messages_messages.messages);
                    locationActivity.getLocationController().markLiveLoactionsAsRead(locationActivity.dialogId);
                    if (locationActivity.markAsReadRunnable == null) {
                        LocationActivity$$ExternalSyntheticLambda6 locationActivity$$ExternalSyntheticLambda6 = new LocationActivity$$ExternalSyntheticLambda6(locationActivity, 5);
                        locationActivity.markAsReadRunnable = locationActivity$$ExternalSyntheticLambda6;
                        AndroidUtilities.runOnUIThread(locationActivity$$ExternalSyntheticLambda6, 5000L);
                    }
                    break;
                }
                break;
            case 22:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj2;
                starGiftSheet.showTimeoutAlert((int) j2, starGiftSheet.getContext(), true);
                Runnable runnable = (Runnable) obj;
                if (runnable != null) {
                    runnable.run();
                }
                break;
            case 23:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) obj2;
                starGiftSheet2.getClass();
                ((Browser.Progress) obj).end();
                starGiftSheet2.showTimeoutAlert((int) j2, starGiftSheet2.getContext(), true);
                break;
            case 24:
                BottomSheet bottomSheet = ((BottomSheet[]) obj2)[0];
                if (bottomSheet != null) {
                    bottomSheet.lambda$showGiftOfferSheet$15();
                }
                BaseFragment safeLastFragment3 = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment3 != null) {
                    safeLastFragment3.presentFragment(ChatActivity.of(((TL_stories.Boost) obj).giveaway_msg_id, j2));
                    break;
                }
                break;
            case 25:
                DialogStoriesCell dialogStoriesCell = (DialogStoriesCell) obj2;
                DialogsActivity dialogsActivity2 = dialogStoriesCell.fragment;
                if (dialogsActivity2 != null && dialogsActivity2.getParentActivity() != null) {
                    DialogStoriesCell.StoryCell storyCell = (DialogStoriesCell.StoryCell) obj;
                    int size = storyCell.position;
                    ArrayList arrayList2 = new ArrayList();
                    int i8 = 0;
                    while (true) {
                        arrayList = dialogStoriesCell.items;
                        int size2 = arrayList.size();
                        storiesController = dialogStoriesCell.storiesController;
                        if (i8 < size2) {
                            long j3 = ((DialogStoriesCell.Item) arrayList.get(i8)).dialogId;
                            j = j2;
                            i2 = 1;
                            if (j3 == UserConfig.getInstance(dialogStoriesCell.currentAccount).clientUserId || !storiesController.hasUnreadStories(j3)) {
                                i8++;
                                j2 = j;
                            } else {
                                z = false;
                            }
                        } else {
                            j = j2;
                            i2 = 1;
                            z = true;
                        }
                    }
                    if (!storyCell.isSelf || (z && arrayList.size() != i2)) {
                        if (storyCell.isSelf || !storiesController.hasUnreadStories(storyCell.dialogId)) {
                            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                                if (storiesController.hasStories(((DialogStoriesCell.Item) arrayList.get(i9)).dialogId)) {
                                    arrayList2.add(Long.valueOf(((DialogStoriesCell.Item) arrayList.get(i9)).dialogId));
                                } else if (i9 <= size) {
                                    size--;
                                }
                            }
                            i3 = size;
                            z2 = false;
                        } else {
                            int i10 = 0;
                            while (i10 < arrayList.size()) {
                                long j4 = ((DialogStoriesCell.Item) arrayList.get(i10)).dialogId;
                                if (!storyCell.isSelf && storiesController.hasUnreadStories(j4)) {
                                    arrayList2.add(Long.valueOf(j4));
                                }
                                if (j4 == storyCell.dialogId) {
                                    i4 = 1;
                                    size = arrayList2.size() - 1;
                                } else {
                                    i4 = 1;
                                }
                                i10 += i4;
                            }
                            i3 = size;
                            z2 = false;
                            z3 = true;
                        }
                        StoryViewer orCreateStoryViewer = dialogsActivity2.getOrCreateStoryViewer();
                        orCreateStoryViewer.doOnAnimationReadyRunnables.add(new LinkManager$3$$ExternalSyntheticLambda0(dialogStoriesCell, j, 21));
                        Context context = dialogStoriesCell.getContext();
                        StoriesListPlaceProvider storiesListPlaceProvider = new StoriesListPlaceProvider(dialogStoriesCell.recyclerListView, false);
                        storiesListPlaceProvider.loadNextInterface = new ChatActivity$$ExternalSyntheticLambda168(9, dialogStoriesCell, z2);
                        if (dialogStoriesCell.type == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        storiesListPlaceProvider.hiddedStories = z4;
                        storiesListPlaceProvider.onlyUnreadStories = z3;
                        storiesListPlaceProvider.onlySelfStories = z2;
                        storiesListPlaceProvider.hasPaginationParams = true;
                        orCreateStoryViewer.open(UserConfig.selectedAccount, context, null, arrayList2, i3, null, null, storiesListPlaceProvider, false);
                    } else {
                        arrayList2.add(Long.valueOf(storyCell.dialogId));
                        i3 = size;
                        z2 = true;
                    }
                    z3 = false;
                    StoryViewer orCreateStoryViewer2 = dialogsActivity2.getOrCreateStoryViewer();
                    orCreateStoryViewer2.doOnAnimationReadyRunnables.add(new LinkManager$3$$ExternalSyntheticLambda0(dialogStoriesCell, j, 21));
                    Context context2 = dialogStoriesCell.getContext();
                    StoriesListPlaceProvider storiesListPlaceProvider2 = new StoriesListPlaceProvider(dialogStoriesCell.recyclerListView, false);
                    storiesListPlaceProvider2.loadNextInterface = new ChatActivity$$ExternalSyntheticLambda168(9, dialogStoriesCell, z2);
                    if (dialogStoriesCell.type == 1) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    storiesListPlaceProvider2.hiddedStories = z4;
                    storiesListPlaceProvider2.onlyUnreadStories = z3;
                    storiesListPlaceProvider2.onlySelfStories = z2;
                    storiesListPlaceProvider2.hasPaginationParams = true;
                    orCreateStoryViewer2.open(UserConfig.selectedAccount, context2, null, arrayList2, i3, null, null, storiesListPlaceProvider2, false);
                    break;
                }
                break;
            case 26:
                StoriesController storiesController2 = (StoriesController) obj2;
                storiesController2.allStoriesLoading.remove(Long.valueOf(j2));
                TLObject tLObject = (TLObject) obj;
                if (tLObject != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject;
                    int i11 = storiesController2.currentAccount;
                    MessagesController.getInstance(i11).putUsers(tL_stories_peerStories.users, false);
                    TLRPC.User user2 = MessagesController.getInstance(i11).getUser(Long.valueOf(j2));
                    TL_stories.PeerStories peerStories = tL_stories_peerStories.stories;
                    storiesController2.allStoriesMap.put(peerStories, DialogObject.getPeerDialogId(peerStories.peer));
                    if (user2 != null && (storiesController2.isContactOrService(user2) || user2.self)) {
                        storiesController2.applyToList(peerStories);
                        StoriesStorage storiesStorage = storiesController2.storiesStorage;
                        storiesStorage.storage.getStorageQueue().postRunnable(new StoriesStorage$$ExternalSyntheticLambda13(storiesStorage, peerStories, 0));
                    }
                    StringBuilder sbM = AacUtil.m(j2, "StoriesController processAllStoriesResponse dialogId=", " overwrite stories ");
                    sbM.append(tL_stories_peerStories.stories.stories.size());
                    FileLog.d(sbM.toString());
                    NotificationCenter.getInstance(i11).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                    break;
                }
                break;
            case 27:
                StoriesController.UploadingStory uploadingStory = (StoriesController.UploadingStory) obj2;
                uploadingStory.entryDestroyed = true;
                StoryEntry storyEntry = uploadingStory.entry;
                boolean z6 = storyEntry.isError;
                StoriesController storiesController3 = StoriesController.this;
                DraftsController draftsController = storiesController3.draftsController;
                if (z6) {
                    draftsController.getClass();
                    ArrayList arrayList3 = new ArrayList(1);
                    arrayList3.add(storyEntry);
                    draftsController.delete(arrayList3);
                }
                storyEntry.isError = false;
                storyEntry.error = null;
                if (storyEntry.isEditingCover) {
                    z5 = false;
                } else {
                    draftsController.getClass();
                    if (storyEntry.isRepostMessage) {
                        z5 = false;
                    } else {
                        TL_stories.StoryItem storyItem = (TL_stories.StoryItem) obj;
                        if (storyItem.media == null) {
                            z5 = false;
                        } else {
                            ArrayList arrayList4 = new ArrayList();
                            ArrayList arrayList5 = draftsController.drafts;
                            int size3 = arrayList5.size();
                            int i12 = 0;
                            while (i12 < size3) {
                                Object obj3 = arrayList5.get(i12);
                                i12++;
                                StoryEntry storyEntry2 = (StoryEntry) obj3;
                                if (storyEntry2.isEdit && storyEntry2.editStoryId == storyItem.id) {
                                    arrayList4.add(storyEntry2);
                                }
                            }
                            draftsController.delete(arrayList4);
                            draftsController.prepare(storyEntry);
                            storyEntry.draftId = Utilities.random.nextLong();
                            DraftsController.StoryDraft storyDraft = new DraftsController.StoryDraft(storyEntry);
                            storyEntry.isEdit = true;
                            storyDraft.isEdit = true;
                            storyEntry.editStoryPeerId = j2;
                            storyDraft.editStoryPeerId = j2;
                            int i13 = storyItem.id;
                            storyEntry.editStoryId = i13;
                            storyDraft.editStoryId = i13;
                            long j5 = ((long) storyItem.expire_date) * 1000;
                            storyEntry.editExpireDate = j5;
                            storyDraft.editExpireDate = j5;
                            TLRPC.MessageMedia messageMedia = storyItem.media;
                            TLRPC.Document document = messageMedia.document;
                            if (document != null) {
                                long j6 = document.id;
                                storyEntry.editDocumentId = j6;
                                storyDraft.editDocumentId = j6;
                            } else {
                                TLRPC.Photo photo = messageMedia.photo;
                                if (photo != null) {
                                    long j7 = photo.id;
                                    storyEntry.editPhotoId = j7;
                                    storyDraft.editPhotoId = j7;
                                }
                            }
                            arrayList5.remove(storyEntry);
                            z5 = false;
                            arrayList5.add(0, storyEntry);
                            draftsController.append(storyDraft);
                        }
                    }
                }
                if (!uploadingStory.edit) {
                    storiesController3.storyLimitFetched = z5;
                    storiesController3.storyLimitCached = null;
                }
                break;
            case 28:
                ArrayList arrayList6 = (ArrayList) obj;
                MessagesStorage messagesStorage = ((StoriesStorage) obj2).storage;
                SQLiteDatabase database = messagesStorage.getDatabase();
                try {
                    String strJoin = TextUtils.join(", ", arrayList6);
                    Locale locale = Locale.US;
                    database.executeFast("DELETE FROM stories WHERE dialog_id = " + j2 + " AND story_id IN (" + strJoin + ")").stepThis().dispose();
                } catch (Throwable th) {
                    messagesStorage.checkSQLException(th);
                    return;
                }
                break;
            default:
                ((StoriesStorage) obj2).updateStoryItemInternal(j2, (TL_stories.StoryItem) obj);
                break;
        }
    }

    public PollItemMenu$$ExternalSyntheticLambda12(Object obj, Object obj2, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = j;
    }
}
