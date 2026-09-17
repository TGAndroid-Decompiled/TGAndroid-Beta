package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class oo0 extends AnimatorListenerAdapter {
    public final int f39290a;
    public final boolean f39291b;
    public final xo0 f39292c;

    public oo0(xo0 xo0Var, boolean z10, int i10) {
        this.f39290a = i10;
        this.f39292c = xo0Var;
        this.f39291b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f39290a) {
            case 0:
                xo0 xo0Var = this.f39292c;
                AnimatorSet animatorSet = xo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xo0Var.v = null;
                    return;
                }
                return;
            default:
                xo0 xo0Var2 = this.f39292c;
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
        switch (this.f39290a) {
            case 0:
                xo0 xo0Var = this.f39292c;
                AnimatorSet animatorSet = xo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f39291b) {
                        xo0Var.f42834r.setVisibility(4);
                        return;
                    } else {
                        xo0Var.f42829n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                xo0 xo0Var2 = this.f39292c;
                AnimatorSet animatorSet2 = xo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f39291b) {
                        xo0Var2.f42836s.setVisibility(4);
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
