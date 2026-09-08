package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
public final class w81 extends AnimatorListenerAdapter {
    public final int f32237a;
    public final x81 f32238b;

    public w81(x81 x81Var, int i10) {
        this.f32237a = i10;
        this.f32238b = x81Var;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        switch (this.f32237a) {
            case 0:
                this.f32238b.f32502y = null;
                return;
            default:
                this.f32238b.f32502y = null;
                return;
        }
    }
}
