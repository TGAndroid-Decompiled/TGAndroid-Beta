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
                this.f$0.lambda$animateToState$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$setNewForegroundHeight$1(valueAnimator);
                break;
        }
    }
}
