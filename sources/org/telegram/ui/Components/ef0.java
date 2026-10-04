package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f26071a;
    public final gf0 f26072b;

    public ef0(gf0 gf0Var, int i10) {
        this.f26071a = i10;
        this.f26072b = gf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f26071a) {
            case 0:
                this.f26072b.f26862s = null;
                return;
            default:
                this.f26072b.v = null;
                return;
        }
    }
}
