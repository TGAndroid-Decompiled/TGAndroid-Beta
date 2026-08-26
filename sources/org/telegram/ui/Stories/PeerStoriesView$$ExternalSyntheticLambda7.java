package org.telegram.ui.Stories;

import org.telegram.messenger.MessagesController;

public final class PeerStoriesView$$ExternalSyntheticLambda7 implements Runnable {
    public final int $r8$classId;
    public final StoriesViewPager.AnonymousClass2.AnonymousClass1 f$0;

    public PeerStoriesView$$ExternalSyntheticLambda7(StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass1;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.checkStealthMode(true);
                break;
            case 1:
                this.f$0.showNoSoundHint(false);
                MessagesController.getGlobalMainSettings().edit().putInt("taptostorysoundhint", MessagesController.getGlobalMainSettings().getInt("taptostorysoundhint", 0) + 1).apply();
                break;
            case 2:
                StoryViewer storyViewer = StoryViewer.this;
                storyViewer.isHintVisible = false;
                storyViewer.updatePlayingMode();
                break;
            default:
                this.f$0.likeStory(null);
                break;
        }
    }
}
