package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class na1 extends AnimatorListenerAdapter {
    public final int f35196a;
    public final pa1 f35197b;

    public na1(pa1 pa1Var, int i10) {
        this.f35196a = i10;
        this.f35197b = pa1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35196a) {
            case 0:
                pa1 pa1Var = this.f35197b;
                pa1Var.f35753b.setVisibility(4);
                hg.g gVar = pa1Var.f35753b;
                gVar.J = false;
                hg.g gVar2 = pa1Var.f35754c;
                gVar2.J = true;
                gVar.f9390y0 = 0;
                gVar2.f9390y0 = 0;
                Window window = pa1Var.f35752a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                pa1 pa1Var2 = this.f35197b;
                hg.g gVar3 = pa1Var2.f35754c;
                gVar3.setVisibility(4);
                hg.g gVar4 = pa1Var2.f35753b;
                gVar4.f9390y0 = 0;
                gVar3.f9390y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof hg.q)) {
                    gVar4.f9383u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f9363g0.f9404k) - hg.g.f9332k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f9383u0 = false;
                    gVar4.d();
                }
                Window window2 = pa1Var2.f35752a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                pa1 pa1Var3 = this.f35197b;
                pa1Var3.f35753b.f9390y0 = 0;
                pa1Var3.e.setVisibility(8);
                return;
        }
    }
}
