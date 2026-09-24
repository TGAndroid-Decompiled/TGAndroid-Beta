package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class oi0 extends AnimatorListenerAdapter {
    public final int f27086a;
    public final pi0 f27087b;

    public oi0(pi0 pi0Var, int i10) {
        this.f27086a = i10;
        this.f27087b = pi0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27086a) {
            case 1:
                pi0 pi0Var = this.f27087b;
                AnimatorSet animatorSet = pi0Var.f27342s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    pi0Var.f27342s = null;
                    pi0Var.getClass();
                    return;
                }
                return;
            case 2:
                pi0 pi0Var2 = this.f27087b;
                AnimatorSet animatorSet2 = pi0Var2.f27342s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pi0Var2.f27342s = null;
                    pi0Var2.getClass();
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
        int i10 = this.f27086a;
        pi0 pi0Var = this.f27087b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = pi0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    pi0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = pi0Var.f27342s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    pi0Var.f27342s = null;
                    if (pi0Var.f27343w) {
                        pi0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = pi0Var.f27342s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    pi0Var.f27342s = null;
                    AndroidUtilities.runOnUIThread(new ic0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
