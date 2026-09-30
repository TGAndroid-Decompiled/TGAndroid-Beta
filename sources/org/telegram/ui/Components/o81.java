package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class o81 extends AnimatorListenerAdapter {
    public boolean f27027a;
    public final View f27028b;
    public final float f27029c;
    public final y81 d;

    public o81(y81 y81Var, View view, float f7) {
        this.d = y81Var;
        this.f27028b = view;
        this.f27029c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f27027a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f27027a) {
            this.d.E(this.f27028b, this.f27029c);
        }
    }
}
