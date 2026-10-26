package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class cj0 extends AnimatorListenerAdapter {
    public final int f27187a;
    public final dj0 f27188b;

    public cj0(dj0 dj0Var, int i10) {
        this.f27187a = i10;
        this.f27188b = dj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27187a) {
            case 1:
                dj0 dj0Var = this.f27188b;
                AnimatorSet animatorSet = dj0Var.f27538s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dj0Var.f27538s = null;
                    dj0Var.getClass();
                    return;
                }
                return;
            case 2:
                dj0 dj0Var2 = this.f27188b;
                AnimatorSet animatorSet2 = dj0Var2.f27538s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dj0Var2.f27538s = null;
                    dj0Var2.getClass();
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
        int i10 = this.f27187a;
        dj0 dj0Var = this.f27188b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = dj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = dj0Var.f27538s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dj0Var.f27538s = null;
                    if (dj0Var.f27539w) {
                        dj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = dj0Var.f27538s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dj0Var.f27538s = null;
                    AndroidUtilities.runOnUIThread(new wa0(this, 16));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
