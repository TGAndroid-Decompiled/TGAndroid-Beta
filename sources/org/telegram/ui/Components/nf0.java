package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class nf0 extends AnimatorListenerAdapter {
    public final int f29158a;
    public final rf0 f29159b;

    public nf0(rf0 rf0Var, int i10) {
        this.f29158a = i10;
        this.f29159b = rf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29158a) {
            case 0:
                this.f29159b.f30517x = null;
                return;
            default:
                this.f29159b.f30518y = null;
                return;
        }
    }
}
