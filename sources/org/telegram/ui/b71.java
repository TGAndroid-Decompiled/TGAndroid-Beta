package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class b71 extends AnimatorListenerAdapter {
    public final int f45804a;
    public final x71 f45805b;

    public b71(x71 x71Var, int i7) {
        this.f45804a = i7;
        this.f45805b = x71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45804a) {
            case 0:
                super.onAnimationEnd(animator);
                x71 x71Var = this.f45805b;
                x71Var.f53780z0.invalidate();
                x71Var.f53778y0[1].setVisibility(8);
                x71Var.f53728e2 = null;
                return;
            case 1:
                this.f45805b.D0 = null;
                return;
            case 2:
                x71 x71Var2 = this.f45805b;
                if (x71Var2.F0.getTag() == null) {
                    x71Var2.F0.setVisibility(4);
                }
                x71Var2.J0 = null;
                return;
            case 3:
                x71 x71Var3 = this.f45805b;
                if (x71Var3.G0.getTag() == null) {
                    x71Var3.G0.setVisibility(4);
                }
                x71Var3.K0 = null;
                return;
            case 4:
                x71 x71Var4 = this.f45805b;
                bc bcVar = x71Var4.f53744j2;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) x71Var4.f53744j2.getParent()).removeView(x71Var4.f53744j2);
                    }
                    x71Var4.f53744j2 = null;
                }
                x71Var4.f53749l2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                x71 x71Var5 = this.f45805b;
                if (!x71Var5.f53761r1.d()) {
                    x71Var5.T1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
