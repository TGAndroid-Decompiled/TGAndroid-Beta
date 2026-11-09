package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.Window;
public final class k41 extends AnimatorListenerAdapter {
    public final int f47193a;
    public final m41 f47194b;

    public k41(m41 m41Var, int i7) {
        this.f47193a = i7;
        this.f47194b = m41Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f47193a) {
            case 0:
                m41 m41Var = this.f47194b;
                m41Var.f47744b.setVisibility(4);
                lg.g gVar = m41Var.f47744b;
                gVar.J = false;
                lg.g gVar2 = m41Var.f47745c;
                gVar2.J = true;
                gVar.f18330y0 = 0;
                gVar2.f18330y0 = 0;
                Window window = m41Var.f47743a;
                if (window != null) {
                    window.clearFlags(16);
                    return;
                }
                return;
            case 1:
                m41 m41Var2 = this.f47194b;
                lg.g gVar3 = m41Var2.f47745c;
                gVar3.setVisibility(4);
                lg.g gVar4 = m41Var2.f47744b;
                gVar4.f18330y0 = 0;
                gVar3.f18330y0 = 0;
                gVar4.J = true;
                gVar3.J = false;
                if (!(gVar4 instanceof lg.q)) {
                    gVar4.f18323u0 = true;
                    gVar4.x((gVar4.G0 * gVar4.f18303g0.f18346k) - lg.g.f18272k1);
                    gVar4.c(true);
                    gVar4.invalidate();
                } else {
                    gVar4.f18323u0 = false;
                    gVar4.d();
                }
                Window window2 = m41Var2.f47743a;
                if (window2 != null) {
                    window2.clearFlags(16);
                    return;
                }
                return;
            default:
                m41 m41Var3 = this.f47194b;
                m41Var3.f47744b.f18330y0 = 0;
                m41Var3.f47746e.setVisibility(8);
                return;
        }
    }
}
