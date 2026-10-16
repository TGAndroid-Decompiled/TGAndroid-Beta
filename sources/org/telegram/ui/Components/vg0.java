package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vg0 extends AnimatorListenerAdapter {
    public final int f29640a;
    public final wg0 f29641b;

    public vg0(wg0 wg0Var, int i10) {
        this.f29640a = i10;
        this.f29641b = wg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29640a) {
            case 0:
                wg0 wg0Var = this.f29641b;
                wg0Var.h = false;
                wg0Var.f30567a = wg0Var.f30569c;
                wg0Var.invalidate();
                int i10 = wg0Var.J;
                if (i10 >= 0) {
                    wg0Var.b(i10);
                    wg0Var.J = -1;
                    return;
                }
                return;
            default:
                wg0 wg0Var2 = this.f29641b;
                wg0Var2.f30571n = false;
                wg0Var2.h = false;
                wg0Var2.invalidate();
                int i11 = wg0Var2.J;
                if (i11 >= 0) {
                    wg0Var2.b(i11);
                    wg0Var2.J = -1;
                }
                wg0Var2.a();
                return;
        }
    }
}
