package org.telegram.ui.Components;

import androidx.dynamicanimation.animation.DynamicAnimation;

public final class Bulletin$$ExternalSyntheticLambda3 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final Object f$0;

    public Bulletin$$ExternalSyntheticLambda3(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((Bulletin) this.f$0).lambda$show$1(dynamicAnimation, z, f, f2);
                break;
            case 1:
                ((ShareAlert.AnonymousClass27) this.f$0).lambda$didReceivedNotification$1(dynamicAnimation, z, f, f2);
                break;
            case 2:
                Bulletin.Layout.SpringTransition.lambda$animateExit$2((Runnable) this.f$0, dynamicAnimation, z, f, f2);
                break;
            case 3:
                ((SenderSelectPopup) this.f$0).lambda$startDismissAnimation$8(dynamicAnimation, z, f, f2);
                break;
            case 4:
                ((SenderSelectView) this.f$0).lambda$setProgress$3(dynamicAnimation, z, f, f2);
                break;
            default:
                ((ShareAlert) this.f$0).lambda$collapseTopics$23(dynamicAnimation, z, f, f2);
                break;
        }
    }
}
