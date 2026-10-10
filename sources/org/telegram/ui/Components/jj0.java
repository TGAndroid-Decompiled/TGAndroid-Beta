package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class jj0 extends AnimatorListenerAdapter {
    public final int f27708a;
    public final kj0 f27709b;

    public jj0(kj0 kj0Var, int i10) {
        this.f27708a = i10;
        this.f27709b = kj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27708a) {
            case 1:
                kj0 kj0Var = this.f27709b;
                AnimatorSet animatorSet = kj0Var.f28057s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kj0Var.f28057s = null;
                    kj0Var.getClass();
                    return;
                }
                return;
            case 2:
                kj0 kj0Var2 = this.f27709b;
                AnimatorSet animatorSet2 = kj0Var2.f28057s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kj0Var2.f28057s = null;
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
        int i10 = this.f27708a;
        kj0 kj0Var = this.f27709b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = kj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    kj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = kj0Var.f28057s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    kj0Var.f28057s = null;
                    if (kj0Var.f28058w) {
                        kj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = kj0Var.f28057s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    kj0Var.f28057s = null;
                    AndroidUtilities.runOnUIThread(new cd0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
