package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ii1 extends AnimatorListenerAdapter {
    public final int f38729a;
    public final ui1 f38730b;

    public ii1(ui1 ui1Var, int i10) {
        this.f38729a = i10;
        this.f38730b = ui1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.y9[] y9VarArr;
        ai.m4 m4Var;
        org.telegram.ui.Components.y9[] y9VarArr2;
        ai.m4 m4Var2;
        switch (this.f38729a) {
            case 0:
                ui1 ui1Var = this.f38730b;
                ui1Var.f42633i1 = null;
                ui1Var.f42627f1 = 1.0f;
                ui1Var.Y0 = 0.0f;
                ui1Var.Z0 = 0.0f;
                ui1Var.f42647s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.n2.k().f32212a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new mz0(this, 24), 200L);
                return;
            case 2:
                ui1 ui1Var2 = this.f38730b;
                ui1Var2.L0.unlock();
                ui1Var2.Y.setCornerRadius(-1.0f);
                ui1Var2.E0 = false;
                ui1Var2.Y.f32416b0 = false;
                ui1Var2.f42644q0 = ui1Var2.f42643p0;
                ui1Var2.G();
                return;
            case 3:
                for (org.telegram.ui.Components.y9 y9Var : this.f38730b.V) {
                    org.telegram.ui.Components.s5 s5Var = y9Var.f33191e;
                    if (s5Var != null && (m4Var = s5Var.f30739k) != null) {
                        m4Var.setAllowStartAnimation(true);
                        y9Var.f33191e.f30739k.startAnimation();
                    }
                }
                return;
            case 4:
                ui1 ui1Var3 = this.f38730b;
                ui1Var3.A();
                for (org.telegram.ui.Components.y9 y9Var2 : ui1Var3.V) {
                    org.telegram.ui.Components.s5 s5Var2 = y9Var2.f33191e;
                    if (s5Var2 != null && (m4Var2 = s5Var2.f30739k) != null) {
                        m4Var2.setAllowStartAnimation(false);
                        y9Var2.f33191e.f30739k.stopAnimation();
                    }
                }
                ui1Var3.R.setVisibility(8);
                return;
            case 5:
                ui1 ui1Var4 = this.f38730b;
                if (ui1Var4.Z.getTag() == null) {
                    ui1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ui1 ui1Var5 = this.f38730b;
                ui1Var5.Y.setTranslationX(0.0f);
                ui1Var5.Y.setTranslationY(0.0f);
                ui1Var5.Y.setScaleY(1.0f);
                ui1Var5.Y.setScaleX(1.0f);
                ui1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f38730b.f42656y.setVisibility(8);
                return;
            default:
                this.f38730b.f42623e0.setVisibility(8);
                return;
        }
    }
}
