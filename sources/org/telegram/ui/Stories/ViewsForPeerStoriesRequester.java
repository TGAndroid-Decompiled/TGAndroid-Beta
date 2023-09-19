package org.telegram.ui.Stories;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$PeerStories;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_stories_getStoriesViews;
import org.telegram.tgnet.TLRPC$TL_stories_storyViews;
public class ViewsForPeerStoriesRequester {
    final int currentAccount;
    int currentReqId;
    final long dialogId;
    boolean isRunning;
    final Runnable scheduleRequestRunnable = new Runnable() {
        @Override
        public final void run() {
            ViewsForPeerStoriesRequester.this.lambda$new$0();
        }
    };
    final StoriesController storiesController;

    public ViewsForPeerStoriesRequester(StoriesController storiesController, long j, int i) {
        this.currentAccount = i;
        this.storiesController = storiesController;
        this.dialogId = j;
    }

    public void start(boolean z) {
        if (this.isRunning != z) {
            if (lambda$new$0()) {
                this.isRunning = z;
                return;
            }
            return;
        }
        this.isRunning = false;
        AndroidUtilities.cancelRunOnUIThread(this.scheduleRequestRunnable);
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentReqId, false);
        this.currentReqId = 0;
    }

    public boolean lambda$new$0() {
        TLRPC$PeerStories stories = this.storiesController.getStories(this.dialogId);
        if (stories == null || stories.stories.isEmpty() || this.currentReqId != 0) {
            return false;
        }
        final TLRPC$TL_stories_getStoriesViews tLRPC$TL_stories_getStoriesViews = new TLRPC$TL_stories_getStoriesViews();
        for (int i = 0; i < stories.stories.size(); i++) {
            tLRPC$TL_stories_getStoriesViews.id.add(Integer.valueOf(stories.stories.get(i).id));
        }
        tLRPC$TL_stories_getStoriesViews.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        this.currentReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tLRPC$TL_stories_getStoriesViews, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                ViewsForPeerStoriesRequester.this.lambda$requestInternal$2(tLRPC$TL_stories_getStoriesViews, tLObject, tLRPC$TL_error);
            }
        });
        return true;
    }

    public void lambda$requestInternal$2(final TLRPC$TL_stories_getStoriesViews tLRPC$TL_stories_getStoriesViews, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ViewsForPeerStoriesRequester.this.lambda$requestInternal$1(tLObject, tLRPC$TL_stories_getStoriesViews);
            }
        });
    }

    public void lambda$requestInternal$1(TLObject tLObject, TLRPC$TL_stories_getStoriesViews tLRPC$TL_stories_getStoriesViews) {
        if (tLObject != null) {
            TLRPC$PeerStories stories = this.storiesController.getStories(this.dialogId);
            if (stories == null || stories.stories.isEmpty()) {
                this.currentReqId = 0;
                this.isRunning = false;
                return;
            }
            TLRPC$TL_stories_storyViews tLRPC$TL_stories_storyViews = (TLRPC$TL_stories_storyViews) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_stories_storyViews.users, false);
            for (int i = 0; i < tLRPC$TL_stories_storyViews.views.size(); i++) {
                for (int i2 = 0; i2 < stories.stories.size(); i2++) {
                    if (stories.stories.get(i2).id == tLRPC$TL_stories_getStoriesViews.id.get(i).intValue()) {
                        stories.stories.get(i2).views = tLRPC$TL_stories_storyViews.views.get(i);
                    }
                }
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
            this.storiesController.storiesStorage.updateStories(stories);
        }
        this.currentReqId = 0;
        if (this.isRunning) {
            AndroidUtilities.cancelRunOnUIThread(this.scheduleRequestRunnable);
            AndroidUtilities.runOnUIThread(this.scheduleRequestRunnable, 10000L);
        }
    }
}
