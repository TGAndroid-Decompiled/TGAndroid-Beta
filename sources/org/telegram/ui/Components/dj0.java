package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class dj0 extends AnimatorListenerAdapter {
    public final int f25662a;
    public final ej0 f25663b;

    public dj0(ej0 ej0Var, int i10) {
        this.f25662a = i10;
        this.f25663b = ej0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25662a) {
            case 1:
                ej0 ej0Var = this.f25663b;
                AnimatorSet animatorSet = ej0Var.f25990s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ej0Var.f25990s = null;
                    ej0Var.getClass();
                    return;
                }
                return;
            case 2:
                ej0 ej0Var2 = this.f25663b;
                AnimatorSet animatorSet2 = ej0Var2.f25990s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ej0Var2.f25990s = null;
                    ej0Var2.getClass();
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
        int i10 = this.f25662a;
        ej0 ej0Var = this.f25663b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ej0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ej0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = ej0Var.f25990s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ej0Var.f25990s = null;
                    if (ej0Var.f25991w) {
                        ej0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = ej0Var.f25990s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ej0Var.f25990s = null;
                    AndroidUtilities.runOnUIThread(new yb0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
