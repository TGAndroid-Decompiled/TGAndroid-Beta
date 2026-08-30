package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class b81 extends AnimatorListenerAdapter {
    public boolean f23593a;
    public final View f23594b;
    public final float f23595c;
    public final l81 d;

    public b81(l81 l81Var, View view, float f10) {
        this.d = l81Var;
        this.f23594b = view;
        this.f23595c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f23593a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f23593a) {
            this.d.E(this.f23594b, this.f23595c);
        }
    }
}
