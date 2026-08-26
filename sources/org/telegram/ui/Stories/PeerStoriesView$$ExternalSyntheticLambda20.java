package org.telegram.ui.Stories;

import android.animation.ValueAnimator;

public final class PeerStoriesView$$ExternalSyntheticLambda20 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PeerStoriesView f$0;

    public PeerStoriesView$$ExternalSyntheticLambda20(PeerStoriesView peerStoriesView, int i) {
        this.$r8$classId = i;
        this.f$0 = peerStoriesView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PeerStoriesView peerStoriesView = this.f$0;
                peerStoriesView.getClass();
                peerStoriesView.animatingKeyboardHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                peerStoriesView.invalidate();
                break;
            case 1:
                PeerStoriesView peerStoriesView2 = this.f$0;
                peerStoriesView2.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                peerStoriesView2.likesReactionShowProgress = fFloatValue;
                peerStoriesView2.likesReactionLayout.setTransitionProgress(fFloatValue);
                break;
            default:
                this.f$0.lambda$animateOut$59(valueAnimator);
                break;
        }
    }
}
