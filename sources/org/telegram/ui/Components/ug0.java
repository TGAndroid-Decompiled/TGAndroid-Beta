package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ug0 extends AnimatorListenerAdapter {
    public final int f29684a;
    public final vg0 f29685b;

    public ug0(vg0 vg0Var, int i10) {
        this.f29684a = i10;
        this.f29685b = vg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29684a) {
            case 0:
                vg0 vg0Var = this.f29685b;
                vg0Var.h = false;
                vg0Var.f29961a = vg0Var.f29963c;
                vg0Var.invalidate();
                int i10 = vg0Var.J;
                if (i10 >= 0) {
                    vg0Var.b(i10);
                    vg0Var.J = -1;
                    return;
                }
                return;
            default:
                vg0 vg0Var2 = this.f29685b;
                vg0Var2.f29965n = false;
                vg0Var2.h = false;
                vg0Var2.invalidate();
                int i11 = vg0Var2.J;
                if (i11 >= 0) {
                    vg0Var2.b(i11);
                    vg0Var2.J = -1;
                }
                vg0Var2.a();
                return;
        }
    }
}
