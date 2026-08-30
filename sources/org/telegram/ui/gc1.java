package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class gc1 extends AnimatorListenerAdapter {
    public final int f34571a;
    public final cd1 f34572b;

    public gc1(cd1 cd1Var, int i10) {
        this.f34571a = i10;
        this.f34572b = cd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34571a) {
            case 0:
                super.onAnimationEnd(animator);
                cd1 cd1Var = this.f34572b;
                cd1Var.f33338u0.invalidate();
                cd1Var.f33336t0[1].setVisibility(8);
                cd1Var.Z1 = null;
                return;
            case 1:
                this.f34572b.f33349y0 = null;
                return;
            case 2:
                cd1 cd1Var2 = this.f34572b;
                if (cd1Var2.A0.getTag() == null) {
                    cd1Var2.A0.setVisibility(4);
                }
                cd1Var2.E0 = null;
                return;
            case 3:
                cd1 cd1Var3 = this.f34572b;
                if (cd1Var3.B0.getTag() == null) {
                    cd1Var3.B0.setVisibility(4);
                }
                cd1Var3.F0 = null;
                return;
            case 4:
                cd1 cd1Var4 = this.f34572b;
                kc kcVar = cd1Var4.f33303e2;
                if (kcVar != null) {
                    if (kcVar.getParent() != null) {
                        ((ViewGroup) cd1Var4.f33303e2.getParent()).removeView(cd1Var4.f33303e2);
                    }
                    cd1Var4.f33303e2 = null;
                }
                cd1Var4.f33310g2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                cd1 cd1Var5 = this.f34572b;
                if (!cd1Var5.f33320m1.a()) {
                    cd1Var5.O1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
