package org.telegram.ui.Wallet;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import org.telegram.ui.Components.ki;
public final class n6 extends AnimatorListenerAdapter {
    public final ki f44195a;
    public final w6 f44196b;
    public final o6 f44197c;

    public n6(o6 o6Var, ki kiVar, w6 w6Var) {
        this.f44197c = o6Var;
        this.f44195a = kiVar;
        this.f44196b = w6Var;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        this.f44197c.a(false);
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        this.f44197c.a(true);
    }

    @Override
    public final void onAnimationStart(Animator animator) {
        if (this.f44195a != null) {
            org.telegram.messenger.g0.v1(this.f44196b);
        }
    }
}
