package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class d61 extends AnimatorListenerAdapter {
    public final int f33340a;
    public final f61 f33341b;

    public d61(f61 f61Var, int i10) {
        this.f33340a = i10;
        this.f33341b = f61Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33340a) {
            case 0:
                super.onAnimationEnd(animator);
                this.f33341b.F = null;
                return;
            case 1:
                super.onAnimationEnd(animator);
                this.f33341b.F = null;
                return;
            default:
                super.onAnimationEnd(animator);
                f61 f61Var = this.f33341b;
                f61Var.K = 0.0f;
                f61Var.F = null;
                f61Var.J = false;
                f61Var.d(true, false);
                return;
        }
    }
}
