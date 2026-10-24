package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c91 extends AnimatorListenerAdapter {
    public boolean f25271a;
    public final View f25272b;
    public final float f25273c;
    public final l91 d;

    public c91(l91 l91Var, View view, float f7) {
        this.d = l91Var;
        this.f25272b = view;
        this.f25273c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f25271a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f25271a) {
            this.d.E(this.f25272b, this.f25273c);
        }
    }
}
