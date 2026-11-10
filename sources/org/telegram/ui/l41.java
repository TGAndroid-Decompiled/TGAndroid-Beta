package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class l41 extends AnimatorListenerAdapter {
    public final int f47513a;
    public final n41 f47514b;

    public l41(n41 n41Var, int i7) {
        this.f47513a = i7;
        this.f47514b = n41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47513a) {
            case 0:
                n41 n41Var = this.f47514b;
                n41Var.f48114b.setVisibility(4);
                lg.g gVar = n41Var.f48114b;
                gVar.J = false;
                lg.g gVar2 = n41Var.f48115c;
                gVar2.J = true;
                gVar.f18333y0 = 0;
                gVar2.f18333y0 = 0;
                Window window = n41Var.f48113a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                n41 n41Var2 = this.f47514b;
                lg.g gVar3 = n41Var2.f48115c;
                gVar3.setVisibility(4);
                lg.g gVar4 = n41Var2.f48114b;
                gVar4.f18333y0 = 0;
                gVar3.f18333y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof lg.q)) {
                    gVar4.f18326u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f18306g0.f18349k) - lg.g.f18275k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f18326u0 = false;
                    gVar4.d();
                }
                Window window2 = n41Var2.f48113a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                n41 n41Var3 = this.f47514b;
                n41Var3.f48114b.f18333y0 = 0;
                n41Var3.f48116e.setVisibility(8);
                return;
        }
    }
}
