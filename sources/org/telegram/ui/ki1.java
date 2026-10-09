package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ki1 extends AnimatorListenerAdapter {
    public final int f39301a;
    public final wi1 f39302b;

    public ki1(wi1 wi1Var, int i10) {
        this.f39301a = i10;
        this.f39302b = wi1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.y9[] y9VarArr;
        ai.m4 m4Var;
        org.telegram.ui.Components.y9[] y9VarArr2;
        ai.m4 m4Var2;
        switch (this.f39301a) {
            case 0:
                wi1 wi1Var = this.f39302b;
                wi1Var.f43646i1 = null;
                wi1Var.f43640f1 = 1.0f;
                wi1Var.Y0 = 0.0f;
                wi1Var.Z0 = 0.0f;
                wi1Var.f43660s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.m2.k().f32089a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new nz0(this, 24), 200L);
                return;
            case 2:
                wi1 wi1Var2 = this.f39302b;
                wi1Var2.L0.unlock();
                wi1Var2.Y.setCornerRadius(-1.0f);
                wi1Var2.E0 = false;
                wi1Var2.Y.f32293b0 = false;
                wi1Var2.f43657q0 = wi1Var2.f43656p0;
                wi1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.y9 y9Var : this.f39302b.V) {
                    org.telegram.ui.Components.s5 s5Var = y9Var.f33159e;
                    if (s5Var != null && (m4Var = s5Var.f30654k) != null) {
                        m4Var.setAllowStartAnimation(true);
                        y9Var.f33159e.f30654k.startAnimation();
                    }
                }
                return;
            case 4:
                wi1 wi1Var3 = this.f39302b;
                wi1Var3.A();
                for (org.telegram.ui.Components.y9 y9Var2 : wi1Var3.V) {
                    org.telegram.ui.Components.s5 s5Var2 = y9Var2.f33159e;
                    if (s5Var2 != null && (m4Var2 = s5Var2.f30654k) != null) {
                        m4Var2.setAllowStartAnimation(false);
                        y9Var2.f33159e.f30654k.stopAnimation();
                    }
                }
                wi1Var3.R.setVisibility(8);
                return;
            case 5:
                wi1 wi1Var4 = this.f39302b;
                if (wi1Var4.Z.getTag() == null) {
                    wi1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                wi1 wi1Var5 = this.f39302b;
                wi1Var5.Y.setTranslationX(0.0f);
                wi1Var5.Y.setTranslationY(0.0f);
                wi1Var5.Y.setScaleY(1.0f);
                wi1Var5.Y.setScaleX(1.0f);
                wi1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f39302b.f43669y.setVisibility(8);
                return;
            default:
                this.f39302b.f43636e0.setVisibility(8);
                return;
        }
    }
}
