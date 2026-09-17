package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ja1 extends AnimatorListenerAdapter {
    public final int f37769a;
    public final la1 f37770b;

    public ja1(la1 la1Var, int i10) {
        this.f37769a = i10;
        this.f37770b = la1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37769a) {
            case 0:
                la1 la1Var = this.f37770b;
                la1Var.f38280b.setVisibility(4);
                jg.g gVar = la1Var.f38280b;
                gVar.J = false;
                jg.g gVar2 = la1Var.f38281c;
                gVar2.J = true;
                gVar.f13724y0 = 0;
                gVar2.f13724y0 = 0;
                Window window = la1Var.f38279a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                la1 la1Var2 = this.f37770b;
                jg.g gVar3 = la1Var2.f38281c;
                gVar3.setVisibility(4);
                jg.g gVar4 = la1Var2.f38280b;
                gVar4.f13724y0 = 0;
                gVar3.f13724y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof jg.q)) {
                    gVar4.f13717u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f13697g0.f13740k) - jg.g.f13665k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f13717u0 = false;
                    gVar4.d();
                }
                Window window2 = la1Var2.f38279a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                la1 la1Var3 = this.f37770b;
                la1Var3.f38280b.f13724y0 = 0;
                la1Var3.f38282e.setVisibility(8);
                return;
        }
    }
}
