package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ob1 extends AnimatorListenerAdapter {
    public final int f39830a;
    public final kc1 f39831b;

    public ob1(kc1 kc1Var, int i10) {
        this.f39830a = i10;
        this.f39831b = kc1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39830a) {
            case 0:
                super.onAnimationEnd(animator);
                kc1 kc1Var = this.f39831b;
                kc1Var.f38582x0.invalidate();
                kc1Var.f38579w0[1].setVisibility(8);
                kc1Var.f38530c2 = null;
                return;
            case 1:
                this.f39831b.B0 = null;
                return;
            case 2:
                kc1 kc1Var2 = this.f39831b;
                if (kc1Var2.D0.getTag() == null) {
                    kc1Var2.D0.setVisibility(4);
                }
                kc1Var2.H0 = null;
                return;
            case 3:
                kc1 kc1Var3 = this.f39831b;
                if (kc1Var3.E0.getTag() == null) {
                    kc1Var3.E0.setVisibility(4);
                }
                kc1Var3.I0 = null;
                return;
            case 4:
                kc1 kc1Var4 = this.f39831b;
                lc lcVar = kc1Var4.f38546h2;
                if (lcVar != null) {
                    if (lcVar.getParent() != null) {
                        ((ViewGroup) kc1Var4.f38546h2.getParent()).removeView(kc1Var4.f38546h2);
                    }
                    kc1Var4.f38546h2 = null;
                }
                kc1Var4.f38552j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                kc1 kc1Var5 = this.f39831b;
                if (!kc1Var5.f38563p1.a()) {
                    kc1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
