package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xe0 extends AnimatorListenerAdapter {
    public final int f32463a;
    public final ye0 f32464b;

    public xe0(ye0 ye0Var, int i10) {
        this.f32463a = i10;
        this.f32464b = ye0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32463a) {
            case 0:
                ye0 ye0Var = this.f32464b;
                ye0Var.h = false;
                ye0Var.f32701a = ye0Var.f32703c;
                ye0Var.invalidate();
                int i10 = ye0Var.J;
                if (i10 >= 0) {
                    ye0Var.b(i10);
                    ye0Var.J = -1;
                    return;
                }
                return;
            default:
                ye0 ye0Var2 = this.f32464b;
                ye0Var2.f32705n = false;
                ye0Var2.h = false;
                ye0Var2.invalidate();
                int i11 = ye0Var2.J;
                if (i11 >= 0) {
                    ye0Var2.b(i11);
                    ye0Var2.J = -1;
                }
                ye0Var2.a();
                return;
        }
    }
}
