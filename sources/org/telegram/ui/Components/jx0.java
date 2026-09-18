package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class jx0 extends AnimatorListenerAdapter {
    public final int f25477a;
    public final kx0 f25478b;

    public jx0(kx0 kx0Var, int i10) {
        this.f25477a = i10;
        this.f25478b = kx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25477a) {
            case 0:
                this.f25478b.f25870s.setVisibility(8);
                return;
            case 1:
                this.f25478b.f25870s.setVisibility(8);
                return;
            default:
                this.f25478b.f25870s.setVisibility(8);
                return;
        }
    }
}
