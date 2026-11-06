package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final int f39220a;
    public final k0 f39221b;

    public j0(k0 k0Var, int i7) {
        this.f39220a = i7;
        this.f39221b = k0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39220a) {
            case 0:
                k0 k0Var = this.f39221b;
                k0Var.N0 = null;
                k0Var.D.E = false;
                y yVar = k0Var.E;
                if (yVar != null) {
                    if (yVar.getParent() != null) {
                        k0Var.removeView(k0Var.E);
                        k0Var.E.e();
                    }
                    k0Var.E = null;
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                k0 k0Var2 = this.f39221b;
                k0Var2.J0 = null;
                k0Var2.I0 = 0.0f;
                k0Var2.invalidate();
                return;
            default:
                k0 k0Var3 = this.f39221b;
                k0Var3.B0 = null;
                k0Var3.f39272y0 = 1.0f;
                k0Var3.f39261r0 = 0.0f;
                k0Var3.f39263s0 = 0.0f;
                k0Var3.invalidate();
                return;
        }
    }
}
