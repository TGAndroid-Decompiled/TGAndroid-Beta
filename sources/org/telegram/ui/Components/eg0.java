package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eg0 extends AnimatorListenerAdapter {
    public final int f23940a;
    public final fg0 f23941b;

    public eg0(fg0 fg0Var, int i10) {
        this.f23940a = i10;
        this.f23941b = fg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23940a) {
            case 0:
                fg0 fg0Var = this.f23941b;
                fg0Var.h = false;
                fg0Var.f24158a = fg0Var.f24160c;
                fg0Var.invalidate();
                int i10 = fg0Var.J;
                if (i10 >= 0) {
                    fg0Var.b(i10);
                    fg0Var.J = -1;
                    return;
                }
                return;
            default:
                fg0 fg0Var2 = this.f23941b;
                fg0Var2.f24162n = false;
                fg0Var2.h = false;
                fg0Var2.invalidate();
                int i11 = fg0Var2.J;
                if (i11 >= 0) {
                    fg0Var2.b(i11);
                    fg0Var2.J = -1;
                }
                fg0Var2.a();
                return;
        }
    }
}
