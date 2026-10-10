package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class vf0 extends AnimatorListenerAdapter {
    public final int f31835a;
    public final xf0 f31836b;

    public vf0(xf0 xf0Var, int i10) {
        this.f31835a = i10;
        this.f31836b = xf0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f31835a) {
            case 0:
                this.f31836b.f32914s = null;
                return;
            default:
                this.f31836b.v = null;
                return;
        }
    }
}
