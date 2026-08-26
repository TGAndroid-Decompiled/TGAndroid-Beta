package org.telegram.ui.ActionBar;

import android.animation.ValueAnimator;

public final class BottomSheet$$ExternalSyntheticLambda1 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final BottomSheet f$0;

    public BottomSheet$$ExternalSyntheticLambda1(BottomSheet bottomSheet, int i) {
        this.$r8$classId = i;
        this.f$0 = bottomSheet;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$dismissWithButtonClick$7(valueAnimator);
                break;
            case 1:
                this.f$0.lambda$dismiss$11(valueAnimator);
                break;
            case 2:
                this.f$0.lambda$dismiss$12(valueAnimator);
                break;
            case 3:
                this.f$0.lambda$dismiss$13(valueAnimator);
                break;
            case 4:
                this.f$0.lambda$setHideSystemVerticalInsets$0(valueAnimator);
                break;
            case 5:
                this.f$0.lambda$dismissWithButtonClick$8(valueAnimator);
                break;
            case 6:
                this.f$0.lambda$startOpenAnimation$5(valueAnimator);
                break;
            default:
                this.f$0.lambda$startOpenAnimation$6(valueAnimator);
                break;
        }
    }
}
