package org.telegram.ui.Cells;

import androidx.dynamicanimation.animation.DynamicAnimation;
import org.telegram.messenger.AnimationNotificationsLocker;

public final class ShareDialogCell$$ExternalSyntheticLambda2 implements DynamicAnimation.OnAnimationEndListener {
    public final int $r8$classId;
    public final Object f$0;

    public ShareDialogCell$$ExternalSyntheticLambda2(Object obj, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
    }

    @Override
    public final void onAnimationEnd(DynamicAnimation dynamicAnimation, boolean z, float f, float f2) {
        switch (this.$r8$classId) {
            case 0:
                ((ShareDialogCell) this.f$0).lambda$setTopic$2(dynamicAnimation, z, f, f2);
                break;
            default:
                ((AnimationNotificationsLocker) this.f$0).unlock();
                break;
        }
    }
}
