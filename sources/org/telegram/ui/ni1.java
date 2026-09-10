package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ni1 extends AnimatorListenerAdapter {
    public final int f35285a;
    public final zi1 f35286b;

    public ni1(zi1 zi1Var, int i10) {
        this.f35285a = i10;
        this.f35286b = zi1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.w9[] w9VarArr;
        gg.h1 h1Var;
        org.telegram.ui.Components.w9[] w9VarArr2;
        gg.h1 h1Var2;
        switch (this.f35285a) {
            case 0:
                zi1 zi1Var = this.f35286b;
                zi1Var.f39377i1 = null;
                zi1Var.f39371f1 = 1.0f;
                zi1Var.Y0 = 0.0f;
                zi1Var.Z0 = 0.0f;
                zi1Var.f39391s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.l2.k().f28227a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new k01(this, 23), 200L);
                return;
            case 2:
                zi1 zi1Var2 = this.f35286b;
                zi1Var2.L0.unlock();
                zi1Var2.Y.setCornerRadius(-1.0f);
                zi1Var2.E0 = false;
                zi1Var2.Y.f28450b0 = false;
                zi1Var2.f39388q0 = zi1Var2.f39387p0;
                zi1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.w9 w9Var : this.f35286b.V) {
                    org.telegram.ui.Components.p5 p5Var = w9Var.e;
                    if (p5Var != null && (h1Var = p5Var.f26033k) != null) {
                        h1Var.setAllowStartAnimation(true);
                        w9Var.e.f26033k.startAnimation();
                    }
                }
                return;
            case 4:
                zi1 zi1Var3 = this.f35286b;
                zi1Var3.B();
                for (org.telegram.ui.Components.w9 w9Var2 : zi1Var3.V) {
                    org.telegram.ui.Components.p5 p5Var2 = w9Var2.e;
                    if (p5Var2 != null && (h1Var2 = p5Var2.f26033k) != null) {
                        h1Var2.setAllowStartAnimation(false);
                        w9Var2.e.f26033k.stopAnimation();
                    }
                }
                zi1Var3.R.setVisibility(8);
                return;
            case 5:
                zi1 zi1Var4 = this.f35286b;
                if (zi1Var4.Z.getTag() == null) {
                    zi1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                zi1 zi1Var5 = this.f35286b;
                zi1Var5.Y.setTranslationX(0.0f);
                zi1Var5.Y.setTranslationY(0.0f);
                zi1Var5.Y.setScaleY(1.0f);
                zi1Var5.Y.setScaleX(1.0f);
                zi1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f35286b.f39400y.setVisibility(8);
                return;
            default:
                this.f35286b.f39367e0.setVisibility(8);
                return;
        }
    }
}
