package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class q50 extends AnimatorListenerAdapter {
    public final int f31836a;
    public final o60 f31837b;

    public q50(o60 o60Var, int i10) {
        this.f31836a = i10;
        this.f31837b = o60Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31836a) {
            case 0:
                o60 o60Var = this.f31837b;
                if (animator.equals(o60Var.L)) {
                    o60Var.L = null;
                    return;
                }
                return;
            case 1:
                o60 o60Var2 = this.f31837b;
                if (o60Var2.l1 != null) {
                    o60Var2.l1 = null;
                    return;
                }
                return;
            default:
                o60 o60Var3 = this.f31837b;
                if (animator.equals(o60Var3.f31176e0)) {
                    o60Var3.c(true);
                    o60Var3.f31182g1 = false;
                    o60Var3.setVisibility(4);
                    return;
                }
                return;
        }
    }
}
