package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class bh1 extends AnimatorListenerAdapter {
    public final int f36076a;
    public final nh1 f36077b;

    public bh1(nh1 nh1Var, int i10) {
        this.f36076a = i10;
        this.f36077b = nh1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.u9[] u9VarArr;
        ci.f3 f3Var;
        org.telegram.ui.Components.u9[] u9VarArr2;
        ci.f3 f3Var2;
        switch (this.f36076a) {
            case 0:
                nh1 nh1Var = this.f36077b;
                nh1Var.f39847i1 = null;
                nh1Var.f39841f1 = 1.0f;
                nh1Var.Y0 = 0.0f;
                nh1Var.Z0 = 0.0f;
                nh1Var.f39861s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.k2.k().f31652a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new ly0(this, 25), 200L);
                return;
            case 2:
                nh1 nh1Var2 = this.f36077b;
                nh1Var2.L0.unlock();
                nh1Var2.Y.setCornerRadius(-1.0f);
                nh1Var2.E0 = false;
                nh1Var2.Y.f31844b0 = false;
                nh1Var2.f39858q0 = nh1Var2.f39857p0;
                nh1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.u9 u9Var : this.f36077b.V) {
                    org.telegram.ui.Components.p5 p5Var = u9Var.e;
                    if (p5Var != null && (f3Var = p5Var.f29484k) != null) {
                        f3Var.setAllowStartAnimation(true);
                        u9Var.e.f29484k.startAnimation();
                    }
                }
                return;
            case 4:
                nh1 nh1Var3 = this.f36077b;
                nh1Var3.A();
                for (org.telegram.ui.Components.u9 u9Var2 : nh1Var3.V) {
                    org.telegram.ui.Components.p5 p5Var2 = u9Var2.e;
                    if (p5Var2 != null && (f3Var2 = p5Var2.f29484k) != null) {
                        f3Var2.setAllowStartAnimation(false);
                        u9Var2.e.f29484k.stopAnimation();
                    }
                }
                nh1Var3.R.setVisibility(8);
                return;
            case 5:
                nh1 nh1Var4 = this.f36077b;
                if (nh1Var4.Z.getTag() == null) {
                    nh1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                nh1 nh1Var5 = this.f36077b;
                nh1Var5.Y.setTranslationX(0.0f);
                nh1Var5.Y.setTranslationY(0.0f);
                nh1Var5.Y.setScaleY(1.0f);
                nh1Var5.Y.setScaleX(1.0f);
                nh1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f36077b.f39870y.setVisibility(8);
                return;
            default:
                this.f36077b.f39837e0.setVisibility(8);
                return;
        }
    }
}
