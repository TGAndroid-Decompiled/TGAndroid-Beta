package org.telegram.ui;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class CameraScanActivity$$ExternalSyntheticLambda18 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final Object f$0;

    public CameraScanActivity$$ExternalSyntheticLambda18(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((CameraScanActivity) this.f$0).lambda$initCameraView$8(dynamicAnimation, z, f, f2);
                break;
            case 1:
                ((PaymentFormActivity.BottomFrameLayout) this.f$0).lambda$setChecked$1(dynamicAnimation, z, f, f2);
                break;
            default:
                ((PhotoViewer.CaptionScrollView) this.f$0).lambda$new$1(dynamicAnimation, z, f, f2);
                break;
        }
    }
}
