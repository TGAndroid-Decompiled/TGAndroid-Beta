package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class aj0 extends AnimatorListenerAdapter {
    public final int f24631a;
    public final bj0 f24632b;

    public aj0(bj0 bj0Var, int i10) {
        this.f24631a = i10;
        this.f24632b = bj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f24631a) {
            case 1:
                bj0 bj0Var = this.f24632b;
                AnimatorSet animatorSet = bj0Var.f24962s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bj0Var.f24962s = null;
                    bj0Var.getClass();
                    return;
                }
                return;
            case 2:
                bj0 bj0Var2 = this.f24632b;
                AnimatorSet animatorSet2 = bj0Var2.f24962s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bj0Var2.f24962s = null;
                    bj0Var2.getClass();
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
        int i10 = this.f24631a;
        bj0 bj0Var = this.f24632b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = bj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    bj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = bj0Var.f24962s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    bj0Var.f24962s = null;
                    if (bj0Var.f24963w) {
                        bj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = bj0Var.f24962s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    bj0Var.f24962s = null;
                    AndroidUtilities.runOnUIThread(new rc0(this, 14));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
