package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class od0 extends AnimatorListenerAdapter {
    public final int f38068a;
    public final qd0 f38069b;

    public od0(qd0 qd0Var, int i7) {
        this.f38068a = i7;
        this.f38069b = qd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38068a) {
            case 0:
                this.f38069b.f38769s = null;
                return;
            default:
                this.f38069b.f38770w = null;
                return;
        }
    }
}
