package org.telegram.ui.Stories;

import java.util.ArrayList;
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
    private static long lastRequestTime;
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
        if (this.isRunning == z) {
            return;
        }
        if (z) {
            this.isRunning = true;
            lambda$new$0();
            return;
        }
        this.isRunning = false;
        AndroidUtilities.cancelRunOnUIThread(this.scheduleRequestRunnable);
        ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentReqId, false);
        this.currentReqId = 0;
    }

    protected void getStoryIds(ArrayList<Integer> arrayList) {
        TLRPC$PeerStories stories = this.storiesController.getStories(this.dialogId);
        if (stories == null || stories.stories == null) {
            return;
        }
        for (int i = 0; i < stories.stories.size(); i++) {
            arrayList.add(Integer.valueOf(stories.stories.get(i).id));
        }
    }

    protected boolean updateStories(ArrayList<Integer> arrayList, TLRPC$TL_stories_storyViews tLRPC$TL_stories_storyViews) {
        TLRPC$PeerStories stories;
        if (tLRPC$TL_stories_storyViews == null || tLRPC$TL_stories_storyViews.views == null || (stories = this.storiesController.getStories(this.dialogId)) == null || stories.stories.isEmpty()) {
            return false;
        }
        for (int i = 0; i < tLRPC$TL_stories_storyViews.views.size(); i++) {
            for (int i2 = 0; i2 < stories.stories.size(); i2++) {
                if (stories.stories.get(i2).id == arrayList.get(i).intValue()) {
                    stories.stories.get(i2).views = tLRPC$TL_stories_storyViews.views.get(i);
                }
            }
        }
        this.storiesController.storiesStorage.updateStories(stories);
        return true;
    }

    public void lambda$new$0() {
        if (this.isRunning) {
            long currentTimeMillis = 10000 - (System.currentTimeMillis() - lastRequestTime);
            if (currentTimeMillis > 0) {
                AndroidUtilities.cancelRunOnUIThread(this.scheduleRequestRunnable);
                AndroidUtilities.runOnUIThread(this.scheduleRequestRunnable, currentTimeMillis);
            } else if (requestInternal()) {
            } else {
                this.currentReqId = 0;
                this.isRunning = false;
            }
        }
    }

    private boolean requestInternal() {
        if (this.currentReqId != 0) {
            return false;
        }
        final TLRPC$TL_stories_getStoriesViews tLRPC$TL_stories_getStoriesViews = new TLRPC$TL_stories_getStoriesViews();
        getStoryIds(tLRPC$TL_stories_getStoriesViews.id);
        if (tLRPC$TL_stories_getStoriesViews.id.isEmpty()) {
            return false;
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
        lastRequestTime = System.currentTimeMillis();
        if (tLObject != null) {
            TLRPC$TL_stories_storyViews tLRPC$TL_stories_storyViews = (TLRPC$TL_stories_storyViews) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tLRPC$TL_stories_storyViews.users, false);
            if (!updateStories(tLRPC$TL_stories_getStoriesViews.id, tLRPC$TL_stories_storyViews)) {
                this.currentReqId = 0;
                this.isRunning = false;
                return;
            }
            NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.storiesUpdated, new Object[0]);
        }
        this.currentReqId = 0;
        if (this.isRunning) {
            AndroidUtilities.cancelRunOnUIThread(this.scheduleRequestRunnable);
            AndroidUtilities.runOnUIThread(this.scheduleRequestRunnable, 10000L);
        }
    }
}
