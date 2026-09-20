package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n81 extends AnimatorListenerAdapter {
    public boolean f26608a;
    public final View f26609b;
    public final float f26610c;
    public final x81 d;

    public n81(x81 x81Var, View view, float f7) {
        this.d = x81Var;
        this.f26609b = view;
        this.f26610c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f26608a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f26608a) {
            this.d.F(this.f26609b, this.f26610c);
        }
    }
}
