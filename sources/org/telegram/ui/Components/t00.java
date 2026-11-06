package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t00 extends AnimatorListenerAdapter {
    public final int f38170a;
    public final u00 f38171b;

    public t00(u00 u00Var, int i7) {
        this.f38170a = i7;
        this.f38171b = u00Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38170a) {
            case 0:
                u00 u00Var = this.f38171b;
                org.telegram.messenger.qs.f(u00Var.f38459r.f38773a).j(u00Var.f38457f);
                u00Var.requestLayout();
                return;
            default:
                u00 u00Var2 = this.f38171b;
                u00Var2.d = null;
                u00Var2.f38453a = null;
                u00Var2.f38454b = false;
                return;
        }
    }
}
