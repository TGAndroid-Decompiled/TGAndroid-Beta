package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vf0 extends AnimatorListenerAdapter {
    public final int f31782a;
    public final xf0 f31783b;

    public vf0(xf0 xf0Var, int i10) {
        this.f31782a = i10;
        this.f31783b = xf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31782a) {
            case 0:
                this.f31783b.f32890s = null;
                return;
            default:
                this.f31783b.v = null;
                return;
        }
    }
}
