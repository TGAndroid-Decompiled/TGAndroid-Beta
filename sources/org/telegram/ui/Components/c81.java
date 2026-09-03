package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c81 extends AnimatorListenerAdapter {
    public boolean f25837a;
    public final View f25838b;
    public final float f25839c;
    public final l81 d;

    public c81(l81 l81Var, View view, float f10) {
        this.d = l81Var;
        this.f25838b = view;
        this.f25839c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f25837a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f25837a) {
            this.d.E(this.f25838b, this.f25839c);
        }
    }
}
