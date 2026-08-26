package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class Bulletin$$ExternalSyntheticLambda2 implements DynamicAnimation.OnAnimationUpdateListener {
    public final int $r8$classId;
    public final Object f$0;

    public Bulletin$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationUpdate(DynamicAnimation dynamicAnimation, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((Bulletin) this.f$0).lambda$show$0(dynamicAnimation, f, f2);
                break;
            case 1:
                Bulletin.ParentLayout.AnonymousClass1.lambda$onFling$1((Bulletin.Layout) this.f$0, dynamicAnimation, f, f2);
                break;
            case 2:
                ((ChatAttachAlert.AnonymousClass27) this.f$0).lambda$onAnimationEnd$0(dynamicAnimation, f, f2);
                break;
            case 3:
                ((AudioPlayerAlert) this.f$0).lambda$new$0(dynamicAnimation, f, f2);
                break;
            default:
                ((MotionBackgroundDrawable) this.f$0).updateAnimation();
                break;
        }
    }
}
