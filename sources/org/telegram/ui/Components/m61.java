package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m61 extends AnimatorListenerAdapter {
    public boolean f35977a;
    public final View f35978b;
    public final float f35979c;
    public final w61 d;

    public m61(w61 w61Var, View view, float f10) {
        this.d = w61Var;
        this.f35978b = view;
        this.f35979c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f35977a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f35977a) {
            this.d.F(this.f35978b, this.f35979c);
        }
    }
}
