package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class k41 extends AnimatorListenerAdapter {
    public final int f49152a;
    public final m41 f49153b;

    public k41(m41 m41Var, int i7) {
        this.f49152a = i7;
        this.f49153b = m41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49152a) {
            case 0:
                m41 m41Var = this.f49153b;
                m41Var.f49728b.setVisibility(4);
                lg.g gVar = m41Var.f49728b;
                gVar.K = false;
                lg.g gVar2 = m41Var.f49729c;
                gVar2.K = true;
                gVar.f19825z0 = 0;
                gVar2.f19825z0 = 0;
                Window window = m41Var.f49727a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                m41 m41Var2 = this.f49153b;
                lg.g gVar3 = m41Var2.f49729c;
                gVar3.setVisibility(4);
                lg.g gVar4 = m41Var2.f49728b;
                gVar4.f19825z0 = 0;
                gVar3.f19825z0 = 0;
                gVar4.K = true;
                gVar3.K = false;
                if (!(gVar4 instanceof lg.q)) {
                    gVar4.f19818v0 = true;
                    gVar4.x((gVar4.H0 * gVar4.f19798h0.f19840k) - lg.g.l1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f19818v0 = false;
                    gVar4.d();
                }
                Window window2 = m41Var2.f49727a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                m41 m41Var3 = this.f49153b;
                m41Var3.f49728b.f19825z0 = 0;
                m41Var3.f49730e.setVisibility(8);
                return;
        }
    }
}
