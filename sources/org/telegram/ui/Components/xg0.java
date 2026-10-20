package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xg0 extends AnimatorListenerAdapter {
    public final int f32418a;
    public final ah0 f32419b;

    public xg0(ah0 ah0Var, int i10) {
        this.f32418a = i10;
        this.f32419b = ah0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32418a) {
            case 0:
                this.f32419b.F = null;
                return;
            default:
                this.f32419b.u();
                return;
        }
    }
}
