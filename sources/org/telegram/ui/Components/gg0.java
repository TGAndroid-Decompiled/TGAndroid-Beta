package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class gg0 extends AnimatorListenerAdapter {
    public final int f24549a;
    public final hg0 f24550b;

    public gg0(hg0 hg0Var, int i10) {
        this.f24549a = i10;
        this.f24550b = hg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24549a) {
            case 0:
                hg0 hg0Var = this.f24550b;
                hg0Var.h = false;
                hg0Var.f24815a = hg0Var.f24817c;
                hg0Var.invalidate();
                int i10 = hg0Var.J;
                if (i10 >= 0) {
                    hg0Var.b(i10);
                    hg0Var.J = -1;
                    return;
                }
                return;
            default:
                hg0 hg0Var2 = this.f24550b;
                hg0Var2.f24819n = false;
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
