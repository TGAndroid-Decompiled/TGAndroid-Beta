package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class kj0 extends AnimatorListenerAdapter {
    public final int f27883a;
    public final lj0 f27884b;

    public kj0(lj0 lj0Var, int i10) {
        this.f27883a = i10;
        this.f27884b = lj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27883a) {
            case 1:
                lj0 lj0Var = this.f27884b;
                AnimatorSet animatorSet = lj0Var.f28218s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lj0Var.f28218s = null;
                    lj0Var.getClass();
                    return;
                }
                return;
            case 2:
                lj0 lj0Var2 = this.f27884b;
                AnimatorSet animatorSet2 = lj0Var2.f28218s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    lj0Var2.f28218s = null;
                    lj0Var2.getClass();
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
        int i10 = this.f27883a;
        lj0 lj0Var = this.f27884b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = lj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    lj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = lj0Var.f28218s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    lj0Var.f28218s = null;
                    if (lj0Var.f28219w) {
                        lj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = lj0Var.f28218s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    lj0Var.f28218s = null;
                    AndroidUtilities.runOnUIThread(new cd0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
