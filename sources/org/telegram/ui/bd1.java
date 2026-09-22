package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class bd1 extends AnimatorListenerAdapter {
    public final int f32407a;
    public final xd1 f32408b;

    public bd1(xd1 xd1Var, int i10) {
        this.f32407a = i10;
        this.f32408b = xd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32407a) {
            case 0:
                super.onAnimationEnd(animator);
                xd1 xd1Var = this.f32408b;
                xd1Var.f39556x0.invalidate();
                xd1Var.f39553w0[1].setVisibility(8);
                xd1Var.f39504c2 = null;
                return;
            case 1:
                this.f32408b.B0 = null;
                return;
            case 2:
                xd1 xd1Var2 = this.f32408b;
                if (xd1Var2.D0.getTag() == null) {
                    xd1Var2.D0.setVisibility(4);
                }
                xd1Var2.H0 = null;
                return;
            case 3:
                xd1 xd1Var3 = this.f32408b;
                if (xd1Var3.E0.getTag() == null) {
                    xd1Var3.E0.setVisibility(4);
                }
                xd1Var3.I0 = null;
                return;
            case 4:
                xd1 xd1Var4 = this.f32408b;
                mc mcVar = xd1Var4.f39520h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) xd1Var4.f39520h2.getParent()).removeView(xd1Var4.f39520h2);
                    }
                    xd1Var4.f39520h2 = null;
                }
                xd1Var4.f39526j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                xd1 xd1Var5 = this.f32408b;
                if (!xd1Var5.f39537p1.a()) {
                    xd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
