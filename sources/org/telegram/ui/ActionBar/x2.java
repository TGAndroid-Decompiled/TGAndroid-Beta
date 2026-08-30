package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f20727a;
    public final g3 f20728b;

    public x2(g3 g3Var, int i10) {
        this.f20727a = i10;
        this.f20728b = g3Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f20727a) {
            case 0:
                g3 g3Var = this.f20728b;
                AnimatorSet animatorSet = g3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                g3 g3Var2 = this.f20728b;
                AnimatorSet animatorSet2 = g3Var2.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    g3Var2.currentSheetAnimation = null;
                    g3Var2.currentSheetAnimationType = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimationNotificationsLocker animationNotificationsLocker;
        int i10 = this.f20727a;
        g3 g3Var = this.f20728b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = g3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    g3Var.onOpenAnimationEnd();
                    a3 a3Var = g3Var.delegate;
                    if (a3Var != null) {
                        a3Var.onOpenAnimationEnd();
                    }
                    if (g3Var.useHardwareLayer) {
                        g3Var.container.setLayerType(0, null);
                    }
                    if (g3Var.isFullscreen) {
                        WindowManager.LayoutParams attributes = g3Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        g3Var.getWindow().setAttributes(attributes);
                    }
                }
                if (g3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                }
                animationNotificationsLocker = g3Var.notificationsLocker;
                animationNotificationsLocker.unlock();
                return;
            default:
                AnimatorSet animatorSet2 = g3Var.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    g3Var.currentSheetAnimation = null;
                    g3Var.currentSheetAnimationType = 0;
                    AndroidUtilities.runOnUIThread(new p(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
