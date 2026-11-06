package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class s30 extends AnimatorListenerAdapter {
    public final int f37866a;
    public final o40 f37867b;

    public s30(o40 o40Var, int i7) {
        this.f37866a = i7;
        this.f37867b = o40Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f37866a) {
            case 0:
                o40 o40Var = this.f37867b;
                if (animator.equals(o40Var.K)) {
                    o40Var.K = null;
                    return;
                }
                return;
            case 1:
                o40 o40Var2 = this.f37867b;
                if (o40Var2.f36537k1 != null) {
                    o40Var2.f36537k1 = null;
                    return;
                }
                return;
            default:
                o40 o40Var3 = this.f37867b;
                if (animator.equals(o40Var3.f36520d0)) {
                    o40Var3.c(true);
                    o40Var3.f36527f1 = false;
                    o40Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
