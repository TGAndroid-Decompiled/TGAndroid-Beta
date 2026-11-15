package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m61 extends AnimatorListenerAdapter {
    public boolean f37118a;
    public final View f37119b;
    public final float f37120c;
    public final w61 d;

    public m61(w61 w61Var, View view, float f10) {
        this.d = w61Var;
        this.f37119b = view;
        this.f37120c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f37118a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f37118a) {
            this.d.D(this.f37119b, this.f37120c);
        }
    }
}
