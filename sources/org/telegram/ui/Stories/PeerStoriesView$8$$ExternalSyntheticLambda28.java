package org.telegram.ui.Stories;

public final class PeerStoriesView$8$$ExternalSyntheticLambda28 implements Runnable {
    public final int $r8$classId;
    public final PeerStoriesView.AnonymousClass8 f$0;

    public PeerStoriesView$8$$ExternalSyntheticLambda28(PeerStoriesView.AnonymousClass8 anonymousClass8, int i) {
        this.$r8$classId = i;
        this.f$0 = anonymousClass8;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                ((StoryViewer.AnonymousClass5) ((PeerStoriesView) this.f$0.this$0).delegate).setPopupIsVisible(false);
                break;
            case 1:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass1 = this.f$0.this$0;
                PeerStoriesView.Delegate delegate = ((PeerStoriesView) anonymousClass1).delegate;
                if (delegate != null) {
                    StoryViewer storyViewer = StoryViewer.this;
                    storyViewer.isTranslating = false;
                    storyViewer.updatePlayingMode();
                }
                anonymousClass1.updatePosition(false);
                anonymousClass1.checkBlackoutMode = true;
                anonymousClass1.storyCaptionView.expand(true);
                break;
            case 2:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass2 = this.f$0.this$0;
                anonymousClass2.editOpened = true;
                anonymousClass2.setActive(false);
                break;
            default:
                StoriesViewPager.AnonymousClass2.AnonymousClass1 anonymousClass3 = this.f$0.this$0;
                anonymousClass3.editOpened = true;
                anonymousClass3.setActive(false);
                break;
        }
    }
}
