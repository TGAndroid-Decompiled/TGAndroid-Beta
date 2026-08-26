package org.telegram.ui.Stars;

import android.view.View;
import androidx.collection.LongSparseArray;
import com.google.android.exoplayer2.util.Consumer;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatObject$Call$$ExternalSyntheticOutline0;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ChatActivity$$ExternalSyntheticLambda155;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda51;
import org.telegram.ui.Stories.StoriesController;
import org.telegram.ui.Stories.StoriesUtilities;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;

public final class StarsController$$ExternalSyntheticLambda87 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;
    public final long f$2;
    public final Object f$3;

    public StarsController$$ExternalSyntheticLambda87(Object obj, Object obj2, long j, Object obj3, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = j;
        this.f$3 = obj3;
    }

    @Override
    public final void run() {
        boolean z;
        int i;
        boolean z2;
        boolean z3;
        TLRPC.ChatParticipants chatParticipants;
        ArrayList<TLRPC.ChatParticipant> arrayList;
        long j = this.f$2;
        TL_stories.StoryItem storyItem = null;
        Object obj = this.f$3;
        Object obj2 = this.f$1;
        Object obj3 = this.f$0;
        switch (this.$r8$classId) {
            case 0:
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
            case 1:
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
                            i = 0;
                            NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyDeleted, Long.valueOf(j), Integer.valueOf(tL_updateStory.story.id));
                        } else {
                            i = 0;
                        }
                        NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i]);
                    }
                    MessagesController.getInstance(i3).checkArchiveFolder();
                    break;
                } else {
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
                        i = 0;
                        NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storyDeleted, Long.valueOf(j), Integer.valueOf(tL_updateStory.story.id));
                    } else {
                        i = 0;
                    }
                    NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[i]);
                }
                MessagesController.getInstance(i3).checkArchiveFolder();
                break;
            case 2:
                StoriesController.AnonymousClass1 anonymousClass1 = (StoriesController.AnonymousClass1) obj3;
                TLObject tLObject2 = (TLObject) obj2;
                if (tLObject2 != null) {
                    TL_stories.TL_stories_peerStories tL_stories_peerStories = (TL_stories.TL_stories_peerStories) tLObject2;
                    StoriesController storiesController2 = StoriesController.this;
                    int i5 = storiesController2.currentAccount;
                    MessagesController.getInstance(i5).putUsers(tL_stories_peerStories.users, false);
                    MessagesController.getInstance(i5).putChats(tL_stories_peerStories.chats, false);
                    TL_stories.PeerStories peerStories2 = tL_stories_peerStories.stories;
                    if (peerStories2 != null) {
                        for (int i6 = 0; i6 < peerStories2.stories.size(); i6++) {
                            if ((peerStories2.stories.get(i6).media instanceof TLRPC.TL_messageMediaVideoStream) && !(peerStories2.stories.get(i6) instanceof TL_stories.TL_storyItemSkipped)) {
                                storyItem = peerStories2.stories.get(i6);
                                storiesController2.resolvedStories.put(storyItem, j);
                            }
                        }
                    }
                }
                ((LaunchActivity$$ExternalSyntheticLambda51) obj).accept(storyItem);
                break;
            case 3:
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
            case 4:
                StoriesUtilities.UserStoriesLoadOperation userStoriesLoadOperation = (StoriesUtilities.UserStoriesLoadOperation) obj3;
                userStoriesLoadOperation.getClass();
                long j2 = this.f$2;
                AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda17(userStoriesLoadOperation, (View) obj2, j2, 15), 500L);
                ((StoriesUtilities.AvatarStoryParams) obj).openStory(j2, null);
                break;
            default:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) obj3;
                page.getClass();
                boolean zIsChannel = ChatObject.isChannel((TLRPC.Chat) obj2);
                long j3 = this.f$2;
                TLRPC.ChatFull chatFullLoadChatInfoInQueue = ((MessagesStorage) obj).loadChatInfoInQueue(j3, zIsChannel, true, true, 0);
                if (chatFullLoadChatInfoInQueue == null || (chatParticipants = chatFullLoadChatInfoInQueue.participants) == null || ((arrayList = chatParticipants.participants) != null && arrayList.size() < chatFullLoadChatInfoInQueue.participants_count - 1)) {
                    AndroidUtilities.runOnUIThread(new ChatActivity$$ExternalSyntheticLambda155(page, zIsChannel, j3, 6));
                } else {
                    AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda17(page, j3, chatFullLoadChatInfoInQueue, 16));
                }
                break;
        }
    }

    public StarsController$$ExternalSyntheticLambda87(StoriesController storiesController, long j, TL_stories.TL_updateStory tL_updateStory, TLRPC.User user) {
        this.$r8$classId = 1;
        this.f$0 = storiesController;
        this.f$2 = j;
        this.f$1 = tL_updateStory;
        this.f$3 = user;
    }

    public StarsController$$ExternalSyntheticLambda87(StoryPrivacyBottomSheet.Page page, TLRPC.Chat chat, MessagesStorage messagesStorage, long j) {
        this.$r8$classId = 5;
        this.f$0 = page;
        this.f$1 = chat;
        this.f$3 = messagesStorage;
        this.f$2 = j;
    }
}
