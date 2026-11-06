package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k61 extends AnimatorListenerAdapter {
    public boolean f35187a;
    public final View f35188b;
    public final float f35189c;
    public final u61 d;

    public k61(u61 u61Var, View view, float f10) {
        this.d = u61Var;
        this.f35188b = view;
        this.f35189c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f35187a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f35187a) {
            this.d.F(this.f35188b, this.f35189c);
        }
    }
}
