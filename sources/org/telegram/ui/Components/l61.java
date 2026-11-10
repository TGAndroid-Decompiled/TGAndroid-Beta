package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class l61 extends AnimatorListenerAdapter {
    public boolean f35561a;
    public final View f35562b;
    public final float f35563c;
    public final v61 d;

    public l61(v61 v61Var, View view, float f10) {
        this.d = v61Var;
        this.f35562b = view;
        this.f35563c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f35561a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f35561a) {
            this.d.F(this.f35562b, this.f35563c);
        }
    }
}
