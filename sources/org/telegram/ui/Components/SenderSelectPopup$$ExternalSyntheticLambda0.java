package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class SenderSelectPopup$$ExternalSyntheticLambda0 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId;
    public final SenderSelectPopup f$0;

    public SenderSelectPopup$$ExternalSyntheticLambda0(SenderSelectPopup senderSelectPopup, int i) {
        this.$r8$classId = i;
        this.f$0 = senderSelectPopup;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                this.f$0.lambda$startDismissAnimation$6(dynamicAnimation, f, f2);
                break;
            case 1:
                this.f$0.lambda$startDismissAnimation$7(dynamicAnimation, f, f2);
                break;
            case 2:
                this.f$0.lambda$startShowAnimation$3(dynamicAnimation, f, f2);
                break;
            default:
                this.f$0.lambda$startShowAnimation$4(dynamicAnimation, f, f2);
                break;
        }
    }
}
