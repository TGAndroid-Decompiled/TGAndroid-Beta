package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class PopupSwipeBackLayout$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PopupSwipeBackLayout f$0;

    public PopupSwipeBackLayout$$ExternalSyntheticLambda0(PopupSwipeBackLayout popupSwipeBackLayout, int i) {
        this.$r8$classId = i;
        this.f$0 = popupSwipeBackLayout;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                PopupSwipeBackLayout popupSwipeBackLayout = this.f$0;
                popupSwipeBackLayout.getClass();
                popupSwipeBackLayout.transitionProgress = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                popupSwipeBackLayout.invalidateTransforms(true);
                break;
            default:
                PopupSwipeBackLayout popupSwipeBackLayout2 = this.f$0;
                popupSwipeBackLayout2.getClass();
                popupSwipeBackLayout2.overrideForegroundHeight = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                popupSwipeBackLayout2.invalidateTransforms(true);
                break;
        }
    }
}
