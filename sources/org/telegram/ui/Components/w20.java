package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w20 extends AnimatorListenerAdapter {
    public final int f32615a;
    public final c30 f32616b;

    public w20(c30 c30Var, int i10) {
        this.f32615a = i10;
        this.f32616b = c30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32615a) {
            case 0:
                c30 c30Var = this.f32616b;
                c30Var.f25750b.setVisibility(8);
                c30Var.f25759y = false;
                c30Var.B = 0.0f;
                return;
            default:
                this.f32616b.f25752e.setVisibility(8);
                return;
        }
    }
}
