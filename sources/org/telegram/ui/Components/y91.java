package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class y91 extends AnimatorListenerAdapter {
    public final int f32858a;
    public final z91 f32859b;

    public y91(z91 z91Var, int i10) {
        this.f32858a = i10;
        this.f32859b = z91Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32858a) {
            case 0:
                this.f32859b.f33196y = null;
                return;
            default:
                this.f32859b.f33196y = null;
                return;
        }
    }
}
