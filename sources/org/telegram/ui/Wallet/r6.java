package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.bi;
public final class r6 extends AnimatorListenerAdapter {
    public final bi f35118a;
    public final a7 f35119b;
    public final s6 f35120c;

    public r6(s6 s6Var, bi biVar, a7 a7Var) {
        this.f35120c = s6Var;
        this.f35118a = biVar;
        this.f35119b = a7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f35120c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f35120c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f35118a != null) {
            org.telegram.messenger.i0.v1(this.f35119b);
        }
    }
}
