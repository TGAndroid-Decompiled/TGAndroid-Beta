package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class aa1 extends AnimatorListenerAdapter {
    public final int f32164a;
    public final ca1 f32165b;

    public aa1(ca1 ca1Var, int i10) {
        this.f32164a = i10;
        this.f32165b = ca1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32164a) {
            case 0:
                ca1 ca1Var = this.f32165b;
                ca1Var.f32701b.setVisibility(4);
                ig.g gVar = ca1Var.f32701b;
                gVar.J = false;
                ig.g gVar2 = ca1Var.f32702c;
                gVar2.J = true;
                gVar.f11174y0 = 0;
                gVar2.f11174y0 = 0;
                Window window = ca1Var.f32700a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ca1 ca1Var2 = this.f32165b;
                ig.g gVar3 = ca1Var2.f32702c;
                gVar3.setVisibility(4);
                ig.g gVar4 = ca1Var2.f32701b;
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
                Window window2 = ca1Var2.f32700a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ca1 ca1Var3 = this.f32165b;
                ca1Var3.f32701b.f11174y0 = 0;
                ca1Var3.e.setVisibility(8);
                return;
        }
    }
}
