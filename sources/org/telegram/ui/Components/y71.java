package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class y71 extends AnimatorListenerAdapter {
    public boolean f30175a;
    public final View f30176b;
    public final float f30177c;
    public final h81 d;

    public y71(h81 h81Var, View view, float f7) {
        this.d = h81Var;
        this.f30176b = view;
        this.f30177c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f30175a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30175a) {
            this.d.E(this.f30176b, this.f30177c);
        }
    }
}
