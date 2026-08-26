package org.telegram.ui.Cells;

import java.util.Collections;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.BaseFragment;
import org.telegram.ui.ChatActivity;
import org.telegram.ui.Components.SharedMediaLayout;
import org.telegram.ui.Gifts.GiftSheet$$ExternalSyntheticLambda17;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Stories.StoriesController;

public final class ChatMessageCell$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final int f$2;

    public ChatMessageCell$$ExternalSyntheticLambda7(Object obj, int i, long j, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = i;
        this.f$1 = j;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatMessageCell) this.f$0).lambda$setMessageContent$7(this.f$1, this.f$2);
                break;
            case 1:
                ((LocationController) this.f$0).lambda$setProximityLocation$12(this.f$2, this.f$1);
                break;
            case 2:
                ((MediaController) this.f$0).lambda$prepareResumedRecording$23(this.f$2, this.f$1);
                break;
            case 3:
                ((MediaDataController) this.f$0).lambda$deletePeer$159(this.f$1, this.f$2);
                break;
            case 4:
                ((MessagesController) this.f$0).lambda$processUpdateArray$420(this.f$1, this.f$2);
                break;
            case 5:
                SendMessagesHelper.lambda$finishGroup$117((AccountInstance) this.f$0, this.f$1, this.f$2);
                break;
            case 6:
                ((SharedMediaLayout) this.f$0).lambda$openDeleteStoriesAlbumAlert$71(this.f$1, this.f$2);
                break;
            case 7:
                BaseFragment safeLastFragment = LaunchActivity.getSafeLastFragment();
                if (safeLastFragment != null) {
                    Long l = (Long) this.f$0;
                    ChatActivity chatActivityOf = ChatActivity.of(l.longValue());
                    safeLastFragment.presentFragment(chatActivityOf);
                    TLRPC.Chat chat = MessagesController.getInstance(this.f$2).getChat(Long.valueOf(-l.longValue()));
                    if (chat != null) {
                        AndroidUtilities.runOnUIThread(new GiftSheet$$ExternalSyntheticLambda17(chatActivityOf, this.f$1, chat, 9), 250L);
                    }
                    break;
                }
                break;
            default:
                StoriesController storiesController = (StoriesController) this.f$0;
                LongSparseIntArray longSparseIntArray = storiesController.dialogIdToMaxReadId;
                long j = this.f$1;
                int i = longSparseIntArray.get(j, 0);
                int i2 = this.f$2;
                int iMax = Math.max(i, i2);
                storiesController.dialogIdToMaxReadId.put(j, iMax);
                storiesController.storiesStorage.updateMaxReadId(iMax, j);
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.allStoriesMap.get(j);
                if (peerStories != null && i2 > peerStories.max_read_id) {
                    peerStories.max_read_id = i2;
                    Collections.sort(storiesController.dialogListStories, storiesController.peerStoriesComparator);
                    NotificationCenter.getInstance(storiesController.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
                }
                break;
        }
    }

    public ChatMessageCell$$ExternalSyntheticLambda7(Object obj, long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = i;
    }
}
