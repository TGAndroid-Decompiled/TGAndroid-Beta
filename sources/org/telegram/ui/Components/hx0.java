package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx0 extends AnimatorListenerAdapter {
    public final int f24857a;
    public final ix0 f24858b;

    public hx0(ix0 ix0Var, int i10) {
        this.f24857a = i10;
        this.f24858b = ix0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24857a) {
            case 0:
                this.f24858b.f25169s.setVisibility(8);
                return;
            case 1:
                this.f24858b.f25169s.setVisibility(8);
                return;
            default:
                this.f24858b.f25169s.setVisibility(8);
                return;
        }
    }
}
