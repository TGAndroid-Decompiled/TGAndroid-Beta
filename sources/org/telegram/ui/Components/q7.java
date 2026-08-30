package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q7 extends AnimatorListenerAdapter {
    public final int f28075a;
    public final c8 f28076b;

    public q7(c8 c8Var, int i10) {
        this.f28075a = i10;
        this.f28076b = c8Var;
    }

    @Override
    public void onAnimationCancel(Animator animator) {
        switch (this.f28075a) {
            case 2:
                this.f28076b.f23918z0 = null;
                return;
            default:
                super.onAnimationCancel(animator);
                return;
        }
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28075a) {
            case 0:
                this.f28076b.f23897j0 = false;
                return;
            case 1:
                c8 c8Var = this.f28076b;
                c8Var.f23893f0.setVisibility(4);
                c8Var.f23894g0.setImageBitmap(null);
                c8Var.f23897j0 = false;
                return;
            default:
                return;
        }
    }

    private final void a(Animator animator) {
    }
}
