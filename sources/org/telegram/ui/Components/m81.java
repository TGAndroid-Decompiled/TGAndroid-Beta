package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m81 extends AnimatorListenerAdapter {
    public boolean f26407a;
    public final View f26408b;
    public final float f26409c;
    public final w81 d;

    public m81(w81 w81Var, View view, float f7) {
        this.d = w81Var;
        this.f26408b = view;
        this.f26409c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f26407a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f26407a) {
            this.d.E(this.f26408b, this.f26409c);
        }
    }
}
