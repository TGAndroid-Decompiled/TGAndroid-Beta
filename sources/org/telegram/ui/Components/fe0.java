package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fe0 extends AnimatorListenerAdapter {
    public final int f34587a;
    public final ge0 f34588b;

    public fe0(ge0 ge0Var, int i7) {
        this.f34587a = i7;
        this.f34588b = ge0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f34587a) {
            case 0:
                ge0 ge0Var = this.f34588b;
                ge0Var.h = false;
                ge0Var.f34917a = ge0Var.f34919c;
                ge0Var.invalidate();
                int i7 = ge0Var.K;
                if (i7 >= 0) {
                    ge0Var.b(i7);
                    ge0Var.K = -1;
                    return;
                }
                return;
            default:
                ge0 ge0Var2 = this.f34588b;
                ge0Var2.f34922n = false;
                ge0Var2.h = false;
                ge0Var2.invalidate();
                int i10 = ge0Var2.K;
                if (i10 >= 0) {
                    ge0Var2.b(i10);
                    ge0Var2.K = -1;
                }
                ge0Var2.a();
                return;
        }
    }
}
