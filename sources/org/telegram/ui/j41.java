package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class j41 extends AnimatorListenerAdapter {
    public final int f46837a;
    public final l41 f46838b;

    public j41(l41 l41Var, int i7) {
        this.f46837a = i7;
        this.f46838b = l41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f46837a) {
            case 0:
                l41 l41Var = this.f46838b;
                l41Var.f47410b.setVisibility(4);
                lg.g gVar = l41Var.f47410b;
                gVar.J = false;
                lg.g gVar2 = l41Var.f47411c;
                gVar2.J = true;
                gVar.f18327y0 = 0;
                gVar2.f18327y0 = 0;
                Window window = l41Var.f47409a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                l41 l41Var2 = this.f46838b;
                lg.g gVar3 = l41Var2.f47411c;
                gVar3.setVisibility(4);
                lg.g gVar4 = l41Var2.f47410b;
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
                Window window2 = l41Var2.f47409a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                l41 l41Var3 = this.f46838b;
                l41Var3.f47410b.f18327y0 = 0;
                l41Var3.f47412e.setVisibility(8);
                return;
        }
    }
}
