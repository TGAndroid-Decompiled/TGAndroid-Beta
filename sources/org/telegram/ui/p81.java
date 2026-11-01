package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class p81 extends AnimatorListenerAdapter {
    public final int f40422a;
    public final k91 f40423b;

    public p81(k91 k91Var, int i10) {
        this.f40422a = i10;
        this.f40423b = k91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40422a) {
            case 0:
                super.onAnimationEnd(animator);
                k91 k91Var = this.f40423b;
                k91Var.f38778y0.invalidate();
                k91Var.f38775x0[1].setVisibility(8);
                k91Var.f38725d2 = null;
                return;
            case 1:
                this.f40423b.C0 = null;
                return;
            case 2:
                k91 k91Var2 = this.f40423b;
                if (k91Var2.E0.getTag() == null) {
                    k91Var2.E0.setVisibility(4);
                }
                k91Var2.I0 = null;
                return;
            case 3:
                k91 k91Var3 = this.f40423b;
                if (k91Var3.F0.getTag() == null) {
                    k91Var3.F0.setVisibility(4);
                }
                k91Var3.J0 = null;
                return;
            case 4:
                k91 k91Var4 = this.f40423b;
                ic icVar = k91Var4.f38741i2;
                if (icVar != null) {
                    if (icVar.getParent() != null) {
                        ((ViewGroup) k91Var4.f38741i2.getParent()).removeView(k91Var4.f38741i2);
                    }
                    k91Var4.f38741i2 = null;
                }
                k91Var4.f38747k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                k91 k91Var5 = this.f40423b;
                if (!k91Var5.f38758q1.a()) {
                    k91Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
