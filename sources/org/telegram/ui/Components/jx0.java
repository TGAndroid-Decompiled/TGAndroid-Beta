package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jx0 extends AnimatorListenerAdapter {
    public final int f25528a;
    public final kx0 f25529b;

    public jx0(kx0 kx0Var, int i10) {
        this.f25528a = i10;
        this.f25529b = kx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25528a) {
            case 0:
                this.f25529b.f25860s.setVisibility(8);
                return;
            case 1:
                this.f25529b.f25860s.setVisibility(8);
                return;
            default:
                this.f25529b.f25860s.setVisibility(8);
                return;
        }
    }
}
