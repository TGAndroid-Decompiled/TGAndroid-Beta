package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class io0 extends AnimatorListenerAdapter {
    public final int f34509a;
    public final boolean f34510b;
    public final ro0 f34511c;

    public io0(ro0 ro0Var, boolean z10, int i10) {
        this.f34509a = i10;
        this.f34511c = ro0Var;
        this.f34510b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f34509a) {
            case 0:
                ro0 ro0Var = this.f34511c;
                AnimatorSet animatorSet = ro0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    ro0Var.v = null;
                    return;
                }
                return;
            default:
                ro0 ro0Var2 = this.f34511c;
                AnimatorSet animatorSet2 = ro0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    ro0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34509a) {
            case 0:
                ro0 ro0Var = this.f34511c;
                AnimatorSet animatorSet = ro0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f34510b) {
                        ro0Var.f37194r.setVisibility(4);
                        return;
                    } else {
                        ro0Var.f37189n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                ro0 ro0Var2 = this.f34511c;
                AnimatorSet animatorSet2 = ro0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f34510b) {
                        ro0Var2.f37196s.setVisibility(4);
                        return;
                    } else {
                        ro0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
