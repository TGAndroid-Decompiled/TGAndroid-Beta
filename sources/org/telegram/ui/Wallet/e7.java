package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ti;
public final class e7 extends AnimatorListenerAdapter {
    public final ti f44219a;
    public final n7 f44220b;
    public final f7 f44221c;

    public e7(f7 f7Var, ti tiVar, n7 n7Var) {
        this.f44221c = f7Var;
        this.f44219a = tiVar;
        this.f44220b = n7Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f44221c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44221c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f44219a != null) {
            org.telegram.messenger.g0.v1(this.f44220b);
        }
    }
}
