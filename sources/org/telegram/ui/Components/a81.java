package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class a81 extends AnimatorListenerAdapter {
    public boolean f22348a;
    public final View f22349b;
    public final float f22350c;
    public final j81 d;

    public a81(j81 j81Var, View view, float f7) {
        this.d = j81Var;
        this.f22349b = view;
        this.f22350c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f22348a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f22348a) {
            this.d.F(this.f22349b, this.f22350c);
        }
    }
}
