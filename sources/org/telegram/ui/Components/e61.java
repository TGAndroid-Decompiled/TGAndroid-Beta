package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class e61 extends AnimatorListenerAdapter {
    public boolean f33295a;
    public final View f33296b;
    public final float f33297c;
    public final n61 d;

    public e61(n61 n61Var, View view, float f10) {
        this.d = n61Var;
        this.f33296b = view;
        this.f33297c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f33295a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33295a) {
            this.d.E(this.f33296b, this.f33297c);
        }
    }
}
