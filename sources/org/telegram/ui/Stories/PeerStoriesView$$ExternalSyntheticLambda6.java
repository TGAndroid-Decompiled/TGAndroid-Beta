package org.telegram.ui.Stories;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog;
import org.telegram.ui.Components.chat.layouts.ButtonOnClickListener;

public final class PeerStoriesView$$ExternalSyntheticLambda6 implements ButtonOnClickListener, AlertDialog.OnButtonClickListener {
    public final int $r8$classId;
    public final PeerStoriesView f$0;

    public PeerStoriesView$$ExternalSyntheticLambda6(PeerStoriesView peerStoriesView, int i) {
        this.$r8$classId = i;
        this.f$0 = peerStoriesView;
    }

    @Override
    public void onClick(int i) {
        PeerStoriesView peerStoriesView = this.f$0;
        if (i == 0) {
            peerStoriesView.openAttachMenu$2();
        }
    }

    @Override
    public void onClick(AlertDialog alertDialog, int i) {
        long j;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        ?? r13;
        TL_stories.PeerStories peerStories;
        ?? r9;
        boolean z;
        TL_stories.PeerStories peerStories2;
        boolean z2;
        TL_stories.StoryItem storyItem;
        PeerStoriesView peerStoriesView = this.f$0;
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView.AnonymousClass19 anonymousClass19 = peerStoriesView.chatActivityEnterView;
                if (anonymousClass19 != null) {
                    anonymousClass19.cancelRecordingAudioVideo();
                }
                break;
            default:
                PeerStoriesView.StoryItemHolder storyItemHolder = peerStoriesView.currentStory;
                TLRPC.ChatFull chatFull3 = null;
                if (storyItemHolder.isLive && (storyItem = storyItemHolder.storyItem) != null) {
                    TLRPC.MessageMedia messageMedia = storyItem.media;
                    if (messageMedia instanceof TLRPC.TL_messageMediaVideoStream) {
                        TLRPC.InputGroupCall inputGroupCall = ((TLRPC.TL_messageMediaVideoStream) messageMedia).call;
                        LivePlayer livePlayer = LivePlayer.recording;
                        if (livePlayer != null && livePlayer.equals(inputGroupCall)) {
                            LivePlayer.recording.destroy();
                            if (LivePlayer.recording != null) {
                                LivePlayer.recording = null;
                                NotificationCenter.getInstance(peerStoriesView.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.liveStoryUpdated, Long.valueOf(LivePlayer.recording.getCallId()));
                            }
                        }
                    }
                }
                TL_stories.StoryItem storyItem2 = storyItemHolder.storyItem;
                if (storyItem2 instanceof StoriesController.BotPreview) {
                    StoriesController.BotPreviewsList botPreviewsList = ((StoriesController.BotPreview) storyItem2).list;
                    TLRPC.MessageMedia messageMedia2 = storyItem2.media;
                    botPreviewsList.getClass();
                    botPreviewsList.delete(new ArrayList(Arrays.asList(messageMedia2)));
                } else if (storyItem2 != null) {
                    StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = storyItemHolder.this$0;
                    StoriesController storiesController = anonymousClass1.storiesController;
                    long j2 = anonymousClass1.dialogId;
                    storiesController.getClass();
                    if (!(storyItem2 instanceof TL_stories.TL_storyItemDeleted)) {
                        int i2 = 0;
                        while (true) {
                            int i3 = storiesController.currentAccount;
                            if (i2 < 2) {
                                LongSparseArray longSparseArray = storiesController.allStoriesMap;
                                if (i2 == 0) {
                                    peerStories2 = (TL_stories.PeerStories) longSparseArray.get(j2);
                                    j = 0;
                                    chatFull = chatFull3;
                                    r9 = chatFull;
                                } else if (j2 >= 0) {
                                    TLRPC.UserFull userFull = MessagesController.getInstance(i3).getUserFull(j2);
                                    if (userFull != null) {
                                        j = 0;
                                        r9 = userFull;
                                        r13 = userFull.stories;
                                        chatFull = chatFull3;
                                    } else {
                                        j = 0;
                                        r9 = userFull;
                                        chatFull = chatFull3;
                                        r13 = chatFull;
                                    }
                                } else {
                                    j = 0;
                                    chatFull = MessagesController.getInstance(i3).getChatFull(-j2);
                                    if (chatFull != null) {
                                        peerStories = chatFull.stories;
                                        r9 = chatFull3;
                                    } else {
                                        chatFull2 = chatFull3;
                                        r13 = chatFull2;
                                    }
                                }
                                if (r13 != 0) {
                                    r9 = chatFull2;
                                    r13 = peerStories;
                                    r13 = peerStories2;
                                    for (int i4 = 0; i4 < r13.stories.size(); i4++) {
                                        if (r13.stories.get(i4).id == storyItem2.id) {
                                            r13.stories.remove(i4);
                                            if (r13.stories.size() == 0) {
                                                if (!storiesController.hasUploadingStories(j2)) {
                                                    longSparseArray.remove(j2);
                                                    storiesController.dialogListStories.remove(r13);
                                                    storiesController.hiddenListStories.remove(r13);
                                                }
                                                if (j2 > j) {
                                                    TLRPC.User user = MessagesController.getInstance(i3).getUser(Long.valueOf(j2));
                                                    if (user != null) {
                                                        user.stories_unavailable = true;
                                                    }
                                                } else {
                                                    TLRPC.Chat chat = MessagesController.getInstance(i3).getChat(Long.valueOf(-j2));
                                                    if (chat != null) {
                                                        chat.stories_unavailable = true;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                if (chatFull != null) {
                                    z = false;
                                    MessagesStorage.getInstance(i3).updateChatInfo(chatFull, false);
                                } else {
                                    z = false;
                                }
                                if (r9 != 0) {
                                    MessagesStorage.getInstance(i3).updateUserInfo(r9, z);
                                }
                                i2++;
                                chatFull3 = null;
                            } else {
                                TL_stories.TL_stories_deleteStories tL_stories_deleteStories = new TL_stories.TL_stories_deleteStories();
                                tL_stories_deleteStories.peer = MessagesController.getInstance(i3).getInputPeer(j2);
                                tL_stories_deleteStories.id.add(Integer.valueOf(storyItem2.id));
                                ConnectionsManager.getInstance(i3).sendRequest(tL_stories_deleteStories, new StoriesController$$ExternalSyntheticLambda0(storiesController, 5));
                                int i5 = storyItem2.id;
                                StoriesStorage storiesStorage = storiesController.storiesStorage;
                                storiesStorage.storage.getStorageQueue().postRunnable(new StoriesStorage$$ExternalSyntheticLambda6(storiesStorage, j2, i5, 1));
                                NotificationCenter.getInstance(i3).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                                MessagesController.getInstance(i3).checkArchiveFolder();
                                storiesController.updateDeletedStoriesInLists(j2, Arrays.asList(storyItem2));
                            }
                        }
                    }
                } else {
                    StoriesController.UploadingStory uploadingStory = storyItemHolder.uploadingStory;
                    if (uploadingStory != null) {
                        uploadingStory.cancel();
                    }
                }
                peerStoriesView.updateStoryItems();
                if (peerStoriesView.isActive && peerStoriesView.count == 0) {
                    ((StoryViewer.AnonymousClass5) peerStoriesView.delegate).switchToNextAndRemoveCurrentPeer();
                } else {
                    int i6 = peerStoriesView.selectedPosition;
                    int i7 = peerStoriesView.count;
                    if (i6 >= i7) {
                        peerStoriesView.selectedPosition = i7 - 1;
                        z2 = false;
                    } else {
                        z2 = false;
                        if (i6 < 0) {
                            peerStoriesView.selectedPosition = 0;
                        }
                    }
                    peerStoriesView.updatePosition(z2);
                    StoryViewer storyViewer = peerStoriesView.storyViewer;
                    if (storyViewer != null) {
                        storyViewer.checkSelfStoriesView();
                    }
                }
                break;
        }
    }
}
