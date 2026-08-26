package org.telegram.ui.Stories;

import org.telegram.messenger.ImageReceiver;
import org.telegram.ui.Components.CubicBezierInterpolator;

public final class StoryViewer$$ExternalSyntheticLambda2 implements Runnable {
    public final int $r8$classId;
    public final StoryViewer f$0;

    public StoryViewer$$ExternalSyntheticLambda2(StoryViewer storyViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = storyViewer;
    }

    @Override
    public final void run() {
        switch (this.$r8$classId) {
            case 0:
                StoryViewer storyViewer = this.f$0;
                if (storyViewer.openCloseAnimator != null) {
                    StoryViewer.AnonymousClass3 anonymousClass3 = storyViewer.containerView;
                    if (anonymousClass3 != null) {
                        HwFrameLayout.hwEnabled = true;
                        anonymousClass3.setLayerType(2, null);
                    }
                    storyViewer.openCloseAnimator.addListener(new StoryViewer.AnonymousClass8(storyViewer, 1));
                    storyViewer.openCloseAnimator.setDuration(320L);
                    storyViewer.openCloseAnimator.setInterpolator(CubicBezierInterpolator.EASE_OUT_QUINT);
                    storyViewer.openCloseAnimator.start();
                    break;
                }
                break;
            case 1:
                this.f$0.updatePlayingMode();
                break;
            case 2:
                this.f$0.cancelSwipeToReply();
                break;
            case 3:
                StoryViewer storyViewer2 = this.f$0;
                storyViewer2.allowSelfStoriesView = true;
                storyViewer2.cancelSwipeToViews(true);
                break;
            case 4:
                this.f$0.setLongPressed(true);
                break;
            case 5:
                StoryViewer storyViewer3 = this.f$0;
                storyViewer3.currentSheet = null;
                storyViewer3.updatePlayingMode();
                break;
            default:
                StoryViewer storyViewer4 = this.f$0;
                storyViewer4.updateTransitionParams();
                StoryViewer.TransitionViewHolder transitionViewHolder = storyViewer4.transitionViewHolder;
                ImageReceiver imageReceiver = transitionViewHolder.avatarImage;
                if (imageReceiver != null) {
                    imageReceiver.setVisible(false, true);
                }
                ImageReceiver imageReceiver2 = transitionViewHolder.storyImage;
                if (imageReceiver2 != null) {
                    imageReceiver2.setVisible(false, true);
                }
                break;
        }
    }
}
