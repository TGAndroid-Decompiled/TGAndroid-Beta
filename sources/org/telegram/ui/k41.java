package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class k41 extends AnimatorListenerAdapter {
    public final int f49151a;
    public final m41 f49152b;

    public k41(m41 m41Var, int i7) {
        this.f49151a = i7;
        this.f49152b = m41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49151a) {
            case 0:
                m41 m41Var = this.f49152b;
                m41Var.f49707b.setVisibility(4);
                lg.g gVar = m41Var.f49707b;
                gVar.K = false;
                lg.g gVar2 = m41Var.f49708c;
                gVar2.K = true;
                gVar.f19828z0 = 0;
                gVar2.f19828z0 = 0;
                Window window = m41Var.f49706a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                m41 m41Var2 = this.f49152b;
                lg.g gVar3 = m41Var2.f49708c;
                gVar3.setVisibility(4);
                lg.g gVar4 = m41Var2.f49707b;
                gVar4.f19828z0 = 0;
                gVar3.f19828z0 = 0;
                gVar4.K = true;
                gVar3.K = false;
                if (!(gVar4 instanceof lg.q)) {
                    gVar4.f19821v0 = true;
                    gVar4.x((gVar4.H0 * gVar4.f19801h0.f19843k) - lg.g.l1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f19821v0 = false;
                    gVar4.d();
                }
                Window window2 = m41Var2.f49706a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                m41 m41Var3 = this.f49152b;
                m41Var3.f49707b.f19828z0 = 0;
                m41Var3.f49709e.setVisibility(8);
                return;
        }
    }
}
