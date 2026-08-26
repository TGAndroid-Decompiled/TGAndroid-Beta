package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class PasscodeView$$ExternalSyntheticLambda2 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PasscodeView f$0;

    public PasscodeView$$ExternalSyntheticLambda2(PasscodeView passcodeView, int i) {
        this.$r8$classId = i;
        this.f$0 = passcodeView;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$processDone$10(valueAnimator);
                break;
            default:
                this.f$0.lambda$showPin$14(valueAnimator);
                break;
        }
    }
}
