package org.telegram.ui;

import android.animation.ValueAnimator;

public final class CameraScanActivity$$ExternalSyntheticLambda13 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final CameraScanActivity f$0;

    public CameraScanActivity$$ExternalSyntheticLambda13(CameraScanActivity cameraScanActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraScanActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$createView$3(valueAnimator);
                break;
            default:
                this.f$0.lambda$updateRecognized$5(valueAnimator);
                break;
        }
    }
}
