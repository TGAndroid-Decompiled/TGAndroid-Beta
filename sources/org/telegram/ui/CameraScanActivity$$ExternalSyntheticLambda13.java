package org.telegram.ui;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class CameraScanActivity$$ExternalSyntheticLambda13 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId;
    public final CameraScanActivity f$0;

    public CameraScanActivity$$ExternalSyntheticLambda13(CameraScanActivity cameraScanActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraScanActivity;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                CameraScanActivity cameraScanActivity = this.f$0;
                cameraScanActivity.qrAppearingValue = f / 500.0f;
                cameraScanActivity.fragmentView.invalidate();
                break;
            default:
                CameraScanActivity cameraScanActivity2 = this.f$0;
                float f3 = f / 500.0f;
                if (!cameraScanActivity2.recognized) {
                    f3 = 1.0f - f3;
                }
                cameraScanActivity2.useRecognizedBounds = f3;
                cameraScanActivity2.fragmentView.invalidate();
                break;
        }
    }
}
