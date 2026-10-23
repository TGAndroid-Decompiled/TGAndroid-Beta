package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class c91 extends AnimatorListenerAdapter {
    public final int f36309a;
    public final e91 f36310b;

    public c91(e91 e91Var, int i10) {
        this.f36309a = i10;
        this.f36310b = e91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f36309a) {
            case 0:
                e91 e91Var = this.f36310b;
                e91Var.f36879b.setVisibility(4);
                jg.g gVar = e91Var.f36879b;
                gVar.J = false;
                jg.g gVar2 = e91Var.f36880c;
                gVar2.J = true;
                gVar.f14533y0 = 0;
                gVar2.f14533y0 = 0;
                Window window = e91Var.f36878a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                e91 e91Var2 = this.f36310b;
                jg.g gVar3 = e91Var2.f36880c;
                gVar3.setVisibility(4);
                jg.g gVar4 = e91Var2.f36879b;
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
                Window window2 = e91Var2.f36878a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                e91 e91Var3 = this.f36310b;
                e91Var3.f36879b.f14533y0 = 0;
                e91Var3.e.setVisibility(8);
                return;
        }
    }
}
