package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class mf0 extends AnimatorListenerAdapter {
    public final int f28510a;
    public final of0 f28511b;

    public mf0(of0 of0Var, int i10) {
        this.f28510a = i10;
        this.f28511b = of0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f28510a) {
            case 0:
                this.f28511b.f29042s = null;
                return;
            default:
                this.f28511b.v = null;
                return;
        }
    }
}
