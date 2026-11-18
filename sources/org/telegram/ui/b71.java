package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class b71 extends AnimatorListenerAdapter {
    public final int f45787a;
    public final x71 f45788b;

    public b71(x71 x71Var, int i7) {
        this.f45787a = i7;
        this.f45788b = x71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f45787a) {
            case 0:
                super.onAnimationEnd(animator);
                x71 x71Var = this.f45788b;
                x71Var.f53751z0.invalidate();
                x71Var.f53749y0[1].setVisibility(8);
                x71Var.f53699e2 = null;
                return;
            case 1:
                this.f45788b.D0 = null;
                return;
            case 2:
                x71 x71Var2 = this.f45788b;
                if (x71Var2.F0.getTag() == null) {
                    x71Var2.F0.setVisibility(4);
                }
                x71Var2.J0 = null;
                return;
            case 3:
                x71 x71Var3 = this.f45788b;
                if (x71Var3.G0.getTag() == null) {
                    x71Var3.G0.setVisibility(4);
                }
                x71Var3.K0 = null;
                return;
            case 4:
                x71 x71Var4 = this.f45788b;
                bc bcVar = x71Var4.f53715j2;
                if (bcVar != null) {
                    if (bcVar.getParent() != null) {
                        ((ViewGroup) x71Var4.f53715j2.getParent()).removeView(x71Var4.f53715j2);
                    }
                    x71Var4.f53715j2 = null;
                }
                x71Var4.f53720l2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                x71 x71Var5 = this.f45788b;
                if (!x71Var5.f53732r1.d()) {
                    x71Var5.T1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
