package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;
public final class a3 extends AnimatorListenerAdapter {
    public final int f22378a;
    public final k3 f22379b;

    public a3(k3 k3Var, int i10) {
        this.f22378a = i10;
        this.f22379b = k3Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f22378a) {
            case 0:
                k3 k3Var = this.f22379b;
                AnimatorSet animatorSet = k3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    k3Var.currentSheetAnimation = null;
                    k3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                k3 k3Var2 = this.f22379b;
                AnimatorSet animatorSet2 = k3Var2.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    k3Var2.currentSheetAnimation = null;
                    k3Var2.currentSheetAnimationType = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimationNotificationsLocker animationNotificationsLocker;
        int i10 = this.f22378a;
        k3 k3Var = this.f22379b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = k3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    k3Var.currentSheetAnimation = null;
                    k3Var.currentSheetAnimationType = 0;
                    k3Var.onOpenAnimationEnd();
                    d3 d3Var = k3Var.delegate;
                    if (d3Var != null) {
                        d3Var.onOpenAnimationEnd();
                    }
                    if (k3Var.useHardwareLayer) {
                        k3Var.container.setLayerType(0, null);
                    }
                    if (k3Var.isFullscreen) {
                        WindowManager.LayoutParams attributes = k3Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        k3Var.getWindow().setAttributes(attributes);
                    }
                }
                if (k3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                }
                animationNotificationsLocker = k3Var.notificationsLocker;
                animationNotificationsLocker.unlock();
                return;
            default:
                AnimatorSet animatorSet2 = k3Var.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    k3Var.currentSheetAnimation = null;
                    k3Var.currentSheetAnimationType = 0;
                    AndroidUtilities.runOnUIThread(new q(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
