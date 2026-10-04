package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f26066a;
    public final gf0 f26067b;

    public ef0(gf0 gf0Var, int i10) {
        this.f26066a = i10;
        this.f26067b = gf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26066a) {
            case 0:
                this.f26067b.f26857s = null;
                return;
            default:
                this.f26067b.v = null;
                return;
        }
    }
}
