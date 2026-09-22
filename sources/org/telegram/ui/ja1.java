package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ja1 extends AnimatorListenerAdapter {
    public final int f34908a;
    public final la1 f34909b;

    public ja1(la1 la1Var, int i10) {
        this.f34908a = i10;
        this.f34909b = la1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34908a) {
            case 0:
                la1 la1Var = this.f34909b;
                la1Var.f35408b.setVisibility(4);
                ig.g gVar = la1Var.f35408b;
                gVar.J = false;
                ig.g gVar2 = la1Var.f35409c;
                gVar2.J = true;
                gVar.f11174y0 = 0;
                gVar2.f11174y0 = 0;
                Window window = la1Var.f35407a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                la1 la1Var2 = this.f34909b;
                ig.g gVar3 = la1Var2.f35409c;
                gVar3.setVisibility(4);
                ig.g gVar4 = la1Var2.f35408b;
                gVar4.f11174y0 = 0;
                gVar3.f11174y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof ig.q)) {
                    gVar4.f11167u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f11147g0.f11188k) - ig.g.f11116k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f11167u0 = false;
                    gVar4.d();
                }
                Window window2 = la1Var2.f35407a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                la1 la1Var3 = this.f34909b;
                la1Var3.f35408b.f11174y0 = 0;
                la1Var3.e.setVisibility(8);
                return;
        }
    }
}
