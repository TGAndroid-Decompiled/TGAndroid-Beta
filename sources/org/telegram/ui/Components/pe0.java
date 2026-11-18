package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pe0 extends AnimatorListenerAdapter {
    public final int f38382a;
    public final qe0 f38383b;

    public pe0(qe0 qe0Var, int i7) {
        this.f38382a = i7;
        this.f38383b = qe0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38382a) {
            case 0:
                qe0 qe0Var = this.f38383b;
                qe0Var.h = false;
                qe0Var.f38773a = qe0Var.f38775c;
                qe0Var.invalidate();
                int i7 = qe0Var.K;
                if (i7 >= 0) {
                    qe0Var.b(i7);
                    qe0Var.K = -1;
                    return;
                }
                return;
            default:
                qe0 qe0Var2 = this.f38383b;
                qe0Var2.f38778n = false;
                qe0Var2.h = false;
                qe0Var2.invalidate();
                int i10 = qe0Var2.K;
                if (i10 >= 0) {
                    qe0Var2.b(i10);
                    qe0Var2.K = -1;
                }
                qe0Var2.a();
                return;
        }
    }
}
