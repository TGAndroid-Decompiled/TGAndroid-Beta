package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class jj0 extends AnimatorListenerAdapter {
    public final int f27767a;
    public final kj0 f27768b;

    public jj0(kj0 kj0Var, int i10) {
        this.f27767a = i10;
        this.f27768b = kj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27767a) {
            case 1:
                kj0 kj0Var = this.f27768b;
                AnimatorSet animatorSet = kj0Var.f28094s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kj0Var.f28094s = null;
                    kj0Var.getClass();
                    return;
                }
                return;
            case 2:
                kj0 kj0Var2 = this.f27768b;
                AnimatorSet animatorSet2 = kj0Var2.f28094s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kj0Var2.f28094s = null;
                    kj0Var2.getClass();
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
        int i10 = this.f27767a;
        kj0 kj0Var = this.f27768b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = kj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = kj0Var.f28094s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kj0Var.f28094s = null;
                    if (kj0Var.f28095w) {
                        kj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = kj0Var.f28094s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kj0Var.f28094s = null;
                    AndroidUtilities.runOnUIThread(new yc0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
