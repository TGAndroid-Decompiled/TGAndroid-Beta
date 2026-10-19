package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class u81 extends AnimatorListenerAdapter {
    public boolean f30910a;
    public final View f30911b;
    public final float f30912c;
    public final d91 d;

    public u81(d91 d91Var, View view, float f7) {
        this.d = d91Var;
        this.f30911b = view;
        this.f30912c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f30910a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30910a) {
            this.d.E(this.f30911b, this.f30912c);
        }
    }
}
