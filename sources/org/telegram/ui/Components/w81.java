package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class w81 extends AnimatorListenerAdapter {
    public boolean f32484a;
    public final View f32485b;
    public final float f32486c;
    public final g91 d;

    public w81(g91 g91Var, View view, float f7) {
        this.d = g91Var;
        this.f32485b = view;
        this.f32486c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f32484a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f32484a) {
            this.d.F(this.f32485b, this.f32486c);
        }
    }
}
