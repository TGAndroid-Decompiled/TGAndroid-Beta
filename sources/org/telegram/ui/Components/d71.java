package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class d71 extends AnimatorListenerAdapter {
    public boolean f27669a;
    public final View f27670b;
    public final float f27671c;
    public final n71 d;

    public d71(n71 n71Var, View view, float f10) {
        this.d = n71Var;
        this.f27670b = view;
        this.f27671c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f27669a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f27669a) {
            this.d.E(this.f27670b, this.f27671c);
        }
    }
}
