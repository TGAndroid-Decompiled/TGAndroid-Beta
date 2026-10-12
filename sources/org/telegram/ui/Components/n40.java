package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class n40 extends AnimatorListenerAdapter {
    public final int f28715a;
    public final p40 f28716b;

    public n40(p40 p40Var, int i10) {
        this.f28715a = i10;
        this.f28716b = p40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28715a) {
            case 0:
                p40 p40Var = this.f28716b;
                if (p40Var.f29365b0 == animator) {
                    p40Var.f29365b0 = null;
                    p40Var.b();
                    return;
                }
                return;
            default:
                p40 p40Var2 = this.f28716b;
                if (p40Var2.f29363a0 == animator) {
                    p40Var2.f29363a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f28715a) {
            case 1:
                o40 o40Var = this.f28716b.W;
                if (o40Var != null) {
                    ((org.telegram.ui.xs0) o40Var).f44160a.f33743e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
