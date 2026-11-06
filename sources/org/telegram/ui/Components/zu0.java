package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class zu0 extends AnimatorListenerAdapter {
    public final int f41094a;
    public final av0 f41095b;

    public zu0(av0 av0Var, int i7) {
        this.f41094a = i7;
        this.f41095b = av0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f41094a) {
            case 0:
                this.f41095b.f31921s.setVisibility(8);
                return;
            case 1:
                this.f41095b.f31921s.setVisibility(8);
                return;
            default:
                this.f41095b.f31921s.setVisibility(8);
                return;
        }
    }
}
