package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final int f39196a;
    public final y f39197b;
    public final k0 f39198c;

    public i0(k0 k0Var, y yVar, int i7) {
        this.f39196a = i7;
        this.f39198c = k0Var;
        this.f39197b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f39196a) {
            case 0:
                k0 k0Var = this.f39198c;
                k0Var.N0 = null;
                this.f39197b.E = false;
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
                k0 k0Var2 = this.f39198c;
                k0Var2.f39268y.e();
                k0Var2.f39257r = null;
                this.f39197b.f39591r = false;
                if (!k0Var2.f39237b) {
                    k0Var2.d();
                    k0Var2.D = null;
                    k0Var2.d = 0L;
                }
                if (k0Var2.f39237b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k0Var2.f39239c = f10;
                k0Var2.l();
                k0Var2.i(false);
                if (!k0Var2.f39237b) {
                    k0Var2.f39250k0.setVisibility(8);
                    k0Var2.f39251l0.setVisibility(8);
                    k0Var2.f39243e0.setVisibility(8);
                    k0Var2.f39245f0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                y yVar2 = this.f39197b;
                if (yVar2.getParent() != null) {
                    this.f39198c.removeView(yVar2);
                    yVar2.e();
                    return;
                }
                return;
            default:
                y yVar3 = this.f39197b;
                if (yVar3.getParent() != null) {
                    this.f39198c.removeView(yVar3);
                    yVar3.e();
                    return;
                }
                return;
        }
    }
}
