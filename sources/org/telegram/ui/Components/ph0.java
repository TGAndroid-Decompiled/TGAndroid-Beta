package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ph0 extends AnimatorListenerAdapter {
    public final int f31663a;
    public final qh0 f31664b;

    public ph0(qh0 qh0Var, int i9) {
        this.f31663a = i9;
        this.f31664b = qh0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f31663a) {
            case 1:
                qh0 qh0Var = this.f31664b;
                AnimatorSet animatorSet = qh0Var.f31949s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qh0Var.f31949s = null;
                    qh0Var.getClass();
                    return;
                }
                return;
            case 2:
                qh0 qh0Var2 = this.f31664b;
                AnimatorSet animatorSet2 = qh0Var2.f31949s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qh0Var2.f31949s = null;
                    qh0Var2.getClass();
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
        int i9 = this.f31663a;
        qh0 qh0Var = this.f31664b;
        switch (i9) {
            case 0:
                AnimatorSet animatorSet = qh0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qh0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = qh0Var.f31949s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qh0Var.f31949s = null;
                    if (qh0Var.f31950w) {
                        qh0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = qh0Var.f31949s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    qh0Var.f31949s = null;
                    AndroidUtilities.runOnUIThread(new ib0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
