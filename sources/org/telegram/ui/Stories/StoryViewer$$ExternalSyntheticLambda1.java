package org.telegram.ui.Stories;

import android.animation.ValueAnimator;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.Utilities;

public final class StoryViewer$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final StoryViewer f$0;

    public StoryViewer$$ExternalSyntheticLambda1(StoryViewer storyViewer, int i) {
        this.$r8$classId = i;
        this.f$0 = storyViewer;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                StoryViewer storyViewer = this.f$0;
                storyViewer.getClass();
                storyViewer.progressToOpen = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyViewer.checkNavBarColor();
                StoryViewer.AnonymousClass2 anonymousClass2 = storyViewer.windowView;
                if (anonymousClass2 != null) {
                    anonymousClass2.invalidate();
                }
                LivePlayer livePlayer = storyViewer.livePlayer;
                if (livePlayer != null) {
                    livePlayer.setVolume((1.0f - storyViewer.progressToDismiss) * storyViewer.progressToOpen);
                }
                break;
            case 1:
                StoryViewer storyViewer2 = this.f$0;
                storyViewer2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyViewer2.progressToOpen = fFloatValue;
                StoryViewer.AnonymousClass3 anonymousClass3 = storyViewer2.containerView;
                if (anonymousClass3 != null && fFloatValue > 0.6f && HwFrameLayout.hwEnabled && anonymousClass3.isFastDevice) {
                    anonymousClass3.disableHwAcceleration(false);
                }
                LivePlayer livePlayer2 = storyViewer2.livePlayer;
                if (livePlayer2 != null) {
                    livePlayer2.setVolume((1.0f - storyViewer2.progressToDismiss) * storyViewer2.progressToOpen);
                }
                storyViewer2.checkNavBarColor();
                StoryViewer.AnonymousClass2 anonymousClass4 = storyViewer2.windowView;
                if (anonymousClass4 != null) {
                    anonymousClass4.invalidate();
                }
                break;
            case 2:
                StoryViewer storyViewer3 = this.f$0;
                storyViewer3.getClass();
                storyViewer3.swipeToReplyOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyViewer3.swipeToReplyProgress = Utilities.clamp(storyViewer3.swipeToReplyOffset / AndroidUtilities.dp(200.0f), 1.0f, 0.0f);
                StoryViewer.AnonymousClass4 anonymousClass5 = storyViewer3.storiesViewPager;
                PeerStoriesView currentPeerView = anonymousClass5 == null ? null : anonymousClass5.getCurrentPeerView();
                if (currentPeerView != null) {
                    currentPeerView.invalidate();
                }
                break;
            default:
                StoryViewer storyViewer4 = this.f$0;
                storyViewer4.getClass();
                storyViewer4.selfStoriesViewsOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                storyViewer4.containerView.invalidate();
                break;
        }
    }
}
