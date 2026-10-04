package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x30 extends AnimatorListenerAdapter {
    public final int f32711a;
    public final z30 f32712b;

    public x30(z30 z30Var, int i10) {
        this.f32711a = i10;
        this.f32712b = z30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32711a) {
            case 0:
                z30 z30Var = this.f32712b;
                if (z30Var.f33360b0 == animator) {
                    z30Var.f33360b0 = null;
                    z30Var.b();
                    return;
                }
                return;
            default:
                z30 z30Var2 = this.f32712b;
                if (z30Var2.f33358a0 == animator) {
                    z30Var2.f33358a0 = null;
                    return;
                }
                return;
        }
    }

    @Override
    public void onAnimationStart(Animator animator) {
        switch (this.f32711a) {
            case 1:
                y30 y30Var = this.f32712b.W;
                if (y30Var != null) {
                    ((org.telegram.ui.qs0) y30Var).f39813a.f33894e0.requestLayout();
                    return;
                }
                return;
            default:
                super.onAnimationStart(animator);
                return;
        }
    }
}
