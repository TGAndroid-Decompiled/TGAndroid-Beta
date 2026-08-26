package org.telegram.ui;

import android.animation.ValueAnimator;

public final class CameraScanActivity$$ExternalSyntheticLambda5 implements ValueAnimator.AnimatorUpdateListener {
    public final int $r8$classId;
    public final CameraScanActivity f$0;

    public CameraScanActivity$$ExternalSyntheticLambda5(CameraScanActivity cameraScanActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraScanActivity;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.flashButton.invalidate();
                break;
            default:
                CameraScanActivity cameraScanActivity = this.f$0;
                cameraScanActivity.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                cameraScanActivity.recognizedT = fFloatValue;
                cameraScanActivity.titleTextView.setAlpha(1.0f - fFloatValue);
                if (cameraScanActivity.currentType == 3) {
                    cameraScanActivity.descriptionText.setAlpha(1.0f - cameraScanActivity.recognizedT);
                }
                cameraScanActivity.flashButton.setAlpha(1.0f - cameraScanActivity.recognizedT);
                cameraScanActivity.backShadowAlpha = (cameraScanActivity.recognizedT * 0.25f) + 0.5f;
                cameraScanActivity.fragmentView.invalidate();
                break;
        }
    }
}
