package org.telegram.ui.Stories;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Stars.StarGiftSheet$$ExternalSyntheticLambda0;
import org.telegram.ui.bots.BotSensors$1$$ExternalSyntheticLambda0;
import org.webrtc.EglRenderer$$ExternalSyntheticLambda6;

public class ViewsForPeerStoriesRequester {
    private static final long interval = 10000;
    private static long lastRequestTime;
    final int currentAccount;
    int currentReqId;
    final long dialogId;
    boolean isRunning;
    final Runnable scheduleRequestRunnable = new BotSensors$1$$ExternalSyntheticLambda0(this, 13);
    final StoriesController storiesController;

    public ViewsForPeerStoriesRequester(int i, long j, StoriesController storiesController) {
        this.currentAccount = i;
        this.storiesController = storiesController;
        this.dialogId = j;
    }

    public void getStoryIds(ArrayList arrayList) {
        StoriesController storiesController = this.storiesController;
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.allStoriesMap.get(this.dialogId);
        if (peerStories == null || peerStories.stories == null) {
            return;
        }
        int iM = 0;
        while (iM < peerStories.stories.size()) {
            iM = LocationController$$ExternalSyntheticOutline0.m(peerStories.stories.get(iM).id, iM, 1, arrayList);
        }
    }

    public final void lambda$new$0() {
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

    public final void lambda$requestInternal$1(TLObject tLObject, TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews) {
        lastRequestTime = System.currentTimeMillis();
        if (tLObject != null) {
            TL_stories.TL_stories_storyViews tL_stories_storyViews = (TL_stories.TL_stories_storyViews) tLObject;
            MessagesController.getInstance(this.currentAccount).putUsers(tL_stories_storyViews.users, false);
            if (!updateStories(tL_stories_getStoriesViews.id, tL_stories_storyViews)) {
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

    public final void lambda$requestInternal$2(TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new EglRenderer$$ExternalSyntheticLambda6(this, tLObject, tL_stories_getStoriesViews, 4));
    }

    public final boolean requestInternal() {
        if (this.currentReqId != 0) {
            return false;
        }
        TL_stories.TL_stories_getStoriesViews tL_stories_getStoriesViews = new TL_stories.TL_stories_getStoriesViews();
        getStoryIds(tL_stories_getStoriesViews.id);
        if (tL_stories_getStoriesViews.id.isEmpty()) {
            return false;
        }
        tL_stories_getStoriesViews.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.dialogId);
        this.currentReqId = ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_stories_getStoriesViews, new StarGiftSheet$$ExternalSyntheticLambda0(27, this, tL_stories_getStoriesViews));
        return true;
    }

    public void start(boolean z) {
        if (this.isRunning == z) {
            return;
        }
        if (!z) {
            this.isRunning = false;
            AndroidUtilities.cancelRunOnUIThread(this.scheduleRequestRunnable);
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentReqId, false);
            this.currentReqId = 0;
            return;
        }
        this.isRunning = true;
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

    public boolean updateStories(ArrayList arrayList, TL_stories.TL_stories_storyViews tL_stories_storyViews) {
        if (tL_stories_storyViews != null && tL_stories_storyViews.views != null) {
            StoriesController storiesController = this.storiesController;
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.allStoriesMap.get(this.dialogId);
            if (peerStories != null && !peerStories.stories.isEmpty()) {
                for (int i = 0; i < tL_stories_storyViews.views.size(); i++) {
                    for (int i2 = 0; i2 < peerStories.stories.size(); i2++) {
                        if (peerStories.stories.get(i2).id == ((Integer) arrayList.get(i)).intValue()) {
                            peerStories.stories.get(i2).views = tL_stories_storyViews.views.get(i);
                        }
                    }
                }
                StoriesStorage storiesStorage = this.storiesController.storiesStorage;
                storiesStorage.storage.getStorageQueue().postRunnable(new StoriesStorage$$ExternalSyntheticLambda2(storiesStorage, peerStories, 1));
                return true;
            }
        }
        return false;
    }
}
