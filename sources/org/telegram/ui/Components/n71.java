package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class n71 extends AnimatorListenerAdapter {
    public boolean f28701a;
    public final View f28702b;
    public final float f28703c;
    public final w71 d;

    public n71(w71 w71Var, View view, float f7) {
        this.d = w71Var;
        this.f28702b = view;
        this.f28703c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f28701a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f28701a) {
            this.d.F(this.f28702b, this.f28703c);
        }
    }
}
