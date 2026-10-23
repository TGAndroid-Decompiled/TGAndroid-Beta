package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class tg0 extends AnimatorListenerAdapter {
    public final int f30698a;
    public final ug0 f30699b;

    public tg0(ug0 ug0Var, int i10) {
        this.f30698a = i10;
        this.f30699b = ug0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30698a) {
            case 0:
                ug0 ug0Var = this.f30699b;
                ug0Var.h = false;
                ug0Var.f31153a = ug0Var.f31155c;
                ug0Var.invalidate();
                int i10 = ug0Var.J;
                if (i10 >= 0) {
                    ug0Var.b(i10);
                    ug0Var.J = -1;
                    return;
                }
                return;
            default:
                ug0 ug0Var2 = this.f30699b;
                ug0Var2.f31157n = false;
                ug0Var2.h = false;
                ug0Var2.invalidate();
                int i11 = ug0Var2.J;
                if (i11 >= 0) {
                    ug0Var2.b(i11);
                    ug0Var2.J = -1;
                }
                ug0Var2.a();
                return;
        }
    }
}
