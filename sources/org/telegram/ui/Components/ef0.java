package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f24001a;
    public final gf0 f24002b;

    public ef0(gf0 gf0Var, int i10) {
        this.f24001a = i10;
        this.f24002b = gf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24001a) {
            case 0:
                this.f24002b.f24547s = null;
                return;
            default:
                this.f24002b.v = null;
                return;
        }
    }
}
