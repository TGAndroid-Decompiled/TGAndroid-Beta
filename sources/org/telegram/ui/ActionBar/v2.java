package org.telegram.ui.ActionBar;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.view.WindowManager;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;

public final class v2 extends AnimatorListenerAdapter {

    public final int f23881a;

    public final e3 f23882b;

    public v2(e3 e3Var, int i10) {
        this.f23881a = i10;
        this.f23882b = e3Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f23881a) {
            case 0:
                e3 e3Var = this.f23882b;
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    break;
                }
                break;
            default:
                e3 e3Var2 = this.f23882b;
                AnimatorSet animatorSet2 = e3Var2.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    e3Var2.currentSheetAnimation = null;
                    e3Var2.currentSheetAnimationType = 0;
                    break;
                }
                break;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f23881a;
        e3 e3Var = this.f23882b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = e3Var.currentSheetAnimation;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    e3Var.onOpenAnimationEnd();
                    y2 y2Var = e3Var.delegate;
                    if (y2Var != null) {
                        y2Var.onOpenAnimationEnd();
                    }
                    if (e3Var.useHardwareLayer) {
                        e3Var.container.setLayerType(0, null);
                    }
                    if (e3Var.isFullscreen) {
                        WindowManager.LayoutParams attributes = e3Var.getWindow().getAttributes();
                        attributes.flags &= -1025;
                        e3Var.getWindow().setAttributes(attributes);
                    }
                }
                if (e3Var.pauseAllHeavyOperations) {
                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                }
                e3Var.notificationsLocker.unlock();
                break;
            default:
                AnimatorSet animatorSet2 = e3Var.currentSheetAnimation;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    e3Var.currentSheetAnimation = null;
                    e3Var.currentSheetAnimationType = 0;
                    AndroidUtilities.runOnUIThread(new p(this, 9));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                break;
        }
    }
}
