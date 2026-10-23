package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;
public final class x2 extends AnimatorListenerAdapter {
    public final int f21955a;
    public final h3 f21956b;

    public x2(h3 h3Var, int i10) {
        this.f21955a = i10;
        this.f21956b = h3Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f21955a) {
            case 0:
                h3 h3Var = this.f21956b;
                AnimatorSet animatorSet = h3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h3Var.currentSheetAnimation = null;
                    h3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                h3 h3Var2 = this.f21956b;
                AnimatorSet animatorSet2 = h3Var2.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    h3Var2.currentSheetAnimation = null;
                    h3Var2.currentSheetAnimationType = 0;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        AnimationNotificationsLocker animationNotificationsLocker;
        int i10 = this.f21955a;
        h3 h3Var = this.f21956b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = h3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h3Var.currentSheetAnimation = null;
                    h3Var.currentSheetAnimationType = 0;
                    h3Var.onOpenAnimationEnd();
                    a3 a3Var = h3Var.delegate;
                    if (a3Var != null) {
                        a3Var.onOpenAnimationEnd();
                    }
                    if (h3Var.useHardwareLayer) {
                        h3Var.container.setLayerType(0, null);
                    }
                    if (h3Var.isFullscreen) {
                        WindowManager.LayoutParams attributes = h3Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        h3Var.getWindow().setAttributes(attributes);
                    }
                }
                if (h3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                }
                animationNotificationsLocker = h3Var.notificationsLocker;
                animationNotificationsLocker.unlock();
                return;
            default:
                AnimatorSet animatorSet2 = h3Var.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    h3Var.currentSheetAnimation = null;
                    h3Var.currentSheetAnimationType = 0;
                    AndroidUtilities.runOnUIThread(new p(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
