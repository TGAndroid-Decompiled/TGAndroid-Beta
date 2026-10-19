package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ig0 extends AnimatorListenerAdapter {
    public final int f27244a;
    public final jg0 f27245b;

    public ig0(jg0 jg0Var, int i10) {
        this.f27244a = i10;
        this.f27245b = jg0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f27244a) {
            case 0:
                this.f27245b.f27524a.f27845n.setVisibility(8);
                return;
            default:
                this.f27245b.f27524a.h.setVisibility(8);
                return;
        }
    }
}
