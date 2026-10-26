package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class dh1 extends AnimatorListenerAdapter {
    public final int f38889a;
    public final ph1 f38890b;

    public dh1(ph1 ph1Var, int i10) {
        this.f38889a = i10;
        this.f38890b = ph1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.y9[] y9VarArr;
        di.f3 f3Var;
        org.telegram.ui.Components.y9[] y9VarArr2;
        di.f3 f3Var2;
        switch (this.f38889a) {
            case 0:
                ph1 ph1Var = this.f38890b;
                ph1Var.f42531i1 = null;
                ph1Var.f42525f1 = 1.0f;
                ph1Var.Y0 = 0.0f;
                ph1Var.Z0 = 0.0f;
                ph1Var.f42545s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.n2.k().f33956a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new my0(this, 27), 200L);
                return;
            case 2:
                ph1 ph1Var2 = this.f38890b;
                ph1Var2.L0.unlock();
                ph1Var2.Y.setCornerRadius(-1.0f);
                ph1Var2.E0 = false;
                ph1Var2.Y.f34153b0 = false;
                ph1Var2.f42542q0 = ph1Var2.f42541p0;
                ph1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.y9 y9Var : this.f38890b.V) {
                    org.telegram.ui.Components.t5 t5Var = y9Var.e;
                    if (t5Var != null && (f3Var = t5Var.f32852k) != null) {
                        f3Var.setAllowStartAnimation(true);
                        y9Var.e.f32852k.startAnimation();
                    }
                }
                return;
            case 4:
                ph1 ph1Var3 = this.f38890b;
                ph1Var3.A();
                for (org.telegram.ui.Components.y9 y9Var2 : ph1Var3.V) {
                    org.telegram.ui.Components.t5 t5Var2 = y9Var2.e;
                    if (t5Var2 != null && (f3Var2 = t5Var2.f32852k) != null) {
                        f3Var2.setAllowStartAnimation(false);
                        y9Var2.e.f32852k.stopAnimation();
                    }
                }
                ph1Var3.R.setVisibility(8);
                return;
            case 5:
                ph1 ph1Var4 = this.f38890b;
                if (ph1Var4.Z.getTag() == null) {
                    ph1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ph1 ph1Var5 = this.f38890b;
                ph1Var5.Y.setTranslationX(0.0f);
                ph1Var5.Y.setTranslationY(0.0f);
                ph1Var5.Y.setScaleY(1.0f);
                ph1Var5.Y.setScaleX(1.0f);
                ph1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f38890b.f42554y.setVisibility(8);
                return;
            default:
                this.f38890b.f42521e0.setVisibility(8);
                return;
        }
    }
}
