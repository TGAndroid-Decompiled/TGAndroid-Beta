package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final int f41051a;
    public final y f41052b;
    public final k0 f41053c;

    public i0(k0 k0Var, y yVar, int i7) {
        this.f41051a = i7;
        this.f41053c = k0Var;
        this.f41052b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f41051a) {
            case 0:
                k0 k0Var = this.f41053c;
                k0Var.O0 = null;
                this.f41052b.F = false;
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
                k0 k0Var2 = this.f41053c;
                k0Var2.f41139y.e();
                k0Var2.f41128r = null;
                this.f41052b.f41482r = false;
                if (!k0Var2.f41108b) {
                    k0Var2.d();
                    k0Var2.E = null;
                    k0Var2.d = 0L;
                }
                if (k0Var2.f41108b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k0Var2.f41110c = f10;
                k0Var2.l();
                k0Var2.i(false);
                if (!k0Var2.f41108b) {
                    k0Var2.f41122l0.setVisibility(8);
                    k0Var2.m0.setVisibility(8);
                    k0Var2.f41116f0.setVisibility(8);
                    k0Var2.f41117g0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                y yVar2 = this.f41052b;
                if (yVar2.getParent() != null) {
                    this.f41053c.removeView(yVar2);
                    yVar2.e();
                    return;
                }
                return;
            default:
                y yVar3 = this.f41052b;
                if (yVar3.getParent() != null) {
                    this.f41053c.removeView(yVar3);
                    yVar3.e();
                    return;
                }
                return;
        }
    }
}
