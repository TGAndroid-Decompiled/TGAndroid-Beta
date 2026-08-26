package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.DynamicAnimation;
import androidx.dynamicanimation.animation.SpringAnimation;

public final class SenderSelectPopup$$ExternalSyntheticLambda3 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final SenderSelectPopup f$0;
    public final SpringAnimation f$1;

    public SenderSelectPopup$$ExternalSyntheticLambda3(SenderSelectPopup senderSelectPopup, SpringAnimation springAnimation, int i) {
        this.$r8$classId = i;
        this.f$0 = senderSelectPopup;
        this.f$1 = springAnimation;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                SenderSelectPopup senderSelectPopup = this.f$0;
                if (!z) {
                    senderSelectPopup.springAnimations.remove(this.f$1);
                    dynamicAnimation.cancel();
                } else {
                    senderSelectPopup.getClass();
                }
                break;
            default:
                SenderSelectPopup senderSelectPopup2 = this.f$0;
                if (!z) {
                    senderSelectPopup2.springAnimations.remove(this.f$1);
                    dynamicAnimation.cancel();
                } else {
                    senderSelectPopup2.getClass();
                }
                break;
        }
    }
}
