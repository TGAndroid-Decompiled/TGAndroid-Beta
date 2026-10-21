package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pg0 extends AnimatorListenerAdapter {
    public final int f29311a;
    public final qg0 f29312b;

    public pg0(qg0 qg0Var, int i10) {
        this.f29311a = i10;
        this.f29312b = qg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29311a) {
            case 0:
                qg0 qg0Var = this.f29312b;
                qg0Var.h = false;
                qg0Var.f29577a = qg0Var.f29579c;
                qg0Var.invalidate();
                int i10 = qg0Var.J;
                if (i10 >= 0) {
                    qg0Var.b(i10);
                    qg0Var.J = -1;
                    return;
                }
                return;
            default:
                qg0 qg0Var2 = this.f29312b;
                qg0Var2.f29581n = false;
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
