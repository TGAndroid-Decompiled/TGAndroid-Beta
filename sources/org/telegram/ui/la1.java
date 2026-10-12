package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class la1 extends AnimatorListenerAdapter {
    public final int f39679a;
    public final na1 f39680b;

    public la1(na1 na1Var, int i10) {
        this.f39679a = i10;
        this.f39680b = na1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39679a) {
            case 0:
                na1 na1Var = this.f39680b;
                na1Var.f40340b.setVisibility(4);
                ig.g gVar = na1Var.f40340b;
                gVar.J = false;
                ig.g gVar2 = na1Var.f40341c;
                gVar2.J = true;
                gVar.f12198y0 = 0;
                gVar2.f12198y0 = 0;
                Window window = na1Var.f40339a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                na1 na1Var2 = this.f39680b;
                ig.g gVar3 = na1Var2.f40341c;
                gVar3.setVisibility(4);
                ig.g gVar4 = na1Var2.f40340b;
                gVar4.f12198y0 = 0;
                gVar3.f12198y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f12191u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f12171g0.f12214k) - ig.g.f12139k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f12191u0 = false;
                    gVar4.d();
                }
                Window window2 = na1Var2.f40339a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                na1 na1Var3 = this.f39680b;
                na1Var3.f40340b.f12198y0 = 0;
                na1Var3.f40342e.setVisibility(8);
                return;
        }
    }
}
