package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o81 extends AnimatorListenerAdapter {
    public boolean f27043a;
    public final View f27044b;
    public final float f27045c;
    public final y81 d;

    public o81(y81 y81Var, View view, float f7) {
        this.d = y81Var;
        this.f27044b = view;
        this.f27045c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f27043a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f27043a) {
            this.d.F(this.f27044b, this.f27045c);
        }
    }
}
