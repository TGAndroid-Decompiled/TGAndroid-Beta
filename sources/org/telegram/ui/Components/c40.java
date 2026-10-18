package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class c40 extends AnimatorListenerAdapter {
    public final int f25090a;
    public final e40 f25091b;

    public c40(e40 e40Var, int i10) {
        this.f25090a = i10;
        this.f25091b = e40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25090a) {
            case 0:
                e40 e40Var = this.f25091b;
                if (e40Var.f25802b0 == animator) {
                    e40Var.f25802b0 = null;
                    e40Var.b();
                    return;
                }
                return;
            default:
                e40 e40Var2 = this.f25091b;
                if (e40Var2.f25800a0 == animator) {
                    e40Var2.f25800a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f25090a) {
            case 1:
                d40 d40Var = this.f25091b.W;
                if (d40Var != null) {
                    ((org.telegram.ui.ds0) d40Var).f36322a.f33273e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
