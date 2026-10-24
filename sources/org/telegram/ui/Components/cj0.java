package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class cj0 extends AnimatorListenerAdapter {
    public final int f25344a;
    public final dj0 f25345b;

    public cj0(dj0 dj0Var, int i10) {
        this.f25344a = i10;
        this.f25345b = dj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f25344a) {
            case 1:
                dj0 dj0Var = this.f25345b;
                AnimatorSet animatorSet = dj0Var.f25766s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dj0Var.f25766s = null;
                    dj0Var.getClass();
                    return;
                }
                return;
            case 2:
                dj0 dj0Var2 = this.f25345b;
                AnimatorSet animatorSet2 = dj0Var2.f25766s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dj0Var2.f25766s = null;
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
        int i10 = this.f25344a;
        dj0 dj0Var = this.f25345b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = dj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    dj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = dj0Var.f25766s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    dj0Var.f25766s = null;
                    if (dj0Var.f25767w) {
                        dj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = dj0Var.f25766s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    dj0Var.f25766s = null;
                    AndroidUtilities.runOnUIThread(new wb0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
