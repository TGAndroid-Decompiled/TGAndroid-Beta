package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class g61 extends AnimatorListenerAdapter {
    public boolean f33871a;
    public final View f33872b;
    public final float f33873c;
    public final p61 d;

    public g61(p61 p61Var, View view, float f10) {
        this.d = p61Var;
        this.f33872b = view;
        this.f33873c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f33871a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33871a) {
            this.d.F(this.f33872b, this.f33873c);
        }
    }
}
