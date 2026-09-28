package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jx0 extends AnimatorListenerAdapter {
    public final int f25529a;
    public final kx0 f25530b;

    public jx0(kx0 kx0Var, int i10) {
        this.f25529a = i10;
        this.f25530b = kx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25529a) {
            case 0:
                this.f25530b.f25861s.setVisibility(8);
                return;
            case 1:
                this.f25530b.f25861s.setVisibility(8);
                return;
            default:
                this.f25530b.f25861s.setVisibility(8);
                return;
        }
    }
}
