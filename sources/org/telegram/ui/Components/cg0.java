package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class cg0 extends AnimatorListenerAdapter {
    public final int f23287a;
    public final dg0 f23288b;

    public cg0(dg0 dg0Var, int i10) {
        this.f23287a = i10;
        this.f23288b = dg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f23287a) {
            case 0:
                dg0 dg0Var = this.f23288b;
                dg0Var.h = false;
                dg0Var.f23584a = dg0Var.f23586c;
                dg0Var.invalidate();
                int i10 = dg0Var.J;
                if (i10 >= 0) {
                    dg0Var.b(i10);
                    dg0Var.J = -1;
                    return;
                }
                return;
            default:
                dg0 dg0Var2 = this.f23288b;
                dg0Var2.f23588n = false;
                dg0Var2.h = false;
                dg0Var2.invalidate();
                int i11 = dg0Var2.J;
                if (i11 >= 0) {
                    dg0Var2.b(i11);
                    dg0Var2.J = -1;
                }
                dg0Var2.a();
                return;
        }
    }
}
