package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class dj0 extends AnimatorListenerAdapter {
    public final int f27473a;
    public final ej0 f27474b;

    public dj0(ej0 ej0Var, int i10) {
        this.f27473a = i10;
        this.f27474b = ej0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27473a) {
            case 1:
                ej0 ej0Var = this.f27474b;
                AnimatorSet animatorSet = ej0Var.f27865s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ej0Var.f27865s = null;
                    ej0Var.getClass();
                    return;
                }
                return;
            case 2:
                ej0 ej0Var2 = this.f27474b;
                AnimatorSet animatorSet2 = ej0Var2.f27865s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ej0Var2.f27865s = null;
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
        int i10 = this.f27473a;
        ej0 ej0Var = this.f27474b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = ej0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ej0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = ej0Var.f27865s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ej0Var.f27865s = null;
                    if (ej0Var.f27866w) {
                        ej0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = ej0Var.f27865s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    ej0Var.f27865s = null;
                    AndroidUtilities.runOnUIThread(new xa0(this, 16));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
