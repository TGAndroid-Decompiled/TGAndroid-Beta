package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class yg0 extends AnimatorListenerAdapter {
    public final int f33192a;
    public final zg0 f33193b;

    public yg0(zg0 zg0Var, int i10) {
        this.f33192a = i10;
        this.f33193b = zg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33192a) {
            case 0:
                zg0 zg0Var = this.f33193b;
                zg0Var.h = false;
                zg0Var.f33515a = zg0Var.f33517c;
                zg0Var.invalidate();
                int i10 = zg0Var.J;
                if (i10 >= 0) {
                    zg0Var.b(i10);
                    zg0Var.J = -1;
                    return;
                }
                return;
            default:
                zg0 zg0Var2 = this.f33193b;
                zg0Var2.f33520n = false;
                zg0Var2.h = false;
                zg0Var2.invalidate();
                int i11 = zg0Var2.J;
                if (i11 >= 0) {
                    zg0Var2.b(i11);
                    zg0Var2.J = -1;
                }
                zg0Var2.a();
                return;
        }
    }
}
