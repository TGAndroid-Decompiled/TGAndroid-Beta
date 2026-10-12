package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class li1 extends AnimatorListenerAdapter {
    public final int f39770a;
    public final xi1 f39771b;

    public li1(xi1 xi1Var, int i10) {
        this.f39770a = i10;
        this.f39771b = xi1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.y9[] y9VarArr;
        ai.m4 m4Var;
        org.telegram.ui.Components.y9[] y9VarArr2;
        ai.m4 m4Var2;
        switch (this.f39770a) {
            case 0:
                xi1 xi1Var = this.f39771b;
                xi1Var.f44005i1 = null;
                xi1Var.f43999f1 = 1.0f;
                xi1Var.Y0 = 0.0f;
                xi1Var.Z0 = 0.0f;
                xi1Var.f44019s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.n2.k().f31833a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new pz0(this, 24), 200L);
                return;
            case 2:
                xi1 xi1Var2 = this.f39771b;
                xi1Var2.L0.unlock();
                xi1Var2.Y.setCornerRadius(-1.0f);
                xi1Var2.E0 = false;
                xi1Var2.Y.f32038b0 = false;
                xi1Var2.f44016q0 = xi1Var2.f44015p0;
                xi1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.y9 y9Var : this.f39771b.V) {
                    org.telegram.ui.Components.s5 s5Var = y9Var.f32997e;
                    if (s5Var != null && (m4Var = s5Var.f30402k) != null) {
                        m4Var.setAllowStartAnimation(true);
                        y9Var.f32997e.f30402k.startAnimation();
                    }
                }
                return;
            case 4:
                xi1 xi1Var3 = this.f39771b;
                xi1Var3.A();
                for (org.telegram.ui.Components.y9 y9Var2 : xi1Var3.V) {
                    org.telegram.ui.Components.s5 s5Var2 = y9Var2.f32997e;
                    if (s5Var2 != null && (m4Var2 = s5Var2.f30402k) != null) {
                        m4Var2.setAllowStartAnimation(false);
                        y9Var2.f32997e.f30402k.stopAnimation();
                    }
                }
                xi1Var3.R.setVisibility(8);
                return;
            case 5:
                xi1 xi1Var4 = this.f39771b;
                if (xi1Var4.Z.getTag() == null) {
                    xi1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                xi1 xi1Var5 = this.f39771b;
                xi1Var5.Y.setTranslationX(0.0f);
                xi1Var5.Y.setTranslationY(0.0f);
                xi1Var5.Y.setScaleY(1.0f);
                xi1Var5.Y.setScaleX(1.0f);
                xi1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f39771b.f44028y.setVisibility(8);
                return;
            default:
                this.f39771b.f43995e0.setVisibility(8);
                return;
        }
    }
}
