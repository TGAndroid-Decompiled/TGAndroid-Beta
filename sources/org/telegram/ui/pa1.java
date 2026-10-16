package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class pa1 extends AnimatorListenerAdapter {
    public final int f38866a;
    public final ra1 f38867b;

    public pa1(ra1 ra1Var, int i10) {
        this.f38866a = i10;
        this.f38867b = ra1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38866a) {
            case 0:
                ra1 ra1Var = this.f38867b;
                ra1Var.f39438b.setVisibility(4);
                jg.g gVar = ra1Var.f39438b;
                gVar.J = false;
                jg.g gVar2 = ra1Var.f39439c;
                gVar2.J = true;
                gVar.f13076y0 = 0;
                gVar2.f13076y0 = 0;
                Window window = ra1Var.f39437a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                ra1 ra1Var2 = this.f38867b;
                jg.g gVar3 = ra1Var2.f39439c;
                gVar3.setVisibility(4);
                jg.g gVar4 = ra1Var2.f39438b;
                gVar4.f13076y0 = 0;
                gVar3.f13076y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof jg.q)) {
                    gVar4.f13069u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f13049g0.f13090k) - jg.g.f13018k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f13069u0 = false;
                    gVar4.d();
                }
                Window window2 = ra1Var2.f39437a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                ra1 ra1Var3 = this.f38867b;
                ra1Var3.f39438b.f13076y0 = 0;
                ra1Var3.e.setVisibility(8);
                return;
        }
    }
}
