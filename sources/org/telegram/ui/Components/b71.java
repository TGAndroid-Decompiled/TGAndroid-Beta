package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class b71 extends AnimatorListenerAdapter {
    public boolean f33677a;
    public final View f33678b;
    public final float f33679c;
    public final k71 d;

    public b71(k71 k71Var, View view, float f10) {
        this.d = k71Var;
        this.f33678b = view;
        this.f33679c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f33677a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f33677a) {
            this.d.D(this.f33678b, this.f33679c);
        }
    }
}
