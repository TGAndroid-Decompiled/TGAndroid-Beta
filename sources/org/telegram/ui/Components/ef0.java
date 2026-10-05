package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f26140a;
    public final gf0 f26141b;

    public ef0(gf0 gf0Var, int i10) {
        this.f26140a = i10;
        this.f26141b = gf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26140a) {
            case 0:
                this.f26141b.f26911s = null;
                return;
            default:
                this.f26141b.v = null;
                return;
        }
    }
}
