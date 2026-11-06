package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
public final class aa extends AnimatorListenerAdapter {
    public final di f42085a;
    public final w6 f42086b;
    public final ba f42087c;

    public aa(ba baVar, di diVar, w6 w6Var) {
        this.f42087c = baVar;
        this.f42085a = diVar;
        this.f42086b = w6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42087c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42087c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f42085a != null) {
            org.telegram.messenger.g0.v1(this.f42086b);
        }
    }
}
