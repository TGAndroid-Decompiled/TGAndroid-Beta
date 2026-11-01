package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.bi;
public final class ea extends AnimatorListenerAdapter {
    public final bi f34470a;
    public final a7 f34471b;
    public final fa f34472c;

    public ea(fa faVar, bi biVar, a7 a7Var) {
        this.f34472c = faVar;
        this.f34470a = biVar;
        this.f34471b = a7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f34472c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f34472c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f34470a != null) {
            org.telegram.messenger.i0.v1(this.f34471b);
        }
    }
}
