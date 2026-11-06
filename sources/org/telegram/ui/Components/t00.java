package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t00 extends AnimatorListenerAdapter {
    public final int f38161a;
    public final u00 f38162b;

    public t00(u00 u00Var, int i7) {
        this.f38161a = i7;
        this.f38162b = u00Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38161a) {
            case 0:
                u00 u00Var = this.f38162b;
                org.telegram.messenger.qs.f(u00Var.f38458r.f38766a).j(u00Var.f38456f);
                u00Var.requestLayout();
                return;
            default:
                u00 u00Var2 = this.f38162b;
                u00Var2.d = null;
                u00Var2.f38452a = null;
                u00Var2.f38453b = false;
                return;
        }
    }
}
