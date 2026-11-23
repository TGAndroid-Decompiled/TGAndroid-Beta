package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class b71 extends AnimatorListenerAdapter {
    public final int f45808a;
    public final x71 f45809b;

    public b71(x71 x71Var, int i7) {
        this.f45808a = i7;
        this.f45809b = x71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45808a) {
            case 0:
                super.onAnimationEnd(animator);
                x71 x71Var = this.f45809b;
                x71Var.f53784z0.invalidate();
                x71Var.f53782y0[1].setVisibility(8);
                x71Var.f53732e2 = null;
                return;
            case 1:
                this.f45809b.D0 = null;
                return;
            case 2:
                x71 x71Var2 = this.f45809b;
                if (x71Var2.F0.getTag() == null) {
                    x71Var2.F0.setVisibility(4);
                }
                x71Var2.J0 = null;
                return;
            case 3:
                x71 x71Var3 = this.f45809b;
                if (x71Var3.G0.getTag() == null) {
                    x71Var3.G0.setVisibility(4);
                }
                x71Var3.K0 = null;
                return;
            case 4:
                x71 x71Var4 = this.f45809b;
                bc bcVar = x71Var4.f53748j2;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) x71Var4.f53748j2.getParent()).removeView(x71Var4.f53748j2);
                    }
                    x71Var4.f53748j2 = null;
                }
                x71Var4.f53753l2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                x71 x71Var5 = this.f45809b;
                if (!x71Var5.f53765r1.d()) {
                    x71Var5.T1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
