package org.telegram.ui.Stories;

import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocationController$$ExternalSyntheticOutline0;
import org.telegram.messenger.MessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ThemeSetUrlActivity$$ExternalSyntheticLambda6;

public class ViewsForPeerStoriesRequester {
    public static long lastRequestTime;
    public final int currentAccount;
    public int currentReqId;
    public final long dialogId;
    public boolean isRunning;
    public final LivePlayer$1$$ExternalSyntheticLambda0 scheduleRequestRunnable = new LivePlayer$1$$ExternalSyntheticLambda0(this, 26);
    public final StoriesController storiesController;

    public ViewsForPeerStoriesRequester(int i, long j, StoriesController storiesController) {
        this.currentAccount = i;
        this.storiesController = storiesController;
        this.dialogId = j;
    }

    public void getStoryIds(ArrayList arrayList) {
        TL_stories.PeerStories peerStories = (TL_stories.PeerStories) this.storiesController.allStoriesMap.get(this.dialogId);
        if (peerStories == null || peerStories.stories == null) {
            return;
        }
        int iM = 0;
        while (iM < peerStories.stories.size()) {
            iM = LocationController$$ExternalSyntheticOutline0.m(peerStories.stories.get(iM).id, iM, 1, arrayList);
        }
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
        int i = this.currentAccount;
        tL_stories_getStoriesViews.peer = MessagesController.getInstance(i).getInputPeer(this.dialogId);
        this.currentReqId = ConnectionsManager.getInstance(i).sendRequest(tL_stories_getStoriesViews, new ThemeSetUrlActivity$$ExternalSyntheticLambda6(1, this, tL_stories_getStoriesViews));
        return true;
    }

    public final void start(boolean z) {
        if (this.isRunning == z) {
            return;
        }
        LivePlayer$1$$ExternalSyntheticLambda0 livePlayer$1$$ExternalSyntheticLambda0 = this.scheduleRequestRunnable;
        if (!z) {
            this.isRunning = false;
            AndroidUtilities.cancelRunOnUIThread(livePlayer$1$$ExternalSyntheticLambda0);
            ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.currentReqId, false);
            this.currentReqId = 0;
            return;
        }
        this.isRunning = true;
        long jCurrentTimeMillis = 10000 - (System.currentTimeMillis() - lastRequestTime);
        if (jCurrentTimeMillis > 0) {
            AndroidUtilities.cancelRunOnUIThread(livePlayer$1$$ExternalSyntheticLambda0);
            AndroidUtilities.runOnUIThread(livePlayer$1$$ExternalSyntheticLambda0, jCurrentTimeMillis);
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
                StoriesStorage storiesStorage = storiesController.storiesStorage;
                storiesStorage.storage.getStorageQueue().postRunnable(new StoriesStorage$$ExternalSyntheticLambda13(storiesStorage, peerStories, 1));
                return true;
            }
        }
        return false;
    }
}
