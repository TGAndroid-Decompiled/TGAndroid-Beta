package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x30 extends AnimatorListenerAdapter {
    public final int f32939a;
    public final z30 f32940b;

    public x30(z30 z30Var, int i10) {
        this.f32939a = i10;
        this.f32940b = z30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32939a) {
            case 0:
                z30 z30Var = this.f32940b;
                if (z30Var.V == animator) {
                    z30Var.V = null;
                    z30Var.b();
                    return;
                }
                return;
            default:
                z30 z30Var2 = this.f32940b;
                if (z30Var2.U == animator) {
                    z30Var2.U = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32939a) {
            case 1:
                y30 y30Var = this.f32940b.T;
                if (y30Var != null) {
                    ((org.telegram.ui.bs0) y30Var).f35585a.f34230b0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
