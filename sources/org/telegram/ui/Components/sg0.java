package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sg0 extends AnimatorListenerAdapter {
    public final int f32553a;
    public final tg0 f32554b;

    public sg0(tg0 tg0Var, int i10) {
        this.f32553a = i10;
        this.f32554b = tg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32553a) {
            case 0:
                tg0 tg0Var = this.f32554b;
                tg0Var.h = false;
                tg0Var.f32990a = tg0Var.f32992c;
                tg0Var.invalidate();
                int i10 = tg0Var.J;
                if (i10 >= 0) {
                    tg0Var.b(i10);
                    tg0Var.J = -1;
                    return;
                }
                return;
            default:
                tg0 tg0Var2 = this.f32554b;
                tg0Var2.f32994n = false;
                tg0Var2.h = false;
                tg0Var2.invalidate();
                int i11 = tg0Var2.J;
                if (i11 >= 0) {
                    tg0Var2.b(i11);
                    tg0Var2.J = -1;
                }
                tg0Var2.a();
                return;
        }
    }
}
