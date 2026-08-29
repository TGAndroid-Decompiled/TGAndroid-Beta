package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kf0 extends AnimatorListenerAdapter {
    public final int f30034a;
    public final lf0 f30035b;

    public kf0(lf0 lf0Var, int i10) {
        this.f30034a = i10;
        this.f30035b = lf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f30034a) {
            case 0:
                this.f30035b.f30303a.f30676n.setVisibility(8);
                return;
            default:
                this.f30035b.f30303a.h.setVisibility(8);
                return;
        }
    }
}
