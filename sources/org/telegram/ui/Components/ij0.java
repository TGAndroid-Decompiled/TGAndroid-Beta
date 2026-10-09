package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ij0 extends AnimatorListenerAdapter {
    public final int f27410a;
    public final jj0 f27411b;

    public ij0(jj0 jj0Var, int i10) {
        this.f27410a = i10;
        this.f27411b = jj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27410a) {
            case 1:
                jj0 jj0Var = this.f27411b;
                AnimatorSet animatorSet = jj0Var.f27730s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jj0Var.f27730s = null;
                    jj0Var.getClass();
                    return;
                }
                return;
            case 2:
                jj0 jj0Var2 = this.f27411b;
                AnimatorSet animatorSet2 = jj0Var2.f27730s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jj0Var2.f27730s = null;
                    jj0Var2.getClass();
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
        int i10 = this.f27410a;
        jj0 jj0Var = this.f27411b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = jj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    jj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = jj0Var.f27730s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    jj0Var.f27730s = null;
                    if (jj0Var.f27731w) {
                        jj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = jj0Var.f27730s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    jj0Var.f27730s = null;
                    AndroidUtilities.runOnUIThread(new bd0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
