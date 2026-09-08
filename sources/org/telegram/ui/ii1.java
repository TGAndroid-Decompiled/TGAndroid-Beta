package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ii1 extends AnimatorListenerAdapter {
    public final int f37413a;
    public final ui1 f37414b;

    public ii1(ui1 ui1Var, int i10) {
        this.f37413a = i10;
        this.f37414b = ui1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.x9[] x9VarArr;
        bi.y3 y3Var;
        org.telegram.ui.Components.x9[] x9VarArr2;
        bi.y3 y3Var2;
        switch (this.f37413a) {
            case 0:
                ui1 ui1Var = this.f37414b;
                ui1Var.f41156i1 = null;
                ui1Var.f41150f1 = 1.0f;
                ui1Var.Y0 = 0.0f;
                ui1Var.Z0 = 0.0f;
                ui1Var.f41170s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.k2.k().f31604a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new f01(this, 23), 200L);
                return;
            case 2:
                ui1 ui1Var2 = this.f37414b;
                ui1Var2.L0.unlock();
                ui1Var2.Y.setCornerRadius(-1.0f);
                ui1Var2.E0 = false;
                ui1Var2.Y.f31811b0 = false;
                ui1Var2.f41167q0 = ui1Var2.f41166p0;
                ui1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.x9 x9Var : this.f37414b.V) {
                    org.telegram.ui.Components.q5 q5Var = x9Var.f32506e;
                    if (q5Var != null && (y3Var = q5Var.f29611k) != null) {
                        y3Var.setAllowStartAnimation(true);
                        x9Var.f32506e.f29611k.startAnimation();
                    }
                }
                return;
            case 4:
                ui1 ui1Var3 = this.f37414b;
                ui1Var3.B();
                for (org.telegram.ui.Components.x9 x9Var2 : ui1Var3.V) {
                    org.telegram.ui.Components.q5 q5Var2 = x9Var2.f32506e;
                    if (q5Var2 != null && (y3Var2 = q5Var2.f29611k) != null) {
                        y3Var2.setAllowStartAnimation(false);
                        x9Var2.f32506e.f29611k.stopAnimation();
                    }
                }
                ui1Var3.R.setVisibility(8);
                return;
            case 5:
                ui1 ui1Var4 = this.f37414b;
                if (ui1Var4.Z.getTag() == null) {
                    ui1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ui1 ui1Var5 = this.f37414b;
                ui1Var5.Y.setTranslationX(0.0f);
                ui1Var5.Y.setTranslationY(0.0f);
                ui1Var5.Y.setScaleY(1.0f);
                ui1Var5.Y.setScaleX(1.0f);
                ui1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f37414b.f41179y.setVisibility(8);
                return;
            default:
                this.f37414b.f41146e0.setVisibility(8);
                return;
        }
    }
}
