package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class x81 extends AnimatorListenerAdapter {
    public boolean f32832a;
    public final View f32833b;
    public final float f32834c;
    public final h91 d;

    public x81(h91 h91Var, View view, float f7) {
        this.d = h91Var;
        this.f32833b = view;
        this.f32834c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f32832a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f32832a) {
            this.d.F(this.f32833b, this.f32834c);
        }
    }
}
