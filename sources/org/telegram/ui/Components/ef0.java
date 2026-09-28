package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ef0 extends AnimatorListenerAdapter {
    public final int f24004a;
    public final gf0 f24005b;

    public ef0(gf0 gf0Var, int i10) {
        this.f24004a = i10;
        this.f24005b = gf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24004a) {
            case 0:
                this.f24005b.f24546s = null;
                return;
            default:
                this.f24005b.v = null;
                return;
        }
    }
}
