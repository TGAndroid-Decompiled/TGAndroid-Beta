package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class og0 extends AnimatorListenerAdapter {
    public final int f28980a;
    public final pg0 f28981b;

    public og0(pg0 pg0Var, int i10) {
        this.f28980a = i10;
        this.f28981b = pg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28980a) {
            case 0:
                pg0 pg0Var = this.f28981b;
                pg0Var.h = false;
                pg0Var.f29296a = pg0Var.f29298c;
                pg0Var.invalidate();
                int i10 = pg0Var.J;
                if (i10 >= 0) {
                    pg0Var.b(i10);
                    pg0Var.J = -1;
                    return;
                }
                return;
            default:
                pg0 pg0Var2 = this.f28981b;
                pg0Var2.f29300n = false;
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
