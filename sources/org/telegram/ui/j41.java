package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class j41 extends AnimatorListenerAdapter {
    public final int f48985a;
    public final l41 f48986b;

    public j41(l41 l41Var, int i7) {
        this.f48985a = i7;
        this.f48986b = l41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f48985a) {
            case 0:
                l41 l41Var = this.f48986b;
                l41Var.f49585b.setVisibility(4);
                lg.g gVar = l41Var.f49585b;
                gVar.K = false;
                lg.g gVar2 = l41Var.f49586c;
                gVar2.K = true;
                gVar.f19925z0 = 0;
                gVar2.f19925z0 = 0;
                Window window = l41Var.f49584a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                l41 l41Var2 = this.f48986b;
                lg.g gVar3 = l41Var2.f49586c;
                gVar3.setVisibility(4);
                lg.g gVar4 = l41Var2.f49585b;
                gVar4.f19925z0 = 0;
                gVar3.f19925z0 = 0;
                gVar4.K = true;
                gVar3.K = false;
                if (!(gVar4 instanceof lg.q)) {
                    gVar4.f19918v0 = true;
                    gVar4.x((gVar4.H0 * gVar4.f19898h0.f19940k) - lg.g.l1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f19918v0 = false;
                    gVar4.d();
                }
                Window window2 = l41Var2.f49584a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                l41 l41Var3 = this.f48986b;
                l41Var3.f49585b.f19925z0 = 0;
                l41Var3.f49587e.setVisibility(8);
                return;
        }
    }
}
