package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class z71 extends AnimatorListenerAdapter {
    public boolean f33120a;
    public final View f33121b;
    public final float f33122c;
    public final i81 d;

    public z71(i81 i81Var, View view, float f7) {
        this.d = i81Var;
        this.f33121b = view;
        this.f33122c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f33120a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33120a) {
            this.d.E(this.f33121b, this.f33122c);
        }
    }
}
