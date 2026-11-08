package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
public final class z9 extends AnimatorListenerAdapter {
    public final di f43476a;
    public final v6 f43477b;
    public final aa f43478c;

    public z9(aa aaVar, di diVar, v6 v6Var) {
        this.f43478c = aaVar;
        this.f43476a = diVar;
        this.f43477b = v6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f43478c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43478c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f43476a != null) {
            org.telegram.messenger.g0.v1(this.f43477b);
        }
    }
}
