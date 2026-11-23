package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class od0 extends AnimatorListenerAdapter {
    public final int f38130a;
    public final qd0 f38131b;

    public od0(qd0 qd0Var, int i7) {
        this.f38130a = i7;
        this.f38131b = qd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f38130a) {
            case 0:
                this.f38131b.f38817s = null;
                return;
            default:
                this.f38131b.f38818w = null;
                return;
        }
    }
}
