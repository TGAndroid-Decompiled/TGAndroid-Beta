package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ed1 extends AnimatorListenerAdapter {
    public final int f32163a;
    public final ae1 f32164b;

    public ed1(ae1 ae1Var, int i10) {
        this.f32163a = i10;
        this.f32164b = ae1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32163a) {
            case 0:
                super.onAnimationEnd(animator);
                ae1 ae1Var = this.f32164b;
                ae1Var.f30976x0.invalidate();
                ae1Var.f30973w0[1].setVisibility(8);
                ae1Var.f30924c2 = null;
                return;
            case 1:
                this.f32164b.B0 = null;
                return;
            case 2:
                ae1 ae1Var2 = this.f32164b;
                if (ae1Var2.D0.getTag() == null) {
                    ae1Var2.D0.setVisibility(4);
                }
                ae1Var2.H0 = null;
                return;
            case 3:
                ae1 ae1Var3 = this.f32164b;
                if (ae1Var3.E0.getTag() == null) {
                    ae1Var3.E0.setVisibility(4);
                }
                ae1Var3.I0 = null;
                return;
            case 4:
                ae1 ae1Var4 = this.f32164b;
                nc ncVar = ae1Var4.f30940h2;
                if (ncVar != null) {
                    if (ncVar.getParent() != null) {
                        ((ViewGroup) ae1Var4.f30940h2.getParent()).removeView(ae1Var4.f30940h2);
                    }
                    ae1Var4.f30940h2 = null;
                }
                ae1Var4.f30946j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                ae1 ae1Var5 = this.f32164b;
                if (!ae1Var5.f30957p1.a()) {
                    ae1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
