package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f25905a;
    public final if0 f25906b;

    public ef0(if0 if0Var, int i10) {
        this.f25905a = i10;
        this.f25906b = if0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25905a) {
            case 0:
                this.f25906b.f27243x = null;
                return;
            default:
                this.f25906b.f27244y = null;
                return;
        }
    }
}
