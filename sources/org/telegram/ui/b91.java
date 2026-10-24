package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class b91 extends AnimatorListenerAdapter {
    public final int f35973a;
    public final d91 f35974b;

    public b91(d91 d91Var, int i10) {
        this.f35973a = i10;
        this.f35974b = d91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35973a) {
            case 0:
                d91 d91Var = this.f35974b;
                d91Var.f36540b.setVisibility(4);
                jg.g gVar = d91Var.f36540b;
                gVar.J = false;
                jg.g gVar2 = d91Var.f36541c;
                gVar2.J = true;
                gVar.f14533y0 = 0;
                gVar2.f14533y0 = 0;
                Window window = d91Var.f36539a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                d91 d91Var2 = this.f35974b;
                jg.g gVar3 = d91Var2.f36541c;
                gVar3.setVisibility(4);
                jg.g gVar4 = d91Var2.f36540b;
                gVar4.f14533y0 = 0;
                gVar3.f14533y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof jg.q)) {
                    gVar4.f14526u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f14506g0.f14547k) - jg.g.f14475k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f14526u0 = false;
                    gVar4.d();
                }
                Window window2 = d91Var2.f36539a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                d91 d91Var3 = this.f35974b;
                d91Var3.f36540b.f14533y0 = 0;
                d91Var3.e.setVisibility(8);
                return;
        }
    }
}
