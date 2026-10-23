package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pg0 extends AnimatorListenerAdapter {
    public final int f29315a;
    public final qg0 f29316b;

    public pg0(qg0 qg0Var, int i10) {
        this.f29315a = i10;
        this.f29316b = qg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29315a) {
            case 0:
                qg0 qg0Var = this.f29316b;
                qg0Var.h = false;
                qg0Var.f29581a = qg0Var.f29583c;
                qg0Var.invalidate();
                int i10 = qg0Var.J;
                if (i10 >= 0) {
                    qg0Var.b(i10);
                    qg0Var.J = -1;
                    return;
                }
                return;
            default:
                qg0 qg0Var2 = this.f29316b;
                qg0Var2.f29585n = false;
                qg0Var2.h = false;
                qg0Var2.invalidate();
                int i11 = qg0Var2.J;
                if (i11 >= 0) {
                    qg0Var2.b(i11);
                    qg0Var2.J = -1;
                }
                qg0Var2.a();
                return;
        }
    }
}
