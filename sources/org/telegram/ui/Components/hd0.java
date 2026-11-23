package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class hd0 extends AnimatorListenerAdapter {
    public final int f35715a;
    public final kd0 f35716b;

    public hd0(kd0 kd0Var, int i7) {
        this.f35715a = i7;
        this.f35716b = kd0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f35715a) {
            case 0:
                this.f35716b.f36715x1 = null;
                return;
            default:
                this.f35716b.f36716y1 = null;
                return;
        }
    }
}
