package org.telegram.ui;

import android.graphics.Bitmap;
import android.text.SpannableStringBuilder;
import android.view.TextureView;
import android.view.View;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FactCheckController$$ExternalSyntheticOutline0;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.Components.Bulletin;
import org.telegram.ui.Components.BulletinFactory;
import org.telegram.ui.Components.voip.VoIPHelper;
import org.telegram.ui.Stars.StarGiftSheet;
import org.telegram.ui.Stars.StarReactionsOverlay;
import org.telegram.ui.Stars.StarsController;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.bots.ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda16;

public final class PhotoViewer$$ExternalSyntheticLambda126 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final Object f$2;
    public final long f$3;

    public PhotoViewer$$ExternalSyntheticLambda126(Object obj, long j, TLObject tLObject, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$3 = j;
        this.f$1 = tLObject;
        this.f$2 = obj2;
    }

    @Override
    public final void run() {
        char c;
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        TL_stories.StoryItem storyItem = null;
        long j = this.f$3;
        Object obj = this.f$2;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                PhotoViewer photoViewer = (PhotoViewer) obj3;
                photoViewer.getClass();
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                long j2 = this.f$3;
                PhotoViewer$$ExternalSyntheticLambda174 photoViewer$$ExternalSyntheticLambda174 = new PhotoViewer$$ExternalSyntheticLambda174(photoViewer, (String) obj2, photoEntry, j2);
                if (photoViewer.usedSurfaceView) {
                    Bitmap bitmapCreateBitmap = Bitmap.createBitmap(photoViewer.videoSurfaceView.getWidth(), photoViewer.videoSurfaceView.getHeight(), Bitmap.Config.ARGB_8888);
                    AndroidUtilities.getBitmapFromSurface(photoViewer.videoSurfaceView, bitmapCreateBitmap, new PhotoViewer$$ExternalSyntheticLambda7(10, photoViewer$$ExternalSyntheticLambda174, bitmapCreateBitmap));
                } else {
                    TextureView textureView = photoViewer.videoTextureView;
                    Bitmap bitmap = textureView.getBitmap(textureView.getWidth(), photoViewer.videoTextureView.getHeight());
                    if (bitmap == null) {
                        photoViewer$$ExternalSyntheticLambda174.run(SendMessagesHelper.createVideoThumbnailAtTime(photoEntry.path, j2, null, true));
                    } else {
                        photoViewer$$ExternalSyntheticLambda174.run(bitmap);
                    }
                }
                break;
            case 1:
                LaunchActivity.AnonymousClass14 anonymousClass14 = (LaunchActivity.AnonymousClass14) obj3;
                if (((String) obj2) != null) {
                    AccountInstance accountInstance = AccountInstance.getInstance(LaunchActivity.this.currentAccount);
                    MessagesController messagesController = accountInstance.getMessagesController();
                    long j3 = this.f$3;
                    long j4 = -j3;
                    ChatObject.Call groupCall = messagesController.getGroupCall(j4, false);
                    BaseFragment baseFragment = (BaseFragment) obj;
                    if (groupCall != null) {
                        TLRPC.Chat chat = accountInstance.getMessagesController().getChat(Long.valueOf(j4));
                        accountInstance.getMessagesController().getInputPeer(j3);
                        VoIPHelper.startCall(chat, null, false, Boolean.valueOf(!groupCall.call.rtmp_stream), LaunchActivity.this, baseFragment, accountInstance);
                    } else {
                        TLRPC.ChatFull chatFull = accountInstance.getMessagesController().getChatFull(j4);
                        if (chatFull != null) {
                            if (chatFull.call != null) {
                                accountInstance.getMessagesController().getGroupCall(j4, true, new LaunchActivity$14$$ExternalSyntheticLambda1(anonymousClass14, accountInstance, j3, baseFragment, 0));
                            } else if (baseFragment.getParentActivity() != null) {
                                FactCheckController$$ExternalSyntheticOutline0.m(R.string.InviteExpired, BulletinFactory.of(baseFragment), R.raw.linkbroken, 36);
                            }
                        }
                    }
                }
                break;
            case 2:
                StarGiftSheet starGiftSheet = (StarGiftSheet) obj3;
                starGiftSheet.getClass();
                if (((StarsController) obj2).balanceLoaded) {
                    starGiftSheet.doTransfer(j, (Utilities.Callback) obj);
                } else {
                    Bulletin bulletinCreateSimpleBulletinWithIconSize = starGiftSheet.getBulletinFactory().createSimpleBulletinWithIconSize(R.raw.error, 36, LocaleController.formatString(R.string.UnknownErrorCode, "NO_BALANCE"));
                    bulletinCreateSimpleBulletinWithIconSize.ignoreDetach = true;
                    bulletinCreateSimpleBulletinWithIconSize.show();
                }
                break;
            case 3:
                ((StarGiftSheet) obj3).lambda$openSetAsTheme$16(j, (TL_stars.TL_starGiftUnique) obj2, (DialogsActivity) obj);
                break;
            case 4:
                StarGiftSheet starGiftSheet2 = (StarGiftSheet) obj3;
                starGiftSheet2.getClass();
                ((boolean[]) obj2)[0] = true;
                starGiftSheet2.button.setLoading(false);
                starGiftSheet2.doTransfer(j, (Utilities.Callback) obj);
                break;
            case 5:
                ((StarsController) obj2).sendPaidReaction((MessageObject) obj, ((StarReactionsOverlay) obj3).chatActivity, this.f$3, true, true, null);
                break;
            case 6:
                StarsController starsController = (StarsController) obj3;
                starsController.getClass();
                TLObject tLObject = (TLObject) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (tLObject instanceof TL_stars.starGiftUpgradePreview) {
                    TL_stars.starGiftUpgradePreview stargiftupgradepreview = (TL_stars.starGiftUpgradePreview) tLObject;
                    starsController.giftPreviews.put(Long.valueOf(j), stargiftupgradepreview);
                    callback.run(stargiftupgradepreview);
                } else {
                    callback.run(null);
                }
                break;
            case 7:
                StarsController starsController2 = (StarsController) obj3;
                Utilities.Callback callback2 = (Utilities.Callback) obj2;
                if (starsController2.balanceLoaded) {
                    starsController2.getResellingGiftForm((TL_stars.StarGift) obj, this.f$3, null, true, callback2);
                } else {
                    StarsController.bulletinError("NO_BALANCE");
                    callback2.run(null);
                }
                break;
            case 8:
                BulletinFactory bulletinFactoryOf = BulletinFactory.of((ChatActivity) obj3);
                TLRPC.Document document = ((TL_stars.StarGift) obj2).sticker;
                String string = LocaleController.getString(R.string.StarsGiftCompleted);
                SpannableStringBuilder spannableStringBuilderReplaceTags = (SpannableStringBuilder) obj;
                if (spannableStringBuilderReplaceTags == null) {
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralString("StarsGiftCompletedText", (int) j, new Object[0]));
                }
                bulletinFactoryOf.createEmojiBulletin(document, string, spannableStringBuilderReplaceTags).show(true);
                break;
            case 9:
                ((StarsController) obj3).showStarsTopupInternal((LaunchActivity) obj, j, (String) obj2);
                break;
            case 10:
                StoriesController storiesController = (StoriesController) obj3;
                storiesController.getClass();
                FileLog.d("StoriesController update stories for dialog " + j);
                TL_stories.TL_updateStory tL_updateStory = (TL_stories.TL_updateStory) obj2;
                storiesController.updateStoriesInLists(j, Collections.singletonList(tL_updateStory.story), false);
                storiesController.updateStoriesForFullPeer(j, Collections.singletonList(tL_updateStory.story), true);
                LongSparseArray longSparseArray = storiesController.allStoriesMap;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) longSparseArray.get(j);
                ArrayList arrayList2 = new ArrayList();
                int i2 = storiesController.totalStoriesCount;
                ArrayList arrayList3 = storiesController.hiddenListStories;
                ArrayList arrayList4 = storiesController.dialogListStories;
                TLRPC.User user = (TLRPC.User) obj;
                int i3 = storiesController.currentAccount;
                if (peerStories != null) {
                    TL_stories.StoryItem storyItemApplyStoryUpdate = tL_updateStory.story;
                    c = 1;
                    if (storyItemApplyStoryUpdate instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationsController.getInstance(i3).processDeleteStory(j, storyItemApplyStoryUpdate.id);
                    }
                    int i4 = 0;
                    while (true) {
                        if (i4 >= peerStories.stories.size()) {
                            z2 = false;
                        } else if (peerStories.stories.get(i4).id != storyItemApplyStoryUpdate.id) {
                            i4++;
                        } else if (storyItemApplyStoryUpdate instanceof TL_stories.TL_storyItemDeleted) {
                            peerStories.stories.remove(i4);
                            ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("StoriesController remove story id="), storyItemApplyStoryUpdate.id);
                            z2 = true;
                            z3 = true;
                        } else {
                            TL_stories.StoryItem storyItem2 = peerStories.stories.get(i4);
                            storyItemApplyStoryUpdate = StoriesController.applyStoryUpdate(storyItem2, storyItemApplyStoryUpdate);
                            arrayList2.add(storyItemApplyStoryUpdate);
                            peerStories.stories.set(i4, storyItemApplyStoryUpdate);
                            if (storyItemApplyStoryUpdate.attachPath == null) {
                                storyItemApplyStoryUpdate.attachPath = storyItem2.attachPath;
                            }
                            if (storyItemApplyStoryUpdate.firstFramePath == null) {
                                storyItemApplyStoryUpdate.firstFramePath = storyItem2.firstFramePath;
                            }
                            ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("StoriesController update story id="), storyItemApplyStoryUpdate.id);
                            z2 = true;
                        }
                        z3 = false;
                    }
                    if (z2) {
                        z = false;
                    } else if (storyItemApplyStoryUpdate instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.d("StoriesController can't add new story DELETED");
                    } else if (StoriesUtilities.isExpired(i3, storyItemApplyStoryUpdate)) {
                        FileLog.d("StoriesController can't add new story isExpired");
                    } else if (j > 0 && (user == null || !(user.self || storiesController.isContactOrService(user)))) {
                        FileLog.d("StoriesController can't add new story user is not contact");
                    } else {
                        arrayList2.add(storyItemApplyStoryUpdate);
                        peerStories.stories.add(storyItemApplyStoryUpdate);
                        FileLog.d("StoriesController add new story id=" + storyItemApplyStoryUpdate.id + " total stories count " + peerStories.stories.size());
                        storiesController.preloadStory(j, storyItemApplyStoryUpdate);
                        storiesController.applyToList(peerStories);
                        z = true;
                        z3 = true;
                    }
                    if (z3) {
                        if (!peerStories.stories.isEmpty() || storiesController.hasUploadingStories(j)) {
                            Collections.sort(peerStories.stories, StoriesController.storiesComparator);
                        } else {
                            arrayList4.remove(peerStories);
                            arrayList3.remove(peerStories);
                            longSparseArray.remove(DialogObject.getPeerDialogId(peerStories.peer));
                            storiesController.totalStoriesCount--;
                        }
                    }
                    if (i2 != storiesController.totalStoriesCount) {
                        storiesController.mainSettings.edit().putInt("total_stores", storiesController.totalStoriesCount).apply();
                    }
                    storiesController.fixDeletedAndNonContactsStories(arrayList4);
                    storiesController.fixDeletedAndNonContactsStories(arrayList3);
                    if (z) {
                        if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                            NotificationCenter notificationCenter = NotificationCenter.getInstance(i3);
                            int i5 = NotificationCenter.storyDeleted;
                            Long lValueOf = Long.valueOf(j);
                            Integer numValueOf = Integer.valueOf(tL_updateStory.story.id);
                            Object[] objArr = new Object[2];
                            i = 0;
                            objArr[0] = lValueOf;
                            objArr[c] = numValueOf;
                            notificationCenter.lambda$postNotificationNameOnUIThread$1(i5, objArr);
                        } else {
                            i = 0;
                        }
                        NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i]);
                    }
                    MessagesController.getInstance(i3).checkArchiveFolder();
                    break;
                } else {
                    c = 1;
                    TL_stories.StoryItem storyItem3 = tL_updateStory.story;
                    if (storyItem3 instanceof TL_stories.TL_storyItemDeleted) {
                        FileLog.d("StoriesController can't add user " + j + " with new story DELETED");
                    } else if (StoriesUtilities.isExpired(i3, storyItem3)) {
                        FileLog.d("StoriesController can't add user " + j + " with new story isExpired");
                    } else if (j > 0 && (user == null || !(user.self || storiesController.isContactOrService(user)))) {
                        FileLog.d("StoriesController can't add user cause is not contact");
                    } else {
                        TL_stories.TL_peerStories tL_peerStories = new TL_stories.TL_peerStories();
                        tL_peerStories.peer = tL_updateStory.peer;
                        tL_peerStories.stories.add(tL_updateStory.story);
                        ChatObject$Call$$ExternalSyntheticOutline0.m(new StringBuilder("StoriesController add new user with story id="), tL_updateStory.story.id);
                        long peerDialogId = DialogObject.getPeerDialogId(tL_peerStories.peer);
                        storiesController.putToAllStories(peerDialogId, tL_peerStories);
                        if (peerDialogId != UserConfig.getInstance(UserConfig.selectedAccount).clientUserId) {
                            TLRPC.User user2 = MessagesController.getInstance(i3).getUser(Long.valueOf(peerDialogId));
                            storiesController.applyToList(tL_peerStories);
                            if (user2 != null && !user2.stories_hidden) {
                                storiesController.preloadUserStories(tL_peerStories);
                            }
                        }
                        FileLog.d("StoriesController applyNewStories " + peerDialogId);
                        storiesController.updateStoriesInLists(peerDialogId, tL_peerStories.stories, false);
                        storiesController.totalStoriesCount = storiesController.totalStoriesCount + 1;
                        storiesController.loadAllStoriesForDialog(j);
                    }
                }
                z = true;
                if (i2 != storiesController.totalStoriesCount) {
                    storiesController.mainSettings.edit().putInt("total_stores", storiesController.totalStoriesCount).apply();
                }
                storiesController.fixDeletedAndNonContactsStories(arrayList4);
                storiesController.fixDeletedAndNonContactsStories(arrayList3);
                if (z) {
                    if (tL_updateStory.story instanceof TL_stories.TL_storyItemDeleted) {
                        NotificationCenter notificationCenter2 = NotificationCenter.getInstance(i3);
                        int i6 = NotificationCenter.storyDeleted;
                        Long lValueOf2 = Long.valueOf(j);
                        Integer numValueOf2 = Integer.valueOf(tL_updateStory.story.id);
                        Object[] objArr2 = new Object[2];
                        i = 0;
                        objArr2[0] = lValueOf2;
                        objArr2[c] = numValueOf2;
                        notificationCenter2.lambda$postNotificationNameOnUIThread$1(i6, objArr2);
                    } else {
                        i = 0;
                    }
                    NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i]);
                }
                MessagesController.getInstance(i3).checkArchiveFolder();
                break;
            case 11:
                StoriesController.AnonymousClass1 anonymousClass1 = (StoriesController.AnonymousClass1) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    StoriesController storiesController2 = StoriesController.this;
                    int i7 = storiesController2.currentAccount;
                    MessagesController.getInstance(i7).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(i7).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        for (int i8 = 0; i8 < peerStories2.stories.size(); i8++) {
                            if ((peerStories2.stories.get(i8).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories2.stories.get(i8) instanceof TL_stories.TL_storyItemSkipped)) {
                                storyItem = peerStories2.stories.get(i8);
                                storiesController2.resolvedStories.put(storyItem, j);
                            }
                        }
                    }
                }
                ((LaunchActivity$$ExternalSyntheticLambda103) obj).accept(storyItem);
                break;
            case 12:
                StoriesController.AnonymousClass2 anonymousClass2 = (StoriesController.AnonymousClass2) obj3;
                anonymousClass2.getClass();
                TLObject tLObject3 = (TLObject) obj2;
                if (tLObject3 != null) {
                    TL_stories.TL_stories_stories tL_stories_stories = (TL_stories.TL_stories_stories) tLObject3;
                    StoriesController storiesController3 = StoriesController.this;
                    MessagesController.getInstance(storiesController3.currentAccount).putUsers(tL_stories_stories.users, false);
                    MessagesController.getInstance(storiesController3.currentAccount).putChats(tL_stories_stories.chats, false);
                    if (tL_stories_stories.stories.size() > 0) {
                        storyItem = tL_stories_stories.stories.get(0);
                        storiesController3.resolvedStories.put(storyItem, j);
                    }
                }
                ((Consumer) obj).accept(storyItem);
                break;
            case 13:
                StoriesUtilities.UserStoriesLoadOperation userStoriesLoadOperation = (StoriesUtilities.UserStoriesLoadOperation) obj3;
                userStoriesLoadOperation.getClass();
                AndroidUtilities.runOnUIThread(new ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda16(userStoriesLoadOperation, (View) obj2, j), 500L);
                ((StoriesUtilities.AvatarStoryParams) obj).openStory(j);
                break;
            default:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) obj3;
                page.getClass();
                boolean zIsChannel = ChatObject.isChannel((TLRPC.Chat) obj2);
                long j5 = this.f$3;
                TLRPC.ChatFull chatFullLoadChatInfoInQueue = ((MessagesStorage) obj).loadChatInfoInQueue(j5, zIsChannel, true, true, 0);
                if (chatFullLoadChatInfoInQueue == null || (chatParticipants = chatFullLoadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < chatFullLoadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda286(page, zIsChannel, j5, 5));
                } else {
                    AndroidUtilities.runOnUIThread(new ChannelAffiliateProgramsFragment$$ExternalSyntheticLambda16(page, j5, chatFullLoadChatInfoInQueue, 2));
                }
                break;
        }
    }

    public PhotoViewer$$ExternalSyntheticLambda126(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = j;
        this.f$2 = obj3;
    }

    public PhotoViewer$$ExternalSyntheticLambda126(Object obj, Object obj2, Object obj3, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = j;
    }

    public PhotoViewer$$ExternalSyntheticLambda126(StarsController starsController, LaunchActivity launchActivity, long j, String str) {
        this.$r8$classId = 9;
        this.f$0 = starsController;
        this.f$2 = launchActivity;
        this.f$3 = j;
        this.f$1 = str;
    }
}
