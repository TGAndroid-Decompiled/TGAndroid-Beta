package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class pf0 extends AnimatorListenerAdapter {
    public final int f29546a;
    public final rf0 f29547b;

    public pf0(rf0 rf0Var, int i10) {
        this.f29546a = i10;
        this.f29547b = rf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29546a) {
            case 0:
                this.f29547b.f30168s = null;
                return;
            default:
                this.f29547b.v = null;
                return;
        }
    }
}
