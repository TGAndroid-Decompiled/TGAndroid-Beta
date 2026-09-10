package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.NotificationCenter;
public final class y2 extends AnimatorListenerAdapter {
    public final int f18772a;
    public final h3 f18773b;

    public y2(h3 h3Var, int i10) {
        this.f18772a = i10;
        this.f18773b = h3Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f18772a) {
            case 0:
                h3 h3Var = this.f18773b;
                AnimatorSet animatorSet = h3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h3Var.currentSheetAnimation = null;
                    h3Var.currentSheetAnimationType = 0;
                    return;
                }
                return;
            default:
                h3 h3Var2 = this.f18773b;
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
        int i10 = this.f18772a;
        h3 h3Var = this.f18773b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = h3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    h3Var.currentSheetAnimation = null;
                    h3Var.currentSheetAnimationType = 0;
                    h3Var.onOpenAnimationEnd();
                    b3 b3Var = h3Var.delegate;
                    if (b3Var != null) {
                        b3Var.onOpenAnimationEnd();
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
                    AndroidUtilities.runOnUIThread(new q(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
