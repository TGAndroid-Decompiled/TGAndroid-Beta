package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final int f40916a;
    public final y f40917b;
    public final k0 f40918c;

    public i0(k0 k0Var, y yVar, int i7) {
        this.f40916a = i7;
        this.f40918c = k0Var;
        this.f40917b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f40916a) {
            case 0:
                k0 k0Var = this.f40918c;
                k0Var.O0 = null;
                this.f40917b.F = false;
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
                k0 k0Var2 = this.f40918c;
                k0Var2.f41004y.e();
                k0Var2.f40993r = null;
                this.f40917b.f41347r = false;
                if (!k0Var2.f40973b) {
                    k0Var2.d();
                    k0Var2.E = null;
                    k0Var2.d = 0L;
                }
                if (k0Var2.f40973b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k0Var2.f40975c = f10;
                k0Var2.l();
                k0Var2.i(false);
                if (!k0Var2.f40973b) {
                    k0Var2.f40987l0.setVisibility(8);
                    k0Var2.m0.setVisibility(8);
                    k0Var2.f40981f0.setVisibility(8);
                    k0Var2.f40982g0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                y yVar2 = this.f40917b;
                if (yVar2.getParent() != null) {
                    this.f40918c.removeView(yVar2);
                    yVar2.e();
                    return;
                }
                return;
            default:
                y yVar3 = this.f40917b;
                if (yVar3.getParent() != null) {
                    this.f40918c.removeView(yVar3);
                    yVar3.e();
                    return;
                }
                return;
        }
    }
}
