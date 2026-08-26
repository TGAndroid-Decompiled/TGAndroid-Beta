package org.telegram.ui.Components;

import android.animation.ValueAnimator;
import org.telegram.ui.CalendarActivity;

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
                TopicsTabsView.HorizontalTabView horizontalTabView = this.f$0;
                horizontalTabView.getClass();
                float fMax = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                CalendarActivity.AnonymousClass5 anonymousClass5 = horizontalTabView.counterView;
                anonymousClass5.setScaleX(fMax);
                anonymousClass5.setScaleY(Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue()));
                anonymousClass5.invalidate();
                break;
            default:
                TopicsTabsView.HorizontalTabView horizontalTabView2 = this.f$0;
                horizontalTabView2.getClass();
                horizontalTabView2.selectT = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                horizontalTabView2.updateTextColor();
                break;
        }
    }
}
