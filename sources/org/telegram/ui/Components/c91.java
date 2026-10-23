package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class c91 extends AnimatorListenerAdapter {
    public boolean f25272a;
    public final View f25273b;
    public final float f25274c;
    public final l91 d;

    public c91(l91 l91Var, View view, float f7) {
        this.d = l91Var;
        this.f25273b = view;
        this.f25274c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f25272a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f25272a) {
            this.d.E(this.f25273b, this.f25274c);
        }
    }
}
