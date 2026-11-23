package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ti;
public final class ra extends AnimatorListenerAdapter {
    public final ti f45026a;
    public final n7 f45027b;
    public final sa f45028c;

    public ra(sa saVar, ti tiVar, n7 n7Var) {
        this.f45028c = saVar;
        this.f45026a = tiVar;
        this.f45027b = n7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f45028c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f45028c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f45026a != null) {
            org.telegram.messenger.g0.v1(this.f45027b);
        }
    }
}
