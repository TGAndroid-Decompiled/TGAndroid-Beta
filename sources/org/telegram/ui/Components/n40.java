package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n40 extends AnimatorListenerAdapter {
    public final int f28726a;
    public final p40 f28727b;

    public n40(p40 p40Var, int i10) {
        this.f28726a = i10;
        this.f28727b = p40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28726a) {
            case 0:
                p40 p40Var = this.f28727b;
                if (p40Var.f29362b0 == animator) {
                    p40Var.f29362b0 = null;
                    p40Var.b();
                    return;
                }
                return;
            default:
                p40 p40Var2 = this.f28727b;
                if (p40Var2.f29360a0 == animator) {
                    p40Var2.f29360a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28726a) {
            case 1:
                o40 o40Var = this.f28727b.W;
                if (o40Var != null) {
                    ((org.telegram.ui.xs0) o40Var).f44155a.f33741e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
