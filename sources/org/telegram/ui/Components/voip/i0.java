package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final int f41052a;
    public final y f41053b;
    public final k0 f41054c;

    public i0(k0 k0Var, y yVar, int i7) {
        this.f41052a = i7;
        this.f41054c = k0Var;
        this.f41053b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f41052a) {
            case 0:
                k0 k0Var = this.f41054c;
                k0Var.O0 = null;
                this.f41053b.F = false;
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
                k0 k0Var2 = this.f41054c;
                k0Var2.f41140y.e();
                k0Var2.f41129r = null;
                this.f41053b.f41483r = false;
                if (!k0Var2.f41109b) {
                    k0Var2.d();
                    k0Var2.E = null;
                    k0Var2.d = 0L;
                }
                if (k0Var2.f41109b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k0Var2.f41111c = f10;
                k0Var2.l();
                k0Var2.i(false);
                if (!k0Var2.f41109b) {
                    k0Var2.f41123l0.setVisibility(8);
                    k0Var2.m0.setVisibility(8);
                    k0Var2.f41117f0.setVisibility(8);
                    k0Var2.f41118g0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                y yVar2 = this.f41053b;
                if (yVar2.getParent() != null) {
                    this.f41054c.removeView(yVar2);
                    yVar2.e();
                    return;
                }
                return;
            default:
                y yVar3 = this.f41053b;
                if (yVar3.getParent() != null) {
                    this.f41054c.removeView(yVar3);
                    yVar3.e();
                    return;
                }
                return;
        }
    }
}
