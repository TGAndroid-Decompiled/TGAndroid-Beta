package org.telegram.ui;

import androidx.collection.LongSparseArray;
import java.util.ArrayList;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationsController;
import org.telegram.messenger.TopicsController;
import org.telegram.tgnet.tl.TL_communities;
import org.telegram.ui.ActionBar.BottomSheet;
import org.telegram.ui.ActionBar.EmojiThemes$$ExternalSyntheticLambda0;
import org.telegram.ui.Stars.StarsReactionsSheet;
import org.telegram.ui.Stories.LiveCommentsView;
import org.telegram.ui.Stories.recorder.StoryPrivacyBottomSheet;
import org.telegram.ui.community.CommunityUtils;
import org.telegram.ui.community.CommunityUtils$PendingRequests$$ExternalSyntheticLambda2;

public final class ChatActivity$$ExternalSyntheticLambda286 implements Runnable {
    public final int $r8$classId;
    public final Object f$0;
    public final long f$1;
    public final boolean f$2;

    public ChatActivity$$ExternalSyntheticLambda286(Object obj, long j, boolean z, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
        this.f$2 = z;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((ChatActivity) this.f$0).lambda$performHistoryClear$125(this.f$1, this.f$2);
                break;
            case 1:
                ((MediaDataController) this.f$0).lambda$markFeaturedStickersByIdAsRead$67(this.f$2, this.f$1);
                break;
            case 2:
                ((NotificationsController) this.f$0).lambda$setOpenedInBubble$4(this.f$2, this.f$1);
                break;
            case 3:
                ((TopicsController) this.f$0).lambda$reloadTopics$24(this.f$1, this.f$2);
                break;
            case 4:
                StarsReactionsSheet starsReactionsSheet = (StarsReactionsSheet) this.f$0;
                long j = this.f$1;
                starsReactionsSheet.lastSelectedPeer = j;
                starsReactionsSheet.peer = j;
                if (this.f$2) {
                    LiveCommentsView.Message message = starsReactionsSheet.commentMessage;
                    message.dialogId = j;
                    starsReactionsSheet.commentView.set(message);
                }
                starsReactionsSheet.updatePeerDialog();
                starsReactionsSheet.checkBox.checkBoxBase.setChecked(-1, true, true);
                StarsReactionsSheet.TopSendersView topSendersView = starsReactionsSheet.topSendersView;
                if (topSendersView != null) {
                    topSendersView.setMyPrivacy(starsReactionsSheet.peer);
                }
                break;
            case 5:
                StoryPrivacyBottomSheet.Page page = (StoryPrivacyBottomSheet.Page) this.f$0;
                StoryPrivacyBottomSheet storyPrivacyBottomSheet = StoryPrivacyBottomSheet.this;
                boolean z = this.f$2;
                long j2 = this.f$1;
                if (z) {
                    MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).loadChannelParticipants(Long.valueOf(j2), new EmojiThemes$$ExternalSyntheticLambda0(page, j2, 2), 200);
                } else {
                    MessagesController.getInstance(((BottomSheet) storyPrivacyBottomSheet).currentAccount).loadFullChat(j2, 0, true);
                }
                break;
            default:
                CommunityUtils.PendingRequests pendingRequests = (CommunityUtils.PendingRequests) this.f$0;
                pendingRequests.doCommitRunnable = null;
                LongSparseArray longSparseArray = pendingRequests.hiddenJoinRequests;
                long j3 = this.f$1;
                longSparseArray.remove(j3);
                ArrayList arrayList = pendingRequests.pendingRequests;
                if (arrayList != null) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (DialogObject.getPeerDialogId(((TL_communities.CommunityPeerRequest) pendingRequests.pendingRequests.get(size)).peer) == j3) {
                            pendingRequests.pendingRequests.remove(size);
                        }
                    }
                }
                pendingRequests.calcUnreadPendingRequests();
                CommunityUtils.PendingRequests.Delegate delegate = pendingRequests.delegate;
                if (delegate != null) {
                    delegate.updateAdapter();
                }
                MessagesController.getInstance(pendingRequests.currentAccount).resolveCommunityJoinPendingRequest(pendingRequests.communityId, j3, !this.f$2, new CommunityUtils$PendingRequests$$ExternalSyntheticLambda2(pendingRequests, 2));
                break;
        }
    }

    public ChatActivity$$ExternalSyntheticLambda286(Object obj, boolean z, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$2 = z;
        this.f$1 = j;
    }
}
