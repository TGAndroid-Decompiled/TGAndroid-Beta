package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class z71 extends AnimatorListenerAdapter {
    public boolean f33119a;
    public final View f33120b;
    public final float f33121c;
    public final i81 d;

    public z71(i81 i81Var, View view, float f7) {
        this.d = i81Var;
        this.f33120b = view;
        this.f33121c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f33119a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33119a) {
            this.d.E(this.f33120b, this.f33121c);
        }
    }
}
