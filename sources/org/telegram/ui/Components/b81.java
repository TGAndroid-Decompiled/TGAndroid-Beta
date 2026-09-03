package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class b81 extends AnimatorListenerAdapter {
    public boolean f23580a;
    public final View f23581b;
    public final float f23582c;
    public final l81 d;

    public b81(l81 l81Var, View view, float f10) {
        this.d = l81Var;
        this.f23581b = view;
        this.f23582c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f23580a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f23580a) {
            this.d.E(this.f23581b, this.f23582c);
        }
    }
}
