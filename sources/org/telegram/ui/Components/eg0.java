package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class eg0 extends AnimatorListenerAdapter {
    public final int f23956a;
    public final fg0 f23957b;

    public eg0(fg0 fg0Var, int i10) {
        this.f23956a = i10;
        this.f23957b = fg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23956a) {
            case 0:
                fg0 fg0Var = this.f23957b;
                fg0Var.h = false;
                fg0Var.f24174a = fg0Var.f24176c;
                fg0Var.invalidate();
                int i10 = fg0Var.J;
                if (i10 >= 0) {
                    fg0Var.b(i10);
                    fg0Var.J = -1;
                    return;
                }
                return;
            default:
                fg0 fg0Var2 = this.f23957b;
                fg0Var2.f24178n = false;
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
