package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;
public final class w2 extends AnimatorListenerAdapter {
    public final int f21478a;
    public final f3 f21479b;

    public w2(f3 f3Var, int i10) {
        this.f21478a = i10;
        this.f21479b = f3Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f21478a) {
            case 0:
                f3 f3Var = this.f21479b;
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                f3 f3Var2 = this.f21479b;
                AnimatorSet animatorSet2 = f3Var2.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    f3Var2.currentSheetAnimation = null;
                    f3Var2.currentSheetAnimationType = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimationNotificationsLocker animationNotificationsLocker;
        int i10 = this.f21478a;
        f3 f3Var = this.f21479b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = f3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    f3Var.onOpenAnimationEnd();
                    z2 z2Var = f3Var.delegate;
                    if (z2Var != null) {
                        z2Var.onOpenAnimationEnd();
                    }
                    if (f3Var.useHardwareLayer) {
                        f3Var.container.setLayerType(0, null);
                    }
                    if (f3Var.isFullscreen) {
                        WindowManager.LayoutParams attributes = f3Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        f3Var.getWindow().setAttributes(attributes);
                    }
                }
                if (f3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                }
                animationNotificationsLocker = f3Var.notificationsLocker;
                animationNotificationsLocker.unlock();
                return;
            default:
                AnimatorSet animatorSet2 = f3Var.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    f3Var.currentSheetAnimation = null;
                    f3Var.currentSheetAnimationType = 0;
                    AndroidUtilities.runOnUIThread(new q(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
