package org.telegram.ui.Components;

import android.animation.ValueAnimator;

public final class PasscodeView$FingerprintDialog$$ExternalSyntheticLambda0 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final PasscodeView.FingerprintDialog f$0;

    public PasscodeView$FingerprintDialog$$ExternalSyntheticLambda0(PasscodeView.FingerprintDialog fingerprintDialog, int i) {
        this.$r8$classId = i;
        this.f$0 = fingerprintDialog;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$show$0(valueAnimator);
                break;
            default:
                this.f$0.lambda$dismiss$1(valueAnimator);
                break;
        }
    }
}
