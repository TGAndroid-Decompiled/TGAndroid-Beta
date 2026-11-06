package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
public final class aa extends AnimatorListenerAdapter {
    public final di f42110a;
    public final w6 f42111b;
    public final ba f42112c;

    public aa(ba baVar, di diVar, w6 w6Var) {
        this.f42112c = baVar;
        this.f42110a = diVar;
        this.f42111b = w6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42112c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42112c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f42110a != null) {
            org.telegram.messenger.g0.v1(this.f42111b);
        }
    }
}
