package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w20 extends AnimatorListenerAdapter {
    public final int f32612a;
    public final c30 f32613b;

    public w20(c30 c30Var, int i10) {
        this.f32612a = i10;
        this.f32613b = c30Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32612a) {
            case 0:
                c30 c30Var = this.f32613b;
                c30Var.f25772b.setVisibility(8);
                c30Var.f25781y = false;
                c30Var.B = 0.0f;
                return;
            default:
                this.f32613b.f25774e.setVisibility(8);
                return;
        }
    }
}
