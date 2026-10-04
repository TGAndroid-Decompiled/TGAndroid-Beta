package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f26065a;
    public final gf0 f26066b;

    public ef0(gf0 gf0Var, int i10) {
        this.f26065a = i10;
        this.f26066b = gf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26065a) {
            case 0:
                this.f26066b.f26856s = null;
                return;
            default:
                this.f26066b.v = null;
                return;
        }
    }
}
