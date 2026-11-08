package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class l61 extends AnimatorListenerAdapter {
    public boolean f35548a;
    public final View f35549b;
    public final float f35550c;
    public final v61 d;

    public l61(v61 v61Var, View view, float f10) {
        this.d = v61Var;
        this.f35549b = view;
        this.f35550c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f35548a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f35548a) {
            this.d.F(this.f35549b, this.f35550c);
        }
    }
}
