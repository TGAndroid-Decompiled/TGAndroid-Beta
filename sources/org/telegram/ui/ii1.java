package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.messenger.AndroidUtilities;
public final class ii1 extends AnimatorListenerAdapter {
    public final int f34679a;
    public final ui1 f34680b;

    public ii1(ui1 ui1Var, int i10) {
        this.f34679a = i10;
        this.f34680b = ui1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        org.telegram.ui.Components.u9[] u9VarArr;
        ai.l4 l4Var;
        org.telegram.ui.Components.u9[] u9VarArr2;
        ai.l4 l4Var2;
        switch (this.f34679a) {
            case 0:
                ui1 ui1Var = this.f34680b;
                ui1Var.f38003i1 = null;
                ui1Var.f37997f1 = 1.0f;
                ui1Var.Y0 = 0.0f;
                ui1Var.Z0 = 0.0f;
                ui1Var.f38017s.invalidate();
                return;
            case 1:
                org.telegram.ui.Components.voip.m2.k().f29088a.setAlpha(1.0f);
                AndroidUtilities.runOnUIThread(new f01(this, 23), 200L);
                return;
            case 2:
                ui1 ui1Var2 = this.f34680b;
                ui1Var2.L0.unlock();
                ui1Var2.Y.setCornerRadius(-1.0f);
                ui1Var2.E0 = false;
                ui1Var2.Y.f29278b0 = false;
                ui1Var2.f38014q0 = ui1Var2.f38013p0;
                ui1Var2.H();
                return;
            case 3:
                for (org.telegram.ui.Components.u9 u9Var : this.f34680b.V) {
                    org.telegram.ui.Components.o5 o5Var = u9Var.e;
                    if (o5Var != null && (l4Var = o5Var.f26689k) != null) {
                        l4Var.setAllowStartAnimation(true);
                        u9Var.e.f26689k.startAnimation();
                    }
                }
                return;
            case 4:
                ui1 ui1Var3 = this.f34680b;
                ui1Var3.B();
                for (org.telegram.ui.Components.u9 u9Var2 : ui1Var3.V) {
                    org.telegram.ui.Components.o5 o5Var2 = u9Var2.e;
                    if (o5Var2 != null && (l4Var2 = o5Var2.f26689k) != null) {
                        l4Var2.setAllowStartAnimation(false);
                        u9Var2.e.f26689k.stopAnimation();
                    }
                }
                ui1Var3.R.setVisibility(8);
                return;
            case 5:
                ui1 ui1Var4 = this.f34680b;
                if (ui1Var4.Z.getTag() == null) {
                    ui1Var4.Z.setVisibility(8);
                    return;
                }
                return;
            case 6:
                ui1 ui1Var5 = this.f34680b;
                ui1Var5.Y.setTranslationX(0.0f);
                ui1Var5.Y.setTranslationY(0.0f);
                ui1Var5.Y.setScaleY(1.0f);
                ui1Var5.Y.setScaleX(1.0f);
                ui1Var5.Y.setVisibility(8);
                return;
            case 7:
                this.f34680b.f38026y.setVisibility(8);
                return;
            default:
                this.f34680b.f37993e0.setVisibility(8);
                return;
        }
    }
}
