package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q7 extends AnimatorListenerAdapter {
    public final int f28099a;
    public final c8 f28100b;

    public q7(c8 c8Var, int i10) {
        this.f28099a = i10;
        this.f28100b = c8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28099a) {
            case 2:
                this.f28100b.f23873z0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28099a) {
            case 0:
                this.f28100b.f23852j0 = false;
                return;
            case 1:
                c8 c8Var = this.f28100b;
                c8Var.f23848f0.setVisibility(4);
                c8Var.f23849g0.setImageBitmap(null);
                c8Var.f23852j0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
