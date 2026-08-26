package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class PinnedLineView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PinnedLineView f$0;

    public PinnedLineView$$ExternalSyntheticLambda0(PinnedLineView pinnedLineView, int i) {
        this.$r8$classId = i;
        this.f$0 = pinnedLineView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PinnedLineView pinnedLineView = this.f$0;
                pinnedLineView.getClass();
                pinnedLineView.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinnedLineView.invalidate();
                break;
            default:
                PinnedLineView pinnedLineView2 = this.f$0;
                pinnedLineView2.getClass();
                pinnedLineView2.animationProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pinnedLineView2.invalidate();
                break;
        }
    }
}
