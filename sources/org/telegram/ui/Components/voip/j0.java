package org.telegram.ui.Components.voip;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class j0 extends AnimatorListenerAdapter {
    public final int f40947a;
    public final z f40948b;
    public final l0 f40949c;

    public j0(l0 l0Var, z zVar, int i7) {
        this.f40947a = i7;
        this.f40949c = l0Var;
        this.f40948b = zVar;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        float f10;
        switch (this.f40947a) {
            case 0:
                l0 l0Var = this.f40949c;
                l0Var.O0 = null;
                this.f40948b.F = false;
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
                l0 l0Var2 = this.f40949c;
                l0Var2.f41034y.e();
                l0Var2.f41023r = null;
                this.f40948b.f41379r = false;
                if (!l0Var2.f41003b) {
                    l0Var2.d();
                    l0Var2.E = null;
                    l0Var2.d = 0L;
                }
                if (l0Var2.f41003b) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                l0Var2.f41005c = f10;
                l0Var2.l();
                l0Var2.i(false);
                if (!l0Var2.f41003b) {
                    l0Var2.f41017l0.setVisibility(8);
                    l0Var2.m0.setVisibility(8);
                    l0Var2.f41011f0.setVisibility(8);
                    l0Var2.f41012g0.setVisibility(8);
                    return;
                }
                return;
            case 2:
                z zVar2 = this.f40948b;
                if (zVar2.getParent() != null) {
                    this.f40949c.removeView(zVar2);
                    zVar2.e();
                    return;
                }
                return;
            default:
                z zVar3 = this.f40948b;
                if (zVar3.getParent() != null) {
                    this.f40949c.removeView(zVar3);
                    zVar3.e();
                    return;
                }
                return;
        }
    }
}
