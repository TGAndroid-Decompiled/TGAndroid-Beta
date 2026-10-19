package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class u81 extends AnimatorListenerAdapter {
    public boolean f30912a;
    public final View f30913b;
    public final float f30914c;
    public final d91 d;

    public u81(d91 d91Var, View view, float f7) {
        this.d = d91Var;
        this.f30913b = view;
        this.f30914c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f30912a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30912a) {
            this.d.E(this.f30913b, this.f30914c);
        }
    }
}
