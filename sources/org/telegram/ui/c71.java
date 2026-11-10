package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
public final class c71 extends AnimatorListenerAdapter {
    public final int f44270a;
    public final x71 f44271b;

    public c71(x71 x71Var, int i7) {
        this.f44270a = i7;
        this.f44271b = x71Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f44270a) {
            case 0:
                super.onAnimationEnd(animator);
                x71 x71Var = this.f44271b;
                x71Var.f51627y0.invalidate();
                x71Var.f51624x0[1].setVisibility(8);
                x71Var.d2 = null;
                return;
            case 1:
                this.f44271b.C0 = null;
                return;
            case 2:
                x71 x71Var2 = this.f44271b;
                if (x71Var2.E0.getTag() == null) {
                    x71Var2.E0.setVisibility(4);
                }
                x71Var2.I0 = null;
                return;
            case 3:
                x71 x71Var3 = this.f44271b;
                if (x71Var3.F0.getTag() == null) {
                    x71Var3.F0.setVisibility(4);
                }
                x71Var3.J0 = null;
                return;
            case 4:
                x71 x71Var4 = this.f44271b;
                cc ccVar = x71Var4.f51591i2;
                if (ccVar != null) {
                    if (ccVar.getParent() != null) {
                        ((ViewGroup) x71Var4.f51591i2.getParent()).removeView(x71Var4.f51591i2);
                    }
                    x71Var4.f51591i2 = null;
                }
                x71Var4.f51597k2 = null;
                super.onAnimationEnd(animator);
                return;
            default:
                x71 x71Var5 = this.f44271b;
                if (!x71Var5.f51607q1.a()) {
                    x71Var5.S1.setVisibility(8);
                    return;
                }
                return;
        }
    }
}
