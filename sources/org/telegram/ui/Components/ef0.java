package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f24003a;
    public final gf0 f24004b;

    public ef0(gf0 gf0Var, int i10) {
        this.f24003a = i10;
        this.f24004b = gf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24003a) {
            case 0:
                this.f24004b.f24545s = null;
                return;
            default:
                this.f24004b.v = null;
                return;
        }
    }
}
