package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class pi0 extends AnimatorListenerAdapter {
    public final int f27395a;
    public final qi0 f27396b;

    public pi0(qi0 qi0Var, int i10) {
        this.f27395a = i10;
        this.f27396b = qi0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f27395a) {
            case 1:
                qi0 qi0Var = this.f27396b;
                AnimatorSet animatorSet = qi0Var.f27688s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qi0Var.f27688s = null;
                    qi0Var.getClass();
                    return;
                }
                return;
            case 2:
                qi0 qi0Var2 = this.f27396b;
                AnimatorSet animatorSet2 = qi0Var2.f27688s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qi0Var2.f27688s = null;
                    qi0Var2.getClass();
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
        int i10 = this.f27395a;
        qi0 qi0Var = this.f27396b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = qi0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    qi0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = qi0Var.f27688s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    qi0Var.f27688s = null;
                    if (qi0Var.f27689w) {
                        qi0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = qi0Var.f27688s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    qi0Var.f27688s = null;
                    AndroidUtilities.runOnUIThread(new jc0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
