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
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                FilterTabsView.TabView tabView = this.f$0;
                tabView.changeProgress = fFloatValue;
                tabView.invalidate();
                break;
            default:
                FilterTabsView.TabView tabView2 = this.f$0;
                tabView2.getClass();
                tabView2.locIconXOffset = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tabView2.invalidate();
                break;
        }
    }
}
