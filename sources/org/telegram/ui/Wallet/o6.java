package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ci;
public final class o6 extends AnimatorListenerAdapter {
    public final ci f42909a;
    public final x6 f42910b;
    public final p6 f42911c;

    public o6(p6 p6Var, ci ciVar, x6 x6Var) {
        this.f42911c = p6Var;
        this.f42909a = ciVar;
        this.f42910b = x6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42911c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42911c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f42909a != null) {
            org.telegram.messenger.g0.v1(this.f42910b);
        }
    }
}
