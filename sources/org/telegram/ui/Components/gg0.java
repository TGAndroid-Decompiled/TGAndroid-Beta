package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gg0 extends AnimatorListenerAdapter {
    public final int f24551a;
    public final hg0 f24552b;

    public gg0(hg0 hg0Var, int i10) {
        this.f24551a = i10;
        this.f24552b = hg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24551a) {
            case 0:
                hg0 hg0Var = this.f24552b;
                hg0Var.h = false;
                hg0Var.f24796a = hg0Var.f24798c;
                hg0Var.invalidate();
                int i10 = hg0Var.J;
                if (i10 >= 0) {
                    hg0Var.b(i10);
                    hg0Var.J = -1;
                    return;
                }
                return;
            default:
                hg0 hg0Var2 = this.f24552b;
                hg0Var2.f24800n = false;
                hg0Var2.h = false;
                hg0Var2.invalidate();
                int i11 = hg0Var2.J;
                if (i11 >= 0) {
                    hg0Var2.b(i11);
                    hg0Var2.J = -1;
                }
                hg0Var2.a();
                return;
        }
    }
}
