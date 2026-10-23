package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class xg0 extends AnimatorListenerAdapter {
    public final int f32423a;
    public final ah0 f32424b;

    public xg0(ah0 ah0Var, int i10) {
        this.f32423a = i10;
        this.f32424b = ah0Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32423a) {
            case 0:
                this.f32424b.F = null;
                return;
            default:
                this.f32424b.u();
                return;
        }
    }
}
