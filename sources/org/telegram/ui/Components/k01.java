package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class k01 extends AnimatorListenerAdapter {
    public final int f35203a;
    public final t01 f35204b;

    public k01(t01 t01Var, int i7) {
        this.f35203a = i7;
        this.f35204b = t01Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35203a) {
            case 0:
                t01 t01Var = this.f35204b;
                if (t01Var.T == animator) {
                    t01Var.T = null;
                    return;
                }
                return;
            case 1:
                t01 t01Var2 = this.f35204b;
                if (t01Var2.f38217f0 == animator) {
                    t01Var2.f38217f0 = null;
                }
                t01Var2.b(1.0f);
                return;
            default:
                t01 t01Var3 = this.f35204b;
                if (t01Var3.J == animator) {
                    t01Var3.J = null;
                    return;
                }
                return;
        }
    }
}
