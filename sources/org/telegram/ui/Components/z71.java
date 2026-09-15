package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class z71 extends AnimatorListenerAdapter {
    public boolean f30494a;
    public final View f30495b;
    public final float f30496c;
    public final i81 d;

    public z71(i81 i81Var, View view, float f7) {
        this.d = i81Var;
        this.f30495b = view;
        this.f30496c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f30494a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f30494a) {
            this.d.E(this.f30495b, this.f30496c);
        }
    }
}
