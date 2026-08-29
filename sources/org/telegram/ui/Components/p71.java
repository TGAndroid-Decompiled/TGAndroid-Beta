package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class p71 extends AnimatorListenerAdapter {
    public boolean f31611a;
    public final View f31612b;
    public final float f31613c;
    public final z71 d;

    public p71(z71 z71Var, View view, float f9) {
        this.d = z71Var;
        this.f31612b = view;
        this.f31613c = f9;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f31611a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f31611a) {
            this.d.E(this.f31612b, this.f31613c);
        }
    }
}
