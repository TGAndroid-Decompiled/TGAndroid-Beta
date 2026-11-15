package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x00 extends AnimatorListenerAdapter {
    public final int f41497a;
    public final y00 f41498b;

    public x00(y00 y00Var, int i7) {
        this.f41497a = i7;
        this.f41498b = y00Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41497a) {
            case 0:
                y00 y00Var = this.f41498b;
                org.telegram.messenger.ns.f(y00Var.f41829r.f42202a).j(y00Var.f41827f);
                y00Var.requestLayout();
                return;
            default:
                y00 y00Var2 = this.f41498b;
                y00Var2.d = null;
                y00Var2.f41823a = null;
                y00Var2.f41824b = false;
                return;
        }
    }
}
