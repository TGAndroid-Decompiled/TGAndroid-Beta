package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class nc1 extends AnimatorListenerAdapter {
    public final int f39295a;
    public final jd1 f39296b;

    public nc1(jd1 jd1Var, int i10) {
        this.f39295a = i10;
        this.f39296b = jd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39295a) {
            case 0:
                super.onAnimationEnd(animator);
                jd1 jd1Var = this.f39296b;
                jd1Var.f38013u0.invalidate();
                jd1Var.f38011t0[1].setVisibility(8);
                jd1Var.Z1 = null;
                return;
            case 1:
                this.f39296b.f38024y0 = null;
                return;
            case 2:
                jd1 jd1Var2 = this.f39296b;
                if (jd1Var2.A0.getTag() == null) {
                    jd1Var2.A0.setVisibility(4);
                }
                jd1Var2.E0 = null;
                return;
            case 3:
                jd1 jd1Var3 = this.f39296b;
                if (jd1Var3.B0.getTag() == null) {
                    jd1Var3.B0.setVisibility(4);
                }
                jd1Var3.F0 = null;
                return;
            case 4:
                jd1 jd1Var4 = this.f39296b;
                jc jcVar = jd1Var4.f37978e2;
                if (jcVar != null) {
                    if (jcVar.getParent() != null) {
                        ((ViewGroup) jd1Var4.f37978e2.getParent()).removeView(jd1Var4.f37978e2);
                    }
                    jd1Var4.f37978e2 = null;
                }
                jd1Var4.f37985g2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                jd1 jd1Var5 = this.f39296b;
                if (!jd1Var5.f37995m1.a()) {
                    jd1Var5.O1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
