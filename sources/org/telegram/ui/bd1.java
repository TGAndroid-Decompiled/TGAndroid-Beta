package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class bd1 extends AnimatorListenerAdapter {
    public final int f32109a;
    public final xd1 f32110b;

    public bd1(xd1 xd1Var, int i10) {
        this.f32109a = i10;
        this.f32110b = xd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32109a) {
            case 0:
                super.onAnimationEnd(animator);
                xd1 xd1Var = this.f32110b;
                xd1Var.f39598x0.invalidate();
                xd1Var.f39595w0[1].setVisibility(8);
                xd1Var.f39546c2 = null;
                return;
            case 1:
                this.f32110b.B0 = null;
                return;
            case 2:
                xd1 xd1Var2 = this.f32110b;
                if (xd1Var2.D0.getTag() == null) {
                    xd1Var2.D0.setVisibility(4);
                }
                xd1Var2.H0 = null;
                return;
            case 3:
                xd1 xd1Var3 = this.f32110b;
                if (xd1Var3.E0.getTag() == null) {
                    xd1Var3.E0.setVisibility(4);
                }
                xd1Var3.I0 = null;
                return;
            case 4:
                xd1 xd1Var4 = this.f32110b;
                nc ncVar = xd1Var4.f39562h2;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) xd1Var4.f39562h2.getParent()).removeView(xd1Var4.f39562h2);
                    }
                    xd1Var4.f39562h2 = null;
                }
                xd1Var4.f39568j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                xd1 xd1Var5 = this.f32110b;
                if (!xd1Var5.f39579p1.a()) {
                    xd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
