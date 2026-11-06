package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class i0 extends AnimatorListenerAdapter {
    public final int f39199a;
    public final y f39200b;
    public final k0 f39201c;

    public i0(k0 k0Var, y yVar, int i7) {
        this.f39199a = i7;
        this.f39201c = k0Var;
        this.f39200b = yVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f39199a) {
            case 0:
                k0 k0Var = this.f39201c;
                k0Var.N0 = null;
                this.f39200b.E = false;
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
                k0 k0Var2 = this.f39201c;
                k0Var2.f39271y.e();
                k0Var2.f39260r = null;
                this.f39200b.f39594r = false;
                if (!k0Var2.f39240b) {
                    k0Var2.d();
                    k0Var2.D = null;
                    k0Var2.d = 0L;
                }
                if (k0Var2.f39240b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                k0Var2.f39242c = f10;
                k0Var2.l();
                k0Var2.i(false);
                if (!k0Var2.f39240b) {
                    k0Var2.f39253k0.setVisibility(8);
                    k0Var2.f39254l0.setVisibility(8);
                    k0Var2.f39246e0.setVisibility(8);
                    k0Var2.f39248f0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                y yVar2 = this.f39200b;
                if (yVar2.getParent() != null) {
                    this.f39201c.removeView(yVar2);
                    yVar2.e();
                    return;
                }
                return;
            default:
                y yVar3 = this.f39200b;
                if (yVar3.getParent() != null) {
                    this.f39201c.removeView(yVar3);
                    yVar3.e();
                    return;
                }
                return;
        }
    }
}
