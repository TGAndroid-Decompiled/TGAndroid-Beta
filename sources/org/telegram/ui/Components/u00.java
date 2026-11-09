package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class u00 extends AnimatorListenerAdapter {
    public final int f38542a;
    public final v00 f38543b;

    public u00(v00 v00Var, int i7) {
        this.f38542a = i7;
        this.f38543b = v00Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38542a) {
            case 0:
                v00 v00Var = this.f38543b;
                org.telegram.messenger.qs.f(v00Var.f38869r.f39850a).j(v00Var.f38867f);
                v00Var.requestLayout();
                return;
            default:
                v00 v00Var2 = this.f38543b;
                v00Var2.d = null;
                v00Var2.f38863a = null;
                v00Var2.f38864b = false;
                return;
        }
    }
}
