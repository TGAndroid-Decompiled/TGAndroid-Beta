package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x30 extends AnimatorListenerAdapter {
    public final int f32718a;
    public final z30 f32719b;

    public x30(z30 z30Var, int i10) {
        this.f32718a = i10;
        this.f32719b = z30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32718a) {
            case 0:
                z30 z30Var = this.f32719b;
                if (z30Var.f33367b0 == animator) {
                    z30Var.f33367b0 = null;
                    z30Var.b();
                    return;
                }
                return;
            default:
                z30 z30Var2 = this.f32719b;
                if (z30Var2.f33365a0 == animator) {
                    z30Var2.f33365a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32718a) {
            case 1:
                y30 y30Var = this.f32719b.W;
                if (y30Var != null) {
                    ((org.telegram.ui.qs0) y30Var).f39819a.f33901e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
