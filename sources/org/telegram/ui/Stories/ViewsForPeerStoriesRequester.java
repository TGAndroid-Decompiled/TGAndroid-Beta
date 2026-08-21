package org.telegram.ui.Stories;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;

public class ViewsForPeerStoriesRequester {
    private static long lastRequestTime;
    final int currentAccount;
    int currentReqId;
    final long dialogId;
    boolean isRunning;
    final Runnable scheduleRequestRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.step();
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
            step();
        } else {
            this.isRunning = false;
            AndroidUtilities.cancelRunOnUIThread(this.scheduleRequestRunnable);
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentReqId, false);
            this.currentReqId = 0;
        }
    }

    protected void getStoryIds(ArrayList arrayList) {
        TL_stories.PeerStories stories = this.storiesController.getStories(this.dialogId);
        if (stories == null || stories.stories == null) {
            return;
        }
        for (int i = 0; i < stories.stories.size(); i++) {
            arrayList.add(Integer.valueOf(stories.stories.get(i).id));
        }
    }

    protected boolean updateStories(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        TL_stories.PeerStories stories;
        if (tL_stories_storyViews == null || tL_stories_storyViews.views == null || (stories = this.storiesController.getStories(this.dialogId)) == null || stories.stories.isEmpty()) {
            return false;
        }
        for (int i = 0; i < tL_stories_storyViews.views.size(); i++) {
            for (int i2 = 0; i2 < stories.stories.size(); i2++) {
                if (stories.stories.get(i2).id == ((Integer) arrayList.get(i)).intValue()) {
                    stories.stories.get(i2).views = tL_stories_storyViews.views.get(i);
                }
            }
        }
        this.storiesController.storiesStorage.updateStories(stories);
        return true;
    }

    public void step() {
        if (this.isRunning) {
            long jCurrentTimeMillis = 10000 - (System.currentTimeMillis() - lastRequestTime);
            if (jCurrentTimeMillis > 0) {
                AndroidUtilities.cancelRunOnUIThread(this.scheduleRequestRunnable);
                AndroidUtilities.runOnUIThread(this.scheduleRequestRunnable, jCurrentTimeMillis);
            } else {
                if (requestInternal()) {
                    return;
                }
                this.currentReqId = 0;
                this.isRunning = false;
            }
        }
    }

    private boolean requestInternal() {
        if (this.currentReqId != 0) {
            return false;
        }
        final TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
        getStoryIds(tL_stories_getStoriesViews.id);
        if (tL_stories_getStoriesViews.id.isEmpty()) {
            return false;
        }
        tL_stories_getStoriesViews.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        this.currentReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoriesViews, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                ViewsForPeerStoriesRequester.m4464$r8$lambda$Ro741gksRp0n0clrr1WHUZUJks(this.f$0, tL_stories_getStoriesViews, tLObject, tL_error);
            }
        });
        return true;
    }

    public static void m4464$r8$lambda$Ro741gksRp0n0clrr1WHUZUJks(final ViewsForPeerStoriesRequester viewsForPeerStoriesRequester, final TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews, final TLObject tLObject, TLRPC.TL_error tL_error) {
        viewsForPeerStoriesRequester.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                ViewsForPeerStoriesRequester.$r8$lambda$pAKFcCkvvUSiop6Z4BGxXKgrD7o(this.f$0, tLObject, tL_stories_getStoriesViews);
            }
        });
    }

    public static void $r8$lambda$pAKFcCkvvUSiop6Z4BGxXKgrD7o(ViewsForPeerStoriesRequester viewsForPeerStoriesRequester, TLObject tLObject, TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews) {
        viewsForPeerStoriesRequester.getClass();
        lastRequestTime = System.currentTimeMillis();
        if (tLObject != null) {
            TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject;
            MessagesController.getInstance(viewsForPeerStoriesRequester.currentAccount).putUsers(tL_stories_storyViews.users, false);
            if (!viewsForPeerStoriesRequester.updateStories(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
                viewsForPeerStoriesRequester.currentReqId = 0;
                viewsForPeerStoriesRequester.isRunning = false;
                return;
            }
            NotificationCenter.getInstance(viewsForPeerStoriesRequester.currentAccount).postNotificationName(NotificationCenter.storiesUpdated, new Object[0]);
        }
        viewsForPeerStoriesRequester.currentReqId = 0;
        if (viewsForPeerStoriesRequester.isRunning) {
            AndroidUtilities.cancelRunOnUIThread(viewsForPeerStoriesRequester.scheduleRequestRunnable);
            AndroidUtilities.runOnUIThread(viewsForPeerStoriesRequester.scheduleRequestRunnable, 10000L);
        }
    }
}
