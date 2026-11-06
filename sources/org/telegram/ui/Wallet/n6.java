package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.di;
public final class n6 extends AnimatorListenerAdapter {
    public final di f42837a;
    public final w6 f42838b;
    public final o6 f42839c;

    public n6(o6 o6Var, di diVar, w6 w6Var) {
        this.f42839c = o6Var;
        this.f42837a = diVar;
        this.f42838b = w6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f42839c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f42839c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f42837a != null) {
            org.telegram.messenger.g0.v1(this.f42838b);
        }
    }
}
