package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class m81 extends AnimatorListenerAdapter {
    public boolean f26406a;
    public final View f26407b;
    public final float f26408c;
    public final w81 d;

    public m81(w81 w81Var, View view, float f7) {
        this.d = w81Var;
        this.f26407b = view;
        this.f26408c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f26406a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f26406a) {
            this.d.E(this.f26407b, this.f26408c);
        }
    }
}
