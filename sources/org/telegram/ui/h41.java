package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class h41 extends AnimatorListenerAdapter {
    public final int f47608a;
    public final j41 f47609b;

    public h41(j41 j41Var, int i7) {
        this.f47608a = i7;
        this.f47609b = j41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47608a) {
            case 0:
                j41 j41Var = this.f47609b;
                j41Var.f48216b.setVisibility(4);
                lg.g gVar = j41Var.f48216b;
                gVar.K = false;
                lg.g gVar2 = j41Var.f48217c;
                gVar2.K = true;
                gVar.f19464z0 = 0;
                gVar2.f19464z0 = 0;
                Window window = j41Var.f48215a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                j41 j41Var2 = this.f47609b;
                lg.g gVar3 = j41Var2.f48217c;
                gVar3.setVisibility(4);
                lg.g gVar4 = j41Var2.f48216b;
                gVar4.f19464z0 = 0;
                gVar3.f19464z0 = 0;
                gVar4.K = true;
                gVar3.K = false;
                if (!(gVar4 instanceof lg.q)) {
                    gVar4.f19457v0 = true;
                    gVar4.x((gVar4.H0 * gVar4.f19437h0.f19479k) - lg.g.l1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f19457v0 = false;
                    gVar4.d();
                }
                Window window2 = j41Var2.f48215a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                j41 j41Var3 = this.f47609b;
                j41Var3.f48216b.f19464z0 = 0;
                j41Var3.f48218e.setVisibility(8);
                return;
        }
    }
}
