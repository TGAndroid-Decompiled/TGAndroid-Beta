package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final int f40947a;
    public final k0 f40948b;

    public j0(k0 k0Var, int i7) {
        this.f40947a = i7;
        this.f40948b = k0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40947a) {
            case 0:
                k0 k0Var = this.f40948b;
                k0Var.O0 = null;
                k0Var.E.F = false;
                y yVar = k0Var.F;
                if (yVar != null) {
                    if (yVar.getParent() != null) {
                        k0Var.removeView(k0Var.F);
                        k0Var.F.e();
                    }
                    k0Var.F = null;
                    return;
                }
                return;
            case 1:
                super.onAnimationEnd(animator);
                k0 k0Var2 = this.f40948b;
                k0Var2.K0 = null;
                k0Var2.J0 = 0.0f;
                k0Var2.invalidate();
                return;
            default:
                k0 k0Var3 = this.f40948b;
                k0Var3.C0 = null;
                k0Var3.f41006z0 = 1.0f;
                k0Var3.f40996s0 = 0.0f;
                k0Var3.f40997t0 = 0.0f;
                k0Var3.invalidate();
                return;
        }
    }
}
