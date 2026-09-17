package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f29071a;
    public final pf0 f29072b;

    public of0(pf0 pf0Var, int i10) {
        this.f29071a = i10;
        this.f29072b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29071a) {
            case 0:
                this.f29072b.f29395a.f29740n.setVisibility(8);
                return;
            default:
                this.f29072b.f29395a.h.setVisibility(8);
                return;
        }
    }
}
