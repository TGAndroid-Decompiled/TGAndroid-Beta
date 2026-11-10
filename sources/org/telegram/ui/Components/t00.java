package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class t00 extends AnimatorListenerAdapter {
    public final int f38114a;
    public final u00 f38115b;

    public t00(u00 u00Var, int i7) {
        this.f38114a = i7;
        this.f38115b = u00Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38114a) {
            case 0:
                u00 u00Var = this.f38115b;
                org.telegram.messenger.qs.f(u00Var.f38463r.f38791a).j(u00Var.f38461f);
                u00Var.requestLayout();
                return;
            default:
                u00 u00Var2 = this.f38115b;
                u00Var2.d = null;
                u00Var2.f38457a = null;
                u00Var2.f38458b = false;
                return;
        }
    }
}
