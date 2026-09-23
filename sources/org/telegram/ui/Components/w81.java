package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w81 extends AnimatorListenerAdapter {
    public final int f29577a;
    public final x81 f29578b;

    public w81(x81 x81Var, int i10) {
        this.f29577a = i10;
        this.f29578b = x81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29577a) {
            case 0:
                this.f29578b.f29967y = null;
                return;
            default:
                this.f29578b.f29967y = null;
                return;
        }
    }
}
