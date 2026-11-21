package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class re0 extends AnimatorListenerAdapter {
    public final int f39166a;
    public final se0 f39167b;

    public re0(se0 se0Var, int i7) {
        this.f39166a = i7;
        this.f39167b = se0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f39166a) {
            case 0:
                se0 se0Var = this.f39167b;
                se0Var.h = false;
                se0Var.f39569a = se0Var.f39571c;
                se0Var.invalidate();
                int i7 = se0Var.K;
                if (i7 >= 0) {
                    se0Var.b(i7);
                    se0Var.K = -1;
                    return;
                }
                return;
            default:
                se0 se0Var2 = this.f39167b;
                se0Var2.f39574n = false;
                se0Var2.h = false;
                se0Var2.invalidate();
                int i10 = se0Var2.K;
                if (i10 >= 0) {
                    se0Var2.b(i10);
                    se0Var2.K = -1;
                }
                se0Var2.a();
                return;
        }
    }
}
