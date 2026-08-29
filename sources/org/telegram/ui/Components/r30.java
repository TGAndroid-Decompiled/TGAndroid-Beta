package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class r30 extends AnimatorListenerAdapter {
    public final int f32168a;
    public final t30 f32169b;

    public r30(t30 t30Var, int i10) {
        this.f32168a = i10;
        this.f32169b = t30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32168a) {
            case 0:
                t30 t30Var = this.f32169b;
                if (t30Var.U == animator) {
                    t30Var.U = null;
                    t30Var.b();
                    return;
                }
                return;
            default:
                t30 t30Var2 = this.f32169b;
                if (t30Var2.T == animator) {
                    t30Var2.T = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32168a) {
            case 1:
                s30 s30Var = this.f32169b.S;
                if (s30Var != null) {
                    ((org.telegram.ui.rr0) s30Var).f42193a.f35647a0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
