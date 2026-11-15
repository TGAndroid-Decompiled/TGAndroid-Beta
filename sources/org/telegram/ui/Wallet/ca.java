package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ki;
public final class ca extends AnimatorListenerAdapter {
    public final ki f43707a;
    public final w6 f43708b;
    public final da f43709c;

    public ca(da daVar, ki kiVar, w6 w6Var) {
        this.f43709c = daVar;
        this.f43707a = kiVar;
        this.f43708b = w6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f43709c.b();
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f43709c.b();
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f43707a != null) {
            org.telegram.messenger.g0.v1(this.f43708b);
        }
    }
}
