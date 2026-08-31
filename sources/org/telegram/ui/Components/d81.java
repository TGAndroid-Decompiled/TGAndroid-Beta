package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class d81 extends AnimatorListenerAdapter {
    public boolean f26225a;
    public final View f26226b;
    public final float f26227c;
    public final m81 d;

    public d81(m81 m81Var, View view, float f10) {
        this.d = m81Var;
        this.f26226b = view;
        this.f26227c = f10;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f26225a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f26225a) {
            this.d.E(this.f26226b, this.f26227c);
        }
    }
}
