package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class oo0 extends AnimatorListenerAdapter {
    public final int f39316a;
    public final boolean f39317b;
    public final xo0 f39318c;

    public oo0(xo0 xo0Var, boolean z10, int i10) {
        this.f39316a = i10;
        this.f39318c = xo0Var;
        this.f39317b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39316a) {
            case 0:
                xo0 xo0Var = this.f39318c;
                AnimatorSet animatorSet = xo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xo0Var.v = null;
                    return;
                }
                return;
            default:
                xo0 xo0Var2 = this.f39318c;
                AnimatorSet animatorSet2 = xo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    xo0Var2.v = null;
                    return;
                }
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39316a) {
            case 0:
                xo0 xo0Var = this.f39318c;
                AnimatorSet animatorSet = xo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39317b) {
                        xo0Var.f42860r.setVisibility(4);
                        return;
                    } else {
                        xo0Var.f42855n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                xo0 xo0Var2 = this.f39318c;
                AnimatorSet animatorSet2 = xo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39317b) {
                        xo0Var2.f42862s.setVisibility(4);
                        return;
                    } else {
                        xo0Var2.U.setVisibility(4);
                        return;
                    }
                }
                return;
        }
    }
}
