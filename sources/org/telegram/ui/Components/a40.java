package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class a40 extends AnimatorListenerAdapter {
    public final int f24619a;
    public final c40 f24620b;

    public a40(c40 c40Var, int i10) {
        this.f24619a = i10;
        this.f24620b = c40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24619a) {
            case 0:
                c40 c40Var = this.f24620b;
                if (c40Var.f25170b0 == animator) {
                    c40Var.f25170b0 = null;
                    c40Var.b();
                    return;
                }
                return;
            default:
                c40 c40Var2 = this.f24620b;
                if (c40Var2.f25168a0 == animator) {
                    c40Var2.f25168a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f24619a) {
            case 1:
                b40 b40Var = this.f24620b.W;
                if (b40Var != null) {
                    ((org.telegram.ui.ds0) b40Var).f36720a.f33582e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
