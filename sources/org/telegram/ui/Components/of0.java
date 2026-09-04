package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class of0 extends AnimatorListenerAdapter {
    public final int f29043a;
    public final pf0 f29044b;

    public of0(pf0 pf0Var, int i10) {
        this.f29043a = i10;
        this.f29044b = pf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29043a) {
            case 0:
                this.f29044b.f29367a.f29712n.setVisibility(8);
                return;
            default:
                this.f29044b.f29367a.h.setVisibility(8);
                return;
        }
    }
}
