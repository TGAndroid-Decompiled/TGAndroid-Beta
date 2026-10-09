package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class wg0 extends AnimatorListenerAdapter {
    public final int f32618a;
    public final xg0 f32619b;

    public wg0(xg0 xg0Var, int i10) {
        this.f32618a = i10;
        this.f32619b = xg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32618a) {
            case 0:
                xg0 xg0Var = this.f32619b;
                xg0Var.h = false;
                xg0Var.f32850a = xg0Var.f32852c;
                xg0Var.invalidate();
                int i10 = xg0Var.J;
                if (i10 >= 0) {
                    xg0Var.b(i10);
                    xg0Var.J = -1;
                    return;
                }
                return;
            default:
                xg0 xg0Var2 = this.f32619b;
                xg0Var2.f32855n = false;
                xg0Var2.h = false;
                xg0Var2.invalidate();
                int i11 = xg0Var2.J;
                if (i11 >= 0) {
                    xg0Var2.b(i11);
                    xg0Var2.J = -1;
                }
                xg0Var2.a();
                return;
        }
    }
}
