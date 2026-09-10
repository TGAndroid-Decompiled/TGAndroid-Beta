package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ni0 extends AnimatorListenerAdapter {
    public final int f25529a;
    public final oi0 f25530b;

    public ni0(oi0 oi0Var, int i10) {
        this.f25529a = i10;
        this.f25530b = oi0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25529a) {
            case 1:
                oi0 oi0Var = this.f25530b;
                AnimatorSet animatorSet = oi0Var.f25818s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oi0Var.f25818s = null;
                    oi0Var.getClass();
                    return;
                }
                return;
            case 2:
                oi0 oi0Var2 = this.f25530b;
                AnimatorSet animatorSet2 = oi0Var2.f25818s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    oi0Var2.f25818s = null;
                    oi0Var2.getClass();
                    return;
                }
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        int i10 = this.f25529a;
        oi0 oi0Var = this.f25530b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = oi0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    oi0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = oi0Var.f25818s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    oi0Var.f25818s = null;
                    if (oi0Var.f25819w) {
                        oi0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = oi0Var.f25818s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    oi0Var.f25818s = null;
                    AndroidUtilities.runOnUIThread(new kc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
