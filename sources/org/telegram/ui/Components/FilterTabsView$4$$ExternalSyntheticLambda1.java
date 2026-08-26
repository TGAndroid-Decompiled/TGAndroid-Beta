package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class FilterTabsView$4$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final FilterTabsView.TabView f$0;

    public FilterTabsView$4$$ExternalSyntheticLambda1(FilterTabsView.TabView tabView, int i) {
        this.$r8$classId = i;
        this.f$0 = tabView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                FilterTabsView.AnonymousClass4.lambda$animateMoveImpl$1(this.f$0, valueAnimator);
                break;
            default:
                this.f$0.lambda$shakeLockIcon$0(valueAnimator);
                break;
        }
    }
}
