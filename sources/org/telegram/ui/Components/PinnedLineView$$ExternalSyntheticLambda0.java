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
                this.f$0.lambda$selectPosition$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$set$1(valueAnimator);
                break;
        }
    }
}
