package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final int f41014a;
    public final y f41015b;
    public final k0 f41016c;

    public i0(k0 k0Var, y yVar, int i7) {
        this.f41014a = i7;
        this.f41016c = k0Var;
        this.f41015b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f41014a) {
            case 0:
                k0 k0Var = this.f41016c;
                k0Var.O0 = null;
                this.f41015b.F = false;
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
                k0 k0Var2 = this.f41016c;
                k0Var2.f41102y.e();
                k0Var2.f41091r = null;
                this.f41015b.f41445r = false;
                if (!k0Var2.f41071b) {
                    k0Var2.d();
                    k0Var2.E = null;
                    k0Var2.d = 0L;
                }
                if (k0Var2.f41071b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k0Var2.f41073c = f10;
                k0Var2.l();
                k0Var2.i(false);
                if (!k0Var2.f41071b) {
                    k0Var2.f41085l0.setVisibility(8);
                    k0Var2.m0.setVisibility(8);
                    k0Var2.f41079f0.setVisibility(8);
                    k0Var2.f41080g0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                y yVar2 = this.f41015b;
                if (yVar2.getParent() != null) {
                    this.f41016c.removeView(yVar2);
                    yVar2.e();
                    return;
                }
                return;
            default:
                y yVar3 = this.f41015b;
                if (yVar3.getParent() != null) {
                    this.f41016c.removeView(yVar3);
                    yVar3.e();
                    return;
                }
                return;
        }
    }
}
