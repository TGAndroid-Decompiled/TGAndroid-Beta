package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ci;
public final class ba extends AnimatorListenerAdapter {
    public final ci f42188a;
    public final x6 f42189b;
    public final ca f42190c;

    public ba(ca caVar, ci ciVar, x6 x6Var) {
        this.f42190c = caVar;
        this.f42188a = ciVar;
        this.f42189b = x6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42190c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42190c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f42188a != null) {
            org.telegram.messenger.g0.v1(this.f42189b);
        }
    }
}
