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
                TopicsTabsView.VerticalTabView verticalTabView = this.f$0;
                verticalTabView.getClass();
                verticalTabView.selectT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                verticalTabView.updateState();
                verticalTabView.updateImageColor();
                break;
            default:
                TopicsTabsView.VerticalTabView verticalTabView2 = this.f$0;
                verticalTabView2.getClass();
                verticalTabView2.countScale = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                verticalTabView2.imageLayoutView.invalidate();
                break;
        }
    }
}
