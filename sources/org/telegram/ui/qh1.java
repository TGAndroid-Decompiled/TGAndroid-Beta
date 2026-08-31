package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class qh1 extends AnimatorListenerAdapter {
    public final int f40527a;
    public final ci1 f40528b;

    public qh1(ci1 ci1Var, int i10) {
        this.f40527a = i10;
        this.f40528b = ci1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.p9[] p9VarArr;
        oh.z2 z2Var;
        org.telegram.ui.Components.p9[] p9VarArr2;
        oh.z2 z2Var2;
        switch (this.f40527a) {
            case 0:
                ci1 ci1Var = this.f40528b;
                ci1Var.f35834f1 = null;
                ci1Var.f35826c1 = 1.0f;
                ci1Var.V0 = 0.0f;
                ci1Var.W0 = 0.0f;
                ci1Var.f35852s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.n2.k().f32201a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new xy0(this, 24), 200L);
                return;
            case 2:
                ci1 ci1Var2 = this.f40528b;
                ci1Var2.I0.unlock();
                ci1Var2.V.setCornerRadius(-1.0f);
                ci1Var2.B0 = false;
                ci1Var2.V.V = false;
                ci1Var2.f35846n0 = ci1Var2.m0;
                ci1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.p9 p9Var : this.f40528b.S) {
                    org.telegram.ui.Components.l5 l5Var = p9Var.f30001e;
                    if (l5Var != null && (z2Var = l5Var.f28604k) != null) {
                        z2Var.setAllowStartAnimation(true);
                        p9Var.f30001e.f28604k.startAnimation();
                    }
                }
                return;
            case 4:
                ci1 ci1Var3 = this.f40528b;
                ci1Var3.B();
                for (org.telegram.ui.Components.p9 p9Var2 : ci1Var3.S) {
                    org.telegram.ui.Components.l5 l5Var2 = p9Var2.f30001e;
                    if (l5Var2 != null && (z2Var2 = l5Var2.f28604k) != null) {
                        z2Var2.setAllowStartAnimation(false);
                        p9Var2.f30001e.f28604k.stopAnimation();
                    }
                }
                ci1Var3.O.setVisibility(8);
                return;
            case 5:
                ci1 ci1Var4 = this.f40528b;
                if (ci1Var4.W.getTag() == null) {
                    ci1Var4.W.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ci1 ci1Var5 = this.f40528b;
                ci1Var5.V.setTranslationX(0.0f);
                ci1Var5.V.setTranslationY(0.0f);
                ci1Var5.V.setScaleY(1.0f);
                ci1Var5.V.setScaleX(1.0f);
                ci1Var5.V.setVisibility(8);
                return;
            case 7:
                this.f40528b.f35861y.setVisibility(8);
                return;
            default:
                this.f40528b.f35822b0.setVisibility(8);
                return;
        }
    }
}
