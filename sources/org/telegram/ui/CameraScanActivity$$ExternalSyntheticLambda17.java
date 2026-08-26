package org.telegram.ui;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class CameraScanActivity$$ExternalSyntheticLambda17 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId;
    public final CameraScanActivity f$0;

    public CameraScanActivity$$ExternalSyntheticLambda17(CameraScanActivity cameraScanActivity, int i) {
        this.$r8$classId = i;
        this.f$0 = cameraScanActivity;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$initCameraView$7(dynamicAnimation, f, f2);
                break;
            default:
                this.f$0.lambda$updateRecognized$6(dynamicAnimation, f, f2);
                break;
        }
    }
}
