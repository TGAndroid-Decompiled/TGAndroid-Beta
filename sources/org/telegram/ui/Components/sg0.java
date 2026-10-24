package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class sg0 extends AnimatorListenerAdapter {
    public final int f30502a;
    public final tg0 f30503b;

    public sg0(tg0 tg0Var, int i10) {
        this.f30502a = i10;
        this.f30503b = tg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30502a) {
            case 0:
                tg0 tg0Var = this.f30503b;
                tg0Var.h = false;
                tg0Var.f30833a = tg0Var.f30835c;
                tg0Var.invalidate();
                int i10 = tg0Var.J;
                if (i10 >= 0) {
                    tg0Var.b(i10);
                    tg0Var.J = -1;
                    return;
                }
                return;
            default:
                tg0 tg0Var2 = this.f30503b;
                tg0Var2.f30837n = false;
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
