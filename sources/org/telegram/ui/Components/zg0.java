package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zg0 extends AnimatorListenerAdapter {
    public final int f33382a;
    public final ah0 f33383b;

    public zg0(ah0 ah0Var, int i10) {
        this.f33382a = i10;
        this.f33383b = ah0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f33382a) {
            case 0:
                ah0 ah0Var = this.f33383b;
                ah0Var.h = false;
                ah0Var.f24305a = ah0Var.f24307c;
                ah0Var.invalidate();
                int i10 = ah0Var.J;
                if (i10 >= 0) {
                    ah0Var.b(i10);
                    ah0Var.J = -1;
                    return;
                }
                return;
            default:
                ah0 ah0Var2 = this.f33383b;
                ah0Var2.f24310n = false;
                ah0Var2.h = false;
                ah0Var2.invalidate();
                int i11 = ah0Var2.J;
                if (i11 >= 0) {
                    ah0Var2.b(i11);
                    ah0Var2.J = -1;
                }
                ah0Var2.a();
                return;
        }
    }
}
