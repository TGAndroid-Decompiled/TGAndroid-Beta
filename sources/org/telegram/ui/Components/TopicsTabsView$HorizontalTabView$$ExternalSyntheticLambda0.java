package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class TopicsTabsView$HorizontalTabView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final TopicsTabsView.HorizontalTabView f$0;

    public TopicsTabsView$HorizontalTabView$$ExternalSyntheticLambda0(TopicsTabsView.HorizontalTabView horizontalTabView, int i) {
        this.$r8$classId = i;
        this.f$0 = horizontalTabView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$animateCounterBounce$1(valueAnimator);
                break;
            default:
                this.f$0.lambda$setSelected$0(valueAnimator);
                break;
        }
    }
}
