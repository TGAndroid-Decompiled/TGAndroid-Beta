package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class kx0 extends AnimatorListenerAdapter {
    public final int f25838a;
    public final lx0 f25839b;

    public kx0(lx0 lx0Var, int i10) {
        this.f25838a = i10;
        this.f25839b = lx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25838a) {
            case 0:
                this.f25839b.f26257s.setVisibility(8);
                return;
            case 1:
                this.f25839b.f26257s.setVisibility(8);
                return;
            default:
                this.f25839b.f26257s.setVisibility(8);
                return;
        }
    }
}
