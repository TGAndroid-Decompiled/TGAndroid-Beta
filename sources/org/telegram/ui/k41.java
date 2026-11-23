package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class k41 extends AnimatorListenerAdapter {
    public final int f49198a;
    public final m41 f49199b;

    public k41(m41 m41Var, int i7) {
        this.f49198a = i7;
        this.f49199b = m41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f49198a) {
            case 0:
                m41 m41Var = this.f49199b;
                m41Var.f49759b.setVisibility(4);
                lg.g gVar = m41Var.f49759b;
                gVar.K = false;
                lg.g gVar2 = m41Var.f49760c;
                gVar2.K = true;
                gVar.f19859z0 = 0;
                gVar2.f19859z0 = 0;
                Window window = m41Var.f49758a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                m41 m41Var2 = this.f49199b;
                lg.g gVar3 = m41Var2.f49760c;
                gVar3.setVisibility(4);
                lg.g gVar4 = m41Var2.f49759b;
                gVar4.f19859z0 = 0;
                gVar3.f19859z0 = 0;
                gVar4.K = true;
                gVar3.K = false;
                if (!(gVar4 instanceof lg.q)) {
                    gVar4.f19852v0 = true;
                    gVar4.x((gVar4.H0 * gVar4.f19832h0.f19874k) - lg.g.l1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f19852v0 = false;
                    gVar4.d();
                }
                Window window2 = m41Var2.f49758a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                m41 m41Var3 = this.f49199b;
                m41Var3.f49759b.f19859z0 = 0;
                m41Var3.f49761e.setVisibility(8);
                return;
        }
    }
}
