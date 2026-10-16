package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class ej0 extends AnimatorListenerAdapter {
    public final int f24408a;
    public final fj0 f24409b;

    public ej0(fj0 fj0Var, int i10) {
        this.f24408a = i10;
        this.f24409b = fj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24408a) {
            case 1:
                fj0 fj0Var = this.f24409b;
                AnimatorSet animatorSet = fj0Var.f24766s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fj0Var.f24766s = null;
                    fj0Var.getClass();
                    return;
                }
                return;
            case 2:
                fj0 fj0Var2 = this.f24409b;
                AnimatorSet animatorSet2 = fj0Var2.f24766s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fj0Var2.f24766s = null;
                    fj0Var2.getClass();
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
        int i10 = this.f24408a;
        fj0 fj0Var = this.f24409b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = fj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    fj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = fj0Var.f24766s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    fj0Var.f24766s = null;
                    if (fj0Var.f24767w) {
                        fj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = fj0Var.f24766s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    fj0Var.f24766s = null;
                    AndroidUtilities.runOnUIThread(new yc0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
