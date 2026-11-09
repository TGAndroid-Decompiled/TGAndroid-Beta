package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
public final class y9 extends AnimatorListenerAdapter {
    public final di f43394a;
    public final u6 f43395b;
    public final z9 f43396c;

    public y9(z9 z9Var, di diVar, u6 u6Var) {
        this.f43396c = z9Var;
        this.f43394a = diVar;
        this.f43395b = u6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f43396c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43396c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f43394a != null) {
            org.telegram.messenger.g0.v1(this.f43395b);
        }
    }
}
