package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ki1 extends AnimatorListenerAdapter {
    public final int f39347a;
    public final wi1 f39348b;

    public ki1(wi1 wi1Var, int i10) {
        this.f39347a = i10;
        this.f39348b = wi1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.y9[] y9VarArr;
        ai.m4 m4Var;
        org.telegram.ui.Components.y9[] y9VarArr2;
        ai.m4 m4Var2;
        switch (this.f39347a) {
            case 0:
                wi1 wi1Var = this.f39348b;
                wi1Var.f43692i1 = null;
                wi1Var.f43686f1 = 1.0f;
                wi1Var.Y0 = 0.0f;
                wi1Var.Z0 = 0.0f;
                wi1Var.f43706s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.m2.k().f32154a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new nz0(this, 24), 200L);
                return;
            case 2:
                wi1 wi1Var2 = this.f39348b;
                wi1Var2.L0.unlock();
                wi1Var2.Y.setCornerRadius(-1.0f);
                wi1Var2.E0 = false;
                wi1Var2.Y.f32358b0 = false;
                wi1Var2.f43703q0 = wi1Var2.f43702p0;
                wi1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.y9 y9Var : this.f39348b.V) {
                    org.telegram.ui.Components.s5 s5Var = y9Var.f33138e;
                    if (s5Var != null && (m4Var = s5Var.f30680k) != null) {
                        m4Var.setAllowStartAnimation(true);
                        y9Var.f33138e.f30680k.startAnimation();
                    }
                }
                return;
            case 4:
                wi1 wi1Var3 = this.f39348b;
                wi1Var3.A();
                for (org.telegram.ui.Components.y9 y9Var2 : wi1Var3.V) {
                    org.telegram.ui.Components.s5 s5Var2 = y9Var2.f33138e;
                    if (s5Var2 != null && (m4Var2 = s5Var2.f30680k) != null) {
                        m4Var2.setAllowStartAnimation(false);
                        y9Var2.f33138e.f30680k.stopAnimation();
                    }
                }
                wi1Var3.R.setVisibility(8);
                return;
            case 5:
                wi1 wi1Var4 = this.f39348b;
                if (wi1Var4.Z.getTag() == null) {
                    wi1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                wi1 wi1Var5 = this.f39348b;
                wi1Var5.Y.setTranslationX(0.0f);
                wi1Var5.Y.setTranslationY(0.0f);
                wi1Var5.Y.setScaleY(1.0f);
                wi1Var5.Y.setScaleX(1.0f);
                wi1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f39348b.f43715y.setVisibility(8);
                return;
            default:
                this.f39348b.f43682e0.setVisibility(8);
                return;
        }
    }
}
