package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class ja1 extends AnimatorListenerAdapter {
    public final int f37741a;
    public final la1 f37742b;

    public ja1(la1 la1Var, int i10) {
        this.f37741a = i10;
        this.f37742b = la1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37741a) {
            case 0:
                la1 la1Var = this.f37742b;
                la1Var.f38252b.setVisibility(4);
                jg.g gVar = la1Var.f38252b;
                gVar.J = false;
                jg.g gVar2 = la1Var.f38253c;
                gVar2.J = true;
                gVar.f13698y0 = 0;
                gVar2.f13698y0 = 0;
                Window window = la1Var.f38251a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                la1 la1Var2 = this.f37742b;
                jg.g gVar3 = la1Var2.f38253c;
                gVar3.setVisibility(4);
                jg.g gVar4 = la1Var2.f38252b;
                gVar4.f13698y0 = 0;
                gVar3.f13698y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof jg.q)) {
                    gVar4.f13691u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f13671g0.f13714k) - jg.g.f13639k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f13691u0 = false;
                    gVar4.d();
                }
                Window window2 = la1Var2.f38251a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                la1 la1Var3 = this.f37742b;
                la1Var3.f38252b.f13698y0 = 0;
                la1Var3.f38254e.setVisibility(8);
                return;
        }
    }
}
