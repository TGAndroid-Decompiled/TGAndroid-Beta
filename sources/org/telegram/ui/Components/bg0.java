package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class bg0 extends AnimatorListenerAdapter {
    public final int f25601a;
    public final cg0 f25602b;

    public bg0(cg0 cg0Var, int i10) {
        this.f25601a = i10;
        this.f25602b = cg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25601a) {
            case 0:
                cg0 cg0Var = this.f25602b;
                cg0Var.h = false;
                cg0Var.f25927a = cg0Var.f25929c;
                cg0Var.invalidate();
                int i10 = cg0Var.G;
                if (i10 >= 0) {
                    cg0Var.b(i10);
                    cg0Var.G = -1;
                    return;
                }
                return;
            default:
                cg0 cg0Var2 = this.f25602b;
                cg0Var2.f25932n = false;
                cg0Var2.h = false;
                cg0Var2.invalidate();
                int i11 = cg0Var2.G;
                if (i11 >= 0) {
                    cg0Var2.b(i11);
                    cg0Var2.G = -1;
                }
                cg0Var2.a();
                return;
        }
    }
}
