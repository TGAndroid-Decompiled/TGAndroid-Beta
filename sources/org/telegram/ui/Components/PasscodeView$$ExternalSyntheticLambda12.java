package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class PasscodeView$$ExternalSyntheticLambda12 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final Object f$0;
    public final Object f$1;

    public PasscodeView$$ExternalSyntheticLambda12(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((PasscodeView) this.f$0).lambda$animateBackground$8((MotionBackgroundDrawable) this.f$1, dynamicAnimation, z, f, f2);
                break;
            case 1:
                ((ChatAttachAlert.AnonymousClass27) this.f$0).lambda$onAnimationEnd$1((Runnable) this.f$1, dynamicAnimation, z, f, f2);
                break;
            case 2:
                Bulletin.Layout.SpringTransition.lambda$animateEnter$0((Bulletin.Layout) this.f$0, (Runnable) this.f$1, dynamicAnimation, z, f, f2);
                break;
            default:
                ((ChatAttachAlert) this.f$0).lambda$onCustomOpenAnimation$59((ImageUpdater$$ExternalSyntheticLambda1) this.f$1, dynamicAnimation, z, f, f2);
                break;
        }
    }
}
