package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class z71 extends AnimatorListenerAdapter {
    public boolean f33093a;
    public final View f33094b;
    public final float f33095c;
    public final i81 d;

    public z71(i81 i81Var, View view, float f7) {
        this.d = i81Var;
        this.f33094b = view;
        this.f33095c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f33093a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33093a) {
            this.d.E(this.f33094b, this.f33095c);
        }
    }
}
