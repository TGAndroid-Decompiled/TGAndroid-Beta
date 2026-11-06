package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
public final class n6 extends AnimatorListenerAdapter {
    public final di f42838a;
    public final w6 f42839b;
    public final o6 f42840c;

    public n6(o6 o6Var, di diVar, w6 w6Var) {
        this.f42840c = o6Var;
        this.f42838a = diVar;
        this.f42839b = w6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42840c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42840c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f42838a != null) {
            org.telegram.messenger.g0.v1(this.f42839b);
        }
    }
}
