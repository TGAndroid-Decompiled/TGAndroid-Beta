package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hx0 extends AnimatorListenerAdapter {
    public final int f24882a;
    public final ix0 f24883b;

    public hx0(ix0 ix0Var, int i10) {
        this.f24882a = i10;
        this.f24883b = ix0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f24882a) {
            case 0:
                this.f24883b.f25194s.setVisibility(8);
                return;
            case 1:
                this.f24883b.f25194s.setVisibility(8);
                return;
            default:
                this.f24883b.f25194s.setVisibility(8);
                return;
        }
    }
}
