package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class fh1 extends AnimatorListenerAdapter {
    public final int f39383a;
    public final rh1 f39384b;

    public fh1(rh1 rh1Var, int i10) {
        this.f39383a = i10;
        this.f39384b = rh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.y9[] y9VarArr;
        di.f3 f3Var;
        org.telegram.ui.Components.y9[] y9VarArr2;
        di.f3 f3Var2;
        switch (this.f39383a) {
            case 0:
                rh1 rh1Var = this.f39384b;
                rh1Var.f43021i1 = null;
                rh1Var.f43015f1 = 1.0f;
                rh1Var.Y0 = 0.0f;
                rh1Var.Z0 = 0.0f;
                rh1Var.f43035s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.n2.k().f34061a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new oy0(this, 27), 200L);
                return;
            case 2:
                rh1 rh1Var2 = this.f39384b;
                rh1Var2.L0.unlock();
                rh1Var2.Y.setCornerRadius(-1.0f);
                rh1Var2.E0 = false;
                rh1Var2.Y.f34258b0 = false;
                rh1Var2.f43032q0 = rh1Var2.f43031p0;
                rh1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.y9 y9Var : this.f39384b.V) {
                    org.telegram.ui.Components.t5 t5Var = y9Var.e;
                    if (t5Var != null && (f3Var = t5Var.f32860k) != null) {
                        f3Var.setAllowStartAnimation(true);
                        y9Var.e.f32860k.startAnimation();
                    }
                }
                return;
            case 4:
                rh1 rh1Var3 = this.f39384b;
                rh1Var3.A();
                for (org.telegram.ui.Components.y9 y9Var2 : rh1Var3.V) {
                    org.telegram.ui.Components.t5 t5Var2 = y9Var2.e;
                    if (t5Var2 != null && (f3Var2 = t5Var2.f32860k) != null) {
                        f3Var2.setAllowStartAnimation(false);
                        y9Var2.e.f32860k.stopAnimation();
                    }
                }
                rh1Var3.R.setVisibility(8);
                return;
            case 5:
                rh1 rh1Var4 = this.f39384b;
                if (rh1Var4.Z.getTag() == null) {
                    rh1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                rh1 rh1Var5 = this.f39384b;
                rh1Var5.Y.setTranslationX(0.0f);
                rh1Var5.Y.setTranslationY(0.0f);
                rh1Var5.Y.setScaleY(1.0f);
                rh1Var5.Y.setScaleX(1.0f);
                rh1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f39384b.f43044y.setVisibility(8);
                return;
            default:
                this.f39384b.f43011e0.setVisibility(8);
                return;
        }
    }
}
