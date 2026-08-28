package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class df0 extends AnimatorListenerAdapter {
    public final int f27732a;
    public final ef0 f27733b;

    public df0(ef0 ef0Var, int i9) {
        this.f27732a = i9;
        this.f27733b = ef0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27732a) {
            case 0:
                ef0 ef0Var = this.f27733b;
                ef0Var.h = false;
                ef0Var.f28012a = ef0Var.f28014c;
                ef0Var.invalidate();
                int i9 = ef0Var.F;
                if (i9 >= 0) {
                    ef0Var.b(i9);
                    ef0Var.F = -1;
                    return;
                }
                return;
            default:
                ef0 ef0Var2 = this.f27733b;
                ef0Var2.f28017n = false;
                ef0Var2.h = false;
                ef0Var2.invalidate();
                int i10 = ef0Var2.F;
                if (i10 >= 0) {
                    ef0Var2.b(i10);
                    ef0Var2.F = -1;
                }
                ef0Var2.a();
                return;
        }
    }
}
