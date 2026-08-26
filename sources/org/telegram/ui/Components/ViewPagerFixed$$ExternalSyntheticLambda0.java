package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class ViewPagerFixed$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ViewPagerFixed f$0;

    public ViewPagerFixed$$ExternalSyntheticLambda0(ViewPagerFixed viewPagerFixed, int i) {
        this.$r8$classId = i;
        this.f$0 = viewPagerFixed;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$scrollToPosition$1(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$cancelTouches$4(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$onTouchEventInternal$2(valueAnimator);
                break;
            default:
                this.f$0.lambda$rebuild$3(valueAnimator);
                break;
        }
    }
}
