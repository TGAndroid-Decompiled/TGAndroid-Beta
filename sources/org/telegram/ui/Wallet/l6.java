package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.bi;
public final class l6 extends AnimatorListenerAdapter {
    public final bi f42786a;
    public final u6 f42787b;
    public final m6 f42788c;

    public l6(m6 m6Var, bi biVar, u6 u6Var) {
        this.f42788c = m6Var;
        this.f42786a = biVar;
        this.f42787b = u6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42788c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42788c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f42786a != null) {
            org.telegram.messenger.g0.v1(this.f42787b);
        }
    }
}
