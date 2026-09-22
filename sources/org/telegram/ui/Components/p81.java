package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class p81 extends AnimatorListenerAdapter {
    public boolean f27279a;
    public final View f27280b;
    public final float f27281c;
    public final z81 d;

    public p81(z81 z81Var, View view, float f7) {
        this.d = z81Var;
        this.f27280b = view;
        this.f27281c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f27279a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f27279a) {
            this.d.F(this.f27280b, this.f27281c);
        }
    }
}
