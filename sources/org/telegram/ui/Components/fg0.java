package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class fg0 extends AnimatorListenerAdapter {
    public final int f24226a;
    public final gg0 f24227b;

    public fg0(gg0 gg0Var, int i10) {
        this.f24226a = i10;
        this.f24227b = gg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24226a) {
            case 0:
                gg0 gg0Var = this.f24227b;
                gg0Var.h = false;
                gg0Var.f24518a = gg0Var.f24520c;
                gg0Var.invalidate();
                int i10 = gg0Var.J;
                if (i10 >= 0) {
                    gg0Var.b(i10);
                    gg0Var.J = -1;
                    return;
                }
                return;
            default:
                gg0 gg0Var2 = this.f24227b;
                gg0Var2.f24522n = false;
                gg0Var2.h = false;
                gg0Var2.invalidate();
                int i11 = gg0Var2.J;
                if (i11 >= 0) {
                    gg0Var2.b(i11);
                    gg0Var2.J = -1;
                }
                gg0Var2.a();
                return;
        }
    }
}
