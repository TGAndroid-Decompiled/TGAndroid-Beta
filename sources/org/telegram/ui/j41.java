package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class j41 extends AnimatorListenerAdapter {
    public final int f46813a;
    public final l41 f46814b;

    public j41(l41 l41Var, int i7) {
        this.f46813a = i7;
        this.f46814b = l41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46813a) {
            case 0:
                l41 l41Var = this.f46814b;
                l41Var.f47383b.setVisibility(4);
                lg.g gVar = l41Var.f47383b;
                gVar.J = false;
                lg.g gVar2 = l41Var.f47384c;
                gVar2.J = true;
                gVar.f18327y0 = 0;
                gVar2.f18327y0 = 0;
                Window window = l41Var.f47382a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                l41 l41Var2 = this.f46814b;
                lg.g gVar3 = l41Var2.f47384c;
                gVar3.setVisibility(4);
                lg.g gVar4 = l41Var2.f47383b;
                gVar4.f18327y0 = 0;
                gVar3.f18327y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof lg.q)) {
                    gVar4.f18320u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f18300g0.f18343k) - lg.g.f18269k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f18320u0 = false;
                    gVar4.d();
                }
                Window window2 = l41Var2.f47382a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                l41 l41Var3 = this.f46814b;
                l41Var3.f47383b.f18327y0 = 0;
                l41Var3.f47385e.setVisibility(8);
                return;
        }
    }
}
