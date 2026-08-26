package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

public final class ActionBar$$ExternalSyntheticLambda3 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final ActionBar f$0;

    public ActionBar$$ExternalSyntheticLambda3(ActionBar actionBar, int i) {
        this.$r8$classId = i;
        this.f$0 = actionBar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$setAdaptiveBackground$5(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$setAdaptiveBackground$7(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$hideActionMode$3(valueAnimator);
                break;
            case 3:
                this.f$0.lambda$onSearchFieldVisibilityChanged$4(valueAnimator);
                break;
            default:
                this.f$0.lambda$showActionMode$2(valueAnimator);
                break;
        }
    }
}
