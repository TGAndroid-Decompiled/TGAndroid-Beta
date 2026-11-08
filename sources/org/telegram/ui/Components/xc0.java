package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xc0 extends AnimatorListenerAdapter {
    public final int f40290a;
    public final ad0 f40291b;

    public xc0(ad0 ad0Var, int i7) {
        this.f40290a = i7;
        this.f40291b = ad0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f40290a) {
            case 0:
                this.f40291b.f31783t1 = null;
                return;
            default:
                this.f40291b.f31784u1 = null;
                return;
        }
    }
}
