package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ce0 extends AnimatorListenerAdapter {
    public final int f32545a;
    public final de0 f32546b;

    public ce0(de0 de0Var, int i7) {
        this.f32545a = i7;
        this.f32546b = de0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32545a) {
            case 0:
                de0 de0Var = this.f32546b;
                de0Var.h = false;
                de0Var.f32835a = de0Var.f32837c;
                de0Var.invalidate();
                int i7 = de0Var.J;
                if (i7 >= 0) {
                    de0Var.b(i7);
                    de0Var.J = -1;
                    return;
                }
                return;
            default:
                de0 de0Var2 = this.f32546b;
                de0Var2.f32840n = false;
                de0Var2.h = false;
                de0Var2.invalidate();
                int i10 = de0Var2.J;
                if (i10 >= 0) {
                    de0Var2.b(i10);
                    de0Var2.J = -1;
                }
                de0Var2.a();
                return;
        }
    }
}
