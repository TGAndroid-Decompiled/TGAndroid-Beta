package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c40 extends AnimatorListenerAdapter {
    public final int f25072a;
    public final e40 f25073b;

    public c40(e40 e40Var, int i10) {
        this.f25072a = i10;
        this.f25073b = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25072a) {
            case 0:
                e40 e40Var = this.f25073b;
                if (e40Var.f25764b0 == animator) {
                    e40Var.f25764b0 = null;
                    e40Var.b();
                    return;
                }
                return;
            default:
                e40 e40Var2 = this.f25073b;
                if (e40Var2.f25762a0 == animator) {
                    e40Var2.f25762a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25072a) {
            case 1:
                d40 d40Var = this.f25073b.W;
                if (d40Var != null) {
                    ((org.telegram.ui.bs0) d40Var).f35733a.f33272e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
