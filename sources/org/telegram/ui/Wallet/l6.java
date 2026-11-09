package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
public final class l6 extends AnimatorListenerAdapter {
    public final di f42725a;
    public final u6 f42726b;
    public final m6 f42727c;

    public l6(m6 m6Var, di diVar, u6 u6Var) {
        this.f42727c = m6Var;
        this.f42725a = diVar;
        this.f42726b = u6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42727c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42727c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f42725a != null) {
            org.telegram.messenger.g0.v1(this.f42726b);
        }
    }
}
