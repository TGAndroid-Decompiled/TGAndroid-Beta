package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ix0 extends AnimatorListenerAdapter {
    public final int f25151a;
    public final jx0 f25152b;

    public ix0(jx0 jx0Var, int i10) {
        this.f25151a = i10;
        this.f25152b = jx0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f25151a) {
            case 0:
                this.f25152b.f25554s.setVisibility(8);
                return;
            case 1:
                this.f25152b.f25554s.setVisibility(8);
                return;
            default:
                this.f25152b.f25554s.setVisibility(8);
                return;
        }
    }
}
