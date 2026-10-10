package org.telegram.ui.Components;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
public final class f91 extends AnimatorListenerAdapter {
    public boolean f26363a;
    public final View f26364b;
    public final float f26365c;
    public final p91 d;

    public f91(p91 p91Var, View view, float f7) {
        this.d = p91Var;
        this.f26364b = view;
        this.f26365c = f7;
    }

    @Override
    public final void onAnimationCancel(Animator animator) {
        super.onAnimationCancel(animator);
        this.f26363a = true;
    }

    @Override
    public final void onAnimationEnd(Animator animator) {
        if (!this.f26363a) {
            this.d.E(this.f26364b, this.f26365c);
        }
    }
}
