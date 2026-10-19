package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f28999a;
    public final pg0 f29000b;

    public og0(pg0 pg0Var, int i10) {
        this.f28999a = i10;
        this.f29000b = pg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28999a) {
            case 0:
                pg0 pg0Var = this.f29000b;
                pg0Var.h = false;
                pg0Var.f29259a = pg0Var.f29261c;
                pg0Var.invalidate();
                int i10 = pg0Var.J;
                if (i10 >= 0) {
                    pg0Var.b(i10);
                    pg0Var.J = -1;
                    return;
                }
                return;
            default:
                pg0 pg0Var2 = this.f29000b;
                pg0Var2.f29263n = false;
                pg0Var2.h = false;
                pg0Var2.invalidate();
                int i11 = pg0Var2.J;
                if (i11 >= 0) {
                    pg0Var2.b(i11);
                    pg0Var2.J = -1;
                }
                pg0Var2.a();
                return;
        }
    }
}
