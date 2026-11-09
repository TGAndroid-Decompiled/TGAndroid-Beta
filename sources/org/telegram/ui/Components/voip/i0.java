package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final int f39341a;
    public final y f39342b;
    public final k0 f39343c;

    public i0(k0 k0Var, y yVar, int i7) {
        this.f39341a = i7;
        this.f39343c = k0Var;
        this.f39342b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f39341a) {
            case 0:
                k0 k0Var = this.f39343c;
                k0Var.N0 = null;
                this.f39342b.E = false;
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
                k0 k0Var2 = this.f39343c;
                k0Var2.f39413y.e();
                k0Var2.f39402r = null;
                this.f39342b.f39736r = false;
                if (!k0Var2.f39382b) {
                    k0Var2.d();
                    k0Var2.D = null;
                    k0Var2.d = 0L;
                }
                if (k0Var2.f39382b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k0Var2.f39384c = f10;
                k0Var2.l();
                k0Var2.i(false);
                if (!k0Var2.f39382b) {
                    k0Var2.f39395k0.setVisibility(8);
                    k0Var2.f39396l0.setVisibility(8);
                    k0Var2.f39388e0.setVisibility(8);
                    k0Var2.f39390f0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                y yVar2 = this.f39342b;
                if (yVar2.getParent() != null) {
                    this.f39343c.removeView(yVar2);
                    yVar2.e();
                    return;
                }
                return;
            default:
                y yVar3 = this.f39342b;
                if (yVar3.getParent() != null) {
                    this.f39343c.removeView(yVar3);
                    yVar3.e();
                    return;
                }
                return;
        }
    }
}
