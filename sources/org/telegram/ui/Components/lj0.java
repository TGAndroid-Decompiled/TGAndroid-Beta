package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.NotificationCenter;
public final class lj0 extends AnimatorListenerAdapter {
    public final int f28209a;
    public final mj0 f28210b;

    public lj0(mj0 mj0Var, int i10) {
        this.f28209a = i10;
        this.f28210b = mj0Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28209a) {
            case 1:
                mj0 mj0Var = this.f28210b;
                AnimatorSet animatorSet = mj0Var.f28581s;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    mj0Var.f28581s = null;
                    mj0Var.getClass();
                    return;
                }
                return;
            case 2:
                mj0 mj0Var2 = this.f28210b;
                AnimatorSet animatorSet2 = mj0Var2.f28581s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    mj0Var2.f28581s = null;
                    mj0Var2.getClass();
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
        int i10 = this.f28209a;
        mj0 mj0Var = this.f28210b;
        switch (i10) {
            case 0:
                AnimatorSet animatorSet = mj0Var.h;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    mj0Var.h = null;
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            case 1:
                AnimatorSet animatorSet2 = mj0Var.f28581s;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    mj0Var.f28581s = null;
                    if (mj0Var.f28582w) {
                        mj0Var.setLayerType(0, null);
                    }
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
            default:
                AnimatorSet animatorSet3 = mj0Var.f28581s;
                if (animatorSet3 != null && animatorSet3.equals(animator)) {
                    mj0Var.f28581s = null;
                    AndroidUtilities.runOnUIThread(new cd0(this, 15));
                }
                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.startAllHeavyOperations, 512);
                return;
        }
    }
}
