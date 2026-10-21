package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xg0 extends AnimatorListenerAdapter {
    public final int f32419a;
    public final ah0 f32420b;

    public xg0(ah0 ah0Var, int i10) {
        this.f32419a = i10;
        this.f32420b = ah0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32419a) {
            case 0:
                this.f32420b.F = null;
                return;
            default:
                this.f32420b.u();
                return;
        }
    }
}
