package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class k91 extends AnimatorListenerAdapter {
    public boolean f27793a;
    public final View f27794b;
    public final float f27795c;
    public final u91 d;

    public k91(u91 u91Var, View view, float f7) {
        this.d = u91Var;
        this.f27794b = view;
        this.f27795c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f27793a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f27793a) {
            this.d.E(this.f27794b, this.f27795c);
        }
    }
}
