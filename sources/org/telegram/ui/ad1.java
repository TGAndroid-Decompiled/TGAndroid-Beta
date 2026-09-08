package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class ad1 extends AnimatorListenerAdapter {
    public final int f34415a;
    public final wd1 f34416b;

    public ad1(wd1 wd1Var, int i10) {
        this.f34415a = i10;
        this.f34416b = wd1Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34415a) {
            case 0:
                super.onAnimationEnd(animator);
                wd1 wd1Var = this.f34416b;
                wd1Var.f42004x0.invalidate();
                wd1Var.f42001w0[1].setVisibility(8);
                wd1Var.f41951c2 = null;
                return;
            case 1:
                this.f34416b.B0 = null;
                return;
            case 2:
                wd1 wd1Var2 = this.f34416b;
                if (wd1Var2.D0.getTag() == null) {
                    wd1Var2.D0.setVisibility(4);
                }
                wd1Var2.H0 = null;
                return;
            case 3:
                wd1 wd1Var3 = this.f34416b;
                if (wd1Var3.E0.getTag() == null) {
                    wd1Var3.E0.setVisibility(4);
                }
                wd1Var3.I0 = null;
                return;
            case 4:
                wd1 wd1Var4 = this.f34416b;
                mc mcVar = wd1Var4.f41968h2;
                if (mcVar != null) {
                    if (mcVar.getParent() != null) {
                        ((ViewGroup) wd1Var4.f41968h2.getParent()).removeView(wd1Var4.f41968h2);
                    }
                    wd1Var4.f41968h2 = null;
                }
                wd1Var4.f41974j2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                wd1 wd1Var5 = this.f34416b;
                if (!wd1Var5.f41985p1.a()) {
                    wd1Var5.R1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
