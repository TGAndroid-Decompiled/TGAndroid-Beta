package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k0 extends AnimatorListenerAdapter {
    public final int f40987a;
    public final l0 f40988b;

    public k0(l0 l0Var, int i7) {
        this.f40987a = i7;
        this.f40988b = l0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40987a) {
            case 0:
                l0 l0Var = this.f40988b;
                l0Var.O0 = null;
                l0Var.E.F = false;
                z zVar = l0Var.F;
                if (zVar != null) {
                    if (zVar.getParent() != null) {
                        l0Var.removeView(l0Var.F);
                        l0Var.F.e();
                    }
                    l0Var.F = null;
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                l0 l0Var2 = this.f40988b;
                l0Var2.K0 = null;
                l0Var2.J0 = 0.0f;
                l0Var2.invalidate();
                return;
            default:
                l0 l0Var3 = this.f40988b;
                l0Var3.C0 = null;
                l0Var3.f41036z0 = 1.0f;
                l0Var3.f41026s0 = 0.0f;
                l0Var3.f41027t0 = 0.0f;
                l0Var3.invalidate();
                return;
        }
    }
}
