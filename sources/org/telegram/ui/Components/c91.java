package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c91 extends AnimatorListenerAdapter {
    public boolean f23659a;
    public final View f23660b;
    public final float f23661c;
    public final l91 d;

    public c91(l91 l91Var, View view, float f7) {
        this.d = l91Var;
        this.f23660b = view;
        this.f23661c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f23659a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f23659a) {
            this.d.E(this.f23660b, this.f23661c);
        }
    }
}
