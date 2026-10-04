package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class w81 extends AnimatorListenerAdapter {
    public boolean f32483a;
    public final View f32484b;
    public final float f32485c;
    public final g91 d;

    public w81(g91 g91Var, View view, float f7) {
        this.d = g91Var;
        this.f32484b = view;
        this.f32485c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f32483a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f32483a) {
            this.d.F(this.f32484b, this.f32485c);
        }
    }
}
