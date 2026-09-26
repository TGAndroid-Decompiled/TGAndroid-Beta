package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n81 extends AnimatorListenerAdapter {
    public boolean f26716a;
    public final View f26717b;
    public final float f26718c;
    public final x81 d;

    public n81(x81 x81Var, View view, float f7) {
        this.d = x81Var;
        this.f26717b = view;
        this.f26718c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f26716a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f26716a) {
            this.d.E(this.f26717b, this.f26718c);
        }
    }
}
