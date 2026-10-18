package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class qb1 extends AnimatorListenerAdapter {
    public final int f40330a;
    public final mc1 f40331b;

    public qb1(mc1 mc1Var, int i10) {
        this.f40330a = i10;
        this.f40331b = mc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40330a) {
            case 0:
                super.onAnimationEnd(animator);
                mc1 mc1Var = this.f40331b;
                mc1Var.f39140x0.invalidate();
                mc1Var.f39137w0[1].setVisibility(8);
                mc1Var.f39088c2 = null;
                return;
            case 1:
                this.f40331b.B0 = null;
                return;
            case 2:
                mc1 mc1Var2 = this.f40331b;
                if (mc1Var2.D0.getTag() == null) {
                    mc1Var2.D0.setVisibility(4);
                }
                mc1Var2.H0 = null;
                return;
            case 3:
                mc1 mc1Var3 = this.f40331b;
                if (mc1Var3.E0.getTag() == null) {
                    mc1Var3.E0.setVisibility(4);
                }
                mc1Var3.I0 = null;
                return;
            case 4:
                mc1 mc1Var4 = this.f40331b;
                nc ncVar = mc1Var4.f39104h2;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) mc1Var4.f39104h2.getParent()).removeView(mc1Var4.f39104h2);
                    }
                    mc1Var4.f39104h2 = null;
                }
                mc1Var4.f39110j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                mc1 mc1Var5 = this.f40331b;
                if (!mc1Var5.f39121p1.a()) {
                    mc1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
