package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
public final class m6 extends AnimatorListenerAdapter {
    public final di f42807a;
    public final v6 f42808b;
    public final n6 f42809c;

    public m6(n6 n6Var, di diVar, v6 v6Var) {
        this.f42809c = n6Var;
        this.f42807a = diVar;
        this.f42808b = v6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42809c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42809c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f42807a != null) {
            org.telegram.messenger.g0.v1(this.f42808b);
        }
    }
}
