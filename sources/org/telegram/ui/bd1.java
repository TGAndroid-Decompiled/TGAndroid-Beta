package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class bd1 extends AnimatorListenerAdapter {
    public final int f32389a;
    public final xd1 f32390b;

    public bd1(xd1 xd1Var, int i10) {
        this.f32389a = i10;
        this.f32390b = xd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32389a) {
            case 0:
                super.onAnimationEnd(animator);
                xd1 xd1Var = this.f32390b;
                xd1Var.f39532x0.invalidate();
                xd1Var.f39529w0[1].setVisibility(8);
                xd1Var.f39480c2 = null;
                return;
            case 1:
                this.f32390b.B0 = null;
                return;
            case 2:
                xd1 xd1Var2 = this.f32390b;
                if (xd1Var2.D0.getTag() == null) {
                    xd1Var2.D0.setVisibility(4);
                }
                xd1Var2.H0 = null;
                return;
            case 3:
                xd1 xd1Var3 = this.f32390b;
                if (xd1Var3.E0.getTag() == null) {
                    xd1Var3.E0.setVisibility(4);
                }
                xd1Var3.I0 = null;
                return;
            case 4:
                xd1 xd1Var4 = this.f32390b;
                mc mcVar = xd1Var4.f39496h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) xd1Var4.f39496h2.getParent()).removeView(xd1Var4.f39496h2);
                    }
                    xd1Var4.f39496h2 = null;
                }
                xd1Var4.f39502j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                xd1 xd1Var5 = this.f32390b;
                if (!xd1Var5.f39513p1.a()) {
                    xd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
