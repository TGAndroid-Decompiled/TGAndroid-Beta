package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class p91 extends AnimatorListenerAdapter {
    public final int f29250a;
    public final q91 f29251b;

    public p91(q91 q91Var, int i10) {
        this.f29250a = i10;
        this.f29251b = q91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f29250a) {
            case 0:
                this.f29251b.f29622y = null;
                return;
            default:
                this.f29251b.f29622y = null;
                return;
        }
    }
}
