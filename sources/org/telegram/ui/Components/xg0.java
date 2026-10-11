package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xg0 extends AnimatorListenerAdapter {
    public final int f32978a;
    public final yg0 f32979b;

    public xg0(yg0 yg0Var, int i10) {
        this.f32978a = i10;
        this.f32979b = yg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32978a) {
            case 0:
                yg0 yg0Var = this.f32979b;
                yg0Var.h = false;
                yg0Var.f33245a = yg0Var.f33247c;
                yg0Var.invalidate();
                int i10 = yg0Var.J;
                if (i10 >= 0) {
                    yg0Var.b(i10);
                    yg0Var.J = -1;
                    return;
                }
                return;
            default:
                yg0 yg0Var2 = this.f32979b;
                yg0Var2.f33250n = false;
                yg0Var2.h = false;
                yg0Var2.invalidate();
                int i11 = yg0Var2.J;
                if (i11 >= 0) {
                    yg0Var2.b(i11);
                    yg0Var2.J = -1;
                }
                yg0Var2.a();
                return;
        }
    }
}
