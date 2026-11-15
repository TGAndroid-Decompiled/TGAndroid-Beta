package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class x00 extends AnimatorListenerAdapter {
    public final int f41494a;
    public final y00 f41495b;

    public x00(y00 y00Var, int i7) {
        this.f41494a = i7;
        this.f41495b = y00Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41494a) {
            case 0:
                y00 y00Var = this.f41495b;
                org.telegram.messenger.ns.f(y00Var.f41837r.f42200a).j(y00Var.f41835f);
                y00Var.requestLayout();
                return;
            default:
                y00 y00Var2 = this.f41495b;
                y00Var2.d = null;
                y00Var2.f41831a = null;
                y00Var2.f41832b = false;
                return;
        }
    }
}
