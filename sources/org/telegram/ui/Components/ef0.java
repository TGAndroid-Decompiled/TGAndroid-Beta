package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f25921a;
    public final if0 f25922b;

    public ef0(if0 if0Var, int i10) {
        this.f25921a = i10;
        this.f25922b = if0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25921a) {
            case 0:
                this.f25922b.f27233x = null;
                return;
            default:
                this.f25922b.f27234y = null;
                return;
        }
    }
}
