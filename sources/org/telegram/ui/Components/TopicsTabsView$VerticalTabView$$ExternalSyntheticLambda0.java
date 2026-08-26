package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class TopicsTabsView$VerticalTabView$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final TopicsTabsView.VerticalTabView f$0;

    public TopicsTabsView$VerticalTabView$$ExternalSyntheticLambda0(TopicsTabsView.VerticalTabView verticalTabView, int i) {
        this.$r8$classId = i;
        this.f$0 = verticalTabView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setSelected$1(valueAnimator);
                break;
            default:
                this.f$0.lambda$animateCounterBounce$0(valueAnimator);
                break;
        }
    }
}
