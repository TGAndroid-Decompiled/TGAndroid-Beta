package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ba1 extends AnimatorListenerAdapter {
    public final int f35110a;
    public final da1 f35111b;

    public ba1(da1 da1Var, int i10) {
        this.f35110a = i10;
        this.f35111b = da1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35110a) {
            case 0:
                da1 da1Var = this.f35111b;
                da1Var.f35733b.setVisibility(4);
                ig.g gVar = da1Var.f35733b;
                gVar.J = false;
                ig.g gVar2 = da1Var.f35734c;
                gVar2.J = true;
                gVar.f12153y0 = 0;
                gVar2.f12153y0 = 0;
                Window window = da1Var.f35732a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                da1 da1Var2 = this.f35111b;
                ig.g gVar3 = da1Var2.f35734c;
                gVar3.setVisibility(4);
                ig.g gVar4 = da1Var2.f35733b;
                gVar4.f12153y0 = 0;
                gVar3.f12153y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f12146u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f12126g0.f12169k) - ig.g.f12094k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f12146u0 = false;
                    gVar4.d();
                }
                Window window2 = da1Var2.f35732a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                da1 da1Var3 = this.f35111b;
                da1Var3.f35733b.f12153y0 = 0;
                da1Var3.f35735e.setVisibility(8);
                return;
        }
    }
}
