package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class ww0 extends AnimatorListenerAdapter {
    public final int f29823a;
    public final xw0 f29824b;

    public ww0(xw0 xw0Var, int i10) {
        this.f29823a = i10;
        this.f29824b = xw0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29823a) {
            case 0:
                this.f29824b.f30083s.setVisibility(8);
                return;
            case 1:
                this.f29824b.f30083s.setVisibility(8);
                return;
            default:
                this.f29824b.f30083s.setVisibility(8);
                return;
        }
    }
}
