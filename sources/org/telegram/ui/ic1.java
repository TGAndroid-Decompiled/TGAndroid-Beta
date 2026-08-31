package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ic1 extends AnimatorListenerAdapter {
    public final int f37798a;
    public final ed1 f37799b;

    public ic1(ed1 ed1Var, int i10) {
        this.f37798a = i10;
        this.f37799b = ed1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37798a) {
            case 0:
                super.onAnimationEnd(animator);
                ed1 ed1Var = this.f37799b;
                ed1Var.f36538u0.invalidate();
                ed1Var.f36536t0[1].setVisibility(8);
                ed1Var.Z1 = null;
                return;
            case 1:
                this.f37799b.f36549y0 = null;
                return;
            case 2:
                ed1 ed1Var2 = this.f37799b;
                if (ed1Var2.A0.getTag() == null) {
                    ed1Var2.A0.setVisibility(4);
                }
                ed1Var2.E0 = null;
                return;
            case 3:
                ed1 ed1Var3 = this.f37799b;
                if (ed1Var3.B0.getTag() == null) {
                    ed1Var3.B0.setVisibility(4);
                }
                ed1Var3.F0 = null;
                return;
            case 4:
                ed1 ed1Var4 = this.f37799b;
                kc kcVar = ed1Var4.f36503e2;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) ed1Var4.f36503e2.getParent()).removeView(ed1Var4.f36503e2);
                    }
                    ed1Var4.f36503e2 = null;
                }
                ed1Var4.f36510g2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                ed1 ed1Var5 = this.f37799b;
                if (!ed1Var5.f36520m1.a()) {
                    ed1Var5.O1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
