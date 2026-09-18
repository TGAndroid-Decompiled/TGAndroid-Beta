package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class a81 extends AnimatorListenerAdapter {
    public boolean f22351a;
    public final View f22352b;
    public final float f22353c;
    public final j81 d;

    public a81(j81 j81Var, View view, float f7) {
        this.d = j81Var;
        this.f22352b = view;
        this.f22353c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f22351a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f22351a) {
            this.d.F(this.f22352b, this.f22353c);
        }
    }
}
