package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
public final class oo0 extends AnimatorListenerAdapter {
    public final int f36375a;
    public final boolean f36376b;
    public final xo0 f36377c;

    public oo0(xo0 xo0Var, boolean z10, int i10) {
        this.f36375a = i10;
        this.f36377c = xo0Var;
        this.f36376b = z10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        switch (this.f36375a) {
            case 0:
                xo0 xo0Var = this.f36377c;
                AnimatorSet animatorSet = xo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    xo0Var.v = null;
                    return;
                }
                return;
            default:
                xo0 xo0Var2 = this.f36377c;
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
        switch (this.f36375a) {
            case 0:
                xo0 xo0Var = this.f36377c;
                AnimatorSet animatorSet = xo0Var.v;
                if (animatorSet != null && animatorSet.equals(animator)) {
                    if (!this.f36376b) {
                        xo0Var.f39690r.setVisibility(4);
                        return;
                    } else {
                        xo0Var.f39685n.getContentView().setVisibility(4);
                        return;
                    }
                }
                return;
            default:
                xo0 xo0Var2 = this.f36377c;
                AnimatorSet animatorSet2 = xo0Var2.v;
                if (animatorSet2 != null && animatorSet2.equals(animator)) {
                    if (!this.f36376b) {
                        xo0Var2.f39692s.setVisibility(4);
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
