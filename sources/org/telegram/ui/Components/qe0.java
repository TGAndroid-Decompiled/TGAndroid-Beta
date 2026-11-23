package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class qe0 extends AnimatorListenerAdapter {
    public final int f38821a;
    public final re0 f38822b;

    public qe0(re0 re0Var, int i7) {
        this.f38821a = i7;
        this.f38822b = re0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38821a) {
            case 0:
                re0 re0Var = this.f38822b;
                re0Var.h = false;
                re0Var.f39278a = re0Var.f39280c;
                re0Var.invalidate();
                int i7 = re0Var.K;
                if (i7 >= 0) {
                    re0Var.b(i7);
                    re0Var.K = -1;
                    return;
                }
                return;
            default:
                re0 re0Var2 = this.f38822b;
                re0Var2.f39283n = false;
                re0Var2.h = false;
                re0Var2.invalidate();
                int i10 = re0Var2.K;
                if (i10 >= 0) {
                    re0Var2.b(i10);
                    re0Var2.K = -1;
                }
                re0Var2.a();
                return;
        }
    }
}
