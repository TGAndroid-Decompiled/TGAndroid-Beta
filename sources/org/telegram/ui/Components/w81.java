package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w81 extends AnimatorListenerAdapter {
    public final int f32211a;
    public final x81 f32212b;

    public w81(x81 x81Var, int i10) {
        this.f32211a = i10;
        this.f32212b = x81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32211a) {
            case 0:
                this.f32212b.f32476y = null;
                return;
            default:
                this.f32212b.f32476y = null;
                return;
        }
    }
}
