package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ob1 extends AnimatorListenerAdapter {
    public final int f39831a;
    public final kc1 f39832b;

    public ob1(kc1 kc1Var, int i10) {
        this.f39831a = i10;
        this.f39832b = kc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39831a) {
            case 0:
                super.onAnimationEnd(animator);
                kc1 kc1Var = this.f39832b;
                kc1Var.f38583x0.invalidate();
                kc1Var.f38580w0[1].setVisibility(8);
                kc1Var.f38531c2 = null;
                return;
            case 1:
                this.f39832b.B0 = null;
                return;
            case 2:
                kc1 kc1Var2 = this.f39832b;
                if (kc1Var2.D0.getTag() == null) {
                    kc1Var2.D0.setVisibility(4);
                }
                kc1Var2.H0 = null;
                return;
            case 3:
                kc1 kc1Var3 = this.f39832b;
                if (kc1Var3.E0.getTag() == null) {
                    kc1Var3.E0.setVisibility(4);
                }
                kc1Var3.I0 = null;
                return;
            case 4:
                kc1 kc1Var4 = this.f39832b;
                lc lcVar = kc1Var4.f38547h2;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) kc1Var4.f38547h2.getParent()).removeView(kc1Var4.f38547h2);
                    }
                    kc1Var4.f38547h2 = null;
                }
                kc1Var4.f38553j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                kc1 kc1Var5 = this.f39832b;
                if (!kc1Var5.f38564p1.a()) {
                    kc1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
