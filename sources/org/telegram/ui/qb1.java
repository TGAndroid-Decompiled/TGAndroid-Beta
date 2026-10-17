package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class qb1 extends AnimatorListenerAdapter {
    public final int f40366a;
    public final mc1 f40367b;

    public qb1(mc1 mc1Var, int i10) {
        this.f40366a = i10;
        this.f40367b = mc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40366a) {
            case 0:
                super.onAnimationEnd(animator);
                mc1 mc1Var = this.f40367b;
                mc1Var.f39159x0.invalidate();
                mc1Var.f39156w0[1].setVisibility(8);
                mc1Var.f39107c2 = null;
                return;
            case 1:
                this.f40367b.B0 = null;
                return;
            case 2:
                mc1 mc1Var2 = this.f40367b;
                if (mc1Var2.D0.getTag() == null) {
                    mc1Var2.D0.setVisibility(4);
                }
                mc1Var2.H0 = null;
                return;
            case 3:
                mc1 mc1Var3 = this.f40367b;
                if (mc1Var3.E0.getTag() == null) {
                    mc1Var3.E0.setVisibility(4);
                }
                mc1Var3.I0 = null;
                return;
            case 4:
                mc1 mc1Var4 = this.f40367b;
                nc ncVar = mc1Var4.f39123h2;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) mc1Var4.f39123h2.getParent()).removeView(mc1Var4.f39123h2);
                    }
                    mc1Var4.f39123h2 = null;
                }
                mc1Var4.f39129j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                mc1 mc1Var5 = this.f40367b;
                if (!mc1Var5.f39140p1.a()) {
                    mc1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
