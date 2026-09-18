package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n81 extends AnimatorListenerAdapter {
    public boolean f26624a;
    public final View f26625b;
    public final float f26626c;
    public final x81 d;

    public n81(x81 x81Var, View view, float f7) {
        this.d = x81Var;
        this.f26625b = view;
        this.f26626c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f26624a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f26624a) {
            this.d.F(this.f26625b, this.f26626c);
        }
    }
}
